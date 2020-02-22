/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.lexer;

import fan.parser.CompilerLog;
import fan.parser.Loc;
import fan.parser.Token;
import fan.parser.TokenVal;
import fan.parser.Tokenizer;
import fan.sys.FanObj;
import fanjardist.Main;
import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.LexerRestartInfo;

class FanLexer implements Lexer<FanTokenId> {

    private LexerRestartInfo<FanTokenId> info;
    private Tokenizer tokenizer;
    private int lastPos = 0;
    private int codeLength = 0;
    private fan.sys.List tokens;
    private int itractor = 0;

    FanLexer(LexerRestartInfo<FanTokenId> info) {
        this.info = info;
    }
    
    private void readAll() {
        if (tokenizer != null) return;
        
        StringBuilder sb = new StringBuilder();
        while (true) {
            int ch = info.input().read();
            if (ch == -1) break;
            sb.appendCodePoint(ch);
        }
        String code = sb.toString();
        codeLength = code.length();
        
        System.out.println("allStr:"+code);
        System.out.println("code len:"+code.length());
        
        CompilerLog support = CompilerLog.make();
        this.tokenizer = Tokenizer.make(support, Loc.makeUninit(), code, true, true, false);
        this.tokens = this.tokenizer.tokenize();
        itractor = 0;
    }

    @Override
    public org.netbeans.api.lexer.Token<FanTokenId> nextToken() {
        readAll();
        TokenVal token = (TokenVal)tokens.getSafe(itractor);
        ++itractor;
        if (token == null) {
            return null;
        }
        
        if (true) {
            System.out.println("=== token:"+ token.kind() +
                    ", offset:"+token.loc.offset+ ", len:" + token.loc.len +
                    ", lastPos:" + lastPos + ", codeLength:"+codeLength + ", val:" + token.val);
        }
        
        Token kind = token.kind();
        if (kind == Token.eof) {
            int offset = codeLength;
            if (lastPos == offset)
                return null;
            int len = offset - lastPos;
            org.netbeans.api.lexer.Token<FanTokenId> ftoken = info.tokenFactory().createToken(
                FanLanguageHierarchy.getToken(FanTokenId.TokenKind.whitespace.ordinal()), len);
            lastPos = offset;
            return ftoken;
        }
        
        FanTokenId.TokenKind fkind = FanTokenId.TokenKind.whitespace;
        if (kind == Token.identifier) {
            fkind = FanTokenId.TokenKind.identifier;
        }
        else if (kind.keyword) {
            fkind = FanTokenId.TokenKind.keyword;
        }
        else if (kind == Token.strLiteral || kind == Token.uriLiteral) {
            fkind = FanTokenId.TokenKind.string;
        }
        else if (kind == Token.dsl) {
            fkind = FanTokenId.TokenKind.dsl;
        }
        else if (kind == Token.docComment || kind == Token.slComment || kind == Token.mlComment) {
            fkind = FanTokenId.TokenKind.comment;
        }
        else {
            fkind = FanTokenId.TokenKind.symbol;
        }
        
        int offset = token.loc.offset.intValue() + token.loc.len.intValue();
        int len = offset - lastPos;
        
        org.netbeans.api.lexer.Token<FanTokenId> ftoken = info.tokenFactory().createToken(
                FanLanguageHierarchy.getToken(fkind.ordinal()), len);
        lastPos = offset;
        return ftoken;
    }

    @Override
    public Object state() {
        return null;
    }

    @Override
    public void release() {
    }

}