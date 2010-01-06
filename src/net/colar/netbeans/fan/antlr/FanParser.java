// $ANTLR 3.1.2 src/net/colar/netbeans/fan/antlr/Fan.g 2010-01-05 22:03:39
package net.colar.netbeans.fan.antlr;
import net.colar.netbeans.fan.FanParserResult;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class FanParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "KW_BREAK", "KW_CONTINUE", "KW_FOR", "KW_IF", "KW_RETURN", "KW_SWITCH", "KW_THROW", "KW_WHILE", "KW_TRY", "KW_CASE", "KW_DEFAULT", "KW_CATCH", "KW_FINALLY", "KW_USING", "KW_AS", "KW_RD_ONLY", "KW_CONST", "KW_STATIC", "KW_NATIVE", "KW_VOLATILE", "KW_OVERRIDE", "KW_VIRTUAL", "KW_FINAL", "KW_VOID", "KW_CLASS", "KW_ENUM", "KW_MIXIN", "KW_ABSTRACT", "KW_PRIVATE", "KW_PROTECTED", "KW_PUBLIC", "KW_INTERNAL", "KW_NEW", "KW_ONCE", "KW_THIS", "KW_SUPER", "KW_ELSE", "KW_IS", "KW_ISNOT", "KW_NULL", "KW_IT", "KW_TRUE", "KW_FALSE", "INC_STR", "INC_URI", "INC_COMMENT", "INC_DSL", "AST_CLASS", "AST_ENUM", "AST_MIXIN", "AST_METHOD", "AST_CONSTRUCTOR", "AST_FIELD", "AST_CONSTRUCTOR_CHAIN", "AST_CODE_BLOCK", "AST_DOCS", "AST_STR", "AST_CALL", "AST_TERM_EXPR", "AST_DOT_CALL", "AST_SAFE_DOT_CALL", "AST_STATIC_CALL", "AST_USING_POD", "AST_MAP", "AST_LOCAL_DEF", "AST_TYPE_LIT", "AST_SLOT_LIT", "AST_SYMBOL", "AST_NAMED_SUPER", "AST_LIST", "AST_INC_USING", "AST_INC_DOTCALL", "AST_INC_SAFEDOTCALL", "AST_ID", "AST_MODIFIER", "AST_INHERITANCE", "AST_PARAM", "AST_TYPE", "AST_CHILD", "SP_COLCOL", "DOT", "BRACKET_L", "BRACKET_R", "AS_INIT_VAL", "SP_COLON", "SP_COMMA", "SP_QMARK", "LIST_TYPE", "SP_PIPE", "OP_ARROW", "SP_SEMI", "AS_EQUAL", "AS_ASSIGN_OP", "OP_OR", "OP_AND", "CP_EQUALITY", "CP_COMPARATORS", "OP_ELVIS", "OP_RANG_EXCL_OLD", "OP_RANGE_EXCL", "OP_RANGE", "OP_BITOR", "OP_CURRY", "OP_LSHIFT", "OP_RSHIFT", "OP_PLUS", "OP_MINUS", "OP_MULTI", "OP_DIV", "OP_MOD", "OP_BANG", "OP_2PLUS", "OP_2MINUS", "OP_TILDA", "DSL", "OP_SAFE_CALL", "OP_SAFEDYN_CALL", "ID", "URI", "CHAR", "QUOTSTR", "STR", "OP_POUND", "AT", "DOC", "NUMBER", "SQ_BRACKET_L", "SQ_BRACKET_R", "PAR_L", "PAR_R", "LB", "WS", "LINE_COMMENT", "EXEC_COMMENT", "COMPL_ML_COMMENT", "MULTI_COMMENT", "COMPL_DSL", "DIGIT", "HEXLETTER", "COMPL_QSTR", "COMPL_STR", "COMPL_URI", "KEYWORD", "UNDERSCORE", "HEX_HEADER", "HEXNB", "DECIMAL", "FRACTIONAL", "HEXHEADER", "FRACTION", "EXPONENT", "NBTYPE", "LETTER", "INC_UNKNOWN_ITEM", "'$'"
    };
    public static final int EXPONENT=154;
    public static final int DSL=118;
    public static final int OP_AND=98;
    public static final int KW_NATIVE=22;
    public static final int T__158=158;
    public static final int LETTER=156;
    public static final int HEXNB=149;
    public static final int CHAR=123;
    public static final int OP_2PLUS=115;
    public static final int KW_DEFAULT=14;
    public static final int KW_ONCE=37;
    public static final int SP_SEMI=94;
    public static final int INC_UNKNOWN_ITEM=157;
    public static final int AST_MIXIN=53;
    public static final int EOF=-1;
    public static final int KW_PUBLIC=34;
    public static final int KW_ISNOT=42;
    public static final int OP_MOD=113;
    public static final int PAR_R=133;
    public static final int OP_MINUS=110;
    public static final int KW_NEW=36;
    public static final int KW_BREAK=4;
    public static final int KW_SWITCH=9;
    public static final int AST_INC_DOTCALL=75;
    public static final int OP_RANG_EXCL_OLD=102;
    public static final int AST_CLASS=51;
    public static final int OP_BITOR=105;
    public static final int QUOTSTR=124;
    public static final int AST_TYPE=81;
    public static final int OP_BANG=114;
    public static final int AST_DOT_CALL=63;
    public static final int AST_TYPE_LIT=69;
    public static final int PAR_L=132;
    public static final int OP_MULTI=111;
    public static final int AST_USING_POD=66;
    public static final int KEYWORD=146;
    public static final int KW_PROTECTED=33;
    public static final int AST_STR=60;
    public static final int LINE_COMMENT=136;
    public static final int CP_COMPARATORS=100;
    public static final int NUMBER=129;
    public static final int AS_EQUAL=95;
    public static final int KW_CATCH=15;
    public static final int UNDERSCORE=147;
    public static final int OP_DIV=112;
    public static final int SP_COMMA=89;
    public static final int AST_SYMBOL=71;
    public static final int AST_LIST=73;
    public static final int URI=122;
    public static final int KW_FINALLY=16;
    public static final int WS=135;
    public static final int KW_THROW=10;
    public static final int OP_POUND=126;
    public static final int KW_STATIC=21;
    public static final int INC_COMMENT=49;
    public static final int AST_METHOD=54;
    public static final int AST_ENUM=52;
    public static final int AST_CALL=61;
    public static final int SP_QMARK=90;
    public static final int AST_ID=77;
    public static final int HEXHEADER=152;
    public static final int AS_INIT_VAL=87;
    public static final int COMPL_DSL=140;
    public static final int NBTYPE=155;
    public static final int KW_SUPER=39;
    public static final int OP_2MINUS=116;
    public static final int OP_RSHIFT=108;
    public static final int KW_ELSE=40;
    public static final int OP_OR=97;
    public static final int AST_MODIFIER=78;
    public static final int DOC=128;
    public static final int KW_OVERRIDE=24;
    public static final int AST_FIELD=56;
    public static final int AST_CODE_BLOCK=58;
    public static final int KW_ABSTRACT=31;
    public static final int MULTI_COMMENT=139;
    public static final int KW_CONST=20;
    public static final int AST_DOCS=59;
    public static final int COMPL_ML_COMMENT=138;
    public static final int OP_ELVIS=101;
    public static final int BRACKET_R=86;
    public static final int KW_TRUE=45;
    public static final int ID=121;
    public static final int SP_COLON=88;
    public static final int AST_CONSTRUCTOR_CHAIN=57;
    public static final int AST_TERM_EXPR=62;
    public static final int BRACKET_L=85;
    public static final int AT=127;
    public static final int STR=125;
    public static final int OP_RANGE_EXCL=103;
    public static final int SP_PIPE=92;
    public static final int COMPL_QSTR=143;
    public static final int OP_TILDA=117;
    public static final int KW_VIRTUAL=25;
    public static final int CP_EQUALITY=99;
    public static final int AST_SAFE_DOT_CALL=64;
    public static final int KW_FOR=6;
    public static final int KW_WHILE=11;
    public static final int COMPL_URI=145;
    public static final int AST_LOCAL_DEF=68;
    public static final int AST_SLOT_LIT=70;
    public static final int OP_RANGE=104;
    public static final int KW_RETURN=8;
    public static final int INC_DSL=50;
    public static final int SQ_BRACKET_R=131;
    public static final int AST_NAMED_SUPER=72;
    public static final int KW_IS=41;
    public static final int DIGIT=141;
    public static final int KW_TRY=12;
    public static final int KW_IT=44;
    public static final int DOT=84;
    public static final int KW_THIS=38;
    public static final int KW_IF=7;
    public static final int OP_CURRY=106;
    public static final int SQ_BRACKET_L=130;
    public static final int AST_INC_SAFEDOTCALL=76;
    public static final int OP_PLUS=109;
    public static final int KW_FALSE=46;
    public static final int KW_INTERNAL=35;
    public static final int KW_FINAL=26;
    public static final int HEXLETTER=142;
    public static final int KW_CONTINUE=5;
    public static final int KW_PRIVATE=32;
    public static final int KW_ENUM=29;
    public static final int HEX_HEADER=148;
    public static final int OP_SAFEDYN_CALL=120;
    public static final int LIST_TYPE=91;
    public static final int KW_VOLATILE=23;
    public static final int KW_CASE=13;
    public static final int FRACTIONAL=151;
    public static final int OP_LSHIFT=107;
    public static final int EXEC_COMMENT=137;
    public static final int KW_MIXIN=30;
    public static final int AST_CHILD=82;
    public static final int OP_ARROW=93;
    public static final int KW_VOID=27;
    public static final int DECIMAL=150;
    public static final int INC_URI=48;
    public static final int KW_CLASS=28;
    public static final int AS_ASSIGN_OP=96;
    public static final int AST_MAP=67;
    public static final int AST_CONSTRUCTOR=55;
    public static final int KW_RD_ONLY=19;
    public static final int INC_STR=47;
    public static final int AST_STATIC_CALL=65;
    public static final int OP_SAFE_CALL=119;
    public static final int KW_AS=18;
    public static final int COMPL_STR=144;
    public static final int LB=134;
    public static final int KW_USING=17;
    public static final int KW_NULL=43;
    public static final int AST_PARAM=80;
    public static final int FRACTION=153;
    public static final int AST_INHERITANCE=79;
    public static final int AST_INC_USING=74;
    public static final int SP_COLCOL=83;

    // delegates
    // delegators


        public FanParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public FanParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[403+1];
             
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return FanParser.tokenNames; }
    public String getGrammarFileName() { return "src/net/colar/netbeans/fan/antlr/Fan.g"; }


    		public boolean nbErrors=false;
    	/*
           		Thibaut. C
           		 This looks for a linebreak/newline, which are usually ignored (hidden channel)
       	      	Yet in other case they are meaningful (IE: end of expression)
         		index is the index of the current "next non-hidden" token, what that means is that it will
           		have skipped the linebreaks and be pointing at the NEXT token after the line breaks
           		So we need to look BACKWARD at the hidden tokens to check for newLine.
           		Note that the hiden tokens might include other things like tabs or whitespace that does not qualify
        	*/
          	private boolean lookupNL()
           	{
           		int index=input.index();
    		int start=input.mark();
    		if(index < input.size())
    		{
    			// Always allowing comma as end of line might be a bit too "loose"
    			// it's neeed for itBlocks Add feature
    			// maybe i shoul match only when in an itBlock ?
    			if(input.get(index).getType() == SP_COMMA)
    				return true;
    			// if next token is a '}', that counts as a newline
    			if(input.get(index).getType() == BRACKET_R)
    				return true;
    		}
     		Token token;
    		boolean result=false;
    		while (index > 0)
    		{
    			// look back in the hidden channel until we find a linebreak
    			index--;
    			token = input.get(index);
    			if (token.getChannel() != Token.HIDDEN_CHANNEL)
    			{
    				/* We are out of the hidden channel, in other word we found a "real" item,
    				which means we didn't find a linebreak, so we are done (false)
    				*/
    				break;
    			}
    			if (token.getType() == LB)
    			{
    				// found our LineBreak (true)
    				result=true;
    				break;
    			}
    		}
    		if(index==0)
    			result=true;
    		input.rewind(start);
    		return result;
        	}

        	/**
        	Some items ("(" "[") cannot be preceded by an EndOfLine in an expression
        	*/
        	private boolean notAfterEol()
        	{
           		int index=input.index();
    		int start=input.mark();
     		Token token;
    		boolean result=false;
    		while (index > 0)
    		{
    			index--;
    			token = input.get(index);
    			if (token.getChannel() != Token.HIDDEN_CHANNEL)
    			{
    				result=true;
    				break;
    			}
    			if (token.getType() == LB)
    			{
    				result=false;
    				break;
    			}
    		}
    		input.rewind(start);
    		return result;
        	}

        /* Error Handling */
        FanParserResult parsingResult=null;
        public FanParserResult parse(FanParserResult parsingResult) throws RecognitionException
        {
    	this.parsingResult=parsingResult;
    	// Parse from grammar root and save the result
    	ParserRuleReturnScope result=prog();
    	this.parsingResult.setAntlrScope(result);
    	return this.parsingResult;
        }
        @Override
        public void reportError(RecognitionException e)
        {
    		if(! nbErrors)
    			throw(new RuntimeException("Parser Exception",e));
    		else
    			parsingResult.addAntlrError(e,paraphrase);
        }

        Stack<String> paraphrase = new Stack<String>();



    public static class prog_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prog"
    // src/net/colar/netbeans/fan/antlr/Fan.g:253:1: prog : ( using )* ( podDef | ( typeDef )* ) docs EOF ;
    public final FanParser.prog_return prog() throws RecognitionException {
        FanParser.prog_return retval = new FanParser.prog_return();
        retval.start = input.LT(1);
        int prog_StartIndex = input.index();
        Object root_0 = null;

        Token EOF5=null;
        FanParser.using_return using1 = null;

        FanParser.podDef_return podDef2 = null;

        FanParser.typeDef_return typeDef3 = null;

        FanParser.docs_return docs4 = null;


        Object EOF5_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:253:7: ( ( using )* ( podDef | ( typeDef )* ) docs EOF )
            // src/net/colar/netbeans/fan/antlr/Fan.g:253:11: ( using )* ( podDef | ( typeDef )* ) docs EOF
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:253:11: ( using )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==KW_USING) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: using
            	    {
            	    pushFollow(FOLLOW_using_in_prog465);
            	    using1=using();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, using1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:253:18: ( podDef | ( typeDef )* )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:253:19: podDef
                    {
                    pushFollow(FOLLOW_podDef_in_prog469);
                    podDef2=podDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, podDef2.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:253:28: ( typeDef )*
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:253:28: ( typeDef )*
                    loop2:
                    do {
                        int alt2=2;
                        alt2 = dfa2.predict(input);
                        switch (alt2) {
                    	case 1 :
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: typeDef
                    	    {
                    	    pushFollow(FOLLOW_typeDef_in_prog473);
                    	    typeDef3=typeDef();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeDef3.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;

            }

            pushFollow(FOLLOW_docs_in_prog477);
            docs4=docs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, docs4.getTree());
            EOF5=(Token)match(input,EOF,FOLLOW_EOF_in_prog479); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EOF5_tree = (Object)adaptor.create(EOF5);
            adaptor.addChild(root_0, EOF5_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 1, prog_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "prog"

    public static class using_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "using"
    // src/net/colar/netbeans/fan/antlr/Fan.g:254:1: using : ( usingPod | usingType | usingAs | incUsing ) ;
    public final FanParser.using_return using() throws RecognitionException {
        FanParser.using_return retval = new FanParser.using_return();
        retval.start = input.LT(1);
        int using_StartIndex = input.index();
        Object root_0 = null;

        FanParser.usingPod_return usingPod6 = null;

        FanParser.usingType_return usingType7 = null;

        FanParser.usingAs_return usingAs8 = null;

        FanParser.incUsing_return incUsing9 = null;



        paraphrase.push("Using statements");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:255:3: ( ( usingPod | usingType | usingAs | incUsing ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:255:5: ( usingPod | usingType | usingAs | incUsing )
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:255:5: ( usingPod | usingType | usingAs | incUsing )
            int alt4=4;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:255:6: usingPod
                    {
                    pushFollow(FOLLOW_usingPod_in_using499);
                    usingPod6=usingPod();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, usingPod6.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:255:17: usingType
                    {
                    pushFollow(FOLLOW_usingType_in_using503);
                    usingType7=usingType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, usingType7.getTree());

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:255:29: usingAs
                    {
                    pushFollow(FOLLOW_usingAs_in_using507);
                    usingAs8=usingAs();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, usingAs8.getTree());

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:255:39: incUsing
                    {
                    pushFollow(FOLLOW_incUsing_in_using511);
                    incUsing9=incUsing();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, incUsing9.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 2, using_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "using"

    public static class usingPod_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "usingPod"
    // src/net/colar/netbeans/fan/antlr/Fan.g:256:1: usingPod : ( KW_USING podSpec eos ) -> ^( AST_USING_POD ^( AST_CHILD podSpec ) ( eos )? ) ;
    public final FanParser.usingPod_return usingPod() throws RecognitionException {
        FanParser.usingPod_return retval = new FanParser.usingPod_return();
        retval.start = input.LT(1);
        int usingPod_StartIndex = input.index();
        Object root_0 = null;

        Token KW_USING10=null;
        FanParser.podSpec_return podSpec11 = null;

        FanParser.eos_return eos12 = null;


        Object KW_USING10_tree=null;
        RewriteRuleTokenStream stream_KW_USING=new RewriteRuleTokenStream(adaptor,"token KW_USING");
        RewriteRuleSubtreeStream stream_eos=new RewriteRuleSubtreeStream(adaptor,"rule eos");
        RewriteRuleSubtreeStream stream_podSpec=new RewriteRuleSubtreeStream(adaptor,"rule podSpec");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:257:3: ( ( KW_USING podSpec eos ) -> ^( AST_USING_POD ^( AST_CHILD podSpec ) ( eos )? ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:257:5: ( KW_USING podSpec eos )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:257:5: ( KW_USING podSpec eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:257:6: KW_USING podSpec eos
            {
            KW_USING10=(Token)match(input,KW_USING,FOLLOW_KW_USING_in_usingPod522); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_USING.add(KW_USING10);

            pushFollow(FOLLOW_podSpec_in_usingPod524);
            podSpec11=podSpec();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_podSpec.add(podSpec11.getTree());
            pushFollow(FOLLOW_eos_in_usingPod526);
            eos12=eos();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_eos.add(eos12.getTree());

            }



            // AST REWRITE
            // elements: podSpec, eos
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 258:4: -> ^( AST_USING_POD ^( AST_CHILD podSpec ) ( eos )? )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:258:7: ^( AST_USING_POD ^( AST_CHILD podSpec ) ( eos )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_USING_POD, "AST_USING_POD"), root_1);

                // src/net/colar/netbeans/fan/antlr/Fan.g:258:23: ^( AST_CHILD podSpec )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CHILD, "AST_CHILD"), root_2);

                adaptor.addChild(root_2, stream_podSpec.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // src/net/colar/netbeans/fan/antlr/Fan.g:258:44: ( eos )?
                if ( stream_eos.hasNext() ) {
                    adaptor.addChild(root_1, stream_eos.nextTree());

                }
                stream_eos.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 3, usingPod_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "usingPod"

    public static class usingType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "usingType"
    // src/net/colar/netbeans/fan/antlr/Fan.g:259:1: usingType : ( KW_USING podSpec SP_COLCOL id eos ) -> ^( AST_USING_POD ^( AST_CHILD podSpec ) ^( AST_CHILD id ) ) ;
    public final FanParser.usingType_return usingType() throws RecognitionException {
        FanParser.usingType_return retval = new FanParser.usingType_return();
        retval.start = input.LT(1);
        int usingType_StartIndex = input.index();
        Object root_0 = null;

        Token KW_USING13=null;
        Token SP_COLCOL15=null;
        FanParser.podSpec_return podSpec14 = null;

        FanParser.id_return id16 = null;

        FanParser.eos_return eos17 = null;


        Object KW_USING13_tree=null;
        Object SP_COLCOL15_tree=null;
        RewriteRuleTokenStream stream_KW_USING=new RewriteRuleTokenStream(adaptor,"token KW_USING");
        RewriteRuleTokenStream stream_SP_COLCOL=new RewriteRuleTokenStream(adaptor,"token SP_COLCOL");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_eos=new RewriteRuleSubtreeStream(adaptor,"rule eos");
        RewriteRuleSubtreeStream stream_podSpec=new RewriteRuleSubtreeStream(adaptor,"rule podSpec");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:260:3: ( ( KW_USING podSpec SP_COLCOL id eos ) -> ^( AST_USING_POD ^( AST_CHILD podSpec ) ^( AST_CHILD id ) ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:260:5: ( KW_USING podSpec SP_COLCOL id eos )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:260:5: ( KW_USING podSpec SP_COLCOL id eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:260:6: KW_USING podSpec SP_COLCOL id eos
            {
            KW_USING13=(Token)match(input,KW_USING,FOLLOW_KW_USING_in_usingType555); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_USING.add(KW_USING13);

            pushFollow(FOLLOW_podSpec_in_usingType557);
            podSpec14=podSpec();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_podSpec.add(podSpec14.getTree());
            SP_COLCOL15=(Token)match(input,SP_COLCOL,FOLLOW_SP_COLCOL_in_usingType559); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SP_COLCOL.add(SP_COLCOL15);

            pushFollow(FOLLOW_id_in_usingType561);
            id16=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id16.getTree());
            pushFollow(FOLLOW_eos_in_usingType563);
            eos17=eos();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_eos.add(eos17.getTree());

            }



            // AST REWRITE
            // elements: id, podSpec
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 261:4: -> ^( AST_USING_POD ^( AST_CHILD podSpec ) ^( AST_CHILD id ) )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:261:7: ^( AST_USING_POD ^( AST_CHILD podSpec ) ^( AST_CHILD id ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_USING_POD, "AST_USING_POD"), root_1);

                // src/net/colar/netbeans/fan/antlr/Fan.g:261:23: ^( AST_CHILD podSpec )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CHILD, "AST_CHILD"), root_2);

                adaptor.addChild(root_2, stream_podSpec.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // src/net/colar/netbeans/fan/antlr/Fan.g:261:44: ^( AST_CHILD id )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CHILD, "AST_CHILD"), root_2);

                adaptor.addChild(root_2, stream_id.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 4, usingType_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "usingType"

    public static class usingAs_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "usingAs"
    // src/net/colar/netbeans/fan/antlr/Fan.g:263:1: usingAs : ( KW_USING podSpec SP_COLCOL podId KW_AS as= id eos ) -> ^( AST_USING_POD ^( AST_CHILD podSpec ) ^( AST_CHILD podId ) ^( AST_CHILD $as) ) ;
    public final FanParser.usingAs_return usingAs() throws RecognitionException {
        FanParser.usingAs_return retval = new FanParser.usingAs_return();
        retval.start = input.LT(1);
        int usingAs_StartIndex = input.index();
        Object root_0 = null;

        Token KW_USING18=null;
        Token SP_COLCOL20=null;
        Token KW_AS22=null;
        FanParser.id_return as = null;

        FanParser.podSpec_return podSpec19 = null;

        FanParser.podId_return podId21 = null;

        FanParser.eos_return eos23 = null;


        Object KW_USING18_tree=null;
        Object SP_COLCOL20_tree=null;
        Object KW_AS22_tree=null;
        RewriteRuleTokenStream stream_KW_AS=new RewriteRuleTokenStream(adaptor,"token KW_AS");
        RewriteRuleTokenStream stream_KW_USING=new RewriteRuleTokenStream(adaptor,"token KW_USING");
        RewriteRuleTokenStream stream_SP_COLCOL=new RewriteRuleTokenStream(adaptor,"token SP_COLCOL");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_eos=new RewriteRuleSubtreeStream(adaptor,"rule eos");
        RewriteRuleSubtreeStream stream_podSpec=new RewriteRuleSubtreeStream(adaptor,"rule podSpec");
        RewriteRuleSubtreeStream stream_podId=new RewriteRuleSubtreeStream(adaptor,"rule podId");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:263:10: ( ( KW_USING podSpec SP_COLCOL podId KW_AS as= id eos ) -> ^( AST_USING_POD ^( AST_CHILD podSpec ) ^( AST_CHILD podId ) ^( AST_CHILD $as) ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:263:12: ( KW_USING podSpec SP_COLCOL podId KW_AS as= id eos )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:263:12: ( KW_USING podSpec SP_COLCOL podId KW_AS as= id eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:263:13: KW_USING podSpec SP_COLCOL podId KW_AS as= id eos
            {
            KW_USING18=(Token)match(input,KW_USING,FOLLOW_KW_USING_in_usingAs595); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_USING.add(KW_USING18);

            pushFollow(FOLLOW_podSpec_in_usingAs597);
            podSpec19=podSpec();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_podSpec.add(podSpec19.getTree());
            SP_COLCOL20=(Token)match(input,SP_COLCOL,FOLLOW_SP_COLCOL_in_usingAs599); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SP_COLCOL.add(SP_COLCOL20);

            pushFollow(FOLLOW_podId_in_usingAs601);
            podId21=podId();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_podId.add(podId21.getTree());
            KW_AS22=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_usingAs603); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_AS.add(KW_AS22);

            pushFollow(FOLLOW_id_in_usingAs607);
            as=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(as.getTree());
            pushFollow(FOLLOW_eos_in_usingAs609);
            eos23=eos();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_eos.add(eos23.getTree());

            }



            // AST REWRITE
            // elements: podSpec, as, podId
            // token labels: 
            // rule labels: retval, as
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_as=new RewriteRuleSubtreeStream(adaptor,"rule as",as!=null?as.tree:null);

            root_0 = (Object)adaptor.nil();
            // 264:4: -> ^( AST_USING_POD ^( AST_CHILD podSpec ) ^( AST_CHILD podId ) ^( AST_CHILD $as) )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:264:7: ^( AST_USING_POD ^( AST_CHILD podSpec ) ^( AST_CHILD podId ) ^( AST_CHILD $as) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_USING_POD, "AST_USING_POD"), root_1);

                // src/net/colar/netbeans/fan/antlr/Fan.g:264:23: ^( AST_CHILD podSpec )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CHILD, "AST_CHILD"), root_2);

                adaptor.addChild(root_2, stream_podSpec.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // src/net/colar/netbeans/fan/antlr/Fan.g:264:44: ^( AST_CHILD podId )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CHILD, "AST_CHILD"), root_2);

                adaptor.addChild(root_2, stream_podId.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // src/net/colar/netbeans/fan/antlr/Fan.g:264:63: ^( AST_CHILD $as)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CHILD, "AST_CHILD"), root_2);

                adaptor.addChild(root_2, stream_as.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 5, usingAs_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "usingAs"

    public static class podId_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "podId"
    // src/net/colar/netbeans/fan/antlr/Fan.g:266:1: podId : id ( '$' id )* ;
    public final FanParser.podId_return podId() throws RecognitionException {
        FanParser.podId_return retval = new FanParser.podId_return();
        retval.start = input.LT(1);
        int podId_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal25=null;
        FanParser.id_return id24 = null;

        FanParser.id_return id26 = null;


        Object char_literal25_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:266:8: ( id ( '$' id )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:266:10: id ( '$' id )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_id_in_podId647);
            id24=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id24.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:266:13: ( '$' id )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==158) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:266:14: '$' id
            	    {
            	    char_literal25=(Token)match(input,158,FOLLOW_158_in_podId650); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal25_tree = (Object)adaptor.create(char_literal25);
            	    adaptor.addChild(root_0, char_literal25_tree);
            	    }
            	    pushFollow(FOLLOW_id_in_podId652);
            	    id26=id();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, id26.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 6, podId_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "podId"

    public static class incUsing_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "incUsing"
    // src/net/colar/netbeans/fan/antlr/Fan.g:267:1: incUsing : ( ( KW_USING eos ) | ( KW_USING ffi eos ) | ( KW_USING podSpec DOT eos ) | ( KW_USING podSpec SP_COLCOL eos ) ) -> ^( AST_INC_USING ^( AST_CHILD KW_USING ) ^( AST_CHILD ( ffi )? ( podSpec )? ( DOT )? ( SP_COLCOL )? ) ) ;
    public final FanParser.incUsing_return incUsing() throws RecognitionException {
        FanParser.incUsing_return retval = new FanParser.incUsing_return();
        retval.start = input.LT(1);
        int incUsing_StartIndex = input.index();
        Object root_0 = null;

        Token KW_USING27=null;
        Token KW_USING29=null;
        Token KW_USING32=null;
        Token DOT34=null;
        Token KW_USING36=null;
        Token SP_COLCOL38=null;
        FanParser.eos_return eos28 = null;

        FanParser.ffi_return ffi30 = null;

        FanParser.eos_return eos31 = null;

        FanParser.podSpec_return podSpec33 = null;

        FanParser.eos_return eos35 = null;

        FanParser.podSpec_return podSpec37 = null;

        FanParser.eos_return eos39 = null;


        Object KW_USING27_tree=null;
        Object KW_USING29_tree=null;
        Object KW_USING32_tree=null;
        Object DOT34_tree=null;
        Object KW_USING36_tree=null;
        Object SP_COLCOL38_tree=null;
        RewriteRuleTokenStream stream_KW_USING=new RewriteRuleTokenStream(adaptor,"token KW_USING");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_SP_COLCOL=new RewriteRuleTokenStream(adaptor,"token SP_COLCOL");
        RewriteRuleSubtreeStream stream_eos=new RewriteRuleSubtreeStream(adaptor,"rule eos");
        RewriteRuleSubtreeStream stream_podSpec=new RewriteRuleSubtreeStream(adaptor,"rule podSpec");
        RewriteRuleSubtreeStream stream_ffi=new RewriteRuleSubtreeStream(adaptor,"rule ffi");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:267:10: ( ( ( KW_USING eos ) | ( KW_USING ffi eos ) | ( KW_USING podSpec DOT eos ) | ( KW_USING podSpec SP_COLCOL eos ) ) -> ^( AST_INC_USING ^( AST_CHILD KW_USING ) ^( AST_CHILD ( ffi )? ( podSpec )? ( DOT )? ( SP_COLCOL )? ) ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:267:14: ( ( KW_USING eos ) | ( KW_USING ffi eos ) | ( KW_USING podSpec DOT eos ) | ( KW_USING podSpec SP_COLCOL eos ) )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:267:14: ( ( KW_USING eos ) | ( KW_USING ffi eos ) | ( KW_USING podSpec DOT eos ) | ( KW_USING podSpec SP_COLCOL eos ) )
            int alt6=4;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:267:15: ( KW_USING eos )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:267:15: ( KW_USING eos )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:267:16: KW_USING eos
                    {
                    KW_USING27=(Token)match(input,KW_USING,FOLLOW_KW_USING_in_incUsing665); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_USING.add(KW_USING27);

                    pushFollow(FOLLOW_eos_in_incUsing667);
                    eos28=eos();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_eos.add(eos28.getTree());

                    }


                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:267:32: ( KW_USING ffi eos )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:267:32: ( KW_USING ffi eos )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:267:33: KW_USING ffi eos
                    {
                    KW_USING29=(Token)match(input,KW_USING,FOLLOW_KW_USING_in_incUsing673); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_USING.add(KW_USING29);

                    pushFollow(FOLLOW_ffi_in_incUsing675);
                    ffi30=ffi();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ffi.add(ffi30.getTree());
                    pushFollow(FOLLOW_eos_in_incUsing677);
                    eos31=eos();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_eos.add(eos31.getTree());

                    }


                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:267:53: ( KW_USING podSpec DOT eos )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:267:53: ( KW_USING podSpec DOT eos )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:267:54: KW_USING podSpec DOT eos
                    {
                    KW_USING32=(Token)match(input,KW_USING,FOLLOW_KW_USING_in_incUsing683); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_USING.add(KW_USING32);

                    pushFollow(FOLLOW_podSpec_in_incUsing685);
                    podSpec33=podSpec();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_podSpec.add(podSpec33.getTree());
                    DOT34=(Token)match(input,DOT,FOLLOW_DOT_in_incUsing687); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT34);

                    pushFollow(FOLLOW_eos_in_incUsing689);
                    eos35=eos();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_eos.add(eos35.getTree());

                    }


                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:267:82: ( KW_USING podSpec SP_COLCOL eos )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:267:82: ( KW_USING podSpec SP_COLCOL eos )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:267:83: KW_USING podSpec SP_COLCOL eos
                    {
                    KW_USING36=(Token)match(input,KW_USING,FOLLOW_KW_USING_in_incUsing695); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_USING.add(KW_USING36);

                    pushFollow(FOLLOW_podSpec_in_incUsing697);
                    podSpec37=podSpec();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_podSpec.add(podSpec37.getTree());
                    SP_COLCOL38=(Token)match(input,SP_COLCOL,FOLLOW_SP_COLCOL_in_incUsing699); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SP_COLCOL.add(SP_COLCOL38);

                    pushFollow(FOLLOW_eos_in_incUsing701);
                    eos39=eos();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_eos.add(eos39.getTree());

                    }


                    }
                    break;

            }



            // AST REWRITE
            // elements: SP_COLCOL, KW_USING, podSpec, ffi, DOT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 268:4: -> ^( AST_INC_USING ^( AST_CHILD KW_USING ) ^( AST_CHILD ( ffi )? ( podSpec )? ( DOT )? ( SP_COLCOL )? ) )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:268:7: ^( AST_INC_USING ^( AST_CHILD KW_USING ) ^( AST_CHILD ( ffi )? ( podSpec )? ( DOT )? ( SP_COLCOL )? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_INC_USING, "AST_INC_USING"), root_1);

                // src/net/colar/netbeans/fan/antlr/Fan.g:268:23: ^( AST_CHILD KW_USING )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CHILD, "AST_CHILD"), root_2);

                adaptor.addChild(root_2, stream_KW_USING.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                // src/net/colar/netbeans/fan/antlr/Fan.g:268:45: ^( AST_CHILD ( ffi )? ( podSpec )? ( DOT )? ( SP_COLCOL )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CHILD, "AST_CHILD"), root_2);

                // src/net/colar/netbeans/fan/antlr/Fan.g:268:57: ( ffi )?
                if ( stream_ffi.hasNext() ) {
                    adaptor.addChild(root_2, stream_ffi.nextTree());

                }
                stream_ffi.reset();
                // src/net/colar/netbeans/fan/antlr/Fan.g:268:62: ( podSpec )?
                if ( stream_podSpec.hasNext() ) {
                    adaptor.addChild(root_2, stream_podSpec.nextTree());

                }
                stream_podSpec.reset();
                // src/net/colar/netbeans/fan/antlr/Fan.g:268:71: ( DOT )?
                if ( stream_DOT.hasNext() ) {
                    adaptor.addChild(root_2, stream_DOT.nextNode());

                }
                stream_DOT.reset();
                // src/net/colar/netbeans/fan/antlr/Fan.g:268:76: ( SP_COLCOL )?
                if ( stream_SP_COLCOL.hasNext() ) {
                    adaptor.addChild(root_2, stream_SP_COLCOL.nextNode());

                }
                stream_SP_COLCOL.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 7, incUsing_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "incUsing"

    public static class podSpec_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "podSpec"
    // src/net/colar/netbeans/fan/antlr/Fan.g:269:1: podSpec : ( ffi )? id ( DOT id )* ;
    public final FanParser.podSpec_return podSpec() throws RecognitionException {
        FanParser.podSpec_return retval = new FanParser.podSpec_return();
        retval.start = input.LT(1);
        int podSpec_StartIndex = input.index();
        Object root_0 = null;

        Token DOT42=null;
        FanParser.ffi_return ffi40 = null;

        FanParser.id_return id41 = null;

        FanParser.id_return id43 = null;


        Object DOT42_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:269:10: ( ( ffi )? id ( DOT id )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:269:12: ( ffi )? id ( DOT id )*
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:269:12: ( ffi )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==SQ_BRACKET_L) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: ffi
                    {
                    pushFollow(FOLLOW_ffi_in_podSpec742);
                    ffi40=ffi();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ffi40.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_podSpec745);
            id41=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id41.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:269:20: ( DOT id )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==DOT) ) {
                    int LA8_2 = input.LA(2);

                    if ( (LA8_2==ID) ) {
                        int LA8_3 = input.LA(3);

                        if ( (LA8_3==ID) ) {
                            int LA8_4 = input.LA(4);

                            if ( (LA8_4==ID) ) {
                                alt8=1;
                            }


                        }
                        else if ( (LA8_3==EOF||LA8_3==KW_USING||(LA8_3>=KW_CONST && LA8_3<=KW_STATIC)||LA8_3==KW_FINAL||(LA8_3>=KW_CLASS && LA8_3<=KW_INTERNAL)||(LA8_3>=SP_COLCOL && LA8_3<=DOT)||LA8_3==SP_SEMI||(LA8_3>=AT && LA8_3<=DOC)) ) {
                            alt8=1;
                        }


                    }


                }


                switch (alt8) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:269:21: DOT id
            	    {
            	    DOT42=(Token)match(input,DOT,FOLLOW_DOT_in_podSpec748); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    DOT42_tree = (Object)adaptor.create(DOT42);
            	    adaptor.addChild(root_0, DOT42_tree);
            	    }
            	    pushFollow(FOLLOW_id_in_podSpec750);
            	    id43=id();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, id43.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 8, podSpec_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "podSpec"

    public static class ffi_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ffi"
    // src/net/colar/netbeans/fan/antlr/Fan.g:270:1: ffi : sq_bracketL id sq_bracketR ;
    public final FanParser.ffi_return ffi() throws RecognitionException {
        FanParser.ffi_return retval = new FanParser.ffi_return();
        retval.start = input.LT(1);
        int ffi_StartIndex = input.index();
        Object root_0 = null;

        FanParser.sq_bracketL_return sq_bracketL44 = null;

        FanParser.id_return id45 = null;

        FanParser.sq_bracketR_return sq_bracketR46 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:270:7: ( sq_bracketL id sq_bracketR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:270:9: sq_bracketL id sq_bracketR
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_sq_bracketL_in_ffi761);
            sq_bracketL44=sq_bracketL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, sq_bracketL44.getTree());
            pushFollow(FOLLOW_id_in_ffi763);
            id45=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id45.getTree());
            pushFollow(FOLLOW_sq_bracketR_in_ffi765);
            sq_bracketR46=sq_bracketR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, sq_bracketR46.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 9, ffi_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ffi"

    public static class podDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "podDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:272:1: podDef : podHeader BRACKET_L ( symbolDef )* BRACKET_R ;
    public final FanParser.podDef_return podDef() throws RecognitionException {
        FanParser.podDef_return retval = new FanParser.podDef_return();
        retval.start = input.LT(1);
        int podDef_StartIndex = input.index();
        Object root_0 = null;

        Token BRACKET_L48=null;
        Token BRACKET_R50=null;
        FanParser.podHeader_return podHeader47 = null;

        FanParser.symbolDef_return symbolDef49 = null;


        Object BRACKET_L48_tree=null;
        Object BRACKET_R50_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:272:9: ( podHeader BRACKET_L ( symbolDef )* BRACKET_R )
            // src/net/colar/netbeans/fan/antlr/Fan.g:272:11: podHeader BRACKET_L ( symbolDef )* BRACKET_R
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_podHeader_in_podDef774);
            podHeader47=podHeader();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, podHeader47.getTree());
            BRACKET_L48=(Token)match(input,BRACKET_L,FOLLOW_BRACKET_L_in_podDef776); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BRACKET_L48_tree = (Object)adaptor.create(BRACKET_L48);
            adaptor.addChild(root_0, BRACKET_L48_tree);
            }
            // src/net/colar/netbeans/fan/antlr/Fan.g:272:31: ( symbolDef )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==EOF||(LA9_0>=KW_RD_ONLY && LA9_0<=KW_FINAL)||(LA9_0>=KW_CLASS && LA9_0<=KW_ONCE)||LA9_0==SP_PIPE||LA9_0==ID||(LA9_0>=AT && LA9_0<=DOC)||LA9_0==SQ_BRACKET_L) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: symbolDef
            	    {
            	    pushFollow(FOLLOW_symbolDef_in_podDef778);
            	    symbolDef49=symbolDef();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, symbolDef49.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            BRACKET_R50=(Token)match(input,BRACKET_R,FOLLOW_BRACKET_R_in_podDef781); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BRACKET_R50_tree = (Object)adaptor.create(BRACKET_R50);
            adaptor.addChild(root_0, BRACKET_R50_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 10, podDef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "podDef"

    public static class podHeader_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "podHeader"
    // src/net/colar/netbeans/fan/antlr/Fan.g:273:1: podHeader : docs ( facet )* pod id ;
    public final FanParser.podHeader_return podHeader() throws RecognitionException {
        FanParser.podHeader_return retval = new FanParser.podHeader_return();
        retval.start = input.LT(1);
        int podHeader_StartIndex = input.index();
        Object root_0 = null;

        FanParser.docs_return docs51 = null;

        FanParser.facet_return facet52 = null;

        FanParser.pod_return pod53 = null;

        FanParser.id_return id54 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:273:11: ( docs ( facet )* pod id )
            // src/net/colar/netbeans/fan/antlr/Fan.g:273:13: docs ( facet )* pod id
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_docs_in_podHeader788);
            docs51=docs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, docs51.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:273:18: ( facet )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==AT) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: facet
            	    {
            	    pushFollow(FOLLOW_facet_in_podHeader790);
            	    facet52=facet();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, facet52.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            pushFollow(FOLLOW_pod_in_podHeader793);
            pod53=pod();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, pod53.getTree());
            pushFollow(FOLLOW_id_in_podHeader795);
            id54=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id54.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 11, podHeader_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "podHeader"

    public static class symbolDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "symbolDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:274:1: symbolDef : docs ( facet )* ( symbolFlag )* typeId AS_INIT_VAL expr eos ;
    public final FanParser.symbolDef_return symbolDef() throws RecognitionException {
        FanParser.symbolDef_return retval = new FanParser.symbolDef_return();
        retval.start = input.LT(1);
        int symbolDef_StartIndex = input.index();
        Object root_0 = null;

        Token AS_INIT_VAL59=null;
        FanParser.docs_return docs55 = null;

        FanParser.facet_return facet56 = null;

        FanParser.symbolFlag_return symbolFlag57 = null;

        FanParser.typeId_return typeId58 = null;

        FanParser.expr_return expr60 = null;

        FanParser.eos_return eos61 = null;


        Object AS_INIT_VAL59_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:274:11: ( docs ( facet )* ( symbolFlag )* typeId AS_INIT_VAL expr eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:274:13: docs ( facet )* ( symbolFlag )* typeId AS_INIT_VAL expr eos
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_docs_in_symbolDef802);
            docs55=docs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, docs55.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:274:18: ( facet )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==AT) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: facet
            	    {
            	    pushFollow(FOLLOW_facet_in_symbolDef804);
            	    facet56=facet();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, facet56.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:274:25: ( symbolFlag )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==KW_VIRTUAL) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: symbolFlag
            	    {
            	    pushFollow(FOLLOW_symbolFlag_in_symbolDef807);
            	    symbolFlag57=symbolFlag();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, symbolFlag57.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            pushFollow(FOLLOW_typeId_in_symbolDef810);
            typeId58=typeId();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeId58.getTree());
            AS_INIT_VAL59=(Token)match(input,AS_INIT_VAL,FOLLOW_AS_INIT_VAL_in_symbolDef812); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            AS_INIT_VAL59_tree = (Object)adaptor.create(AS_INIT_VAL59);
            adaptor.addChild(root_0, AS_INIT_VAL59_tree);
            }
            pushFollow(FOLLOW_expr_in_symbolDef814);
            expr60=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr60.getTree());
            pushFollow(FOLLOW_eos_in_symbolDef816);
            eos61=eos();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, eos61.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 12, symbolDef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "symbolDef"

    public static class symbolFlag_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "symbolFlag"
    // src/net/colar/netbeans/fan/antlr/Fan.g:275:1: symbolFlag : 'virtual' ;
    public final FanParser.symbolFlag_return symbolFlag() throws RecognitionException {
        FanParser.symbolFlag_return retval = new FanParser.symbolFlag_return();
        retval.start = input.LT(1);
        int symbolFlag_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal62=null;

        Object string_literal62_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:275:12: ( 'virtual' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:275:14: 'virtual'
            {
            root_0 = (Object)adaptor.nil();

            string_literal62=(Token)match(input,KW_VIRTUAL,FOLLOW_KW_VIRTUAL_in_symbolFlag823); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal62_tree = (Object)adaptor.create(string_literal62);
            adaptor.addChild(root_0, string_literal62_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 13, symbolFlag_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "symbolFlag"

    public static class typeDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:278:1: typeDef : docs ( facet )* ( ( ( classFlags )* KW_CLASS )=> classDef | ( ( protection )? KW_ENUM )=> enumDef | mixinDef ) ;
    public final FanParser.typeDef_return typeDef() throws RecognitionException {
        FanParser.typeDef_return retval = new FanParser.typeDef_return();
        retval.start = input.LT(1);
        int typeDef_StartIndex = input.index();
        Object root_0 = null;

        FanParser.docs_return docs63 = null;

        FanParser.facet_return facet64 = null;

        FanParser.classDef_return classDef65 = null;

        FanParser.enumDef_return enumDef66 = null;

        FanParser.mixinDef_return mixinDef67 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:278:10: ( docs ( facet )* ( ( ( classFlags )* KW_CLASS )=> classDef | ( ( protection )? KW_ENUM )=> enumDef | mixinDef ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:278:12: docs ( facet )* ( ( ( classFlags )* KW_CLASS )=> classDef | ( ( protection )? KW_ENUM )=> enumDef | mixinDef )
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_docs_in_typeDef833);
            docs63=docs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, docs63.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:278:17: ( facet )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==AT) ) {
                    int LA13_2 = input.LA(2);

                    if ( (LA13_2==ID) ) {
                        int LA13_3 = input.LA(3);

                        if ( (synpred17_Fan()) ) {
                            alt13=1;
                        }


                    }


                }


                switch (alt13) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: facet
            	    {
            	    pushFollow(FOLLOW_facet_in_typeDef835);
            	    facet64=facet();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, facet64.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:278:24: ( ( ( classFlags )* KW_CLASS )=> classDef | ( ( protection )? KW_ENUM )=> enumDef | mixinDef )
            int alt14=3;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:278:25: ( ( classFlags )* KW_CLASS )=> classDef
                    {
                    pushFollow(FOLLOW_classDef_in_typeDef846);
                    classDef65=classDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDef65.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:279:4: ( ( protection )? KW_ENUM )=> enumDef
                    {
                    pushFollow(FOLLOW_enumDef_in_typeDef860);
                    enumDef66=enumDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumDef66.getTree());

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:279:37: mixinDef
                    {
                    pushFollow(FOLLOW_mixinDef_in_typeDef864);
                    mixinDef67=mixinDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, mixinDef67.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 14, typeDef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeDef"

    public static class classDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:280:1: classDef : ( classHeader classBody ) -> ^( AST_CLASS classHeader classBody ) ;
    public final FanParser.classDef_return classDef() throws RecognitionException {
        FanParser.classDef_return retval = new FanParser.classDef_return();
        retval.start = input.LT(1);
        int classDef_StartIndex = input.index();
        Object root_0 = null;

        FanParser.classHeader_return classHeader68 = null;

        FanParser.classBody_return classBody69 = null;


        RewriteRuleSubtreeStream stream_classHeader=new RewriteRuleSubtreeStream(adaptor,"rule classHeader");
        RewriteRuleSubtreeStream stream_classBody=new RewriteRuleSubtreeStream(adaptor,"rule classBody");
        paraphrase.push("Class definition");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:281:3: ( ( classHeader classBody ) -> ^( AST_CLASS classHeader classBody ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:281:7: ( classHeader classBody )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:281:7: ( classHeader classBody )
            // src/net/colar/netbeans/fan/antlr/Fan.g:281:8: classHeader classBody
            {
            pushFollow(FOLLOW_classHeader_in_classDef887);
            classHeader68=classHeader();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_classHeader.add(classHeader68.getTree());
            pushFollow(FOLLOW_classBody_in_classDef889);
            classBody69=classBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_classBody.add(classBody69.getTree());

            }



            // AST REWRITE
            // elements: classBody, classHeader
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 282:7: -> ^( AST_CLASS classHeader classBody )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:282:10: ^( AST_CLASS classHeader classBody )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CLASS, "AST_CLASS"), root_1);

                adaptor.addChild(root_1, stream_classHeader.nextTree());
                adaptor.addChild(root_1, stream_classBody.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 15, classDef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "classDef"

    public static class classHeader_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classHeader"
    // src/net/colar/netbeans/fan/antlr/Fan.g:283:1: classHeader : ( docs ( facet )* (m= classFlags )* KW_CLASS cname= id ( inheritance )? ) -> ^( $cname) ( ^( AST_INHERITANCE inheritance ) )? ( ^( AST_MODIFIER $m) )* ;
    public final FanParser.classHeader_return classHeader() throws RecognitionException {
        FanParser.classHeader_return retval = new FanParser.classHeader_return();
        retval.start = input.LT(1);
        int classHeader_StartIndex = input.index();
        Object root_0 = null;

        Token KW_CLASS72=null;
        FanParser.classFlags_return m = null;

        FanParser.id_return cname = null;

        FanParser.docs_return docs70 = null;

        FanParser.facet_return facet71 = null;

        FanParser.inheritance_return inheritance73 = null;


        Object KW_CLASS72_tree=null;
        RewriteRuleTokenStream stream_KW_CLASS=new RewriteRuleTokenStream(adaptor,"token KW_CLASS");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_facet=new RewriteRuleSubtreeStream(adaptor,"rule facet");
        RewriteRuleSubtreeStream stream_docs=new RewriteRuleSubtreeStream(adaptor,"rule docs");
        RewriteRuleSubtreeStream stream_classFlags=new RewriteRuleSubtreeStream(adaptor,"rule classFlags");
        RewriteRuleSubtreeStream stream_inheritance=new RewriteRuleSubtreeStream(adaptor,"rule inheritance");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:283:13: ( ( docs ( facet )* (m= classFlags )* KW_CLASS cname= id ( inheritance )? ) -> ^( $cname) ( ^( AST_INHERITANCE inheritance ) )? ( ^( AST_MODIFIER $m) )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:283:15: ( docs ( facet )* (m= classFlags )* KW_CLASS cname= id ( inheritance )? )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:283:15: ( docs ( facet )* (m= classFlags )* KW_CLASS cname= id ( inheritance )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:283:16: docs ( facet )* (m= classFlags )* KW_CLASS cname= id ( inheritance )?
            {
            pushFollow(FOLLOW_docs_in_classHeader914);
            docs70=docs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_docs.add(docs70.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:283:21: ( facet )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==AT) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: facet
            	    {
            	    pushFollow(FOLLOW_facet_in_classHeader916);
            	    facet71=facet();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_facet.add(facet71.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:283:29: (m= classFlags )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=KW_CONST && LA16_0<=KW_STATIC)||LA16_0==KW_FINAL||(LA16_0>=KW_ABSTRACT && LA16_0<=KW_INTERNAL)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: m= classFlags
            	    {
            	    pushFollow(FOLLOW_classFlags_in_classHeader921);
            	    m=classFlags();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_classFlags.add(m.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            KW_CLASS72=(Token)match(input,KW_CLASS,FOLLOW_KW_CLASS_in_classHeader924); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_CLASS.add(KW_CLASS72);

            pushFollow(FOLLOW_id_in_classHeader928);
            cname=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(cname.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:283:60: ( inheritance )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==SP_COLON) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: inheritance
                    {
                    pushFollow(FOLLOW_inheritance_in_classHeader930);
                    inheritance73=inheritance();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_inheritance.add(inheritance73.getTree());

                    }
                    break;

            }


            }



            // AST REWRITE
            // elements: cname, m, inheritance
            // token labels: 
            // rule labels: retval, m, cname
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_m=new RewriteRuleSubtreeStream(adaptor,"rule m",m!=null?m.tree:null);
            RewriteRuleSubtreeStream stream_cname=new RewriteRuleSubtreeStream(adaptor,"rule cname",cname!=null?cname.tree:null);

            root_0 = (Object)adaptor.nil();
            // 284:4: -> ^( $cname) ( ^( AST_INHERITANCE inheritance ) )? ( ^( AST_MODIFIER $m) )*
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:284:7: ^( $cname)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_cname.nextNode(), root_1);

                adaptor.addChild(root_0, root_1);
                }
                // src/net/colar/netbeans/fan/antlr/Fan.g:284:17: ( ^( AST_INHERITANCE inheritance ) )?
                if ( stream_inheritance.hasNext() ) {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:284:17: ^( AST_INHERITANCE inheritance )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_INHERITANCE, "AST_INHERITANCE"), root_1);

                    adaptor.addChild(root_1, stream_inheritance.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_inheritance.reset();
                // src/net/colar/netbeans/fan/antlr/Fan.g:284:49: ( ^( AST_MODIFIER $m) )*
                while ( stream_m.hasNext() ) {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:284:49: ^( AST_MODIFIER $m)
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_MODIFIER, "AST_MODIFIER"), root_1);

                    adaptor.addChild(root_1, stream_m.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_m.reset();

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 16, classHeader_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "classHeader"

    public static class classFlags_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classFlags"
    // src/net/colar/netbeans/fan/antlr/Fan.g:285:1: classFlags : ( protection | KW_ABSTRACT | KW_FINAL | KW_CONST | KW_STATIC );
    public final FanParser.classFlags_return classFlags() throws RecognitionException {
        FanParser.classFlags_return retval = new FanParser.classFlags_return();
        retval.start = input.LT(1);
        int classFlags_StartIndex = input.index();
        Object root_0 = null;

        Token KW_ABSTRACT75=null;
        Token KW_FINAL76=null;
        Token KW_CONST77=null;
        Token KW_STATIC78=null;
        FanParser.protection_return protection74 = null;


        Object KW_ABSTRACT75_tree=null;
        Object KW_FINAL76_tree=null;
        Object KW_CONST77_tree=null;
        Object KW_STATIC78_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:285:13: ( protection | KW_ABSTRACT | KW_FINAL | KW_CONST | KW_STATIC )
            int alt18=5;
            switch ( input.LA(1) ) {
            case KW_PRIVATE:
            case KW_PROTECTED:
            case KW_PUBLIC:
            case KW_INTERNAL:
                {
                alt18=1;
                }
                break;
            case KW_ABSTRACT:
                {
                alt18=2;
                }
                break;
            case KW_FINAL:
                {
                alt18=3;
                }
                break;
            case KW_CONST:
                {
                alt18=4;
                }
                break;
            case KW_STATIC:
                {
                alt18=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:285:15: protection
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_protection_in_classFlags965);
                    protection74=protection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, protection74.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:285:28: KW_ABSTRACT
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_ABSTRACT75=(Token)match(input,KW_ABSTRACT,FOLLOW_KW_ABSTRACT_in_classFlags969); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_ABSTRACT75_tree = (Object)adaptor.create(KW_ABSTRACT75);
                    adaptor.addChild(root_0, KW_ABSTRACT75_tree);
                    }

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:285:42: KW_FINAL
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_FINAL76=(Token)match(input,KW_FINAL,FOLLOW_KW_FINAL_in_classFlags973); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_FINAL76_tree = (Object)adaptor.create(KW_FINAL76);
                    adaptor.addChild(root_0, KW_FINAL76_tree);
                    }

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:285:53: KW_CONST
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_CONST77=(Token)match(input,KW_CONST,FOLLOW_KW_CONST_in_classFlags977); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_CONST77_tree = (Object)adaptor.create(KW_CONST77);
                    adaptor.addChild(root_0, KW_CONST77_tree);
                    }

                    }
                    break;
                case 5 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:285:64: KW_STATIC
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_STATIC78=(Token)match(input,KW_STATIC,FOLLOW_KW_STATIC_in_classFlags981); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_STATIC78_tree = (Object)adaptor.create(KW_STATIC78);
                    adaptor.addChild(root_0, KW_STATIC78_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 17, classFlags_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "classFlags"

    public static class classBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classBody"
    // src/net/colar/netbeans/fan/antlr/Fan.g:286:1: classBody : ( bracketL ( slotDef )* bracketR ) -> ^( AST_CODE_BLOCK bracketL ( slotDef )* bracketR ) ;
    public final FanParser.classBody_return classBody() throws RecognitionException {
        FanParser.classBody_return retval = new FanParser.classBody_return();
        retval.start = input.LT(1);
        int classBody_StartIndex = input.index();
        Object root_0 = null;

        FanParser.bracketL_return bracketL79 = null;

        FanParser.slotDef_return slotDef80 = null;

        FanParser.bracketR_return bracketR81 = null;


        RewriteRuleSubtreeStream stream_slotDef=new RewriteRuleSubtreeStream(adaptor,"rule slotDef");
        RewriteRuleSubtreeStream stream_bracketL=new RewriteRuleSubtreeStream(adaptor,"rule bracketL");
        RewriteRuleSubtreeStream stream_bracketR=new RewriteRuleSubtreeStream(adaptor,"rule bracketR");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:286:12: ( ( bracketL ( slotDef )* bracketR ) -> ^( AST_CODE_BLOCK bracketL ( slotDef )* bracketR ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:286:14: ( bracketL ( slotDef )* bracketR )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:286:14: ( bracketL ( slotDef )* bracketR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:286:15: bracketL ( slotDef )* bracketR
            {
            pushFollow(FOLLOW_bracketL_in_classBody990);
            bracketL79=bracketL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bracketL.add(bracketL79.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:286:24: ( slotDef )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=KW_RD_ONLY && LA19_0<=KW_FINAL)||(LA19_0>=KW_ABSTRACT && LA19_0<=KW_ONCE)||LA19_0==SP_PIPE||LA19_0==ID||(LA19_0>=AT && LA19_0<=DOC)||LA19_0==SQ_BRACKET_L) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: slotDef
            	    {
            	    pushFollow(FOLLOW_slotDef_in_classBody992);
            	    slotDef80=slotDef();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_slotDef.add(slotDef80.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            pushFollow(FOLLOW_bracketR_in_classBody995);
            bracketR81=bracketR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bracketR.add(bracketR81.getTree());

            }



            // AST REWRITE
            // elements: bracketL, bracketR, slotDef
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 286:44: -> ^( AST_CODE_BLOCK bracketL ( slotDef )* bracketR )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:286:47: ^( AST_CODE_BLOCK bracketL ( slotDef )* bracketR )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CODE_BLOCK, "AST_CODE_BLOCK"), root_1);

                adaptor.addChild(root_1, stream_bracketL.nextTree());
                // src/net/colar/netbeans/fan/antlr/Fan.g:286:73: ( slotDef )*
                while ( stream_slotDef.hasNext() ) {
                    adaptor.addChild(root_1, stream_slotDef.nextTree());

                }
                stream_slotDef.reset();
                adaptor.addChild(root_1, stream_bracketR.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 18, classBody_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "classBody"

    public static class protection_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "protection"
    // src/net/colar/netbeans/fan/antlr/Fan.g:287:1: protection : ( KW_PUBLIC | KW_PROTECTED | KW_PRIVATE | KW_INTERNAL );
    public final FanParser.protection_return protection() throws RecognitionException {
        FanParser.protection_return retval = new FanParser.protection_return();
        retval.start = input.LT(1);
        int protection_StartIndex = input.index();
        Object root_0 = null;

        Token set82=null;

        Object set82_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:287:12: ( KW_PUBLIC | KW_PROTECTED | KW_PRIVATE | KW_INTERNAL )
            // src/net/colar/netbeans/fan/antlr/Fan.g:
            {
            root_0 = (Object)adaptor.nil();

            set82=(Token)input.LT(1);
            if ( (input.LA(1)>=KW_PRIVATE && input.LA(1)<=KW_INTERNAL) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set82));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 19, protection_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "protection"

    public static class mixinDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mixinDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:288:1: mixinDef : ( mixinHeader mixinBody ) -> ^( AST_MIXIN mixinHeader mixinBody ) ;
    public final FanParser.mixinDef_return mixinDef() throws RecognitionException {
        FanParser.mixinDef_return retval = new FanParser.mixinDef_return();
        retval.start = input.LT(1);
        int mixinDef_StartIndex = input.index();
        Object root_0 = null;

        FanParser.mixinHeader_return mixinHeader83 = null;

        FanParser.mixinBody_return mixinBody84 = null;


        RewriteRuleSubtreeStream stream_mixinBody=new RewriteRuleSubtreeStream(adaptor,"rule mixinBody");
        RewriteRuleSubtreeStream stream_mixinHeader=new RewriteRuleSubtreeStream(adaptor,"rule mixinHeader");
        paraphrase.push("Mixin definition");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:289:3: ( ( mixinHeader mixinBody ) -> ^( AST_MIXIN mixinHeader mixinBody ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:289:5: ( mixinHeader mixinBody )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:289:5: ( mixinHeader mixinBody )
            // src/net/colar/netbeans/fan/antlr/Fan.g:289:6: mixinHeader mixinBody
            {
            pushFollow(FOLLOW_mixinHeader_in_mixinDef1048);
            mixinHeader83=mixinHeader();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_mixinHeader.add(mixinHeader83.getTree());
            pushFollow(FOLLOW_mixinBody_in_mixinDef1050);
            mixinBody84=mixinBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_mixinBody.add(mixinBody84.getTree());

            }



            // AST REWRITE
            // elements: mixinHeader, mixinBody
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 290:7: -> ^( AST_MIXIN mixinHeader mixinBody )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:290:10: ^( AST_MIXIN mixinHeader mixinBody )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_MIXIN, "AST_MIXIN"), root_1);

                adaptor.addChild(root_1, stream_mixinHeader.nextTree());
                adaptor.addChild(root_1, stream_mixinBody.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 20, mixinDef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "mixinDef"

    public static class mixinHeader_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mixinHeader"
    // src/net/colar/netbeans/fan/antlr/Fan.g:291:1: mixinHeader : ( docs ( facet )* (m= mixinFlags )* KW_MIXIN mname= id ( inheritance )? ) -> ^( $mname) ( ^( AST_INHERITANCE inheritance ) )? ( ^( AST_MODIFIER $m) )* ;
    public final FanParser.mixinHeader_return mixinHeader() throws RecognitionException {
        FanParser.mixinHeader_return retval = new FanParser.mixinHeader_return();
        retval.start = input.LT(1);
        int mixinHeader_StartIndex = input.index();
        Object root_0 = null;

        Token KW_MIXIN87=null;
        FanParser.mixinFlags_return m = null;

        FanParser.id_return mname = null;

        FanParser.docs_return docs85 = null;

        FanParser.facet_return facet86 = null;

        FanParser.inheritance_return inheritance88 = null;


        Object KW_MIXIN87_tree=null;
        RewriteRuleTokenStream stream_KW_MIXIN=new RewriteRuleTokenStream(adaptor,"token KW_MIXIN");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_facet=new RewriteRuleSubtreeStream(adaptor,"rule facet");
        RewriteRuleSubtreeStream stream_mixinFlags=new RewriteRuleSubtreeStream(adaptor,"rule mixinFlags");
        RewriteRuleSubtreeStream stream_docs=new RewriteRuleSubtreeStream(adaptor,"rule docs");
        RewriteRuleSubtreeStream stream_inheritance=new RewriteRuleSubtreeStream(adaptor,"rule inheritance");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:291:13: ( ( docs ( facet )* (m= mixinFlags )* KW_MIXIN mname= id ( inheritance )? ) -> ^( $mname) ( ^( AST_INHERITANCE inheritance ) )? ( ^( AST_MODIFIER $m) )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:291:15: ( docs ( facet )* (m= mixinFlags )* KW_MIXIN mname= id ( inheritance )? )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:291:15: ( docs ( facet )* (m= mixinFlags )* KW_MIXIN mname= id ( inheritance )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:291:16: docs ( facet )* (m= mixinFlags )* KW_MIXIN mname= id ( inheritance )?
            {
            pushFollow(FOLLOW_docs_in_mixinHeader1075);
            docs85=docs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_docs.add(docs85.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:291:21: ( facet )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==AT) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: facet
            	    {
            	    pushFollow(FOLLOW_facet_in_mixinHeader1077);
            	    facet86=facet();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_facet.add(facet86.getTree());

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:291:29: (m= mixinFlags )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=KW_CONST && LA21_0<=KW_STATIC)||LA21_0==KW_FINAL||(LA21_0>=KW_PRIVATE && LA21_0<=KW_INTERNAL)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: m= mixinFlags
            	    {
            	    pushFollow(FOLLOW_mixinFlags_in_mixinHeader1082);
            	    m=mixinFlags();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_mixinFlags.add(m.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            KW_MIXIN87=(Token)match(input,KW_MIXIN,FOLLOW_KW_MIXIN_in_mixinHeader1085); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_MIXIN.add(KW_MIXIN87);

            pushFollow(FOLLOW_id_in_mixinHeader1089);
            mname=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(mname.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:291:60: ( inheritance )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==SP_COLON) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: inheritance
                    {
                    pushFollow(FOLLOW_inheritance_in_mixinHeader1091);
                    inheritance88=inheritance();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_inheritance.add(inheritance88.getTree());

                    }
                    break;

            }


            }



            // AST REWRITE
            // elements: inheritance, m, mname
            // token labels: 
            // rule labels: mname, retval, m
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_mname=new RewriteRuleSubtreeStream(adaptor,"rule mname",mname!=null?mname.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_m=new RewriteRuleSubtreeStream(adaptor,"rule m",m!=null?m.tree:null);

            root_0 = (Object)adaptor.nil();
            // 292:4: -> ^( $mname) ( ^( AST_INHERITANCE inheritance ) )? ( ^( AST_MODIFIER $m) )*
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:292:7: ^( $mname)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_mname.nextNode(), root_1);

                adaptor.addChild(root_0, root_1);
                }
                // src/net/colar/netbeans/fan/antlr/Fan.g:292:17: ( ^( AST_INHERITANCE inheritance ) )?
                if ( stream_inheritance.hasNext() ) {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:292:17: ^( AST_INHERITANCE inheritance )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_INHERITANCE, "AST_INHERITANCE"), root_1);

                    adaptor.addChild(root_1, stream_inheritance.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_inheritance.reset();
                // src/net/colar/netbeans/fan/antlr/Fan.g:292:49: ( ^( AST_MODIFIER $m) )*
                while ( stream_m.hasNext() ) {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:292:49: ^( AST_MODIFIER $m)
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_MODIFIER, "AST_MODIFIER"), root_1);

                    adaptor.addChild(root_1, stream_m.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_m.reset();

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 21, mixinHeader_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "mixinHeader"

    public static class mixinFlags_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mixinFlags"
    // src/net/colar/netbeans/fan/antlr/Fan.g:293:1: mixinFlags : ( protection | KW_CONST | KW_STATIC | KW_FINAL );
    public final FanParser.mixinFlags_return mixinFlags() throws RecognitionException {
        FanParser.mixinFlags_return retval = new FanParser.mixinFlags_return();
        retval.start = input.LT(1);
        int mixinFlags_StartIndex = input.index();
        Object root_0 = null;

        Token KW_CONST90=null;
        Token KW_STATIC91=null;
        Token KW_FINAL92=null;
        FanParser.protection_return protection89 = null;


        Object KW_CONST90_tree=null;
        Object KW_STATIC91_tree=null;
        Object KW_FINAL92_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:293:12: ( protection | KW_CONST | KW_STATIC | KW_FINAL )
            int alt23=4;
            switch ( input.LA(1) ) {
            case KW_PRIVATE:
            case KW_PROTECTED:
            case KW_PUBLIC:
            case KW_INTERNAL:
                {
                alt23=1;
                }
                break;
            case KW_CONST:
                {
                alt23=2;
                }
                break;
            case KW_STATIC:
                {
                alt23=3;
                }
                break;
            case KW_FINAL:
                {
                alt23=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:293:14: protection
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_protection_in_mixinFlags1125);
                    protection89=protection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, protection89.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:293:27: KW_CONST
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_CONST90=(Token)match(input,KW_CONST,FOLLOW_KW_CONST_in_mixinFlags1129); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_CONST90_tree = (Object)adaptor.create(KW_CONST90);
                    adaptor.addChild(root_0, KW_CONST90_tree);
                    }

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:293:38: KW_STATIC
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_STATIC91=(Token)match(input,KW_STATIC,FOLLOW_KW_STATIC_in_mixinFlags1133); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_STATIC91_tree = (Object)adaptor.create(KW_STATIC91);
                    adaptor.addChild(root_0, KW_STATIC91_tree);
                    }

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:293:50: KW_FINAL
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_FINAL92=(Token)match(input,KW_FINAL,FOLLOW_KW_FINAL_in_mixinFlags1137); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_FINAL92_tree = (Object)adaptor.create(KW_FINAL92);
                    adaptor.addChild(root_0, KW_FINAL92_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 22, mixinFlags_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "mixinFlags"

    public static class mixinBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mixinBody"
    // src/net/colar/netbeans/fan/antlr/Fan.g:294:1: mixinBody : bracketL ( slotDef )* bracketR -> ^( AST_CODE_BLOCK bracketL ( slotDef )* bracketR ) ;
    public final FanParser.mixinBody_return mixinBody() throws RecognitionException {
        FanParser.mixinBody_return retval = new FanParser.mixinBody_return();
        retval.start = input.LT(1);
        int mixinBody_StartIndex = input.index();
        Object root_0 = null;

        FanParser.bracketL_return bracketL93 = null;

        FanParser.slotDef_return slotDef94 = null;

        FanParser.bracketR_return bracketR95 = null;


        RewriteRuleSubtreeStream stream_slotDef=new RewriteRuleSubtreeStream(adaptor,"rule slotDef");
        RewriteRuleSubtreeStream stream_bracketL=new RewriteRuleSubtreeStream(adaptor,"rule bracketL");
        RewriteRuleSubtreeStream stream_bracketR=new RewriteRuleSubtreeStream(adaptor,"rule bracketR");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:294:11: ( bracketL ( slotDef )* bracketR -> ^( AST_CODE_BLOCK bracketL ( slotDef )* bracketR ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:294:13: bracketL ( slotDef )* bracketR
            {
            pushFollow(FOLLOW_bracketL_in_mixinBody1144);
            bracketL93=bracketL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bracketL.add(bracketL93.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:294:22: ( slotDef )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=KW_RD_ONLY && LA24_0<=KW_FINAL)||(LA24_0>=KW_ABSTRACT && LA24_0<=KW_ONCE)||LA24_0==SP_PIPE||LA24_0==ID||(LA24_0>=AT && LA24_0<=DOC)||LA24_0==SQ_BRACKET_L) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: slotDef
            	    {
            	    pushFollow(FOLLOW_slotDef_in_mixinBody1146);
            	    slotDef94=slotDef();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_slotDef.add(slotDef94.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            pushFollow(FOLLOW_bracketR_in_mixinBody1149);
            bracketR95=bracketR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bracketR.add(bracketR95.getTree());


            // AST REWRITE
            // elements: bracketR, slotDef, bracketL
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 294:41: -> ^( AST_CODE_BLOCK bracketL ( slotDef )* bracketR )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:294:44: ^( AST_CODE_BLOCK bracketL ( slotDef )* bracketR )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CODE_BLOCK, "AST_CODE_BLOCK"), root_1);

                adaptor.addChild(root_1, stream_bracketL.nextTree());
                // src/net/colar/netbeans/fan/antlr/Fan.g:294:70: ( slotDef )*
                while ( stream_slotDef.hasNext() ) {
                    adaptor.addChild(root_1, stream_slotDef.nextTree());

                }
                stream_slotDef.reset();
                adaptor.addChild(root_1, stream_bracketR.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 23, mixinBody_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "mixinBody"

    public static class enumDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "enumDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:295:1: enumDef : ( enumHeader enumBody ) -> ^( AST_ENUM enumHeader enumBody ) ;
    public final FanParser.enumDef_return enumDef() throws RecognitionException {
        FanParser.enumDef_return retval = new FanParser.enumDef_return();
        retval.start = input.LT(1);
        int enumDef_StartIndex = input.index();
        Object root_0 = null;

        FanParser.enumHeader_return enumHeader96 = null;

        FanParser.enumBody_return enumBody97 = null;


        RewriteRuleSubtreeStream stream_enumBody=new RewriteRuleSubtreeStream(adaptor,"rule enumBody");
        RewriteRuleSubtreeStream stream_enumHeader=new RewriteRuleSubtreeStream(adaptor,"rule enumHeader");
        paraphrase.push("Enumeration definition");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:296:3: ( ( enumHeader enumBody ) -> ^( AST_ENUM enumHeader enumBody ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:296:5: ( enumHeader enumBody )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:296:5: ( enumHeader enumBody )
            // src/net/colar/netbeans/fan/antlr/Fan.g:296:6: enumHeader enumBody
            {
            pushFollow(FOLLOW_enumHeader_in_enumDef1183);
            enumHeader96=enumHeader();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_enumHeader.add(enumHeader96.getTree());
            pushFollow(FOLLOW_enumBody_in_enumDef1185);
            enumBody97=enumBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_enumBody.add(enumBody97.getTree());

            }



            // AST REWRITE
            // elements: enumBody, enumHeader
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 297:7: -> ^( AST_ENUM enumHeader enumBody )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:297:10: ^( AST_ENUM enumHeader enumBody )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_ENUM, "AST_ENUM"), root_1);

                adaptor.addChild(root_1, stream_enumHeader.nextTree());
                adaptor.addChild(root_1, stream_enumBody.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 24, enumDef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "enumDef"

    public static class enumHeader_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "enumHeader"
    // src/net/colar/netbeans/fan/antlr/Fan.g:298:1: enumHeader : ( docs ( facet )* (m= protection )? KW_ENUM ename= id ( inheritance )? ) -> ^( $ename) ( ^( AST_INHERITANCE inheritance ) )? ( ^( AST_MODIFIER $m) )* ;
    public final FanParser.enumHeader_return enumHeader() throws RecognitionException {
        FanParser.enumHeader_return retval = new FanParser.enumHeader_return();
        retval.start = input.LT(1);
        int enumHeader_StartIndex = input.index();
        Object root_0 = null;

        Token KW_ENUM100=null;
        FanParser.protection_return m = null;

        FanParser.id_return ename = null;

        FanParser.docs_return docs98 = null;

        FanParser.facet_return facet99 = null;

        FanParser.inheritance_return inheritance101 = null;


        Object KW_ENUM100_tree=null;
        RewriteRuleTokenStream stream_KW_ENUM=new RewriteRuleTokenStream(adaptor,"token KW_ENUM");
        RewriteRuleSubtreeStream stream_protection=new RewriteRuleSubtreeStream(adaptor,"rule protection");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_facet=new RewriteRuleSubtreeStream(adaptor,"rule facet");
        RewriteRuleSubtreeStream stream_docs=new RewriteRuleSubtreeStream(adaptor,"rule docs");
        RewriteRuleSubtreeStream stream_inheritance=new RewriteRuleSubtreeStream(adaptor,"rule inheritance");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:298:12: ( ( docs ( facet )* (m= protection )? KW_ENUM ename= id ( inheritance )? ) -> ^( $ename) ( ^( AST_INHERITANCE inheritance ) )? ( ^( AST_MODIFIER $m) )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:298:17: ( docs ( facet )* (m= protection )? KW_ENUM ename= id ( inheritance )? )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:298:17: ( docs ( facet )* (m= protection )? KW_ENUM ename= id ( inheritance )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:298:18: docs ( facet )* (m= protection )? KW_ENUM ename= id ( inheritance )?
            {
            pushFollow(FOLLOW_docs_in_enumHeader1213);
            docs98=docs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_docs.add(docs98.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:298:23: ( facet )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==AT) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: facet
            	    {
            	    pushFollow(FOLLOW_facet_in_enumHeader1215);
            	    facet99=facet();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_facet.add(facet99.getTree());

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:298:31: (m= protection )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=KW_PRIVATE && LA26_0<=KW_INTERNAL)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: m= protection
                    {
                    pushFollow(FOLLOW_protection_in_enumHeader1220);
                    m=protection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_protection.add(m.getTree());

                    }
                    break;

            }

            KW_ENUM100=(Token)match(input,KW_ENUM,FOLLOW_KW_ENUM_in_enumHeader1223); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_ENUM.add(KW_ENUM100);

            pushFollow(FOLLOW_id_in_enumHeader1227);
            ename=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(ename.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:298:61: ( inheritance )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==SP_COLON) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: inheritance
                    {
                    pushFollow(FOLLOW_inheritance_in_enumHeader1229);
                    inheritance101=inheritance();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_inheritance.add(inheritance101.getTree());

                    }
                    break;

            }


            }



            // AST REWRITE
            // elements: ename, m, inheritance
            // token labels: 
            // rule labels: retval, ename, m
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_ename=new RewriteRuleSubtreeStream(adaptor,"rule ename",ename!=null?ename.tree:null);
            RewriteRuleSubtreeStream stream_m=new RewriteRuleSubtreeStream(adaptor,"rule m",m!=null?m.tree:null);

            root_0 = (Object)adaptor.nil();
            // 299:4: -> ^( $ename) ( ^( AST_INHERITANCE inheritance ) )? ( ^( AST_MODIFIER $m) )*
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:299:7: ^( $ename)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_ename.nextNode(), root_1);

                adaptor.addChild(root_0, root_1);
                }
                // src/net/colar/netbeans/fan/antlr/Fan.g:299:17: ( ^( AST_INHERITANCE inheritance ) )?
                if ( stream_inheritance.hasNext() ) {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:299:17: ^( AST_INHERITANCE inheritance )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_INHERITANCE, "AST_INHERITANCE"), root_1);

                    adaptor.addChild(root_1, stream_inheritance.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_inheritance.reset();
                // src/net/colar/netbeans/fan/antlr/Fan.g:299:49: ( ^( AST_MODIFIER $m) )*
                while ( stream_m.hasNext() ) {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:299:49: ^( AST_MODIFIER $m)
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_MODIFIER, "AST_MODIFIER"), root_1);

                    adaptor.addChild(root_1, stream_m.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_m.reset();

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 25, enumHeader_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "enumHeader"

    public static class enumBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "enumBody"
    // src/net/colar/netbeans/fan/antlr/Fan.g:300:1: enumBody : bracketL enumValDefs ( slotDef )* bracketR -> ^( AST_CODE_BLOCK bracketL enumValDefs ( slotDef )* bracketR ) ;
    public final FanParser.enumBody_return enumBody() throws RecognitionException {
        FanParser.enumBody_return retval = new FanParser.enumBody_return();
        retval.start = input.LT(1);
        int enumBody_StartIndex = input.index();
        Object root_0 = null;

        FanParser.bracketL_return bracketL102 = null;

        FanParser.enumValDefs_return enumValDefs103 = null;

        FanParser.slotDef_return slotDef104 = null;

        FanParser.bracketR_return bracketR105 = null;


        RewriteRuleSubtreeStream stream_slotDef=new RewriteRuleSubtreeStream(adaptor,"rule slotDef");
        RewriteRuleSubtreeStream stream_bracketL=new RewriteRuleSubtreeStream(adaptor,"rule bracketL");
        RewriteRuleSubtreeStream stream_bracketR=new RewriteRuleSubtreeStream(adaptor,"rule bracketR");
        RewriteRuleSubtreeStream stream_enumValDefs=new RewriteRuleSubtreeStream(adaptor,"rule enumValDefs");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:300:10: ( bracketL enumValDefs ( slotDef )* bracketR -> ^( AST_CODE_BLOCK bracketL enumValDefs ( slotDef )* bracketR ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:300:12: bracketL enumValDefs ( slotDef )* bracketR
            {
            pushFollow(FOLLOW_bracketL_in_enumBody1263);
            bracketL102=bracketL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bracketL.add(bracketL102.getTree());
            pushFollow(FOLLOW_enumValDefs_in_enumBody1265);
            enumValDefs103=enumValDefs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_enumValDefs.add(enumValDefs103.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:300:33: ( slotDef )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=KW_RD_ONLY && LA28_0<=KW_FINAL)||(LA28_0>=KW_ABSTRACT && LA28_0<=KW_ONCE)||LA28_0==SP_PIPE||LA28_0==ID||(LA28_0>=AT && LA28_0<=DOC)||LA28_0==SQ_BRACKET_L) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: slotDef
            	    {
            	    pushFollow(FOLLOW_slotDef_in_enumBody1267);
            	    slotDef104=slotDef();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_slotDef.add(slotDef104.getTree());

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            pushFollow(FOLLOW_bracketR_in_enumBody1270);
            bracketR105=bracketR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bracketR.add(bracketR105.getTree());


            // AST REWRITE
            // elements: enumValDefs, bracketR, slotDef, bracketL
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 300:53: -> ^( AST_CODE_BLOCK bracketL enumValDefs ( slotDef )* bracketR )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:300:56: ^( AST_CODE_BLOCK bracketL enumValDefs ( slotDef )* bracketR )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CODE_BLOCK, "AST_CODE_BLOCK"), root_1);

                adaptor.addChild(root_1, stream_bracketL.nextTree());
                adaptor.addChild(root_1, stream_enumValDefs.nextTree());
                // src/net/colar/netbeans/fan/antlr/Fan.g:300:94: ( slotDef )*
                while ( stream_slotDef.hasNext() ) {
                    adaptor.addChild(root_1, stream_slotDef.nextTree());

                }
                stream_slotDef.reset();
                adaptor.addChild(root_1, stream_bracketR.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 26, enumBody_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "enumBody"

    public static class inheritance_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inheritance"
    // src/net/colar/netbeans/fan/antlr/Fan.g:301:1: inheritance : SP_COLON typeList ;
    public final FanParser.inheritance_return inheritance() throws RecognitionException {
        FanParser.inheritance_return retval = new FanParser.inheritance_return();
        retval.start = input.LT(1);
        int inheritance_StartIndex = input.index();
        Object root_0 = null;

        Token SP_COLON106=null;
        FanParser.typeList_return typeList107 = null;


        Object SP_COLON106_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:301:14: ( SP_COLON typeList )
            // src/net/colar/netbeans/fan/antlr/Fan.g:301:16: SP_COLON typeList
            {
            root_0 = (Object)adaptor.nil();

            SP_COLON106=(Token)match(input,SP_COLON,FOLLOW_SP_COLON_in_inheritance1295); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SP_COLON106_tree = (Object)adaptor.create(SP_COLON106);
            adaptor.addChild(root_0, SP_COLON106_tree);
            }
            pushFollow(FOLLOW_typeList_in_inheritance1297);
            typeList107=typeList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList107.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 27, inheritance_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "inheritance"

    public static class enumValDefs_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "enumValDefs"
    // src/net/colar/netbeans/fan/antlr/Fan.g:303:1: enumValDefs : enumValDef ( SP_COMMA enumValDef )* eos ;
    public final FanParser.enumValDefs_return enumValDefs() throws RecognitionException {
        FanParser.enumValDefs_return retval = new FanParser.enumValDefs_return();
        retval.start = input.LT(1);
        int enumValDefs_StartIndex = input.index();
        Object root_0 = null;

        Token SP_COMMA109=null;
        FanParser.enumValDef_return enumValDef108 = null;

        FanParser.enumValDef_return enumValDef110 = null;

        FanParser.eos_return eos111 = null;


        Object SP_COMMA109_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:303:14: ( enumValDef ( SP_COMMA enumValDef )* eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:303:16: enumValDef ( SP_COMMA enumValDef )* eos
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_enumValDef_in_enumValDefs1307);
            enumValDef108=enumValDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, enumValDef108.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:303:27: ( SP_COMMA enumValDef )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==SP_COMMA) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:303:28: SP_COMMA enumValDef
            	    {
            	    SP_COMMA109=(Token)match(input,SP_COMMA,FOLLOW_SP_COMMA_in_enumValDefs1310); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    SP_COMMA109_tree = (Object)adaptor.create(SP_COMMA109);
            	    adaptor.addChild(root_0, SP_COMMA109_tree);
            	    }
            	    pushFollow(FOLLOW_enumValDef_in_enumValDefs1313);
            	    enumValDef110=enumValDef();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumValDef110.getTree());

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            pushFollow(FOLLOW_eos_in_enumValDefs1317);
            eos111=eos();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, eos111.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 28, enumValDefs_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "enumValDefs"

    public static class enumValDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "enumValDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:304:1: enumValDef : docs id ( parL ( args )? parR )? ;
    public final FanParser.enumValDef_return enumValDef() throws RecognitionException {
        FanParser.enumValDef_return retval = new FanParser.enumValDef_return();
        retval.start = input.LT(1);
        int enumValDef_StartIndex = input.index();
        Object root_0 = null;

        FanParser.docs_return docs112 = null;

        FanParser.id_return id113 = null;

        FanParser.parL_return parL114 = null;

        FanParser.args_return args115 = null;

        FanParser.parR_return parR116 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:304:13: ( docs id ( parL ( args )? parR )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:304:15: docs id ( parL ( args )? parR )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_docs_in_enumValDef1325);
            docs112=docs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, docs112.getTree());
            pushFollow(FOLLOW_id_in_enumValDef1327);
            id113=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id113.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:304:23: ( parL ( args )? parR )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==PAR_L) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:304:24: parL ( args )? parR
                    {
                    pushFollow(FOLLOW_parL_in_enumValDef1330);
                    parL114=parL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parL114.getTree());
                    // src/net/colar/netbeans/fan/antlr/Fan.g:304:29: ( args )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( ((LA30_0>=KW_THIS && LA30_0<=KW_SUPER)||(LA30_0>=KW_NULL && LA30_0<=KW_FALSE)||LA30_0==SP_PIPE||LA30_0==OP_CURRY||(LA30_0>=OP_PLUS && LA30_0<=OP_MULTI)||(LA30_0>=OP_BANG && LA30_0<=OP_TILDA)||(LA30_0>=ID && LA30_0<=AT)||(LA30_0>=NUMBER && LA30_0<=SQ_BRACKET_L)||LA30_0==PAR_L) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: args
                            {
                            pushFollow(FOLLOW_args_in_enumValDef1332);
                            args115=args();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, args115.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_parR_in_enumValDef1335);
                    parR116=parR();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parR116.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 29, enumValDef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "enumValDef"

    public static class typeList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeList"
    // src/net/colar/netbeans/fan/antlr/Fan.g:305:1: typeList : type ( SP_COMMA type )* ;
    public final FanParser.typeList_return typeList() throws RecognitionException {
        FanParser.typeList_return retval = new FanParser.typeList_return();
        retval.start = input.LT(1);
        int typeList_StartIndex = input.index();
        Object root_0 = null;

        Token SP_COMMA118=null;
        FanParser.type_return type117 = null;

        FanParser.type_return type119 = null;


        Object SP_COMMA118_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:305:10: ( type ( SP_COMMA type )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:305:14: type ( SP_COMMA type )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_type_in_typeList1346);
            type117=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type117.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:305:19: ( SP_COMMA type )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==SP_COMMA) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:305:20: SP_COMMA type
            	    {
            	    SP_COMMA118=(Token)match(input,SP_COMMA,FOLLOW_SP_COMMA_in_typeList1349); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    SP_COMMA118_tree = (Object)adaptor.create(SP_COMMA118);
            	    adaptor.addChild(root_0, SP_COMMA118_tree);
            	    }
            	    pushFollow(FOLLOW_type_in_typeList1351);
            	    type119=type();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type119.getTree());

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 30, typeList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeList"

    public static class type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // src/net/colar/netbeans/fan/antlr/Fan.g:307:1: type : typeRoot ( SP_QMARK )? ( LIST_TYPE ( SP_QMARK )? )* ;
    public final FanParser.type_return type() throws RecognitionException {
        FanParser.type_return retval = new FanParser.type_return();
        retval.start = input.LT(1);
        int type_StartIndex = input.index();
        Object root_0 = null;

        Token SP_QMARK121=null;
        Token LIST_TYPE122=null;
        Token SP_QMARK123=null;
        FanParser.typeRoot_return typeRoot120 = null;


        Object SP_QMARK121_tree=null;
        Object LIST_TYPE122_tree=null;
        Object SP_QMARK123_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:307:14: ( typeRoot ( SP_QMARK )? ( LIST_TYPE ( SP_QMARK )? )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:307:18: typeRoot ( SP_QMARK )? ( LIST_TYPE ( SP_QMARK )? )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_typeRoot_in_type1371);
            typeRoot120=typeRoot();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeRoot120.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:307:28: ( SP_QMARK )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==SP_QMARK) ) {
                int LA33_1 = input.LA(2);

                if ( (synpred48_Fan()) ) {
                    alt33=1;
                }
            }
            switch (alt33) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_QMARK
                    {
                    SP_QMARK121=(Token)match(input,SP_QMARK,FOLLOW_SP_QMARK_in_type1374); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SP_QMARK121_tree = (Object)adaptor.create(SP_QMARK121);
                    adaptor.addChild(root_0, SP_QMARK121_tree);
                    }

                    }
                    break;

            }

            // src/net/colar/netbeans/fan/antlr/Fan.g:307:38: ( LIST_TYPE ( SP_QMARK )? )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==LIST_TYPE) ) {
                    int LA35_2 = input.LA(2);

                    if ( (synpred50_Fan()) ) {
                        alt35=1;
                    }


                }


                switch (alt35) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:307:39: LIST_TYPE ( SP_QMARK )?
            	    {
            	    LIST_TYPE122=(Token)match(input,LIST_TYPE,FOLLOW_LIST_TYPE_in_type1378); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    LIST_TYPE122_tree = (Object)adaptor.create(LIST_TYPE122);
            	    adaptor.addChild(root_0, LIST_TYPE122_tree);
            	    }
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:307:49: ( SP_QMARK )?
            	    int alt34=2;
            	    int LA34_0 = input.LA(1);

            	    if ( (LA34_0==SP_QMARK) ) {
            	        int LA34_1 = input.LA(2);

            	        if ( (synpred49_Fan()) ) {
            	            alt34=1;
            	        }
            	    }
            	    switch (alt34) {
            	        case 1 :
            	            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_QMARK
            	            {
            	            SP_QMARK123=(Token)match(input,SP_QMARK,FOLLOW_SP_QMARK_in_type1380); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SP_QMARK123_tree = (Object)adaptor.create(SP_QMARK123);
            	            adaptor.addChild(root_0, SP_QMARK123_tree);
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 31, type_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "type"

    public static class typeRoot_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeRoot"
    // src/net/colar/netbeans/fan/antlr/Fan.g:308:1: typeRoot : ( mapType | nonMapType );
    public final FanParser.typeRoot_return typeRoot() throws RecognitionException {
        FanParser.typeRoot_return retval = new FanParser.typeRoot_return();
        retval.start = input.LT(1);
        int typeRoot_StartIndex = input.index();
        Object root_0 = null;

        FanParser.mapType_return mapType124 = null;

        FanParser.nonMapType_return nonMapType125 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:308:10: ( mapType | nonMapType )
            int alt36=2;
            switch ( input.LA(1) ) {
            case SQ_BRACKET_L:
                {
                alt36=1;
                }
                break;
            case SP_PIPE:
                {
                int LA36_2 = input.LA(2);

                if ( (synpred51_Fan()) ) {
                    alt36=1;
                }
                else if ( (true) ) {
                    alt36=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 2, input);

                    throw nvae;
                }
                }
                break;
            case ID:
                {
                int LA36_3 = input.LA(2);

                if ( (synpred51_Fan()) ) {
                    alt36=1;
                }
                else if ( (true) ) {
                    alt36=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:308:12: mapType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_mapType_in_typeRoot1391);
                    mapType124=mapType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, mapType124.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:308:22: nonMapType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_nonMapType_in_typeRoot1395);
                    nonMapType125=nonMapType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nonMapType125.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 32, typeRoot_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeRoot"

    public static class nonMapType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nonMapType"
    // src/net/colar/netbeans/fan/antlr/Fan.g:309:1: nonMapType : ( funcType | simpleType );
    public final FanParser.nonMapType_return nonMapType() throws RecognitionException {
        FanParser.nonMapType_return retval = new FanParser.nonMapType_return();
        retval.start = input.LT(1);
        int nonMapType_StartIndex = input.index();
        Object root_0 = null;

        FanParser.funcType_return funcType126 = null;

        FanParser.simpleType_return simpleType127 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:309:12: ( funcType | simpleType )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==SP_PIPE) ) {
                alt37=1;
            }
            else if ( (LA37_0==ID) ) {
                alt37=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:309:14: funcType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_funcType_in_nonMapType1402);
                    funcType126=funcType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType126.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:309:25: simpleType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_simpleType_in_nonMapType1406);
                    simpleType127=simpleType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleType127.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 33, nonMapType_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "nonMapType"

    public static class simpleType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "simpleType"
    // src/net/colar/netbeans/fan/antlr/Fan.g:310:1: simpleType : id ( SP_COLCOL id )? ;
    public final FanParser.simpleType_return simpleType() throws RecognitionException {
        FanParser.simpleType_return retval = new FanParser.simpleType_return();
        retval.start = input.LT(1);
        int simpleType_StartIndex = input.index();
        Object root_0 = null;

        Token SP_COLCOL129=null;
        FanParser.id_return id128 = null;

        FanParser.id_return id130 = null;


        Object SP_COLCOL129_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:310:17: ( id ( SP_COLCOL id )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:310:21: id ( SP_COLCOL id )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_id_in_simpleType1420);
            id128=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id128.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:310:24: ( SP_COLCOL id )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==SP_COLCOL) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:310:25: SP_COLCOL id
                    {
                    SP_COLCOL129=(Token)match(input,SP_COLCOL,FOLLOW_SP_COLCOL_in_simpleType1423); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SP_COLCOL129_tree = (Object)adaptor.create(SP_COLCOL129);
                    adaptor.addChild(root_0, SP_COLCOL129_tree);
                    }
                    pushFollow(FOLLOW_id_in_simpleType1425);
                    id130=id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, id130.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 34, simpleType_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "simpleType"

    public static class mapType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mapType"
    // src/net/colar/netbeans/fan/antlr/Fan.g:312:1: mapType : ( sq_bracketL )? nonMapType ( SP_QMARK )? ( LIST_TYPE ( SP_QMARK )? )* ({...}? SP_COLON {...}? type )+ ( sq_bracketR )? -> ^( AST_MAP ^( AST_CHILD nonMapType ) ^( AST_CHILD type ) ) ;
    public final FanParser.mapType_return mapType() throws RecognitionException {
        FanParser.mapType_return retval = new FanParser.mapType_return();
        retval.start = input.LT(1);
        int mapType_StartIndex = input.index();
        Object root_0 = null;

        Token SP_QMARK133=null;
        Token LIST_TYPE134=null;
        Token SP_QMARK135=null;
        Token SP_COLON136=null;
        FanParser.sq_bracketL_return sq_bracketL131 = null;

        FanParser.nonMapType_return nonMapType132 = null;

        FanParser.type_return type137 = null;

        FanParser.sq_bracketR_return sq_bracketR138 = null;


        Object SP_QMARK133_tree=null;
        Object LIST_TYPE134_tree=null;
        Object SP_QMARK135_tree=null;
        Object SP_COLON136_tree=null;
        RewriteRuleTokenStream stream_SP_QMARK=new RewriteRuleTokenStream(adaptor,"token SP_QMARK");
        RewriteRuleTokenStream stream_SP_COLON=new RewriteRuleTokenStream(adaptor,"token SP_COLON");
        RewriteRuleTokenStream stream_LIST_TYPE=new RewriteRuleTokenStream(adaptor,"token LIST_TYPE");
        RewriteRuleSubtreeStream stream_nonMapType=new RewriteRuleSubtreeStream(adaptor,"rule nonMapType");
        RewriteRuleSubtreeStream stream_sq_bracketR=new RewriteRuleSubtreeStream(adaptor,"rule sq_bracketR");
        RewriteRuleSubtreeStream stream_sq_bracketL=new RewriteRuleSubtreeStream(adaptor,"rule sq_bracketL");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:312:10: ( ( sq_bracketL )? nonMapType ( SP_QMARK )? ( LIST_TYPE ( SP_QMARK )? )* ({...}? SP_COLON {...}? type )+ ( sq_bracketR )? -> ^( AST_MAP ^( AST_CHILD nonMapType ) ^( AST_CHILD type ) ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:312:12: ( sq_bracketL )? nonMapType ( SP_QMARK )? ( LIST_TYPE ( SP_QMARK )? )* ({...}? SP_COLON {...}? type )+ ( sq_bracketR )?
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:312:12: ( sq_bracketL )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==SQ_BRACKET_L) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: sq_bracketL
                    {
                    pushFollow(FOLLOW_sq_bracketL_in_mapType1436);
                    sq_bracketL131=sq_bracketL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_sq_bracketL.add(sq_bracketL131.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_nonMapType_in_mapType1439);
            nonMapType132=nonMapType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_nonMapType.add(nonMapType132.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:312:36: ( SP_QMARK )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==SP_QMARK) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_QMARK
                    {
                    SP_QMARK133=(Token)match(input,SP_QMARK,FOLLOW_SP_QMARK_in_mapType1441); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SP_QMARK.add(SP_QMARK133);


                    }
                    break;

            }

            // src/net/colar/netbeans/fan/antlr/Fan.g:312:46: ( LIST_TYPE ( SP_QMARK )? )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==LIST_TYPE) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:312:47: LIST_TYPE ( SP_QMARK )?
            	    {
            	    LIST_TYPE134=(Token)match(input,LIST_TYPE,FOLLOW_LIST_TYPE_in_mapType1445); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LIST_TYPE.add(LIST_TYPE134);

            	    // src/net/colar/netbeans/fan/antlr/Fan.g:312:57: ( SP_QMARK )?
            	    int alt41=2;
            	    int LA41_0 = input.LA(1);

            	    if ( (LA41_0==SP_QMARK) ) {
            	        alt41=1;
            	    }
            	    switch (alt41) {
            	        case 1 :
            	            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_QMARK
            	            {
            	            SP_QMARK135=(Token)match(input,SP_QMARK,FOLLOW_SP_QMARK_in_mapType1447); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_SP_QMARK.add(SP_QMARK135);


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:313:5: ({...}? SP_COLON {...}? type )+
            int cnt43=0;
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==SP_COLON) ) {
                    int LA43_2 = input.LA(2);

                    if ( ((synpred58_Fan()&&(notAfterEol()))) ) {
                        alt43=1;
                    }


                }


                switch (alt43) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:313:6: {...}? SP_COLON {...}? type
            	    {
            	    if ( !((notAfterEol())) ) {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        throw new FailedPredicateException(input, "mapType", "notAfterEol()");
            	    }
            	    SP_COLON136=(Token)match(input,SP_COLON,FOLLOW_SP_COLON_in_mapType1459); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_SP_COLON.add(SP_COLON136);

            	    if ( !((notAfterEol())) ) {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        throw new FailedPredicateException(input, "mapType", "notAfterEol()");
            	    }
            	    pushFollow(FOLLOW_type_in_mapType1463);
            	    type137=type();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_type.add(type137.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt43 >= 1 ) break loop43;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(43, input);
                        throw eee;
                }
                cnt43++;
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:313:56: ( sq_bracketR )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==SQ_BRACKET_R) ) {
                int LA44_1 = input.LA(2);

                if ( (synpred59_Fan()) ) {
                    alt44=1;
                }
            }
            switch (alt44) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: sq_bracketR
                    {
                    pushFollow(FOLLOW_sq_bracketR_in_mapType1467);
                    sq_bracketR138=sq_bracketR();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_sq_bracketR.add(sq_bracketR138.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: type, nonMapType
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 314:4: -> ^( AST_MAP ^( AST_CHILD nonMapType ) ^( AST_CHILD type ) )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:314:7: ^( AST_MAP ^( AST_CHILD nonMapType ) ^( AST_CHILD type ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_MAP, "AST_MAP"), root_1);

                // src/net/colar/netbeans/fan/antlr/Fan.g:314:17: ^( AST_CHILD nonMapType )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CHILD, "AST_CHILD"), root_2);

                adaptor.addChild(root_2, stream_nonMapType.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // src/net/colar/netbeans/fan/antlr/Fan.g:314:41: ^( AST_CHILD type )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CHILD, "AST_CHILD"), root_2);

                adaptor.addChild(root_2, stream_type.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 35, mapType_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "mapType"

    public static class funcType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "funcType"
    // src/net/colar/netbeans/fan/antlr/Fan.g:316:1: funcType : SP_PIPE ( SP_COMMA | ( formals ( ( OP_ARROW )=> assignedType )? ) | ( ( OP_ARROW )=> assignedType ) ) SP_PIPE ;
    public final FanParser.funcType_return funcType() throws RecognitionException {
        FanParser.funcType_return retval = new FanParser.funcType_return();
        retval.start = input.LT(1);
        int funcType_StartIndex = input.index();
        Object root_0 = null;

        Token SP_PIPE139=null;
        Token SP_COMMA140=null;
        Token SP_PIPE144=null;
        FanParser.formals_return formals141 = null;

        FanParser.assignedType_return assignedType142 = null;

        FanParser.assignedType_return assignedType143 = null;


        Object SP_PIPE139_tree=null;
        Object SP_COMMA140_tree=null;
        Object SP_PIPE144_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:316:11: ( SP_PIPE ( SP_COMMA | ( formals ( ( OP_ARROW )=> assignedType )? ) | ( ( OP_ARROW )=> assignedType ) ) SP_PIPE )
            // src/net/colar/netbeans/fan/antlr/Fan.g:316:13: SP_PIPE ( SP_COMMA | ( formals ( ( OP_ARROW )=> assignedType )? ) | ( ( OP_ARROW )=> assignedType ) ) SP_PIPE
            {
            root_0 = (Object)adaptor.nil();

            SP_PIPE139=(Token)match(input,SP_PIPE,FOLLOW_SP_PIPE_in_funcType1498); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SP_PIPE139_tree = (Object)adaptor.create(SP_PIPE139);
            adaptor.addChild(root_0, SP_PIPE139_tree);
            }
            // src/net/colar/netbeans/fan/antlr/Fan.g:316:21: ( SP_COMMA | ( formals ( ( OP_ARROW )=> assignedType )? ) | ( ( OP_ARROW )=> assignedType ) )
            int alt46=3;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==SP_COMMA) ) {
                alt46=1;
            }
            else if ( (LA46_0==SP_PIPE||LA46_0==ID||LA46_0==SQ_BRACKET_L) ) {
                alt46=2;
            }
            else if ( (LA46_0==OP_ARROW) && (synpred63_Fan())) {
                alt46=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:316:22: SP_COMMA
                    {
                    SP_COMMA140=(Token)match(input,SP_COMMA,FOLLOW_SP_COMMA_in_funcType1501); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SP_COMMA140_tree = (Object)adaptor.create(SP_COMMA140);
                    adaptor.addChild(root_0, SP_COMMA140_tree);
                    }

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:316:33: ( formals ( ( OP_ARROW )=> assignedType )? )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:316:33: ( formals ( ( OP_ARROW )=> assignedType )? )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:316:34: formals ( ( OP_ARROW )=> assignedType )?
                    {
                    pushFollow(FOLLOW_formals_in_funcType1506);
                    formals141=formals();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, formals141.getTree());
                    // src/net/colar/netbeans/fan/antlr/Fan.g:316:42: ( ( OP_ARROW )=> assignedType )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==OP_ARROW) && (synpred61_Fan())) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // src/net/colar/netbeans/fan/antlr/Fan.g:316:43: ( OP_ARROW )=> assignedType
                            {
                            pushFollow(FOLLOW_assignedType_in_funcType1513);
                            assignedType142=assignedType();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignedType142.getTree());

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:316:73: ( ( OP_ARROW )=> assignedType )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:316:73: ( ( OP_ARROW )=> assignedType )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:316:74: ( OP_ARROW )=> assignedType
                    {
                    pushFollow(FOLLOW_assignedType_in_funcType1525);
                    assignedType143=assignedType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignedType143.getTree());

                    }


                    }
                    break;

            }

            SP_PIPE144=(Token)match(input,SP_PIPE,FOLLOW_SP_PIPE_in_funcType1529); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SP_PIPE144_tree = (Object)adaptor.create(SP_PIPE144);
            adaptor.addChild(root_0, SP_PIPE144_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 36, funcType_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "funcType"

    public static class assignedType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignedType"
    // src/net/colar/netbeans/fan/antlr/Fan.g:317:1: assignedType : OP_ARROW ( type )? ;
    public final FanParser.assignedType_return assignedType() throws RecognitionException {
        FanParser.assignedType_return retval = new FanParser.assignedType_return();
        retval.start = input.LT(1);
        int assignedType_StartIndex = input.index();
        Object root_0 = null;

        Token OP_ARROW145=null;
        FanParser.type_return type146 = null;


        Object OP_ARROW145_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:317:14: ( OP_ARROW ( type )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:317:16: OP_ARROW ( type )?
            {
            root_0 = (Object)adaptor.nil();

            OP_ARROW145=(Token)match(input,OP_ARROW,FOLLOW_OP_ARROW_in_assignedType1536); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            OP_ARROW145_tree = (Object)adaptor.create(OP_ARROW145);
            adaptor.addChild(root_0, OP_ARROW145_tree);
            }
            // src/net/colar/netbeans/fan/antlr/Fan.g:317:25: ( type )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==ID||LA47_0==SQ_BRACKET_L) ) {
                alt47=1;
            }
            else if ( (LA47_0==SP_PIPE) ) {
                int LA47_2 = input.LA(2);

                if ( (synpred64_Fan()) ) {
                    alt47=1;
                }
            }
            switch (alt47) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: type
                    {
                    pushFollow(FOLLOW_type_in_assignedType1538);
                    type146=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type146.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 37, assignedType_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "assignedType"

    public static class formals_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formals"
    // src/net/colar/netbeans/fan/antlr/Fan.g:318:1: formals : formal ( SP_COMMA formal )* ;
    public final FanParser.formals_return formals() throws RecognitionException {
        FanParser.formals_return retval = new FanParser.formals_return();
        retval.start = input.LT(1);
        int formals_StartIndex = input.index();
        Object root_0 = null;

        Token SP_COMMA148=null;
        FanParser.formal_return formal147 = null;

        FanParser.formal_return formal149 = null;


        Object SP_COMMA148_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:318:10: ( formal ( SP_COMMA formal )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:318:14: formal ( SP_COMMA formal )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_formal_in_formals1549);
            formal147=formal();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, formal147.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:318:21: ( SP_COMMA formal )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==SP_COMMA) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:318:22: SP_COMMA formal
            	    {
            	    SP_COMMA148=(Token)match(input,SP_COMMA,FOLLOW_SP_COMMA_in_formals1552); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    SP_COMMA148_tree = (Object)adaptor.create(SP_COMMA148);
            	    adaptor.addChild(root_0, SP_COMMA148_tree);
            	    }
            	    pushFollow(FOLLOW_formal_in_formals1554);
            	    formal149=formal();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, formal149.getTree());

            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 38, formals_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "formals"

    public static class formal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formal"
    // src/net/colar/netbeans/fan/antlr/Fan.g:319:1: formal : ( formalFull | formalTypeOnly | formalInferred );
    public final FanParser.formal_return formal() throws RecognitionException {
        FanParser.formal_return retval = new FanParser.formal_return();
        retval.start = input.LT(1);
        int formal_StartIndex = input.index();
        Object root_0 = null;

        FanParser.formalFull_return formalFull150 = null;

        FanParser.formalTypeOnly_return formalTypeOnly151 = null;

        FanParser.formalInferred_return formalInferred152 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:319:9: ( formalFull | formalTypeOnly | formalInferred )
            int alt49=3;
            switch ( input.LA(1) ) {
            case SQ_BRACKET_L:
                {
                int LA49_1 = input.LA(2);

                if ( (synpred66_Fan()) ) {
                    alt49=1;
                }
                else if ( (synpred67_Fan()) ) {
                    alt49=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 1, input);

                    throw nvae;
                }
                }
                break;
            case SP_PIPE:
                {
                int LA49_2 = input.LA(2);

                if ( (synpred66_Fan()) ) {
                    alt49=1;
                }
                else if ( (synpred67_Fan()) ) {
                    alt49=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 2, input);

                    throw nvae;
                }
                }
                break;
            case ID:
                {
                int LA49_3 = input.LA(2);

                if ( (synpred66_Fan()) ) {
                    alt49=1;
                }
                else if ( (synpred67_Fan()) ) {
                    alt49=2;
                }
                else if ( (true) ) {
                    alt49=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:319:11: formalFull
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_formalFull_in_formal1564);
                    formalFull150=formalFull();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, formalFull150.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:319:24: formalTypeOnly
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_formalTypeOnly_in_formal1568);
                    formalTypeOnly151=formalTypeOnly();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, formalTypeOnly151.getTree());

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:319:41: formalInferred
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_formalInferred_in_formal1572);
                    formalInferred152=formalInferred();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, formalInferred152.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 39, formal_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "formal"

    public static class formalFull_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formalFull"
    // src/net/colar/netbeans/fan/antlr/Fan.g:320:1: formalFull : type id ;
    public final FanParser.formalFull_return formalFull() throws RecognitionException {
        FanParser.formalFull_return retval = new FanParser.formalFull_return();
        retval.start = input.LT(1);
        int formalFull_StartIndex = input.index();
        Object root_0 = null;

        FanParser.type_return type153 = null;

        FanParser.id_return id154 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:320:17: ( type id )
            // src/net/colar/netbeans/fan/antlr/Fan.g:320:19: type id
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_type_in_formalFull1584);
            type153=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type153.getTree());
            pushFollow(FOLLOW_id_in_formalFull1586);
            id154=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id154.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 40, formalFull_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "formalFull"

    public static class formalTypeOnly_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formalTypeOnly"
    // src/net/colar/netbeans/fan/antlr/Fan.g:321:1: formalTypeOnly : type ;
    public final FanParser.formalTypeOnly_return formalTypeOnly() throws RecognitionException {
        FanParser.formalTypeOnly_return retval = new FanParser.formalTypeOnly_return();
        retval.start = input.LT(1);
        int formalTypeOnly_StartIndex = input.index();
        Object root_0 = null;

        FanParser.type_return type155 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:321:17: ( type )
            // src/net/colar/netbeans/fan/antlr/Fan.g:321:21: type
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_type_in_formalTypeOnly1596);
            type155=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type155.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 41, formalTypeOnly_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "formalTypeOnly"

    public static class formalInferred_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formalInferred"
    // src/net/colar/netbeans/fan/antlr/Fan.g:322:1: formalInferred : id ;
    public final FanParser.formalInferred_return formalInferred() throws RecognitionException {
        FanParser.formalInferred_return retval = new FanParser.formalInferred_return();
        retval.start = input.LT(1);
        int formalInferred_StartIndex = input.index();
        Object root_0 = null;

        FanParser.id_return id156 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:322:17: ( id )
            // src/net/colar/netbeans/fan/antlr/Fan.g:322:21: id
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_id_in_formalInferred1606);
            id156=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id156.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 42, formalInferred_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "formalInferred"

    public static class slotDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "slotDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:323:1: slotDef : ( ( KW_STATIC bracketL )=> staticBlock | ( docs ( facet )* ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef | fieldDef ) ) ) ;
    public final FanParser.slotDef_return slotDef() throws RecognitionException {
        FanParser.slotDef_return retval = new FanParser.slotDef_return();
        retval.start = input.LT(1);
        int slotDef_StartIndex = input.index();
        Object root_0 = null;

        FanParser.staticBlock_return staticBlock157 = null;

        FanParser.docs_return docs158 = null;

        FanParser.facet_return facet159 = null;

        FanParser.ctorDef_return ctorDef160 = null;

        FanParser.methodDef_return methodDef161 = null;

        FanParser.fieldDef_return fieldDef162 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:323:10: ( ( ( KW_STATIC bracketL )=> staticBlock | ( docs ( facet )* ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef | fieldDef ) ) ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:323:12: ( ( KW_STATIC bracketL )=> staticBlock | ( docs ( facet )* ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef | fieldDef ) ) )
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:323:12: ( ( KW_STATIC bracketL )=> staticBlock | ( docs ( facet )* ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef | fieldDef ) ) )
            int alt52=2;
            alt52 = dfa52.predict(input);
            switch (alt52) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:323:13: ( KW_STATIC bracketL )=> staticBlock
                    {
                    pushFollow(FOLLOW_staticBlock_in_slotDef1622);
                    staticBlock157=staticBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, staticBlock157.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:324:5: ( docs ( facet )* ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef | fieldDef ) )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:324:5: ( docs ( facet )* ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef | fieldDef ) )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:324:6: docs ( facet )* ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef | fieldDef )
                    {
                    pushFollow(FOLLOW_docs_in_slotDef1630);
                    docs158=docs();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, docs158.getTree());
                    // src/net/colar/netbeans/fan/antlr/Fan.g:324:11: ( facet )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==AT) ) {
                            int LA50_2 = input.LA(2);

                            if ( (LA50_2==ID) ) {
                                int LA50_3 = input.LA(3);

                                if ( (synpred69_Fan()) ) {
                                    alt50=1;
                                }


                            }


                        }


                        switch (alt50) {
                    	case 1 :
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: facet
                    	    {
                    	    pushFollow(FOLLOW_facet_in_slotDef1632);
                    	    facet159=facet();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, facet159.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);

                    // src/net/colar/netbeans/fan/antlr/Fan.g:325:6: ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef | fieldDef )
                    int alt51=3;
                    alt51 = dfa51.predict(input);
                    switch (alt51) {
                        case 1 :
                            // src/net/colar/netbeans/fan/antlr/Fan.g:326:7: ( ( ctorFlags )* KW_NEW )=> ctorDef
                            {
                            pushFollow(FOLLOW_ctorDef_in_slotDef1655);
                            ctorDef160=ctorDef();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, ctorDef160.getTree());

                            }
                            break;
                        case 2 :
                            // src/net/colar/netbeans/fan/antlr/Fan.g:327:7: ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef
                            {
                            pushFollow(FOLLOW_methodDef_in_slotDef1682);
                            methodDef161=methodDef();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, methodDef161.getTree());

                            }
                            break;
                        case 3 :
                            // src/net/colar/netbeans/fan/antlr/Fan.g:328:7: fieldDef
                            {
                            pushFollow(FOLLOW_fieldDef_in_slotDef1692);
                            fieldDef162=fieldDef();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, fieldDef162.getTree());

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 43, slotDef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "slotDef"

    public static class fieldDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fieldDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:332:1: fieldDef : docs ( facet )* m= fieldFlags typeId ( AS_INIT_VAL expr )? ( ( bracketL ( ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )? )+ bracketR ) | eos ) -> ^( AST_FIELD typeId ( ^( AST_MODIFIER $m) )* ( expr )? ) ;
    public final FanParser.fieldDef_return fieldDef() throws RecognitionException {
        FanParser.fieldDef_return retval = new FanParser.fieldDef_return();
        retval.start = input.LT(1);
        int fieldDef_StartIndex = input.index();
        Object root_0 = null;

        Token AS_INIT_VAL166=null;
        Token SP_SEMI172=null;
        FanParser.fieldFlags_return m = null;

        FanParser.docs_return docs163 = null;

        FanParser.facet_return facet164 = null;

        FanParser.typeId_return typeId165 = null;

        FanParser.expr_return expr167 = null;

        FanParser.bracketL_return bracketL168 = null;

        FanParser.protection_return protection169 = null;

        FanParser.getter_return getter170 = null;

        FanParser.setter_return setter171 = null;

        FanParser.block_return block173 = null;

        FanParser.bracketR_return bracketR174 = null;

        FanParser.eos_return eos175 = null;


        Object AS_INIT_VAL166_tree=null;
        Object SP_SEMI172_tree=null;
        RewriteRuleTokenStream stream_SP_SEMI=new RewriteRuleTokenStream(adaptor,"token SP_SEMI");
        RewriteRuleTokenStream stream_AS_INIT_VAL=new RewriteRuleTokenStream(adaptor,"token AS_INIT_VAL");
        RewriteRuleSubtreeStream stream_protection=new RewriteRuleSubtreeStream(adaptor,"rule protection");
        RewriteRuleSubtreeStream stream_facet=new RewriteRuleSubtreeStream(adaptor,"rule facet");
        RewriteRuleSubtreeStream stream_eos=new RewriteRuleSubtreeStream(adaptor,"rule eos");
        RewriteRuleSubtreeStream stream_fieldFlags=new RewriteRuleSubtreeStream(adaptor,"rule fieldFlags");
        RewriteRuleSubtreeStream stream_bracketL=new RewriteRuleSubtreeStream(adaptor,"rule bracketL");
        RewriteRuleSubtreeStream stream_getter=new RewriteRuleSubtreeStream(adaptor,"rule getter");
        RewriteRuleSubtreeStream stream_docs=new RewriteRuleSubtreeStream(adaptor,"rule docs");
        RewriteRuleSubtreeStream stream_setter=new RewriteRuleSubtreeStream(adaptor,"rule setter");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_bracketR=new RewriteRuleSubtreeStream(adaptor,"rule bracketR");
        RewriteRuleSubtreeStream stream_typeId=new RewriteRuleSubtreeStream(adaptor,"rule typeId");
        paraphrase.push("Field definition");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:333:3: ( docs ( facet )* m= fieldFlags typeId ( AS_INIT_VAL expr )? ( ( bracketL ( ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )? )+ bracketR ) | eos ) -> ^( AST_FIELD typeId ( ^( AST_MODIFIER $m) )* ( expr )? ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:333:5: docs ( facet )* m= fieldFlags typeId ( AS_INIT_VAL expr )? ( ( bracketL ( ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )? )+ bracketR ) | eos )
            {
            pushFollow(FOLLOW_docs_in_fieldDef1728);
            docs163=docs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_docs.add(docs163.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:333:10: ( facet )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==AT) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: facet
            	    {
            	    pushFollow(FOLLOW_facet_in_fieldDef1730);
            	    facet164=facet();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_facet.add(facet164.getTree());

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            pushFollow(FOLLOW_fieldFlags_in_fieldDef1735);
            m=fieldFlags();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fieldFlags.add(m.getTree());
            pushFollow(FOLLOW_typeId_in_fieldDef1737);
            typeId165=typeId();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeId.add(typeId165.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:333:37: ( AS_INIT_VAL expr )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==AS_INIT_VAL) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:333:38: AS_INIT_VAL expr
                    {
                    AS_INIT_VAL166=(Token)match(input,AS_INIT_VAL,FOLLOW_AS_INIT_VAL_in_fieldDef1740); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AS_INIT_VAL.add(AS_INIT_VAL166);

                    pushFollow(FOLLOW_expr_in_fieldDef1742);
                    expr167=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr167.getTree());

                    }
                    break;

            }

            // src/net/colar/netbeans/fan/antlr/Fan.g:334:5: ( ( bracketL ( ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )? )+ bracketR ) | eos )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==BRACKET_L) ) {
                alt60=1;
            }
            else if ( (LA60_0==EOF||(LA60_0>=KW_RD_ONLY && LA60_0<=KW_FINAL)||(LA60_0>=KW_ABSTRACT && LA60_0<=KW_ONCE)||LA60_0==BRACKET_R||LA60_0==SP_PIPE||LA60_0==SP_SEMI||LA60_0==ID||(LA60_0>=AT && LA60_0<=DOC)||LA60_0==SQ_BRACKET_L) ) {
                alt60=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:335:5: ( bracketL ( ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )? )+ bracketR )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:335:5: ( bracketL ( ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )? )+ bracketR )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:335:6: bracketL ( ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )? )+ bracketR
                    {
                    pushFollow(FOLLOW_bracketL_in_fieldDef1757);
                    bracketL168=bracketL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_bracketL.add(bracketL168.getTree());
                    // src/net/colar/netbeans/fan/antlr/Fan.g:335:15: ( ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )? )+
                    int cnt59=0;
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( ((LA59_0>=KW_PRIVATE && LA59_0<=KW_INTERNAL)||LA59_0==ID) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:335:16: ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )?
                    	    {
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:335:16: ( protection )?
                    	    int alt55=2;
                    	    int LA55_0 = input.LA(1);

                    	    if ( ((LA55_0>=KW_PRIVATE && LA55_0<=KW_INTERNAL)) ) {
                    	        alt55=1;
                    	    }
                    	    switch (alt55) {
                    	        case 1 :
                    	            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: protection
                    	            {
                    	            pushFollow(FOLLOW_protection_in_fieldDef1760);
                    	            protection169=protection();

                    	            state._fsp--;
                    	            if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) stream_protection.add(protection169.getTree());

                    	            }
                    	            break;

                    	    }

                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:335:28: ( getter | setter )
                    	    int alt56=2;
                    	    int LA56_0 = input.LA(1);

                    	    if ( (LA56_0==ID) ) {
                    	        int LA56_1 = input.LA(2);

                    	        if ( (synpred78_Fan()) ) {
                    	            alt56=1;
                    	        }
                    	        else if ( (true) ) {
                    	            alt56=2;
                    	        }
                    	        else {
                    	            if (state.backtracking>0) {state.failed=true; return retval;}
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("", 56, 1, input);

                    	            throw nvae;
                    	        }
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return retval;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 56, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt56) {
                    	        case 1 :
                    	            // src/net/colar/netbeans/fan/antlr/Fan.g:335:29: getter
                    	            {
                    	            pushFollow(FOLLOW_getter_in_fieldDef1764);
                    	            getter170=getter();

                    	            state._fsp--;
                    	            if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) stream_getter.add(getter170.getTree());

                    	            }
                    	            break;
                    	        case 2 :
                    	            // src/net/colar/netbeans/fan/antlr/Fan.g:335:38: setter
                    	            {
                    	            pushFollow(FOLLOW_setter_in_fieldDef1768);
                    	            setter171=setter();

                    	            state._fsp--;
                    	            if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) stream_setter.add(setter171.getTree());

                    	            }
                    	            break;

                    	    }

                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:335:46: ( SP_SEMI )?
                    	    int alt57=2;
                    	    int LA57_0 = input.LA(1);

                    	    if ( (LA57_0==SP_SEMI) ) {
                    	        alt57=1;
                    	    }
                    	    switch (alt57) {
                    	        case 1 :
                    	            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_SEMI
                    	            {
                    	            SP_SEMI172=(Token)match(input,SP_SEMI,FOLLOW_SP_SEMI_in_fieldDef1771); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_SP_SEMI.add(SP_SEMI172);


                    	            }
                    	            break;

                    	    }

                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:335:55: ( block )?
                    	    int alt58=2;
                    	    int LA58_0 = input.LA(1);

                    	    if ( ((LA58_0>=KW_BREAK && LA58_0<=KW_TRY)||(LA58_0>=KW_THIS && LA58_0<=KW_SUPER)||(LA58_0>=KW_NULL && LA58_0<=KW_FALSE)||LA58_0==BRACKET_L||LA58_0==SP_PIPE||LA58_0==OP_CURRY||(LA58_0>=OP_PLUS && LA58_0<=OP_MULTI)||(LA58_0>=OP_BANG && LA58_0<=OP_TILDA)||(LA58_0>=URI && LA58_0<=AT)||(LA58_0>=NUMBER && LA58_0<=SQ_BRACKET_L)||LA58_0==PAR_L) ) {
                    	        alt58=1;
                    	    }
                    	    else if ( (LA58_0==ID) ) {
                    	        int LA58_2 = input.LA(2);

                    	        if ( (synpred80_Fan()) ) {
                    	            alt58=1;
                    	        }
                    	    }
                    	    switch (alt58) {
                    	        case 1 :
                    	            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: block
                    	            {
                    	            pushFollow(FOLLOW_block_in_fieldDef1774);
                    	            block173=block();

                    	            state._fsp--;
                    	            if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) stream_block.add(block173.getTree());

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt59 >= 1 ) break loop59;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(59, input);
                                throw eee;
                        }
                        cnt59++;
                    } while (true);

                    pushFollow(FOLLOW_bracketR_in_fieldDef1779);
                    bracketR174=bracketR();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_bracketR.add(bracketR174.getTree());

                    }


                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:336:7: eos
                    {
                    pushFollow(FOLLOW_eos_in_fieldDef1788);
                    eos175=eos();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_eos.add(eos175.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: m, typeId, expr
            // token labels: 
            // rule labels: retval, m
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_m=new RewriteRuleSubtreeStream(adaptor,"rule m",m!=null?m.tree:null);

            root_0 = (Object)adaptor.nil();
            // 337:4: -> ^( AST_FIELD typeId ( ^( AST_MODIFIER $m) )* ( expr )? )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:337:7: ^( AST_FIELD typeId ( ^( AST_MODIFIER $m) )* ( expr )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_FIELD, "AST_FIELD"), root_1);

                adaptor.addChild(root_1, stream_typeId.nextTree());
                // src/net/colar/netbeans/fan/antlr/Fan.g:337:26: ( ^( AST_MODIFIER $m) )*
                while ( stream_m.hasNext() ) {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:337:26: ^( AST_MODIFIER $m)
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_MODIFIER, "AST_MODIFIER"), root_2);

                    adaptor.addChild(root_2, stream_m.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_m.reset();
                // src/net/colar/netbeans/fan/antlr/Fan.g:337:46: ( expr )?
                if ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 44, fieldDef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "fieldDef"

    public static class typeId_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeId"
    // src/net/colar/netbeans/fan/antlr/Fan.g:338:1: typeId : ( ( type id )=> typeAndId | fieldId ) ;
    public final FanParser.typeId_return typeId() throws RecognitionException {
        FanParser.typeId_return retval = new FanParser.typeId_return();
        retval.start = input.LT(1);
        int typeId_StartIndex = input.index();
        Object root_0 = null;

        FanParser.typeAndId_return typeAndId176 = null;

        FanParser.fieldId_return fieldId177 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:338:9: ( ( ( type id )=> typeAndId | fieldId ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:338:11: ( ( type id )=> typeAndId | fieldId )
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:338:11: ( ( type id )=> typeAndId | fieldId )
            int alt61=2;
            alt61 = dfa61.predict(input);
            switch (alt61) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:338:12: ( type id )=> typeAndId
                    {
                    pushFollow(FOLLOW_typeAndId_in_typeId1826);
                    typeAndId176=typeAndId();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeAndId176.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:338:35: fieldId
                    {
                    pushFollow(FOLLOW_fieldId_in_typeId1830);
                    fieldId177=fieldId();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fieldId177.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 45, typeId_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeId"

    public static class fieldId_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fieldId"
    // src/net/colar/netbeans/fan/antlr/Fan.g:339:1: fieldId : id ;
    public final FanParser.fieldId_return fieldId() throws RecognitionException {
        FanParser.fieldId_return retval = new FanParser.fieldId_return();
        retval.start = input.LT(1);
        int fieldId_StartIndex = input.index();
        Object root_0 = null;

        FanParser.id_return id178 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:339:10: ( id )
            // src/net/colar/netbeans/fan/antlr/Fan.g:339:12: id
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_id_in_fieldId1839);
            id178=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id178.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 46, fieldId_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "fieldId"

    public static class typeAndId_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeAndId"
    // src/net/colar/netbeans/fan/antlr/Fan.g:340:1: typeAndId : type id -> ^( id ) ^( AST_TYPE type ) ;
    public final FanParser.typeAndId_return typeAndId() throws RecognitionException {
        FanParser.typeAndId_return retval = new FanParser.typeAndId_return();
        retval.start = input.LT(1);
        int typeAndId_StartIndex = input.index();
        Object root_0 = null;

        FanParser.type_return type179 = null;

        FanParser.id_return id180 = null;


        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:340:11: ( type id -> ^( id ) ^( AST_TYPE type ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:340:13: type id
            {
            pushFollow(FOLLOW_type_in_typeAndId1846);
            type179=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type179.getTree());
            pushFollow(FOLLOW_id_in_typeAndId1848);
            id180=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id180.getTree());


            // AST REWRITE
            // elements: id, type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 341:7: -> ^( id ) ^( AST_TYPE type )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:341:10: ^( id )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_id.nextNode(), root_1);

                adaptor.addChild(root_0, root_1);
                }
                // src/net/colar/netbeans/fan/antlr/Fan.g:341:16: ^( AST_TYPE type )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_TYPE, "AST_TYPE"), root_1);

                adaptor.addChild(root_1, stream_type.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 47, typeAndId_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeAndId"

    public static class fieldFlags_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fieldFlags"
    // src/net/colar/netbeans/fan/antlr/Fan.g:342:1: fieldFlags : ( KW_ABSTRACT | KW_RD_ONLY | KW_CONST | KW_STATIC | KW_NATIVE | KW_VOLATILE | KW_OVERRIDE | KW_VIRTUAL | KW_FINAL | protection )* ;
    public final FanParser.fieldFlags_return fieldFlags() throws RecognitionException {
        FanParser.fieldFlags_return retval = new FanParser.fieldFlags_return();
        retval.start = input.LT(1);
        int fieldFlags_StartIndex = input.index();
        Object root_0 = null;

        Token KW_ABSTRACT181=null;
        Token KW_RD_ONLY182=null;
        Token KW_CONST183=null;
        Token KW_STATIC184=null;
        Token KW_NATIVE185=null;
        Token KW_VOLATILE186=null;
        Token KW_OVERRIDE187=null;
        Token KW_VIRTUAL188=null;
        Token KW_FINAL189=null;
        FanParser.protection_return protection190 = null;


        Object KW_ABSTRACT181_tree=null;
        Object KW_RD_ONLY182_tree=null;
        Object KW_CONST183_tree=null;
        Object KW_STATIC184_tree=null;
        Object KW_NATIVE185_tree=null;
        Object KW_VOLATILE186_tree=null;
        Object KW_OVERRIDE187_tree=null;
        Object KW_VIRTUAL188_tree=null;
        Object KW_FINAL189_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:342:12: ( ( KW_ABSTRACT | KW_RD_ONLY | KW_CONST | KW_STATIC | KW_NATIVE | KW_VOLATILE | KW_OVERRIDE | KW_VIRTUAL | KW_FINAL | protection )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:342:14: ( KW_ABSTRACT | KW_RD_ONLY | KW_CONST | KW_STATIC | KW_NATIVE | KW_VOLATILE | KW_OVERRIDE | KW_VIRTUAL | KW_FINAL | protection )*
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:342:14: ( KW_ABSTRACT | KW_RD_ONLY | KW_CONST | KW_STATIC | KW_NATIVE | KW_VOLATILE | KW_OVERRIDE | KW_VIRTUAL | KW_FINAL | protection )*
            loop62:
            do {
                int alt62=11;
                switch ( input.LA(1) ) {
                case KW_ABSTRACT:
                    {
                    alt62=1;
                    }
                    break;
                case KW_RD_ONLY:
                    {
                    alt62=2;
                    }
                    break;
                case KW_CONST:
                    {
                    alt62=3;
                    }
                    break;
                case KW_STATIC:
                    {
                    alt62=4;
                    }
                    break;
                case KW_NATIVE:
                    {
                    alt62=5;
                    }
                    break;
                case KW_VOLATILE:
                    {
                    alt62=6;
                    }
                    break;
                case KW_OVERRIDE:
                    {
                    alt62=7;
                    }
                    break;
                case KW_VIRTUAL:
                    {
                    alt62=8;
                    }
                    break;
                case KW_FINAL:
                    {
                    alt62=9;
                    }
                    break;
                case KW_PRIVATE:
                case KW_PROTECTED:
                case KW_PUBLIC:
                case KW_INTERNAL:
                    {
                    alt62=10;
                    }
                    break;

                }

                switch (alt62) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:342:15: KW_ABSTRACT
            	    {
            	    KW_ABSTRACT181=(Token)match(input,KW_ABSTRACT,FOLLOW_KW_ABSTRACT_in_fieldFlags1874); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    KW_ABSTRACT181_tree = (Object)adaptor.create(KW_ABSTRACT181);
            	    adaptor.addChild(root_0, KW_ABSTRACT181_tree);
            	    }

            	    }
            	    break;
            	case 2 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:342:29: KW_RD_ONLY
            	    {
            	    KW_RD_ONLY182=(Token)match(input,KW_RD_ONLY,FOLLOW_KW_RD_ONLY_in_fieldFlags1878); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    KW_RD_ONLY182_tree = (Object)adaptor.create(KW_RD_ONLY182);
            	    adaptor.addChild(root_0, KW_RD_ONLY182_tree);
            	    }

            	    }
            	    break;
            	case 3 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:342:42: KW_CONST
            	    {
            	    KW_CONST183=(Token)match(input,KW_CONST,FOLLOW_KW_CONST_in_fieldFlags1882); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    KW_CONST183_tree = (Object)adaptor.create(KW_CONST183);
            	    adaptor.addChild(root_0, KW_CONST183_tree);
            	    }

            	    }
            	    break;
            	case 4 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:342:53: KW_STATIC
            	    {
            	    KW_STATIC184=(Token)match(input,KW_STATIC,FOLLOW_KW_STATIC_in_fieldFlags1886); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    KW_STATIC184_tree = (Object)adaptor.create(KW_STATIC184);
            	    adaptor.addChild(root_0, KW_STATIC184_tree);
            	    }

            	    }
            	    break;
            	case 5 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:342:65: KW_NATIVE
            	    {
            	    KW_NATIVE185=(Token)match(input,KW_NATIVE,FOLLOW_KW_NATIVE_in_fieldFlags1890); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    KW_NATIVE185_tree = (Object)adaptor.create(KW_NATIVE185);
            	    adaptor.addChild(root_0, KW_NATIVE185_tree);
            	    }

            	    }
            	    break;
            	case 6 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:342:77: KW_VOLATILE
            	    {
            	    KW_VOLATILE186=(Token)match(input,KW_VOLATILE,FOLLOW_KW_VOLATILE_in_fieldFlags1894); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    KW_VOLATILE186_tree = (Object)adaptor.create(KW_VOLATILE186);
            	    adaptor.addChild(root_0, KW_VOLATILE186_tree);
            	    }

            	    }
            	    break;
            	case 7 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:342:91: KW_OVERRIDE
            	    {
            	    KW_OVERRIDE187=(Token)match(input,KW_OVERRIDE,FOLLOW_KW_OVERRIDE_in_fieldFlags1898); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    KW_OVERRIDE187_tree = (Object)adaptor.create(KW_OVERRIDE187);
            	    adaptor.addChild(root_0, KW_OVERRIDE187_tree);
            	    }

            	    }
            	    break;
            	case 8 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:342:105: KW_VIRTUAL
            	    {
            	    KW_VIRTUAL188=(Token)match(input,KW_VIRTUAL,FOLLOW_KW_VIRTUAL_in_fieldFlags1902); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    KW_VIRTUAL188_tree = (Object)adaptor.create(KW_VIRTUAL188);
            	    adaptor.addChild(root_0, KW_VIRTUAL188_tree);
            	    }

            	    }
            	    break;
            	case 9 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:342:118: KW_FINAL
            	    {
            	    KW_FINAL189=(Token)match(input,KW_FINAL,FOLLOW_KW_FINAL_in_fieldFlags1906); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    KW_FINAL189_tree = (Object)adaptor.create(KW_FINAL189);
            	    adaptor.addChild(root_0, KW_FINAL189_tree);
            	    }

            	    }
            	    break;
            	case 10 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:342:129: protection
            	    {
            	    pushFollow(FOLLOW_protection_in_fieldFlags1910);
            	    protection190=protection();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, protection190.getTree());

            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 48, fieldFlags_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "fieldFlags"

    public static class methodDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "methodDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:343:1: methodDef : docs ( facet )* (m= methodFlags )* returnType= type mname= id parL params parR methodBody -> ^( AST_METHOD ^( $mname) ^( AST_TYPE $returnType) ( params )? ( ^( AST_MODIFIER $m) )* ( methodBody )? ) ;
    public final FanParser.methodDef_return methodDef() throws RecognitionException {
        FanParser.methodDef_return retval = new FanParser.methodDef_return();
        retval.start = input.LT(1);
        int methodDef_StartIndex = input.index();
        Object root_0 = null;

        FanParser.methodFlags_return m = null;

        FanParser.type_return returnType = null;

        FanParser.id_return mname = null;

        FanParser.docs_return docs191 = null;

        FanParser.facet_return facet192 = null;

        FanParser.parL_return parL193 = null;

        FanParser.params_return params194 = null;

        FanParser.parR_return parR195 = null;

        FanParser.methodBody_return methodBody196 = null;


        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_facet=new RewriteRuleSubtreeStream(adaptor,"rule facet");
        RewriteRuleSubtreeStream stream_methodFlags=new RewriteRuleSubtreeStream(adaptor,"rule methodFlags");
        RewriteRuleSubtreeStream stream_methodBody=new RewriteRuleSubtreeStream(adaptor,"rule methodBody");
        RewriteRuleSubtreeStream stream_docs=new RewriteRuleSubtreeStream(adaptor,"rule docs");
        RewriteRuleSubtreeStream stream_parL=new RewriteRuleSubtreeStream(adaptor,"rule parL");
        RewriteRuleSubtreeStream stream_params=new RewriteRuleSubtreeStream(adaptor,"rule params");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        RewriteRuleSubtreeStream stream_parR=new RewriteRuleSubtreeStream(adaptor,"rule parR");
        paraphrase.push("Method definition");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:344:3: ( docs ( facet )* (m= methodFlags )* returnType= type mname= id parL params parR methodBody -> ^( AST_METHOD ^( $mname) ^( AST_TYPE $returnType) ( params )? ( ^( AST_MODIFIER $m) )* ( methodBody )? ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:344:5: docs ( facet )* (m= methodFlags )* returnType= type mname= id parL params parR methodBody
            {
            pushFollow(FOLLOW_docs_in_methodDef1930);
            docs191=docs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_docs.add(docs191.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:344:10: ( facet )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==AT) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: facet
            	    {
            	    pushFollow(FOLLOW_facet_in_methodDef1932);
            	    facet192=facet();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_facet.add(facet192.getTree());

            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:344:18: (m= methodFlags )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( ((LA64_0>=KW_STATIC && LA64_0<=KW_NATIVE)||(LA64_0>=KW_OVERRIDE && LA64_0<=KW_FINAL)||(LA64_0>=KW_ABSTRACT && LA64_0<=KW_INTERNAL)||LA64_0==KW_ONCE) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: m= methodFlags
            	    {
            	    pushFollow(FOLLOW_methodFlags_in_methodDef1937);
            	    m=methodFlags();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_methodFlags.add(m.getTree());

            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);

            pushFollow(FOLLOW_type_in_methodDef1942);
            returnType=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(returnType.getTree());
            pushFollow(FOLLOW_id_in_methodDef1948);
            mname=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(mname.getTree());
            pushFollow(FOLLOW_parL_in_methodDef1950);
            parL193=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parL.add(parL193.getTree());
            pushFollow(FOLLOW_params_in_methodDef1952);
            params194=params();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_params.add(params194.getTree());
            pushFollow(FOLLOW_parR_in_methodDef1954);
            parR195=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parR.add(parR195.getTree());
            pushFollow(FOLLOW_methodBody_in_methodDef1956);
            methodBody196=methodBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_methodBody.add(methodBody196.getTree());


            // AST REWRITE
            // elements: methodBody, m, mname, params, returnType
            // token labels: 
            // rule labels: mname, retval, m, returnType
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_mname=new RewriteRuleSubtreeStream(adaptor,"rule mname",mname!=null?mname.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_m=new RewriteRuleSubtreeStream(adaptor,"rule m",m!=null?m.tree:null);
            RewriteRuleSubtreeStream stream_returnType=new RewriteRuleSubtreeStream(adaptor,"rule returnType",returnType!=null?returnType.tree:null);

            root_0 = (Object)adaptor.nil();
            // 345:7: -> ^( AST_METHOD ^( $mname) ^( AST_TYPE $returnType) ( params )? ( ^( AST_MODIFIER $m) )* ( methodBody )? )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:345:10: ^( AST_METHOD ^( $mname) ^( AST_TYPE $returnType) ( params )? ( ^( AST_MODIFIER $m) )* ( methodBody )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_METHOD, "AST_METHOD"), root_1);

                // src/net/colar/netbeans/fan/antlr/Fan.g:345:23: ^( $mname)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_mname.nextNode(), root_2);

                adaptor.addChild(root_1, root_2);
                }
                // src/net/colar/netbeans/fan/antlr/Fan.g:345:33: ^( AST_TYPE $returnType)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_TYPE, "AST_TYPE"), root_2);

                adaptor.addChild(root_2, stream_returnType.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // src/net/colar/netbeans/fan/antlr/Fan.g:345:57: ( params )?
                if ( stream_params.hasNext() ) {
                    adaptor.addChild(root_1, stream_params.nextTree());

                }
                stream_params.reset();
                // src/net/colar/netbeans/fan/antlr/Fan.g:345:65: ( ^( AST_MODIFIER $m) )*
                while ( stream_m.hasNext() ) {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:345:65: ^( AST_MODIFIER $m)
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_MODIFIER, "AST_MODIFIER"), root_2);

                    adaptor.addChild(root_2, stream_m.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_m.reset();
                // src/net/colar/netbeans/fan/antlr/Fan.g:345:85: ( methodBody )?
                if ( stream_methodBody.hasNext() ) {
                    adaptor.addChild(root_1, stream_methodBody.nextTree());

                }
                stream_methodBody.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 49, methodDef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "methodDef"

    public static class methodFlags_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "methodFlags"
    // src/net/colar/netbeans/fan/antlr/Fan.g:346:1: methodFlags : ( protection | KW_VIRTUAL | KW_OVERRIDE | KW_ABSTRACT | KW_STATIC | KW_ONCE | KW_NATIVE | KW_FINAL );
    public final FanParser.methodFlags_return methodFlags() throws RecognitionException {
        FanParser.methodFlags_return retval = new FanParser.methodFlags_return();
        retval.start = input.LT(1);
        int methodFlags_StartIndex = input.index();
        Object root_0 = null;

        Token KW_VIRTUAL198=null;
        Token KW_OVERRIDE199=null;
        Token KW_ABSTRACT200=null;
        Token KW_STATIC201=null;
        Token KW_ONCE202=null;
        Token KW_NATIVE203=null;
        Token KW_FINAL204=null;
        FanParser.protection_return protection197 = null;


        Object KW_VIRTUAL198_tree=null;
        Object KW_OVERRIDE199_tree=null;
        Object KW_ABSTRACT200_tree=null;
        Object KW_STATIC201_tree=null;
        Object KW_ONCE202_tree=null;
        Object KW_NATIVE203_tree=null;
        Object KW_FINAL204_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:346:13: ( protection | KW_VIRTUAL | KW_OVERRIDE | KW_ABSTRACT | KW_STATIC | KW_ONCE | KW_NATIVE | KW_FINAL )
            int alt65=8;
            switch ( input.LA(1) ) {
            case KW_PRIVATE:
            case KW_PROTECTED:
            case KW_PUBLIC:
            case KW_INTERNAL:
                {
                alt65=1;
                }
                break;
            case KW_VIRTUAL:
                {
                alt65=2;
                }
                break;
            case KW_OVERRIDE:
                {
                alt65=3;
                }
                break;
            case KW_ABSTRACT:
                {
                alt65=4;
                }
                break;
            case KW_STATIC:
                {
                alt65=5;
                }
                break;
            case KW_ONCE:
                {
                alt65=6;
                }
                break;
            case KW_NATIVE:
                {
                alt65=7;
                }
                break;
            case KW_FINAL:
                {
                alt65=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }

            switch (alt65) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:346:15: protection
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_protection_in_methodFlags2002);
                    protection197=protection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, protection197.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:346:28: KW_VIRTUAL
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_VIRTUAL198=(Token)match(input,KW_VIRTUAL,FOLLOW_KW_VIRTUAL_in_methodFlags2006); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_VIRTUAL198_tree = (Object)adaptor.create(KW_VIRTUAL198);
                    adaptor.addChild(root_0, KW_VIRTUAL198_tree);
                    }

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:346:41: KW_OVERRIDE
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_OVERRIDE199=(Token)match(input,KW_OVERRIDE,FOLLOW_KW_OVERRIDE_in_methodFlags2010); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_OVERRIDE199_tree = (Object)adaptor.create(KW_OVERRIDE199);
                    adaptor.addChild(root_0, KW_OVERRIDE199_tree);
                    }

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:346:55: KW_ABSTRACT
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_ABSTRACT200=(Token)match(input,KW_ABSTRACT,FOLLOW_KW_ABSTRACT_in_methodFlags2014); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_ABSTRACT200_tree = (Object)adaptor.create(KW_ABSTRACT200);
                    adaptor.addChild(root_0, KW_ABSTRACT200_tree);
                    }

                    }
                    break;
                case 5 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:346:69: KW_STATIC
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_STATIC201=(Token)match(input,KW_STATIC,FOLLOW_KW_STATIC_in_methodFlags2018); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_STATIC201_tree = (Object)adaptor.create(KW_STATIC201);
                    adaptor.addChild(root_0, KW_STATIC201_tree);
                    }

                    }
                    break;
                case 6 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:346:81: KW_ONCE
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_ONCE202=(Token)match(input,KW_ONCE,FOLLOW_KW_ONCE_in_methodFlags2022); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_ONCE202_tree = (Object)adaptor.create(KW_ONCE202);
                    adaptor.addChild(root_0, KW_ONCE202_tree);
                    }

                    }
                    break;
                case 7 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:347:5: KW_NATIVE
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_NATIVE203=(Token)match(input,KW_NATIVE,FOLLOW_KW_NATIVE_in_methodFlags2030); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_NATIVE203_tree = (Object)adaptor.create(KW_NATIVE203);
                    adaptor.addChild(root_0, KW_NATIVE203_tree);
                    }

                    }
                    break;
                case 8 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:347:17: KW_FINAL
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_FINAL204=(Token)match(input,KW_FINAL,FOLLOW_KW_FINAL_in_methodFlags2034); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_FINAL204_tree = (Object)adaptor.create(KW_FINAL204);
                    adaptor.addChild(root_0, KW_FINAL204_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 50, methodFlags_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "methodFlags"

    public static class params_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "params"
    // src/net/colar/netbeans/fan/antlr/Fan.g:348:1: params : ( param ( SP_COMMA param )* )? ;
    public final FanParser.params_return params() throws RecognitionException {
        FanParser.params_return retval = new FanParser.params_return();
        retval.start = input.LT(1);
        int params_StartIndex = input.index();
        Object root_0 = null;

        Token SP_COMMA206=null;
        FanParser.param_return param205 = null;

        FanParser.param_return param207 = null;


        Object SP_COMMA206_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:348:9: ( ( param ( SP_COMMA param )* )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:348:11: ( param ( SP_COMMA param )* )?
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:348:11: ( param ( SP_COMMA param )* )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==SP_PIPE||LA67_0==ID||LA67_0==SQ_BRACKET_L) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:348:12: param ( SP_COMMA param )*
                    {
                    pushFollow(FOLLOW_param_in_params2043);
                    param205=param();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, param205.getTree());
                    // src/net/colar/netbeans/fan/antlr/Fan.g:348:18: ( SP_COMMA param )*
                    loop66:
                    do {
                        int alt66=2;
                        int LA66_0 = input.LA(1);

                        if ( (LA66_0==SP_COMMA) ) {
                            alt66=1;
                        }


                        switch (alt66) {
                    	case 1 :
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:348:19: SP_COMMA param
                    	    {
                    	    SP_COMMA206=(Token)match(input,SP_COMMA,FOLLOW_SP_COMMA_in_params2046); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    SP_COMMA206_tree = (Object)adaptor.create(SP_COMMA206);
                    	    adaptor.addChild(root_0, SP_COMMA206_tree);
                    	    }
                    	    pushFollow(FOLLOW_param_in_params2048);
                    	    param207=param();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, param207.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop66;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 51, params_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "params"

    public static class param_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "param"
    // src/net/colar/netbeans/fan/antlr/Fan.g:349:1: param : ( type id ( AS_INIT_VAL expr )? ) -> ^( AST_PARAM ^( AST_TYPE type ) id ( AS_INIT_VAL expr )? ) ;
    public final FanParser.param_return param() throws RecognitionException {
        FanParser.param_return retval = new FanParser.param_return();
        retval.start = input.LT(1);
        int param_StartIndex = input.index();
        Object root_0 = null;

        Token AS_INIT_VAL210=null;
        FanParser.type_return type208 = null;

        FanParser.id_return id209 = null;

        FanParser.expr_return expr211 = null;


        Object AS_INIT_VAL210_tree=null;
        RewriteRuleTokenStream stream_AS_INIT_VAL=new RewriteRuleTokenStream(adaptor,"token AS_INIT_VAL");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:349:9: ( ( type id ( AS_INIT_VAL expr )? ) -> ^( AST_PARAM ^( AST_TYPE type ) id ( AS_INIT_VAL expr )? ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:349:11: ( type id ( AS_INIT_VAL expr )? )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:349:11: ( type id ( AS_INIT_VAL expr )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:349:12: type id ( AS_INIT_VAL expr )?
            {
            pushFollow(FOLLOW_type_in_param2062);
            type208=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type208.getTree());
            pushFollow(FOLLOW_id_in_param2064);
            id209=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id209.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:349:20: ( AS_INIT_VAL expr )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==AS_INIT_VAL) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:349:21: AS_INIT_VAL expr
                    {
                    AS_INIT_VAL210=(Token)match(input,AS_INIT_VAL,FOLLOW_AS_INIT_VAL_in_param2067); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AS_INIT_VAL.add(AS_INIT_VAL210);

                    pushFollow(FOLLOW_expr_in_param2069);
                    expr211=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr211.getTree());

                    }
                    break;

            }


            }



            // AST REWRITE
            // elements: AS_INIT_VAL, id, type, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 350:4: -> ^( AST_PARAM ^( AST_TYPE type ) id ( AS_INIT_VAL expr )? )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:350:7: ^( AST_PARAM ^( AST_TYPE type ) id ( AS_INIT_VAL expr )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_PARAM, "AST_PARAM"), root_1);

                // src/net/colar/netbeans/fan/antlr/Fan.g:350:19: ^( AST_TYPE type )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_TYPE, "AST_TYPE"), root_2);

                adaptor.addChild(root_2, stream_type.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_id.nextTree());
                // src/net/colar/netbeans/fan/antlr/Fan.g:350:39: ( AS_INIT_VAL expr )?
                if ( stream_AS_INIT_VAL.hasNext()||stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_AS_INIT_VAL.nextNode());
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_AS_INIT_VAL.reset();
                stream_expr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 52, param_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "param"

    public static class methodBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "methodBody"
    // src/net/colar/netbeans/fan/antlr/Fan.g:351:1: methodBody : ( ( multiStmt )=> multiStmt | eos ) ;
    public final FanParser.methodBody_return methodBody() throws RecognitionException {
        FanParser.methodBody_return retval = new FanParser.methodBody_return();
        retval.start = input.LT(1);
        int methodBody_StartIndex = input.index();
        Object root_0 = null;

        FanParser.multiStmt_return multiStmt212 = null;

        FanParser.eos_return eos213 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:351:12: ( ( ( multiStmt )=> multiStmt | eos ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:351:14: ( ( multiStmt )=> multiStmt | eos )
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:351:14: ( ( multiStmt )=> multiStmt | eos )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==BRACKET_L) && (synpred106_Fan())) {
                alt69=1;
            }
            else if ( (LA69_0==EOF||(LA69_0>=KW_RD_ONLY && LA69_0<=KW_FINAL)||(LA69_0>=KW_ABSTRACT && LA69_0<=KW_ONCE)||LA69_0==BRACKET_R||LA69_0==SP_PIPE||LA69_0==SP_SEMI||LA69_0==ID||(LA69_0>=AT && LA69_0<=DOC)||LA69_0==SQ_BRACKET_L) ) {
                alt69=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:351:15: ( multiStmt )=> multiStmt
                    {
                    pushFollow(FOLLOW_multiStmt_in_methodBody2108);
                    multiStmt212=multiStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiStmt212.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:351:40: eos
                    {
                    pushFollow(FOLLOW_eos_in_methodBody2112);
                    eos213=eos();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, eos213.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 53, methodBody_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "methodBody"

    public static class ctorDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ctorDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:352:1: ctorDef : docs ( facet )* (m= ctorFlags )* KW_NEW cname= id parL params parR (cchain= ( ( SP_COLON )=> ctorChain ) )? methodBody -> ^( AST_CONSTRUCTOR ^( $cname) ( params )? ( ^( AST_MODIFIER $m) )* ( ^( AST_CONSTRUCTOR_CHAIN $cchain) )* ( methodBody )? ) ;
    public final FanParser.ctorDef_return ctorDef() throws RecognitionException {
        FanParser.ctorDef_return retval = new FanParser.ctorDef_return();
        retval.start = input.LT(1);
        int ctorDef_StartIndex = input.index();
        Object root_0 = null;

        Token cchain=null;
        Token KW_NEW216=null;
        FanParser.ctorFlags_return m = null;

        FanParser.id_return cname = null;

        FanParser.docs_return docs214 = null;

        FanParser.facet_return facet215 = null;

        FanParser.parL_return parL217 = null;

        FanParser.params_return params218 = null;

        FanParser.parR_return parR219 = null;

        FanParser.ctorChain_return ctorChain220 = null;

        FanParser.methodBody_return methodBody221 = null;


        Object cchain_tree=null;
        Object KW_NEW216_tree=null;
        RewriteRuleTokenStream stream_KW_NEW=new RewriteRuleTokenStream(adaptor,"token KW_NEW");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_facet=new RewriteRuleSubtreeStream(adaptor,"rule facet");
        RewriteRuleSubtreeStream stream_methodBody=new RewriteRuleSubtreeStream(adaptor,"rule methodBody");
        RewriteRuleSubtreeStream stream_docs=new RewriteRuleSubtreeStream(adaptor,"rule docs");
        RewriteRuleSubtreeStream stream_parL=new RewriteRuleSubtreeStream(adaptor,"rule parL");
        RewriteRuleSubtreeStream stream_ctorChain=new RewriteRuleSubtreeStream(adaptor,"rule ctorChain");
        RewriteRuleSubtreeStream stream_params=new RewriteRuleSubtreeStream(adaptor,"rule params");
        RewriteRuleSubtreeStream stream_parR=new RewriteRuleSubtreeStream(adaptor,"rule parR");
        RewriteRuleSubtreeStream stream_ctorFlags=new RewriteRuleSubtreeStream(adaptor,"rule ctorFlags");
        paraphrase.push("Constructor definition");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:353:3: ( docs ( facet )* (m= ctorFlags )* KW_NEW cname= id parL params parR (cchain= ( ( SP_COLON )=> ctorChain ) )? methodBody -> ^( AST_CONSTRUCTOR ^( $cname) ( params )? ( ^( AST_MODIFIER $m) )* ( ^( AST_CONSTRUCTOR_CHAIN $cchain) )* ( methodBody )? ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:353:5: docs ( facet )* (m= ctorFlags )* KW_NEW cname= id parL params parR (cchain= ( ( SP_COLON )=> ctorChain ) )? methodBody
            {
            pushFollow(FOLLOW_docs_in_ctorDef2132);
            docs214=docs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_docs.add(docs214.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:353:10: ( facet )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==AT) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: facet
            	    {
            	    pushFollow(FOLLOW_facet_in_ctorDef2134);
            	    facet215=facet();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_facet.add(facet215.getTree());

            	    }
            	    break;

            	default :
            	    break loop70;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:353:18: (m= ctorFlags )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( ((LA71_0>=KW_PRIVATE && LA71_0<=KW_INTERNAL)) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: m= ctorFlags
            	    {
            	    pushFollow(FOLLOW_ctorFlags_in_ctorDef2139);
            	    m=ctorFlags();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_ctorFlags.add(m.getTree());

            	    }
            	    break;

            	default :
            	    break loop71;
                }
            } while (true);

            KW_NEW216=(Token)match(input,KW_NEW,FOLLOW_KW_NEW_in_ctorDef2142); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_NEW.add(KW_NEW216);

            pushFollow(FOLLOW_id_in_ctorDef2146);
            cname=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(cname.getTree());
            pushFollow(FOLLOW_parL_in_ctorDef2148);
            parL217=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parL.add(parL217.getTree());
            pushFollow(FOLLOW_params_in_ctorDef2150);
            params218=params();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_params.add(params218.getTree());
            pushFollow(FOLLOW_parR_in_ctorDef2152);
            parR219=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parR.add(parR219.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:353:69: (cchain= ( ( SP_COLON )=> ctorChain ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==SP_COLON) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: cchain= ( ( SP_COLON )=> ctorChain )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:353:70: ( ( SP_COLON )=> ctorChain )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:353:71: ( SP_COLON )=> ctorChain
                    {
                    pushFollow(FOLLOW_ctorChain_in_ctorDef2161);
                    ctorChain220=ctorChain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ctorChain.add(ctorChain220.getTree());

                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_methodBody_in_ctorDef2165);
            methodBody221=methodBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_methodBody.add(methodBody221.getTree());


            // AST REWRITE
            // elements: params, m, methodBody, cname, cchain
            // token labels: cchain
            // rule labels: retval, m, cname
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_cchain=new RewriteRuleTokenStream(adaptor,"token cchain",cchain);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_m=new RewriteRuleSubtreeStream(adaptor,"rule m",m!=null?m.tree:null);
            RewriteRuleSubtreeStream stream_cname=new RewriteRuleSubtreeStream(adaptor,"rule cname",cname!=null?cname.tree:null);

            root_0 = (Object)adaptor.nil();
            // 354:7: -> ^( AST_CONSTRUCTOR ^( $cname) ( params )? ( ^( AST_MODIFIER $m) )* ( ^( AST_CONSTRUCTOR_CHAIN $cchain) )* ( methodBody )? )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:354:10: ^( AST_CONSTRUCTOR ^( $cname) ( params )? ( ^( AST_MODIFIER $m) )* ( ^( AST_CONSTRUCTOR_CHAIN $cchain) )* ( methodBody )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CONSTRUCTOR, "AST_CONSTRUCTOR"), root_1);

                // src/net/colar/netbeans/fan/antlr/Fan.g:354:28: ^( $cname)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_cname.nextNode(), root_2);

                adaptor.addChild(root_1, root_2);
                }
                // src/net/colar/netbeans/fan/antlr/Fan.g:354:38: ( params )?
                if ( stream_params.hasNext() ) {
                    adaptor.addChild(root_1, stream_params.nextTree());

                }
                stream_params.reset();
                // src/net/colar/netbeans/fan/antlr/Fan.g:354:46: ( ^( AST_MODIFIER $m) )*
                while ( stream_m.hasNext() ) {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:354:46: ^( AST_MODIFIER $m)
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_MODIFIER, "AST_MODIFIER"), root_2);

                    adaptor.addChild(root_2, stream_m.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_m.reset();
                // src/net/colar/netbeans/fan/antlr/Fan.g:354:66: ( ^( AST_CONSTRUCTOR_CHAIN $cchain) )*
                while ( stream_cchain.hasNext() ) {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:354:66: ^( AST_CONSTRUCTOR_CHAIN $cchain)
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CONSTRUCTOR_CHAIN, "AST_CONSTRUCTOR_CHAIN"), root_2);

                    adaptor.addChild(root_2, stream_cchain.nextNode());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_cchain.reset();
                // src/net/colar/netbeans/fan/antlr/Fan.g:354:100: ( methodBody )?
                if ( stream_methodBody.hasNext() ) {
                    adaptor.addChild(root_1, stream_methodBody.nextTree());

                }
                stream_methodBody.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 54, ctorDef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ctorDef"

    public static class ctorFlags_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ctorFlags"
    // src/net/colar/netbeans/fan/antlr/Fan.g:355:1: ctorFlags : protection ;
    public final FanParser.ctorFlags_return ctorFlags() throws RecognitionException {
        FanParser.ctorFlags_return retval = new FanParser.ctorFlags_return();
        retval.start = input.LT(1);
        int ctorFlags_StartIndex = input.index();
        Object root_0 = null;

        FanParser.protection_return protection222 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:355:11: ( protection )
            // src/net/colar/netbeans/fan/antlr/Fan.g:355:13: protection
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_protection_in_ctorFlags2212);
            protection222=protection();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, protection222.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 55, ctorFlags_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ctorFlags"

    public static class ctorChain_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ctorChain"
    // src/net/colar/netbeans/fan/antlr/Fan.g:356:1: ctorChain : SP_COLON ( ctorChainThis | ctorChainSuper ) ;
    public final FanParser.ctorChain_return ctorChain() throws RecognitionException {
        FanParser.ctorChain_return retval = new FanParser.ctorChain_return();
        retval.start = input.LT(1);
        int ctorChain_StartIndex = input.index();
        Object root_0 = null;

        Token SP_COLON223=null;
        FanParser.ctorChainThis_return ctorChainThis224 = null;

        FanParser.ctorChainSuper_return ctorChainSuper225 = null;


        Object SP_COLON223_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:356:11: ( SP_COLON ( ctorChainThis | ctorChainSuper ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:356:13: SP_COLON ( ctorChainThis | ctorChainSuper )
            {
            root_0 = (Object)adaptor.nil();

            SP_COLON223=(Token)match(input,SP_COLON,FOLLOW_SP_COLON_in_ctorChain2219); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SP_COLON223_tree = (Object)adaptor.create(SP_COLON223);
            adaptor.addChild(root_0, SP_COLON223_tree);
            }
            // src/net/colar/netbeans/fan/antlr/Fan.g:356:22: ( ctorChainThis | ctorChainSuper )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==KW_THIS) ) {
                alt73=1;
            }
            else if ( (LA73_0==KW_SUPER) ) {
                alt73=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:356:23: ctorChainThis
                    {
                    pushFollow(FOLLOW_ctorChainThis_in_ctorChain2222);
                    ctorChainThis224=ctorChainThis();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ctorChainThis224.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:356:39: ctorChainSuper
                    {
                    pushFollow(FOLLOW_ctorChainSuper_in_ctorChain2226);
                    ctorChainSuper225=ctorChainSuper();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ctorChainSuper225.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 56, ctorChain_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ctorChain"

    public static class ctorChainThis_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ctorChainThis"
    // src/net/colar/netbeans/fan/antlr/Fan.g:358:1: ctorChainThis : KW_THIS DOT id parL ( args )? parR ;
    public final FanParser.ctorChainThis_return ctorChainThis() throws RecognitionException {
        FanParser.ctorChainThis_return retval = new FanParser.ctorChainThis_return();
        retval.start = input.LT(1);
        int ctorChainThis_StartIndex = input.index();
        Object root_0 = null;

        Token KW_THIS226=null;
        Token DOT227=null;
        FanParser.id_return id228 = null;

        FanParser.parL_return parL229 = null;

        FanParser.args_return args230 = null;

        FanParser.parR_return parR231 = null;


        Object KW_THIS226_tree=null;
        Object DOT227_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:358:15: ( KW_THIS DOT id parL ( args )? parR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:358:17: KW_THIS DOT id parL ( args )? parR
            {
            root_0 = (Object)adaptor.nil();

            KW_THIS226=(Token)match(input,KW_THIS,FOLLOW_KW_THIS_in_ctorChainThis2235); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_THIS226_tree = (Object)adaptor.create(KW_THIS226);
            adaptor.addChild(root_0, KW_THIS226_tree);
            }
            DOT227=(Token)match(input,DOT,FOLLOW_DOT_in_ctorChainThis2237); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DOT227_tree = (Object)adaptor.create(DOT227);
            adaptor.addChild(root_0, DOT227_tree);
            }
            pushFollow(FOLLOW_id_in_ctorChainThis2239);
            id228=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id228.getTree());
            pushFollow(FOLLOW_parL_in_ctorChainThis2241);
            parL229=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parL229.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:358:37: ( args )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( ((LA74_0>=KW_THIS && LA74_0<=KW_SUPER)||(LA74_0>=KW_NULL && LA74_0<=KW_FALSE)||LA74_0==SP_PIPE||LA74_0==OP_CURRY||(LA74_0>=OP_PLUS && LA74_0<=OP_MULTI)||(LA74_0>=OP_BANG && LA74_0<=OP_TILDA)||(LA74_0>=ID && LA74_0<=AT)||(LA74_0>=NUMBER && LA74_0<=SQ_BRACKET_L)||LA74_0==PAR_L) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: args
                    {
                    pushFollow(FOLLOW_args_in_ctorChainThis2243);
                    args230=args();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, args230.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_parR_in_ctorChainThis2246);
            parR231=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parR231.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 57, ctorChainThis_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ctorChainThis"

    public static class ctorChainSuper_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ctorChainSuper"
    // src/net/colar/netbeans/fan/antlr/Fan.g:359:1: ctorChainSuper : KW_SUPER ( DOT id )? parL ( args )? parR ;
    public final FanParser.ctorChainSuper_return ctorChainSuper() throws RecognitionException {
        FanParser.ctorChainSuper_return retval = new FanParser.ctorChainSuper_return();
        retval.start = input.LT(1);
        int ctorChainSuper_StartIndex = input.index();
        Object root_0 = null;

        Token KW_SUPER232=null;
        Token DOT233=null;
        FanParser.id_return id234 = null;

        FanParser.parL_return parL235 = null;

        FanParser.args_return args236 = null;

        FanParser.parR_return parR237 = null;


        Object KW_SUPER232_tree=null;
        Object DOT233_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:359:16: ( KW_SUPER ( DOT id )? parL ( args )? parR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:359:18: KW_SUPER ( DOT id )? parL ( args )? parR
            {
            root_0 = (Object)adaptor.nil();

            KW_SUPER232=(Token)match(input,KW_SUPER,FOLLOW_KW_SUPER_in_ctorChainSuper2253); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_SUPER232_tree = (Object)adaptor.create(KW_SUPER232);
            adaptor.addChild(root_0, KW_SUPER232_tree);
            }
            // src/net/colar/netbeans/fan/antlr/Fan.g:359:27: ( DOT id )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==DOT) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:359:28: DOT id
                    {
                    DOT233=(Token)match(input,DOT,FOLLOW_DOT_in_ctorChainSuper2256); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOT233_tree = (Object)adaptor.create(DOT233);
                    adaptor.addChild(root_0, DOT233_tree);
                    }
                    pushFollow(FOLLOW_id_in_ctorChainSuper2258);
                    id234=id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, id234.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_parL_in_ctorChainSuper2262);
            parL235=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parL235.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:359:42: ( args )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( ((LA76_0>=KW_THIS && LA76_0<=KW_SUPER)||(LA76_0>=KW_NULL && LA76_0<=KW_FALSE)||LA76_0==SP_PIPE||LA76_0==OP_CURRY||(LA76_0>=OP_PLUS && LA76_0<=OP_MULTI)||(LA76_0>=OP_BANG && LA76_0<=OP_TILDA)||(LA76_0>=ID && LA76_0<=AT)||(LA76_0>=NUMBER && LA76_0<=SQ_BRACKET_L)||LA76_0==PAR_L) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: args
                    {
                    pushFollow(FOLLOW_args_in_ctorChainSuper2264);
                    args236=args();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, args236.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_parR_in_ctorChainSuper2267);
            parR237=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parR237.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 58, ctorChainSuper_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ctorChainSuper"

    public static class staticBlock_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "staticBlock"
    // src/net/colar/netbeans/fan/antlr/Fan.g:361:1: staticBlock : KW_STATIC block ;
    public final FanParser.staticBlock_return staticBlock() throws RecognitionException {
        FanParser.staticBlock_return retval = new FanParser.staticBlock_return();
        retval.start = input.LT(1);
        int staticBlock_StartIndex = input.index();
        Object root_0 = null;

        Token KW_STATIC238=null;
        FanParser.block_return block239 = null;


        Object KW_STATIC238_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:361:13: ( KW_STATIC block )
            // src/net/colar/netbeans/fan/antlr/Fan.g:361:15: KW_STATIC block
            {
            root_0 = (Object)adaptor.nil();

            KW_STATIC238=(Token)match(input,KW_STATIC,FOLLOW_KW_STATIC_in_staticBlock2275); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_STATIC238_tree = (Object)adaptor.create(KW_STATIC238);
            adaptor.addChild(root_0, KW_STATIC238_tree);
            }
            pushFollow(FOLLOW_block_in_staticBlock2277);
            block239=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, block239.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 59, staticBlock_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "staticBlock"

    public static class block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "block"
    // src/net/colar/netbeans/fan/antlr/Fan.g:362:1: block : ( ( bracketL )=> multiStmt | stmt ) ;
    public final FanParser.block_return block() throws RecognitionException {
        FanParser.block_return retval = new FanParser.block_return();
        retval.start = input.LT(1);
        int block_StartIndex = input.index();
        Object root_0 = null;

        FanParser.multiStmt_return multiStmt240 = null;

        FanParser.stmt_return stmt241 = null;



        paraphrase.push("Block");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:363:3: ( ( ( bracketL )=> multiStmt | stmt ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:363:5: ( ( bracketL )=> multiStmt | stmt )
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:363:5: ( ( bracketL )=> multiStmt | stmt )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==BRACKET_L) && (synpred115_Fan())) {
                alt77=1;
            }
            else if ( ((LA77_0>=KW_BREAK && LA77_0<=KW_TRY)||(LA77_0>=KW_THIS && LA77_0<=KW_SUPER)||(LA77_0>=KW_NULL && LA77_0<=KW_FALSE)||LA77_0==SP_PIPE||LA77_0==OP_CURRY||(LA77_0>=OP_PLUS && LA77_0<=OP_MULTI)||(LA77_0>=OP_BANG && LA77_0<=OP_TILDA)||(LA77_0>=ID && LA77_0<=AT)||(LA77_0>=NUMBER && LA77_0<=SQ_BRACKET_L)||LA77_0==PAR_L) ) {
                alt77=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }
            switch (alt77) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:363:6: ( bracketL )=> multiStmt
                    {
                    pushFollow(FOLLOW_multiStmt_in_block2302);
                    multiStmt240=multiStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiStmt240.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:363:30: stmt
                    {
                    pushFollow(FOLLOW_stmt_in_block2306);
                    stmt241=stmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmt241.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 60, block_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "block"

    public static class multiStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiStmt"
    // src/net/colar/netbeans/fan/antlr/Fan.g:364:1: multiStmt : bracketL ( stmt )* bracketR -> ^( AST_CODE_BLOCK bracketL ( ( stmt )* )? bracketR ) ;
    public final FanParser.multiStmt_return multiStmt() throws RecognitionException {
        FanParser.multiStmt_return retval = new FanParser.multiStmt_return();
        retval.start = input.LT(1);
        int multiStmt_StartIndex = input.index();
        Object root_0 = null;

        FanParser.bracketL_return bracketL242 = null;

        FanParser.stmt_return stmt243 = null;

        FanParser.bracketR_return bracketR244 = null;


        RewriteRuleSubtreeStream stream_bracketL=new RewriteRuleSubtreeStream(adaptor,"rule bracketL");
        RewriteRuleSubtreeStream stream_stmt=new RewriteRuleSubtreeStream(adaptor,"rule stmt");
        RewriteRuleSubtreeStream stream_bracketR=new RewriteRuleSubtreeStream(adaptor,"rule bracketR");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:364:11: ( bracketL ( stmt )* bracketR -> ^( AST_CODE_BLOCK bracketL ( ( stmt )* )? bracketR ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:364:13: bracketL ( stmt )* bracketR
            {
            pushFollow(FOLLOW_bracketL_in_multiStmt2314);
            bracketL242=bracketL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bracketL.add(bracketL242.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:364:22: ( stmt )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( ((LA78_0>=KW_BREAK && LA78_0<=KW_TRY)||(LA78_0>=KW_THIS && LA78_0<=KW_SUPER)||(LA78_0>=KW_NULL && LA78_0<=KW_FALSE)||LA78_0==SP_PIPE||LA78_0==OP_CURRY||(LA78_0>=OP_PLUS && LA78_0<=OP_MULTI)||(LA78_0>=OP_BANG && LA78_0<=OP_TILDA)||(LA78_0>=ID && LA78_0<=AT)||(LA78_0>=NUMBER && LA78_0<=SQ_BRACKET_L)||LA78_0==PAR_L) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_multiStmt2316);
            	    stmt243=stmt();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_stmt.add(stmt243.getTree());

            	    }
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);

            pushFollow(FOLLOW_bracketR_in_multiStmt2319);
            bracketR244=bracketR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bracketR.add(bracketR244.getTree());


            // AST REWRITE
            // elements: bracketL, bracketR, stmt
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 364:37: -> ^( AST_CODE_BLOCK bracketL ( ( stmt )* )? bracketR )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:364:40: ^( AST_CODE_BLOCK bracketL ( ( stmt )* )? bracketR )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CODE_BLOCK, "AST_CODE_BLOCK"), root_1);

                adaptor.addChild(root_1, stream_bracketL.nextTree());
                // src/net/colar/netbeans/fan/antlr/Fan.g:364:66: ( ( stmt )* )?
                if ( stream_stmt.hasNext() ) {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:364:67: ( stmt )*
                    while ( stream_stmt.hasNext() ) {
                        adaptor.addChild(root_1, stream_stmt.nextTree());

                    }
                    stream_stmt.reset();

                }
                stream_stmt.reset();
                adaptor.addChild(root_1, stream_bracketR.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 61, multiStmt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "multiStmt"

    public static class stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stmt"
    // src/net/colar/netbeans/fan/antlr/Fan.g:365:1: stmt : ( g_if | g_for | g_while | g_break | g_continue | g_return | g_switch | g_throw | g_try | exprStmt | localDef ) ;
    public final FanParser.stmt_return stmt() throws RecognitionException {
        FanParser.stmt_return retval = new FanParser.stmt_return();
        retval.start = input.LT(1);
        int stmt_StartIndex = input.index();
        Object root_0 = null;

        FanParser.g_if_return g_if245 = null;

        FanParser.g_for_return g_for246 = null;

        FanParser.g_while_return g_while247 = null;

        FanParser.g_break_return g_break248 = null;

        FanParser.g_continue_return g_continue249 = null;

        FanParser.g_return_return g_return250 = null;

        FanParser.g_switch_return g_switch251 = null;

        FanParser.g_throw_return g_throw252 = null;

        FanParser.g_try_return g_try253 = null;

        FanParser.exprStmt_return exprStmt254 = null;

        FanParser.localDef_return localDef255 = null;



        paraphrase.push("Statement");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:367:3: ( ( g_if | g_for | g_while | g_break | g_continue | g_return | g_switch | g_throw | g_try | exprStmt | localDef ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:367:5: ( g_if | g_for | g_while | g_break | g_continue | g_return | g_switch | g_throw | g_try | exprStmt | localDef )
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:367:5: ( g_if | g_for | g_while | g_break | g_continue | g_return | g_switch | g_throw | g_try | exprStmt | localDef )
            int alt79=11;
            alt79 = dfa79.predict(input);
            switch (alt79) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:367:6: g_if
                    {
                    pushFollow(FOLLOW_g_if_in_stmt2354);
                    g_if245=g_if();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_if245.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:367:13: g_for
                    {
                    pushFollow(FOLLOW_g_for_in_stmt2358);
                    g_for246=g_for();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_for246.getTree());

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:367:21: g_while
                    {
                    pushFollow(FOLLOW_g_while_in_stmt2362);
                    g_while247=g_while();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_while247.getTree());

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:367:31: g_break
                    {
                    pushFollow(FOLLOW_g_break_in_stmt2366);
                    g_break248=g_break();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_break248.getTree());

                    }
                    break;
                case 5 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:368:4: g_continue
                    {
                    pushFollow(FOLLOW_g_continue_in_stmt2373);
                    g_continue249=g_continue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_continue249.getTree());

                    }
                    break;
                case 6 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:368:17: g_return
                    {
                    pushFollow(FOLLOW_g_return_in_stmt2377);
                    g_return250=g_return();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_return250.getTree());

                    }
                    break;
                case 7 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:368:28: g_switch
                    {
                    pushFollow(FOLLOW_g_switch_in_stmt2381);
                    g_switch251=g_switch();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_switch251.getTree());

                    }
                    break;
                case 8 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:369:4: g_throw
                    {
                    pushFollow(FOLLOW_g_throw_in_stmt2388);
                    g_throw252=g_throw();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_throw252.getTree());

                    }
                    break;
                case 9 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:369:14: g_try
                    {
                    pushFollow(FOLLOW_g_try_in_stmt2392);
                    g_try253=g_try();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_try253.getTree());

                    }
                    break;
                case 10 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:369:22: exprStmt
                    {
                    pushFollow(FOLLOW_exprStmt_in_stmt2396);
                    exprStmt254=exprStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exprStmt254.getTree());

                    }
                    break;
                case 11 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:369:33: localDef
                    {
                    pushFollow(FOLLOW_localDef_in_stmt2400);
                    localDef255=localDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, localDef255.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 62, stmt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "stmt"

    public static class stmtList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stmtList"
    // src/net/colar/netbeans/fan/antlr/Fan.g:371:1: stmtList : s= ( ( stmt )* ) -> ^( AST_CODE_BLOCK ( $s)? ) ;
    public final FanParser.stmtList_return stmtList() throws RecognitionException {
        FanParser.stmtList_return retval = new FanParser.stmtList_return();
        retval.start = input.LT(1);
        int stmtList_StartIndex = input.index();
        Object root_0 = null;

        Token s=null;
        FanParser.stmt_return stmt256 = null;


        Object s_tree=null;
        RewriteRuleSubtreeStream stream_stmt=new RewriteRuleSubtreeStream(adaptor,"rule stmt");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:371:10: (s= ( ( stmt )* ) -> ^( AST_CODE_BLOCK ( $s)? ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:371:12: s= ( ( stmt )* )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:371:14: ( ( stmt )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:371:15: ( stmt )*
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:371:15: ( stmt )*
            loop80:
            do {
                int alt80=2;
                alt80 = dfa80.predict(input);
                switch (alt80) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_stmtList2413);
            	    stmt256=stmt();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_stmt.add(stmt256.getTree());

            	    }
            	    break;

            	default :
            	    break loop80;
                }
            } while (true);


            }



            // AST REWRITE
            // elements: s
            // token labels: s
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_s=new RewriteRuleTokenStream(adaptor,"token s",s);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 371:22: -> ^( AST_CODE_BLOCK ( $s)? )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:371:25: ^( AST_CODE_BLOCK ( $s)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CODE_BLOCK, "AST_CODE_BLOCK"), root_1);

                // src/net/colar/netbeans/fan/antlr/Fan.g:371:42: ( $s)?
                if ( stream_s.hasNext() ) {
                    adaptor.addChild(root_1, stream_s.nextNode());

                }
                stream_s.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 63, stmtList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "stmtList"

    public static class g_break_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "g_break"
    // src/net/colar/netbeans/fan/antlr/Fan.g:377:1: g_break : KW_BREAK eos ;
    public final FanParser.g_break_return g_break() throws RecognitionException {
        FanParser.g_break_return retval = new FanParser.g_break_return();
        retval.start = input.LT(1);
        int g_break_StartIndex = input.index();
        Object root_0 = null;

        Token KW_BREAK257=null;
        FanParser.eos_return eos258 = null;


        Object KW_BREAK257_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:377:10: ( KW_BREAK eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:377:12: KW_BREAK eos
            {
            root_0 = (Object)adaptor.nil();

            KW_BREAK257=(Token)match(input,KW_BREAK,FOLLOW_KW_BREAK_in_g_break2435); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_BREAK257_tree = (Object)adaptor.create(KW_BREAK257);
            adaptor.addChild(root_0, KW_BREAK257_tree);
            }
            pushFollow(FOLLOW_eos_in_g_break2437);
            eos258=eos();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, eos258.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 64, g_break_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "g_break"

    public static class g_continue_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "g_continue"
    // src/net/colar/netbeans/fan/antlr/Fan.g:378:1: g_continue : KW_CONTINUE eos ;
    public final FanParser.g_continue_return g_continue() throws RecognitionException {
        FanParser.g_continue_return retval = new FanParser.g_continue_return();
        retval.start = input.LT(1);
        int g_continue_StartIndex = input.index();
        Object root_0 = null;

        Token KW_CONTINUE259=null;
        FanParser.eos_return eos260 = null;


        Object KW_CONTINUE259_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:378:12: ( KW_CONTINUE eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:378:14: KW_CONTINUE eos
            {
            root_0 = (Object)adaptor.nil();

            KW_CONTINUE259=(Token)match(input,KW_CONTINUE,FOLLOW_KW_CONTINUE_in_g_continue2444); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_CONTINUE259_tree = (Object)adaptor.create(KW_CONTINUE259);
            adaptor.addChild(root_0, KW_CONTINUE259_tree);
            }
            pushFollow(FOLLOW_eos_in_g_continue2446);
            eos260=eos();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, eos260.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 65, g_continue_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "g_continue"

    public static class g_for_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "g_for"
    // src/net/colar/netbeans/fan/antlr/Fan.g:379:1: g_for : KW_FOR parL ( forInit )? SP_SEMI ( expr )? SP_SEMI ( expr )? parR block ;
    public final FanParser.g_for_return g_for() throws RecognitionException {
        FanParser.g_for_return retval = new FanParser.g_for_return();
        retval.start = input.LT(1);
        int g_for_StartIndex = input.index();
        Object root_0 = null;

        Token KW_FOR261=null;
        Token SP_SEMI264=null;
        Token SP_SEMI266=null;
        FanParser.parL_return parL262 = null;

        FanParser.forInit_return forInit263 = null;

        FanParser.expr_return expr265 = null;

        FanParser.expr_return expr267 = null;

        FanParser.parR_return parR268 = null;

        FanParser.block_return block269 = null;


        Object KW_FOR261_tree=null;
        Object SP_SEMI264_tree=null;
        Object SP_SEMI266_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:379:8: ( KW_FOR parL ( forInit )? SP_SEMI ( expr )? SP_SEMI ( expr )? parR block )
            // src/net/colar/netbeans/fan/antlr/Fan.g:379:10: KW_FOR parL ( forInit )? SP_SEMI ( expr )? SP_SEMI ( expr )? parR block
            {
            root_0 = (Object)adaptor.nil();

            KW_FOR261=(Token)match(input,KW_FOR,FOLLOW_KW_FOR_in_g_for2454); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_FOR261_tree = (Object)adaptor.create(KW_FOR261);
            adaptor.addChild(root_0, KW_FOR261_tree);
            }
            pushFollow(FOLLOW_parL_in_g_for2456);
            parL262=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parL262.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:379:22: ( forInit )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( ((LA81_0>=KW_THIS && LA81_0<=KW_SUPER)||(LA81_0>=KW_NULL && LA81_0<=KW_FALSE)||LA81_0==SP_PIPE||LA81_0==OP_CURRY||(LA81_0>=OP_PLUS && LA81_0<=OP_MULTI)||(LA81_0>=OP_BANG && LA81_0<=OP_TILDA)||(LA81_0>=ID && LA81_0<=AT)||(LA81_0>=NUMBER && LA81_0<=SQ_BRACKET_L)||LA81_0==PAR_L) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: forInit
                    {
                    pushFollow(FOLLOW_forInit_in_g_for2458);
                    forInit263=forInit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, forInit263.getTree());

                    }
                    break;

            }

            SP_SEMI264=(Token)match(input,SP_SEMI,FOLLOW_SP_SEMI_in_g_for2461); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SP_SEMI264_tree = (Object)adaptor.create(SP_SEMI264);
            adaptor.addChild(root_0, SP_SEMI264_tree);
            }
            // src/net/colar/netbeans/fan/antlr/Fan.g:379:39: ( expr )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( ((LA82_0>=KW_THIS && LA82_0<=KW_SUPER)||(LA82_0>=KW_NULL && LA82_0<=KW_FALSE)||LA82_0==SP_PIPE||LA82_0==OP_CURRY||(LA82_0>=OP_PLUS && LA82_0<=OP_MULTI)||(LA82_0>=OP_BANG && LA82_0<=OP_TILDA)||(LA82_0>=ID && LA82_0<=AT)||(LA82_0>=NUMBER && LA82_0<=SQ_BRACKET_L)||LA82_0==PAR_L) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: expr
                    {
                    pushFollow(FOLLOW_expr_in_g_for2463);
                    expr265=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr265.getTree());

                    }
                    break;

            }

            SP_SEMI266=(Token)match(input,SP_SEMI,FOLLOW_SP_SEMI_in_g_for2466); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SP_SEMI266_tree = (Object)adaptor.create(SP_SEMI266);
            adaptor.addChild(root_0, SP_SEMI266_tree);
            }
            // src/net/colar/netbeans/fan/antlr/Fan.g:379:53: ( expr )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( ((LA83_0>=KW_THIS && LA83_0<=KW_SUPER)||(LA83_0>=KW_NULL && LA83_0<=KW_FALSE)||LA83_0==SP_PIPE||LA83_0==OP_CURRY||(LA83_0>=OP_PLUS && LA83_0<=OP_MULTI)||(LA83_0>=OP_BANG && LA83_0<=OP_TILDA)||(LA83_0>=ID && LA83_0<=AT)||(LA83_0>=NUMBER && LA83_0<=SQ_BRACKET_L)||LA83_0==PAR_L) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: expr
                    {
                    pushFollow(FOLLOW_expr_in_g_for2468);
                    expr267=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr267.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_parR_in_g_for2471);
            parR268=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parR268.getTree());
            pushFollow(FOLLOW_block_in_g_for2474);
            block269=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, block269.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 66, g_for_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "g_for"

    public static class g_if_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "g_if"
    // src/net/colar/netbeans/fan/antlr/Fan.g:380:1: g_if : KW_IF parL expr parR block ( KW_ELSE block )? ;
    public final FanParser.g_if_return g_if() throws RecognitionException {
        FanParser.g_if_return retval = new FanParser.g_if_return();
        retval.start = input.LT(1);
        int g_if_StartIndex = input.index();
        Object root_0 = null;

        Token KW_IF270=null;
        Token KW_ELSE275=null;
        FanParser.parL_return parL271 = null;

        FanParser.expr_return expr272 = null;

        FanParser.parR_return parR273 = null;

        FanParser.block_return block274 = null;

        FanParser.block_return block276 = null;


        Object KW_IF270_tree=null;
        Object KW_ELSE275_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:380:7: ( KW_IF parL expr parR block ( KW_ELSE block )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:380:9: KW_IF parL expr parR block ( KW_ELSE block )?
            {
            root_0 = (Object)adaptor.nil();

            KW_IF270=(Token)match(input,KW_IF,FOLLOW_KW_IF_in_g_if2482); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_IF270_tree = (Object)adaptor.create(KW_IF270);
            adaptor.addChild(root_0, KW_IF270_tree);
            }
            pushFollow(FOLLOW_parL_in_g_if2484);
            parL271=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parL271.getTree());
            pushFollow(FOLLOW_expr_in_g_if2486);
            expr272=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr272.getTree());
            pushFollow(FOLLOW_parR_in_g_if2488);
            parR273=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parR273.getTree());
            pushFollow(FOLLOW_block_in_g_if2490);
            block274=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, block274.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:381:5: ( KW_ELSE block )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==KW_ELSE) ) {
                int LA84_1 = input.LA(2);

                if ( (synpred131_Fan()) ) {
                    alt84=1;
                }
            }
            switch (alt84) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:381:6: KW_ELSE block
                    {
                    KW_ELSE275=(Token)match(input,KW_ELSE,FOLLOW_KW_ELSE_in_g_if2497); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_ELSE275_tree = (Object)adaptor.create(KW_ELSE275);
                    adaptor.addChild(root_0, KW_ELSE275_tree);
                    }
                    pushFollow(FOLLOW_block_in_g_if2499);
                    block276=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block276.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 67, g_if_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "g_if"

    public static class g_return_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "g_return"
    // src/net/colar/netbeans/fan/antlr/Fan.g:382:1: g_return : KW_RETURN ( eos | expr eos ) ;
    public final FanParser.g_return_return g_return() throws RecognitionException {
        FanParser.g_return_return retval = new FanParser.g_return_return();
        retval.start = input.LT(1);
        int g_return_StartIndex = input.index();
        Object root_0 = null;

        Token KW_RETURN277=null;
        FanParser.eos_return eos278 = null;

        FanParser.expr_return expr279 = null;

        FanParser.eos_return eos280 = null;


        Object KW_RETURN277_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:382:10: ( KW_RETURN ( eos | expr eos ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:382:12: KW_RETURN ( eos | expr eos )
            {
            root_0 = (Object)adaptor.nil();

            KW_RETURN277=(Token)match(input,KW_RETURN,FOLLOW_KW_RETURN_in_g_return2508); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_RETURN277_tree = (Object)adaptor.create(KW_RETURN277);
            adaptor.addChild(root_0, KW_RETURN277_tree);
            }
            // src/net/colar/netbeans/fan/antlr/Fan.g:382:22: ( eos | expr eos )
            int alt85=2;
            alt85 = dfa85.predict(input);
            switch (alt85) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:382:23: eos
                    {
                    pushFollow(FOLLOW_eos_in_g_return2511);
                    eos278=eos();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, eos278.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:382:29: expr eos
                    {
                    pushFollow(FOLLOW_expr_in_g_return2515);
                    expr279=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr279.getTree());
                    pushFollow(FOLLOW_eos_in_g_return2517);
                    eos280=eos();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, eos280.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 68, g_return_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "g_return"

    public static class g_switch_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "g_switch"
    // src/net/colar/netbeans/fan/antlr/Fan.g:383:1: g_switch : KW_SWITCH parL expr parR bracketL ( g_case )* ( g_default )? bracketR ;
    public final FanParser.g_switch_return g_switch() throws RecognitionException {
        FanParser.g_switch_return retval = new FanParser.g_switch_return();
        retval.start = input.LT(1);
        int g_switch_StartIndex = input.index();
        Object root_0 = null;

        Token KW_SWITCH281=null;
        FanParser.parL_return parL282 = null;

        FanParser.expr_return expr283 = null;

        FanParser.parR_return parR284 = null;

        FanParser.bracketL_return bracketL285 = null;

        FanParser.g_case_return g_case286 = null;

        FanParser.g_default_return g_default287 = null;

        FanParser.bracketR_return bracketR288 = null;


        Object KW_SWITCH281_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:383:10: ( KW_SWITCH parL expr parR bracketL ( g_case )* ( g_default )? bracketR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:383:12: KW_SWITCH parL expr parR bracketL ( g_case )* ( g_default )? bracketR
            {
            root_0 = (Object)adaptor.nil();

            KW_SWITCH281=(Token)match(input,KW_SWITCH,FOLLOW_KW_SWITCH_in_g_switch2525); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_SWITCH281_tree = (Object)adaptor.create(KW_SWITCH281);
            adaptor.addChild(root_0, KW_SWITCH281_tree);
            }
            pushFollow(FOLLOW_parL_in_g_switch2527);
            parL282=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parL282.getTree());
            pushFollow(FOLLOW_expr_in_g_switch2529);
            expr283=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr283.getTree());
            pushFollow(FOLLOW_parR_in_g_switch2531);
            parR284=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parR284.getTree());
            pushFollow(FOLLOW_bracketL_in_g_switch2533);
            bracketL285=bracketL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bracketL285.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:383:46: ( g_case )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==KW_CASE) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:383:47: g_case
            	    {
            	    pushFollow(FOLLOW_g_case_in_g_switch2536);
            	    g_case286=g_case();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_case286.getTree());

            	    }
            	    break;

            	default :
            	    break loop86;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:383:56: ( g_default )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==KW_DEFAULT) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:383:57: g_default
                    {
                    pushFollow(FOLLOW_g_default_in_g_switch2541);
                    g_default287=g_default();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_default287.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_bracketR_in_g_switch2545);
            bracketR288=bracketR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bracketR288.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 69, g_switch_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "g_switch"

    public static class g_throw_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "g_throw"
    // src/net/colar/netbeans/fan/antlr/Fan.g:384:1: g_throw : KW_THROW expr eos ;
    public final FanParser.g_throw_return g_throw() throws RecognitionException {
        FanParser.g_throw_return retval = new FanParser.g_throw_return();
        retval.start = input.LT(1);
        int g_throw_StartIndex = input.index();
        Object root_0 = null;

        Token KW_THROW289=null;
        FanParser.expr_return expr290 = null;

        FanParser.eos_return eos291 = null;


        Object KW_THROW289_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:384:10: ( KW_THROW expr eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:384:12: KW_THROW expr eos
            {
            root_0 = (Object)adaptor.nil();

            KW_THROW289=(Token)match(input,KW_THROW,FOLLOW_KW_THROW_in_g_throw2553); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_THROW289_tree = (Object)adaptor.create(KW_THROW289);
            adaptor.addChild(root_0, KW_THROW289_tree);
            }
            pushFollow(FOLLOW_expr_in_g_throw2555);
            expr290=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr290.getTree());
            pushFollow(FOLLOW_eos_in_g_throw2557);
            eos291=eos();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, eos291.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 70, g_throw_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "g_throw"

    public static class g_while_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "g_while"
    // src/net/colar/netbeans/fan/antlr/Fan.g:385:1: g_while : KW_WHILE parL expr parR block ;
    public final FanParser.g_while_return g_while() throws RecognitionException {
        FanParser.g_while_return retval = new FanParser.g_while_return();
        retval.start = input.LT(1);
        int g_while_StartIndex = input.index();
        Object root_0 = null;

        Token KW_WHILE292=null;
        FanParser.parL_return parL293 = null;

        FanParser.expr_return expr294 = null;

        FanParser.parR_return parR295 = null;

        FanParser.block_return block296 = null;


        Object KW_WHILE292_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:385:10: ( KW_WHILE parL expr parR block )
            // src/net/colar/netbeans/fan/antlr/Fan.g:385:12: KW_WHILE parL expr parR block
            {
            root_0 = (Object)adaptor.nil();

            KW_WHILE292=(Token)match(input,KW_WHILE,FOLLOW_KW_WHILE_in_g_while2565); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_WHILE292_tree = (Object)adaptor.create(KW_WHILE292);
            adaptor.addChild(root_0, KW_WHILE292_tree);
            }
            pushFollow(FOLLOW_parL_in_g_while2567);
            parL293=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parL293.getTree());
            pushFollow(FOLLOW_expr_in_g_while2569);
            expr294=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr294.getTree());
            pushFollow(FOLLOW_parR_in_g_while2571);
            parR295=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parR295.getTree());
            pushFollow(FOLLOW_block_in_g_while2573);
            block296=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, block296.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 71, g_while_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "g_while"

    public static class g_try_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "g_try"
    // src/net/colar/netbeans/fan/antlr/Fan.g:386:1: g_try : KW_TRY ( ( bracketL )=> try_long | stmtList ) ( ( KW_CATCH )=> g_catch )* ( ( KW_FINALLY )=> g_finally )? ;
    public final FanParser.g_try_return g_try() throws RecognitionException {
        FanParser.g_try_return retval = new FanParser.g_try_return();
        retval.start = input.LT(1);
        int g_try_StartIndex = input.index();
        Object root_0 = null;

        Token KW_TRY297=null;
        FanParser.try_long_return try_long298 = null;

        FanParser.stmtList_return stmtList299 = null;

        FanParser.g_catch_return g_catch300 = null;

        FanParser.g_finally_return g_finally301 = null;


        Object KW_TRY297_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:386:8: ( KW_TRY ( ( bracketL )=> try_long | stmtList ) ( ( KW_CATCH )=> g_catch )* ( ( KW_FINALLY )=> g_finally )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:386:10: KW_TRY ( ( bracketL )=> try_long | stmtList ) ( ( KW_CATCH )=> g_catch )* ( ( KW_FINALLY )=> g_finally )?
            {
            root_0 = (Object)adaptor.nil();

            KW_TRY297=(Token)match(input,KW_TRY,FOLLOW_KW_TRY_in_g_try2581); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_TRY297_tree = (Object)adaptor.create(KW_TRY297);
            adaptor.addChild(root_0, KW_TRY297_tree);
            }
            // src/net/colar/netbeans/fan/antlr/Fan.g:386:17: ( ( bracketL )=> try_long | stmtList )
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==BRACKET_L) && (synpred135_Fan())) {
                alt88=1;
            }
            else if ( (LA88_0==EOF||(LA88_0>=KW_BREAK && LA88_0<=KW_FINALLY)||(LA88_0>=KW_RD_ONLY && LA88_0<=KW_FINAL)||(LA88_0>=KW_ABSTRACT && LA88_0<=KW_ELSE)||(LA88_0>=KW_NULL && LA88_0<=KW_FALSE)||LA88_0==BRACKET_R||LA88_0==SP_COMMA||LA88_0==SP_PIPE||LA88_0==SP_SEMI||LA88_0==OP_CURRY||(LA88_0>=OP_PLUS && LA88_0<=OP_MULTI)||(LA88_0>=OP_BANG && LA88_0<=OP_TILDA)||(LA88_0>=ID && LA88_0<=SQ_BRACKET_L)||LA88_0==PAR_L) ) {
                alt88=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }
            switch (alt88) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:386:18: ( bracketL )=> try_long
                    {
                    pushFollow(FOLLOW_try_long_in_g_try2588);
                    try_long298=try_long();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, try_long298.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:386:41: stmtList
                    {
                    pushFollow(FOLLOW_stmtList_in_g_try2592);
                    stmtList299=stmtList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtList299.getTree());

                    }
                    break;

            }

            // src/net/colar/netbeans/fan/antlr/Fan.g:386:51: ( ( KW_CATCH )=> g_catch )*
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==KW_CATCH) ) {
                    int LA89_2 = input.LA(2);

                    if ( (synpred136_Fan()) ) {
                        alt89=1;
                    }


                }


                switch (alt89) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:386:52: ( KW_CATCH )=> g_catch
            	    {
            	    pushFollow(FOLLOW_g_catch_in_g_try2600);
            	    g_catch300=g_catch();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_catch300.getTree());

            	    }
            	    break;

            	default :
            	    break loop89;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:386:74: ( ( KW_FINALLY )=> g_finally )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==KW_FINALLY) ) {
                int LA90_1 = input.LA(2);

                if ( (synpred137_Fan()) ) {
                    alt90=1;
                }
            }
            switch (alt90) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:386:75: ( KW_FINALLY )=> g_finally
                    {
                    pushFollow(FOLLOW_g_finally_in_g_try2609);
                    g_finally301=g_finally();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_finally301.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 72, g_try_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "g_try"

    public static class try_long_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "try_long"
    // src/net/colar/netbeans/fan/antlr/Fan.g:387:1: try_long : multiStmt ;
    public final FanParser.try_long_return try_long() throws RecognitionException {
        FanParser.try_long_return retval = new FanParser.try_long_return();
        retval.start = input.LT(1);
        int try_long_StartIndex = input.index();
        Object root_0 = null;

        FanParser.multiStmt_return multiStmt302 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:387:10: ( multiStmt )
            // src/net/colar/netbeans/fan/antlr/Fan.g:387:12: multiStmt
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiStmt_in_try_long2618);
            multiStmt302=multiStmt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiStmt302.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 73, try_long_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "try_long"

    public static class exprStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprStmt"
    // src/net/colar/netbeans/fan/antlr/Fan.g:388:1: exprStmt : expr eos ;
    public final FanParser.exprStmt_return exprStmt() throws RecognitionException {
        FanParser.exprStmt_return retval = new FanParser.exprStmt_return();
        retval.start = input.LT(1);
        int exprStmt_StartIndex = input.index();
        Object root_0 = null;

        FanParser.expr_return expr303 = null;

        FanParser.eos_return eos304 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:388:10: ( expr eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:388:12: expr eos
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expr_in_exprStmt2625);
            expr303=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr303.getTree());
            pushFollow(FOLLOW_eos_in_exprStmt2627);
            eos304=eos();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, eos304.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 74, exprStmt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "exprStmt"

    public static class localDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "localDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:389:1: localDef : ( typeId ( AS_INIT_VAL expr )? eos ) -> ^( AST_LOCAL_DEF typeId ( expr )? ( eos )? ) ;
    public final FanParser.localDef_return localDef() throws RecognitionException {
        FanParser.localDef_return retval = new FanParser.localDef_return();
        retval.start = input.LT(1);
        int localDef_StartIndex = input.index();
        Object root_0 = null;

        Token AS_INIT_VAL306=null;
        FanParser.typeId_return typeId305 = null;

        FanParser.expr_return expr307 = null;

        FanParser.eos_return eos308 = null;


        Object AS_INIT_VAL306_tree=null;
        RewriteRuleTokenStream stream_AS_INIT_VAL=new RewriteRuleTokenStream(adaptor,"token AS_INIT_VAL");
        RewriteRuleSubtreeStream stream_eos=new RewriteRuleSubtreeStream(adaptor,"rule eos");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_typeId=new RewriteRuleSubtreeStream(adaptor,"rule typeId");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:389:10: ( ( typeId ( AS_INIT_VAL expr )? eos ) -> ^( AST_LOCAL_DEF typeId ( expr )? ( eos )? ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:389:12: ( typeId ( AS_INIT_VAL expr )? eos )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:389:12: ( typeId ( AS_INIT_VAL expr )? eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:389:13: typeId ( AS_INIT_VAL expr )? eos
            {
            pushFollow(FOLLOW_typeId_in_localDef2635);
            typeId305=typeId();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeId.add(typeId305.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:389:20: ( AS_INIT_VAL expr )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==AS_INIT_VAL) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:389:21: AS_INIT_VAL expr
                    {
                    AS_INIT_VAL306=(Token)match(input,AS_INIT_VAL,FOLLOW_AS_INIT_VAL_in_localDef2638); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AS_INIT_VAL.add(AS_INIT_VAL306);

                    pushFollow(FOLLOW_expr_in_localDef2640);
                    expr307=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr307.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_eos_in_localDef2644);
            eos308=eos();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_eos.add(eos308.getTree());

            }



            // AST REWRITE
            // elements: eos, expr, typeId
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 390:5: -> ^( AST_LOCAL_DEF typeId ( expr )? ( eos )? )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:390:8: ^( AST_LOCAL_DEF typeId ( expr )? ( eos )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_LOCAL_DEF, "AST_LOCAL_DEF"), root_1);

                adaptor.addChild(root_1, stream_typeId.nextTree());
                // src/net/colar/netbeans/fan/antlr/Fan.g:390:31: ( expr )?
                if ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();
                // src/net/colar/netbeans/fan/antlr/Fan.g:390:37: ( eos )?
                if ( stream_eos.hasNext() ) {
                    adaptor.addChild(root_1, stream_eos.nextTree());

                }
                stream_eos.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 75, localDef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "localDef"

    public static class forInit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forInit"
    // src/net/colar/netbeans/fan/antlr/Fan.g:391:1: forInit : ( forInitDef | expr );
    public final FanParser.forInit_return forInit() throws RecognitionException {
        FanParser.forInit_return retval = new FanParser.forInit_return();
        retval.start = input.LT(1);
        int forInit_StartIndex = input.index();
        Object root_0 = null;

        FanParser.forInitDef_return forInitDef309 = null;

        FanParser.expr_return expr310 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:391:10: ( forInitDef | expr )
            int alt92=2;
            alt92 = dfa92.predict(input);
            switch (alt92) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:391:12: forInitDef
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forInitDef_in_forInit2671);
                    forInitDef309=forInitDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, forInitDef309.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:391:25: expr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expr_in_forInit2675);
                    expr310=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr310.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 76, forInit_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "forInit"

    public static class forInitDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forInitDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:392:1: forInitDef : typeId ( AS_INIT_VAL expr )? ;
    public final FanParser.forInitDef_return forInitDef() throws RecognitionException {
        FanParser.forInitDef_return retval = new FanParser.forInitDef_return();
        retval.start = input.LT(1);
        int forInitDef_StartIndex = input.index();
        Object root_0 = null;

        Token AS_INIT_VAL312=null;
        FanParser.typeId_return typeId311 = null;

        FanParser.expr_return expr313 = null;


        Object AS_INIT_VAL312_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:392:12: ( typeId ( AS_INIT_VAL expr )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:392:14: typeId ( AS_INIT_VAL expr )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_typeId_in_forInitDef2682);
            typeId311=typeId();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeId311.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:392:21: ( AS_INIT_VAL expr )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==AS_INIT_VAL) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:392:22: AS_INIT_VAL expr
                    {
                    AS_INIT_VAL312=(Token)match(input,AS_INIT_VAL,FOLLOW_AS_INIT_VAL_in_forInitDef2685); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AS_INIT_VAL312_tree = (Object)adaptor.create(AS_INIT_VAL312);
                    adaptor.addChild(root_0, AS_INIT_VAL312_tree);
                    }
                    pushFollow(FOLLOW_expr_in_forInitDef2687);
                    expr313=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr313.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 77, forInitDef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "forInitDef"

    public static class g_catch_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "g_catch"
    // src/net/colar/netbeans/fan/antlr/Fan.g:394:1: g_catch : KW_CATCH ( catchDef )? ( ( bracketL )=> catch_long | stmtList ) ;
    public final FanParser.g_catch_return g_catch() throws RecognitionException {
        FanParser.g_catch_return retval = new FanParser.g_catch_return();
        retval.start = input.LT(1);
        int g_catch_StartIndex = input.index();
        Object root_0 = null;

        Token KW_CATCH314=null;
        FanParser.catchDef_return catchDef315 = null;

        FanParser.catch_long_return catch_long316 = null;

        FanParser.stmtList_return stmtList317 = null;


        Object KW_CATCH314_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:394:10: ( KW_CATCH ( catchDef )? ( ( bracketL )=> catch_long | stmtList ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:394:12: KW_CATCH ( catchDef )? ( ( bracketL )=> catch_long | stmtList )
            {
            root_0 = (Object)adaptor.nil();

            KW_CATCH314=(Token)match(input,KW_CATCH,FOLLOW_KW_CATCH_in_g_catch2698); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_CATCH314_tree = (Object)adaptor.create(KW_CATCH314);
            adaptor.addChild(root_0, KW_CATCH314_tree);
            }
            // src/net/colar/netbeans/fan/antlr/Fan.g:394:21: ( catchDef )?
            int alt94=2;
            alt94 = dfa94.predict(input);
            switch (alt94) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: catchDef
                    {
                    pushFollow(FOLLOW_catchDef_in_g_catch2700);
                    catchDef315=catchDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, catchDef315.getTree());

                    }
                    break;

            }

            // src/net/colar/netbeans/fan/antlr/Fan.g:394:31: ( ( bracketL )=> catch_long | stmtList )
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==BRACKET_L) && (synpred142_Fan())) {
                alt95=1;
            }
            else if ( (LA95_0==EOF||(LA95_0>=KW_BREAK && LA95_0<=KW_FINALLY)||(LA95_0>=KW_RD_ONLY && LA95_0<=KW_FINAL)||(LA95_0>=KW_ABSTRACT && LA95_0<=KW_ELSE)||(LA95_0>=KW_NULL && LA95_0<=KW_FALSE)||LA95_0==BRACKET_R||LA95_0==SP_COMMA||LA95_0==SP_PIPE||LA95_0==SP_SEMI||LA95_0==OP_CURRY||(LA95_0>=OP_PLUS && LA95_0<=OP_MULTI)||(LA95_0>=OP_BANG && LA95_0<=OP_TILDA)||(LA95_0>=ID && LA95_0<=SQ_BRACKET_L)||LA95_0==PAR_L) ) {
                alt95=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }
            switch (alt95) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:394:32: ( bracketL )=> catch_long
                    {
                    pushFollow(FOLLOW_catch_long_in_g_catch2708);
                    catch_long316=catch_long();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, catch_long316.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:394:57: stmtList
                    {
                    pushFollow(FOLLOW_stmtList_in_g_catch2712);
                    stmtList317=stmtList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtList317.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 78, g_catch_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "g_catch"

    public static class catch_long_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "catch_long"
    // src/net/colar/netbeans/fan/antlr/Fan.g:395:1: catch_long : multiStmt ;
    public final FanParser.catch_long_return catch_long() throws RecognitionException {
        FanParser.catch_long_return retval = new FanParser.catch_long_return();
        retval.start = input.LT(1);
        int catch_long_StartIndex = input.index();
        Object root_0 = null;

        FanParser.multiStmt_return multiStmt318 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:395:12: ( multiStmt )
            // src/net/colar/netbeans/fan/antlr/Fan.g:395:14: multiStmt
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiStmt_in_catch_long2720);
            multiStmt318=multiStmt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiStmt318.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 79, catch_long_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "catch_long"

    public static class catchDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "catchDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:396:1: catchDef : parL type id parR ;
    public final FanParser.catchDef_return catchDef() throws RecognitionException {
        FanParser.catchDef_return retval = new FanParser.catchDef_return();
        retval.start = input.LT(1);
        int catchDef_StartIndex = input.index();
        Object root_0 = null;

        FanParser.parL_return parL319 = null;

        FanParser.type_return type320 = null;

        FanParser.id_return id321 = null;

        FanParser.parR_return parR322 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:396:11: ( parL type id parR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:396:13: parL type id parR
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_parL_in_catchDef2728);
            parL319=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parL319.getTree());
            pushFollow(FOLLOW_type_in_catchDef2730);
            type320=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type320.getTree());
            pushFollow(FOLLOW_id_in_catchDef2732);
            id321=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id321.getTree());
            pushFollow(FOLLOW_parR_in_catchDef2734);
            parR322=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parR322.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 80, catchDef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "catchDef"

    public static class g_finally_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "g_finally"
    // src/net/colar/netbeans/fan/antlr/Fan.g:398:1: g_finally : KW_FINALLY ( ( bracketL )=> finally_long | stmtList ) ;
    public final FanParser.g_finally_return g_finally() throws RecognitionException {
        FanParser.g_finally_return retval = new FanParser.g_finally_return();
        retval.start = input.LT(1);
        int g_finally_StartIndex = input.index();
        Object root_0 = null;

        Token KW_FINALLY323=null;
        FanParser.finally_long_return finally_long324 = null;

        FanParser.stmtList_return stmtList325 = null;


        Object KW_FINALLY323_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:398:11: ( KW_FINALLY ( ( bracketL )=> finally_long | stmtList ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:398:13: KW_FINALLY ( ( bracketL )=> finally_long | stmtList )
            {
            root_0 = (Object)adaptor.nil();

            KW_FINALLY323=(Token)match(input,KW_FINALLY,FOLLOW_KW_FINALLY_in_g_finally2742); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_FINALLY323_tree = (Object)adaptor.create(KW_FINALLY323);
            adaptor.addChild(root_0, KW_FINALLY323_tree);
            }
            // src/net/colar/netbeans/fan/antlr/Fan.g:398:24: ( ( bracketL )=> finally_long | stmtList )
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==BRACKET_L) && (synpred143_Fan())) {
                alt96=1;
            }
            else if ( (LA96_0==EOF||(LA96_0>=KW_BREAK && LA96_0<=KW_FINALLY)||(LA96_0>=KW_RD_ONLY && LA96_0<=KW_FINAL)||(LA96_0>=KW_ABSTRACT && LA96_0<=KW_ELSE)||(LA96_0>=KW_NULL && LA96_0<=KW_FALSE)||LA96_0==BRACKET_R||LA96_0==SP_COMMA||LA96_0==SP_PIPE||LA96_0==SP_SEMI||LA96_0==OP_CURRY||(LA96_0>=OP_PLUS && LA96_0<=OP_MULTI)||(LA96_0>=OP_BANG && LA96_0<=OP_TILDA)||(LA96_0>=ID && LA96_0<=SQ_BRACKET_L)||LA96_0==PAR_L) ) {
                alt96=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }
            switch (alt96) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:398:25: ( bracketL )=> finally_long
                    {
                    pushFollow(FOLLOW_finally_long_in_g_finally2749);
                    finally_long324=finally_long();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, finally_long324.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:398:52: stmtList
                    {
                    pushFollow(FOLLOW_stmtList_in_g_finally2753);
                    stmtList325=stmtList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtList325.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 81, g_finally_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "g_finally"

    public static class finally_long_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "finally_long"
    // src/net/colar/netbeans/fan/antlr/Fan.g:399:1: finally_long : multiStmt ;
    public final FanParser.finally_long_return finally_long() throws RecognitionException {
        FanParser.finally_long_return retval = new FanParser.finally_long_return();
        retval.start = input.LT(1);
        int finally_long_StartIndex = input.index();
        Object root_0 = null;

        FanParser.multiStmt_return multiStmt326 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:399:14: ( multiStmt )
            // src/net/colar/netbeans/fan/antlr/Fan.g:399:16: multiStmt
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiStmt_in_finally_long2761);
            multiStmt326=multiStmt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiStmt326.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 82, finally_long_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "finally_long"

    public static class g_case_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "g_case"
    // src/net/colar/netbeans/fan/antlr/Fan.g:400:1: g_case : KW_CASE expr SP_COLON ( stmt )* ;
    public final FanParser.g_case_return g_case() throws RecognitionException {
        FanParser.g_case_return retval = new FanParser.g_case_return();
        retval.start = input.LT(1);
        int g_case_StartIndex = input.index();
        Object root_0 = null;

        Token KW_CASE327=null;
        Token SP_COLON329=null;
        FanParser.expr_return expr328 = null;

        FanParser.stmt_return stmt330 = null;


        Object KW_CASE327_tree=null;
        Object SP_COLON329_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:400:9: ( KW_CASE expr SP_COLON ( stmt )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:400:11: KW_CASE expr SP_COLON ( stmt )*
            {
            root_0 = (Object)adaptor.nil();

            KW_CASE327=(Token)match(input,KW_CASE,FOLLOW_KW_CASE_in_g_case2769); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_CASE327_tree = (Object)adaptor.create(KW_CASE327);
            adaptor.addChild(root_0, KW_CASE327_tree);
            }
            pushFollow(FOLLOW_expr_in_g_case2771);
            expr328=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr328.getTree());
            SP_COLON329=(Token)match(input,SP_COLON,FOLLOW_SP_COLON_in_g_case2773); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SP_COLON329_tree = (Object)adaptor.create(SP_COLON329);
            adaptor.addChild(root_0, SP_COLON329_tree);
            }
            // src/net/colar/netbeans/fan/antlr/Fan.g:400:33: ( stmt )*
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( ((LA97_0>=KW_BREAK && LA97_0<=KW_TRY)||(LA97_0>=KW_THIS && LA97_0<=KW_SUPER)||(LA97_0>=KW_NULL && LA97_0<=KW_FALSE)||LA97_0==SP_PIPE||LA97_0==OP_CURRY||(LA97_0>=OP_PLUS && LA97_0<=OP_MULTI)||(LA97_0>=OP_BANG && LA97_0<=OP_TILDA)||(LA97_0>=ID && LA97_0<=AT)||(LA97_0>=NUMBER && LA97_0<=SQ_BRACKET_L)||LA97_0==PAR_L) ) {
                    alt97=1;
                }


                switch (alt97) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_g_case2775);
            	    stmt330=stmt();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmt330.getTree());

            	    }
            	    break;

            	default :
            	    break loop97;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 83, g_case_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "g_case"

    public static class g_default_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "g_default"
    // src/net/colar/netbeans/fan/antlr/Fan.g:401:1: g_default : KW_DEFAULT SP_COLON ( stmt )* ;
    public final FanParser.g_default_return g_default() throws RecognitionException {
        FanParser.g_default_return retval = new FanParser.g_default_return();
        retval.start = input.LT(1);
        int g_default_StartIndex = input.index();
        Object root_0 = null;

        Token KW_DEFAULT331=null;
        Token SP_COLON332=null;
        FanParser.stmt_return stmt333 = null;


        Object KW_DEFAULT331_tree=null;
        Object SP_COLON332_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:401:11: ( KW_DEFAULT SP_COLON ( stmt )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:401:13: KW_DEFAULT SP_COLON ( stmt )*
            {
            root_0 = (Object)adaptor.nil();

            KW_DEFAULT331=(Token)match(input,KW_DEFAULT,FOLLOW_KW_DEFAULT_in_g_default2783); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_DEFAULT331_tree = (Object)adaptor.create(KW_DEFAULT331);
            adaptor.addChild(root_0, KW_DEFAULT331_tree);
            }
            SP_COLON332=(Token)match(input,SP_COLON,FOLLOW_SP_COLON_in_g_default2785); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SP_COLON332_tree = (Object)adaptor.create(SP_COLON332);
            adaptor.addChild(root_0, SP_COLON332_tree);
            }
            // src/net/colar/netbeans/fan/antlr/Fan.g:401:33: ( stmt )*
            loop98:
            do {
                int alt98=2;
                int LA98_0 = input.LA(1);

                if ( ((LA98_0>=KW_BREAK && LA98_0<=KW_TRY)||(LA98_0>=KW_THIS && LA98_0<=KW_SUPER)||(LA98_0>=KW_NULL && LA98_0<=KW_FALSE)||LA98_0==SP_PIPE||LA98_0==OP_CURRY||(LA98_0>=OP_PLUS && LA98_0<=OP_MULTI)||(LA98_0>=OP_BANG && LA98_0<=OP_TILDA)||(LA98_0>=ID && LA98_0<=AT)||(LA98_0>=NUMBER && LA98_0<=SQ_BRACKET_L)||LA98_0==PAR_L) ) {
                    alt98=1;
                }


                switch (alt98) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_g_default2787);
            	    stmt333=stmt();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmt333.getTree());

            	    }
            	    break;

            	default :
            	    break loop98;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 84, g_default_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "g_default"

    public static class expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:404:1: expr : assignExpr ;
    public final FanParser.expr_return expr() throws RecognitionException {
        FanParser.expr_return retval = new FanParser.expr_return();
        retval.start = input.LT(1);
        int expr_StartIndex = input.index();
        Object root_0 = null;

        FanParser.assignExpr_return assignExpr334 = null;



        paraphrase.push("Expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:406:3: ( assignExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:406:5: assignExpr
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_assignExpr_in_expr2808);
            assignExpr334=assignExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpr334.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 85, expr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "expr"

    public static class assignExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:407:1: assignExpr : ternaryExpr ( assignOp assignExpr )? ;
    public final FanParser.assignExpr_return assignExpr() throws RecognitionException {
        FanParser.assignExpr_return retval = new FanParser.assignExpr_return();
        retval.start = input.LT(1);
        int assignExpr_StartIndex = input.index();
        Object root_0 = null;

        FanParser.ternaryExpr_return ternaryExpr335 = null;

        FanParser.assignOp_return assignOp336 = null;

        FanParser.assignExpr_return assignExpr337 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:407:12: ( ternaryExpr ( assignOp assignExpr )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:407:14: ternaryExpr ( assignOp assignExpr )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ternaryExpr_in_assignExpr2815);
            ternaryExpr335=ternaryExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, ternaryExpr335.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:407:26: ( assignOp assignExpr )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( ((LA99_0>=AS_EQUAL && LA99_0<=AS_ASSIGN_OP)) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:407:27: assignOp assignExpr
                    {
                    pushFollow(FOLLOW_assignOp_in_assignExpr2818);
                    assignOp336=assignOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignOp336.getTree());
                    pushFollow(FOLLOW_assignExpr_in_assignExpr2820);
                    assignExpr337=assignExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpr337.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 86, assignExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "assignExpr"

    public static class ternaryExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ternaryExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:408:1: ternaryExpr : condOrExpr ( ternaryTail )? ;
    public final FanParser.ternaryExpr_return ternaryExpr() throws RecognitionException {
        FanParser.ternaryExpr_return retval = new FanParser.ternaryExpr_return();
        retval.start = input.LT(1);
        int ternaryExpr_StartIndex = input.index();
        Object root_0 = null;

        FanParser.condOrExpr_return condOrExpr338 = null;

        FanParser.ternaryTail_return ternaryTail339 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:408:13: ( condOrExpr ( ternaryTail )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:408:15: condOrExpr ( ternaryTail )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_condOrExpr_in_ternaryExpr2829);
            condOrExpr338=condOrExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, condOrExpr338.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:408:26: ( ternaryTail )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==SP_QMARK) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:408:27: ternaryTail
                    {
                    pushFollow(FOLLOW_ternaryTail_in_ternaryExpr2832);
                    ternaryTail339=ternaryTail();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ternaryTail339.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 87, ternaryExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ternaryExpr"

    public static class ternaryTail_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ternaryTail"
    // src/net/colar/netbeans/fan/antlr/Fan.g:410:1: ternaryTail : SP_QMARK condOrExpr SP_COLON condOrExpr ;
    public final FanParser.ternaryTail_return ternaryTail() throws RecognitionException {
        FanParser.ternaryTail_return retval = new FanParser.ternaryTail_return();
        retval.start = input.LT(1);
        int ternaryTail_StartIndex = input.index();
        Object root_0 = null;

        Token SP_QMARK340=null;
        Token SP_COLON342=null;
        FanParser.condOrExpr_return condOrExpr341 = null;

        FanParser.condOrExpr_return condOrExpr343 = null;


        Object SP_QMARK340_tree=null;
        Object SP_COLON342_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:410:13: ( SP_QMARK condOrExpr SP_COLON condOrExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:410:15: SP_QMARK condOrExpr SP_COLON condOrExpr
            {
            root_0 = (Object)adaptor.nil();

            SP_QMARK340=(Token)match(input,SP_QMARK,FOLLOW_SP_QMARK_in_ternaryTail2842); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SP_QMARK340_tree = (Object)adaptor.create(SP_QMARK340);
            adaptor.addChild(root_0, SP_QMARK340_tree);
            }
            pushFollow(FOLLOW_condOrExpr_in_ternaryTail2844);
            condOrExpr341=condOrExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, condOrExpr341.getTree());
            SP_COLON342=(Token)match(input,SP_COLON,FOLLOW_SP_COLON_in_ternaryTail2846); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SP_COLON342_tree = (Object)adaptor.create(SP_COLON342);
            adaptor.addChild(root_0, SP_COLON342_tree);
            }
            pushFollow(FOLLOW_condOrExpr_in_ternaryTail2848);
            condOrExpr343=condOrExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, condOrExpr343.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 88, ternaryTail_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ternaryTail"

    public static class assignOp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignOp"
    // src/net/colar/netbeans/fan/antlr/Fan.g:411:1: assignOp : ( AS_EQUAL | AS_ASSIGN_OP );
    public final FanParser.assignOp_return assignOp() throws RecognitionException {
        FanParser.assignOp_return retval = new FanParser.assignOp_return();
        retval.start = input.LT(1);
        int assignOp_StartIndex = input.index();
        Object root_0 = null;

        Token set344=null;

        Object set344_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:411:10: ( AS_EQUAL | AS_ASSIGN_OP )
            // src/net/colar/netbeans/fan/antlr/Fan.g:
            {
            root_0 = (Object)adaptor.nil();

            set344=(Token)input.LT(1);
            if ( (input.LA(1)>=AS_EQUAL && input.LA(1)<=AS_ASSIGN_OP) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set344));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 89, assignOp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "assignOp"

    public static class condOrExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "condOrExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:412:1: condOrExpr : condAndExpr ( OP_OR condAndExpr )* ;
    public final FanParser.condOrExpr_return condOrExpr() throws RecognitionException {
        FanParser.condOrExpr_return retval = new FanParser.condOrExpr_return();
        retval.start = input.LT(1);
        int condOrExpr_StartIndex = input.index();
        Object root_0 = null;

        Token OP_OR346=null;
        FanParser.condAndExpr_return condAndExpr345 = null;

        FanParser.condAndExpr_return condAndExpr347 = null;


        Object OP_OR346_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:412:13: ( condAndExpr ( OP_OR condAndExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:412:15: condAndExpr ( OP_OR condAndExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_condAndExpr_in_condOrExpr2867);
            condAndExpr345=condAndExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, condAndExpr345.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:412:28: ( OP_OR condAndExpr )*
            loop101:
            do {
                int alt101=2;
                int LA101_0 = input.LA(1);

                if ( (LA101_0==OP_OR) ) {
                    alt101=1;
                }


                switch (alt101) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:412:29: OP_OR condAndExpr
            	    {
            	    OP_OR346=(Token)match(input,OP_OR,FOLLOW_OP_OR_in_condOrExpr2871); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OP_OR346_tree = (Object)adaptor.create(OP_OR346);
            	    adaptor.addChild(root_0, OP_OR346_tree);
            	    }
            	    pushFollow(FOLLOW_condAndExpr_in_condOrExpr2874);
            	    condAndExpr347=condAndExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, condAndExpr347.getTree());

            	    }
            	    break;

            	default :
            	    break loop101;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 90, condOrExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "condOrExpr"

    public static class condAndExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "condAndExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:413:1: condAndExpr : equalityExpr ( OP_AND equalityExpr )* ;
    public final FanParser.condAndExpr_return condAndExpr() throws RecognitionException {
        FanParser.condAndExpr_return retval = new FanParser.condAndExpr_return();
        retval.start = input.LT(1);
        int condAndExpr_StartIndex = input.index();
        Object root_0 = null;

        Token OP_AND349=null;
        FanParser.equalityExpr_return equalityExpr348 = null;

        FanParser.equalityExpr_return equalityExpr350 = null;


        Object OP_AND349_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 91) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:413:14: ( equalityExpr ( OP_AND equalityExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:413:16: equalityExpr ( OP_AND equalityExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_equalityExpr_in_condAndExpr2884);
            equalityExpr348=equalityExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpr348.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:413:29: ( OP_AND equalityExpr )*
            loop102:
            do {
                int alt102=2;
                int LA102_0 = input.LA(1);

                if ( (LA102_0==OP_AND) ) {
                    alt102=1;
                }


                switch (alt102) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:413:30: OP_AND equalityExpr
            	    {
            	    OP_AND349=(Token)match(input,OP_AND,FOLLOW_OP_AND_in_condAndExpr2887); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OP_AND349_tree = (Object)adaptor.create(OP_AND349);
            	    adaptor.addChild(root_0, OP_AND349_tree);
            	    }
            	    pushFollow(FOLLOW_equalityExpr_in_condAndExpr2890);
            	    equalityExpr350=equalityExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpr350.getTree());

            	    }
            	    break;

            	default :
            	    break loop102;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 91, condAndExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "condAndExpr"

    public static class equalityExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "equalityExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:414:1: equalityExpr : relationalExpr ( CP_EQUALITY relationalExpr )* ;
    public final FanParser.equalityExpr_return equalityExpr() throws RecognitionException {
        FanParser.equalityExpr_return retval = new FanParser.equalityExpr_return();
        retval.start = input.LT(1);
        int equalityExpr_StartIndex = input.index();
        Object root_0 = null;

        Token CP_EQUALITY352=null;
        FanParser.relationalExpr_return relationalExpr351 = null;

        FanParser.relationalExpr_return relationalExpr353 = null;


        Object CP_EQUALITY352_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 92) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:414:14: ( relationalExpr ( CP_EQUALITY relationalExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:414:16: relationalExpr ( CP_EQUALITY relationalExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_relationalExpr_in_equalityExpr2900);
            relationalExpr351=relationalExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpr351.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:414:31: ( CP_EQUALITY relationalExpr )*
            loop103:
            do {
                int alt103=2;
                int LA103_0 = input.LA(1);

                if ( (LA103_0==CP_EQUALITY) ) {
                    alt103=1;
                }


                switch (alt103) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:414:32: CP_EQUALITY relationalExpr
            	    {
            	    CP_EQUALITY352=(Token)match(input,CP_EQUALITY,FOLLOW_CP_EQUALITY_in_equalityExpr2903); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    CP_EQUALITY352_tree = (Object)adaptor.create(CP_EQUALITY352);
            	    adaptor.addChild(root_0, CP_EQUALITY352_tree);
            	    }
            	    pushFollow(FOLLOW_relationalExpr_in_equalityExpr2905);
            	    relationalExpr353=relationalExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpr353.getTree());

            	    }
            	    break;

            	default :
            	    break loop103;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 92, equalityExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "equalityExpr"

    public static class relationalExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relationalExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:416:1: relationalExpr : elvisExpr ( typeCheck | compare ) ;
    public final FanParser.relationalExpr_return relationalExpr() throws RecognitionException {
        FanParser.relationalExpr_return retval = new FanParser.relationalExpr_return();
        retval.start = input.LT(1);
        int relationalExpr_StartIndex = input.index();
        Object root_0 = null;

        FanParser.elvisExpr_return elvisExpr354 = null;

        FanParser.typeCheck_return typeCheck355 = null;

        FanParser.compare_return compare356 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 93) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:416:16: ( elvisExpr ( typeCheck | compare ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:416:20: elvisExpr ( typeCheck | compare )
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_elvisExpr_in_relationalExpr2918);
            elvisExpr354=elvisExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, elvisExpr354.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:416:30: ( typeCheck | compare )
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==KW_AS||(LA104_0>=KW_IS && LA104_0<=KW_ISNOT)) ) {
                alt104=1;
            }
            else if ( (LA104_0==EOF||(LA104_0>=KW_BREAK && LA104_0<=KW_USING)||(LA104_0>=KW_RD_ONLY && LA104_0<=KW_FINAL)||(LA104_0>=KW_CLASS && LA104_0<=KW_ELSE)||(LA104_0>=KW_NULL && LA104_0<=KW_FALSE)||(LA104_0>=BRACKET_L && LA104_0<=BRACKET_R)||(LA104_0>=SP_COLON && LA104_0<=SP_QMARK)||LA104_0==SP_PIPE||(LA104_0>=SP_SEMI && LA104_0<=CP_COMPARATORS)||LA104_0==OP_CURRY||(LA104_0>=OP_PLUS && LA104_0<=OP_MULTI)||(LA104_0>=OP_BANG && LA104_0<=OP_TILDA)||(LA104_0>=ID && LA104_0<=PAR_R)) ) {
                alt104=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 104, 0, input);

                throw nvae;
            }
            switch (alt104) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:416:31: typeCheck
                    {
                    pushFollow(FOLLOW_typeCheck_in_relationalExpr2921);
                    typeCheck355=typeCheck();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeCheck355.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:416:43: compare
                    {
                    pushFollow(FOLLOW_compare_in_relationalExpr2925);
                    compare356=compare();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, compare356.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 93, relationalExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "relationalExpr"

    public static class typeCheck_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeCheck"
    // src/net/colar/netbeans/fan/antlr/Fan.g:418:1: typeCheck : ( KW_ISNOT | KW_IS | KW_AS ) typeRoot ( ( SP_QMARK )? {...}? '[]' )* ;
    public final FanParser.typeCheck_return typeCheck() throws RecognitionException {
        FanParser.typeCheck_return retval = new FanParser.typeCheck_return();
        retval.start = input.LT(1);
        int typeCheck_StartIndex = input.index();
        Object root_0 = null;

        Token set357=null;
        Token SP_QMARK359=null;
        Token string_literal360=null;
        FanParser.typeRoot_return typeRoot358 = null;


        Object set357_tree=null;
        Object SP_QMARK359_tree=null;
        Object string_literal360_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 94) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:418:11: ( ( KW_ISNOT | KW_IS | KW_AS ) typeRoot ( ( SP_QMARK )? {...}? '[]' )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:418:15: ( KW_ISNOT | KW_IS | KW_AS ) typeRoot ( ( SP_QMARK )? {...}? '[]' )*
            {
            root_0 = (Object)adaptor.nil();

            set357=(Token)input.LT(1);
            if ( input.LA(1)==KW_AS||(input.LA(1)>=KW_IS && input.LA(1)<=KW_ISNOT) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set357));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            pushFollow(FOLLOW_typeRoot_in_typeCheck2948);
            typeRoot358=typeRoot();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeRoot358.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:418:51: ( ( SP_QMARK )? {...}? '[]' )*
            loop106:
            do {
                int alt106=2;
                int LA106_0 = input.LA(1);

                if ( (LA106_0==SP_QMARK) ) {
                    int LA106_2 = input.LA(2);

                    if ( (LA106_2==LIST_TYPE) ) {
                        alt106=1;
                    }


                }
                else if ( (LA106_0==LIST_TYPE) ) {
                    alt106=1;
                }


                switch (alt106) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:418:52: ( SP_QMARK )? {...}? '[]'
            	    {
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:418:52: ( SP_QMARK )?
            	    int alt105=2;
            	    int LA105_0 = input.LA(1);

            	    if ( (LA105_0==SP_QMARK) ) {
            	        alt105=1;
            	    }
            	    switch (alt105) {
            	        case 1 :
            	            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_QMARK
            	            {
            	            SP_QMARK359=(Token)match(input,SP_QMARK,FOLLOW_SP_QMARK_in_typeCheck2951); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SP_QMARK359_tree = (Object)adaptor.create(SP_QMARK359);
            	            adaptor.addChild(root_0, SP_QMARK359_tree);
            	            }

            	            }
            	            break;

            	    }

            	    if ( !((notAfterEol())) ) {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        throw new FailedPredicateException(input, "typeCheck", "notAfterEol()");
            	    }
            	    string_literal360=(Token)match(input,LIST_TYPE,FOLLOW_LIST_TYPE_in_typeCheck2956); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal360_tree = (Object)adaptor.create(string_literal360);
            	    adaptor.addChild(root_0, string_literal360_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop106;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 94, typeCheck_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeCheck"

    public static class compare_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "compare"
    // src/net/colar/netbeans/fan/antlr/Fan.g:419:1: compare : ( CP_COMPARATORS elvisExpr )* ;
    public final FanParser.compare_return compare() throws RecognitionException {
        FanParser.compare_return retval = new FanParser.compare_return();
        retval.start = input.LT(1);
        int compare_StartIndex = input.index();
        Object root_0 = null;

        Token CP_COMPARATORS361=null;
        FanParser.elvisExpr_return elvisExpr362 = null;


        Object CP_COMPARATORS361_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 95) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:419:10: ( ( CP_COMPARATORS elvisExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:419:14: ( CP_COMPARATORS elvisExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:419:14: ( CP_COMPARATORS elvisExpr )*
            loop107:
            do {
                int alt107=2;
                int LA107_0 = input.LA(1);

                if ( (LA107_0==CP_COMPARATORS) ) {
                    alt107=1;
                }


                switch (alt107) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:419:15: CP_COMPARATORS elvisExpr
            	    {
            	    CP_COMPARATORS361=(Token)match(input,CP_COMPARATORS,FOLLOW_CP_COMPARATORS_in_compare2969); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    CP_COMPARATORS361_tree = (Object)adaptor.create(CP_COMPARATORS361);
            	    adaptor.addChild(root_0, CP_COMPARATORS361_tree);
            	    }
            	    pushFollow(FOLLOW_elvisExpr_in_compare2971);
            	    elvisExpr362=elvisExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, elvisExpr362.getTree());

            	    }
            	    break;

            	default :
            	    break loop107;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 95, compare_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "compare"

    public static class elvisExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elvisExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:421:1: elvisExpr : rangeExpr ( OP_ELVIS rangeExpr )* ;
    public final FanParser.elvisExpr_return elvisExpr() throws RecognitionException {
        FanParser.elvisExpr_return retval = new FanParser.elvisExpr_return();
        retval.start = input.LT(1);
        int elvisExpr_StartIndex = input.index();
        Object root_0 = null;

        Token OP_ELVIS364=null;
        FanParser.rangeExpr_return rangeExpr363 = null;

        FanParser.rangeExpr_return rangeExpr365 = null;


        Object OP_ELVIS364_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 96) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:421:12: ( rangeExpr ( OP_ELVIS rangeExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:421:14: rangeExpr ( OP_ELVIS rangeExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_rangeExpr_in_elvisExpr2982);
            rangeExpr363=rangeExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, rangeExpr363.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:421:24: ( OP_ELVIS rangeExpr )*
            loop108:
            do {
                int alt108=2;
                int LA108_0 = input.LA(1);

                if ( (LA108_0==OP_ELVIS) ) {
                    alt108=1;
                }


                switch (alt108) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:421:25: OP_ELVIS rangeExpr
            	    {
            	    OP_ELVIS364=(Token)match(input,OP_ELVIS,FOLLOW_OP_ELVIS_in_elvisExpr2985); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OP_ELVIS364_tree = (Object)adaptor.create(OP_ELVIS364);
            	    adaptor.addChild(root_0, OP_ELVIS364_tree);
            	    }
            	    pushFollow(FOLLOW_rangeExpr_in_elvisExpr2987);
            	    rangeExpr365=rangeExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, rangeExpr365.getTree());

            	    }
            	    break;

            	default :
            	    break loop108;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 96, elvisExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "elvisExpr"

    public static class rangeExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rangeExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:422:1: rangeExpr : bitOrExpr ( ( OP_RANG_EXCL_OLD | OP_RANGE_EXCL | OP_RANGE ) bitOrExpr )* ;
    public final FanParser.rangeExpr_return rangeExpr() throws RecognitionException {
        FanParser.rangeExpr_return retval = new FanParser.rangeExpr_return();
        retval.start = input.LT(1);
        int rangeExpr_StartIndex = input.index();
        Object root_0 = null;

        Token set367=null;
        FanParser.bitOrExpr_return bitOrExpr366 = null;

        FanParser.bitOrExpr_return bitOrExpr368 = null;


        Object set367_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 97) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:422:12: ( bitOrExpr ( ( OP_RANG_EXCL_OLD | OP_RANGE_EXCL | OP_RANGE ) bitOrExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:422:14: bitOrExpr ( ( OP_RANG_EXCL_OLD | OP_RANGE_EXCL | OP_RANGE ) bitOrExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitOrExpr_in_rangeExpr2998);
            bitOrExpr366=bitOrExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitOrExpr366.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:422:24: ( ( OP_RANG_EXCL_OLD | OP_RANGE_EXCL | OP_RANGE ) bitOrExpr )*
            loop109:
            do {
                int alt109=2;
                int LA109_0 = input.LA(1);

                if ( ((LA109_0>=OP_RANG_EXCL_OLD && LA109_0<=OP_RANGE)) ) {
                    alt109=1;
                }


                switch (alt109) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:422:25: ( OP_RANG_EXCL_OLD | OP_RANGE_EXCL | OP_RANGE ) bitOrExpr
            	    {
            	    set367=(Token)input.LT(1);
            	    if ( (input.LA(1)>=OP_RANG_EXCL_OLD && input.LA(1)<=OP_RANGE) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set367));
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_bitOrExpr_in_rangeExpr3015);
            	    bitOrExpr368=bitOrExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitOrExpr368.getTree());

            	    }
            	    break;

            	default :
            	    break loop109;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 97, rangeExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "rangeExpr"

    public static class bitOrExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bitOrExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:423:1: bitOrExpr : bitAndExpr ( ( OP_BITOR | SP_PIPE ) bitAndExpr )* ;
    public final FanParser.bitOrExpr_return bitOrExpr() throws RecognitionException {
        FanParser.bitOrExpr_return retval = new FanParser.bitOrExpr_return();
        retval.start = input.LT(1);
        int bitOrExpr_StartIndex = input.index();
        Object root_0 = null;

        Token set370=null;
        FanParser.bitAndExpr_return bitAndExpr369 = null;

        FanParser.bitAndExpr_return bitAndExpr371 = null;


        Object set370_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 98) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:423:12: ( bitAndExpr ( ( OP_BITOR | SP_PIPE ) bitAndExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:423:14: bitAndExpr ( ( OP_BITOR | SP_PIPE ) bitAndExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitAndExpr_in_bitOrExpr3026);
            bitAndExpr369=bitAndExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitAndExpr369.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:423:25: ( ( OP_BITOR | SP_PIPE ) bitAndExpr )*
            loop110:
            do {
                int alt110=2;
                alt110 = dfa110.predict(input);
                switch (alt110) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:423:26: ( OP_BITOR | SP_PIPE ) bitAndExpr
            	    {
            	    set370=(Token)input.LT(1);
            	    if ( input.LA(1)==SP_PIPE||input.LA(1)==OP_BITOR ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set370));
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_bitAndExpr_in_bitOrExpr3037);
            	    bitAndExpr371=bitAndExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitAndExpr371.getTree());

            	    }
            	    break;

            	default :
            	    break loop110;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 98, bitOrExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "bitOrExpr"

    public static class bitAndExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bitAndExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:424:1: bitAndExpr : shiftExpr ( OP_CURRY shiftExpr )* ;
    public final FanParser.bitAndExpr_return bitAndExpr() throws RecognitionException {
        FanParser.bitAndExpr_return retval = new FanParser.bitAndExpr_return();
        retval.start = input.LT(1);
        int bitAndExpr_StartIndex = input.index();
        Object root_0 = null;

        Token OP_CURRY373=null;
        FanParser.shiftExpr_return shiftExpr372 = null;

        FanParser.shiftExpr_return shiftExpr374 = null;


        Object OP_CURRY373_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 99) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:424:13: ( shiftExpr ( OP_CURRY shiftExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:424:15: shiftExpr ( OP_CURRY shiftExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_shiftExpr_in_bitAndExpr3048);
            shiftExpr372=shiftExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr372.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:424:25: ( OP_CURRY shiftExpr )*
            loop111:
            do {
                int alt111=2;
                alt111 = dfa111.predict(input);
                switch (alt111) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:424:26: OP_CURRY shiftExpr
            	    {
            	    OP_CURRY373=(Token)match(input,OP_CURRY,FOLLOW_OP_CURRY_in_bitAndExpr3051); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OP_CURRY373_tree = (Object)adaptor.create(OP_CURRY373);
            	    adaptor.addChild(root_0, OP_CURRY373_tree);
            	    }
            	    pushFollow(FOLLOW_shiftExpr_in_bitAndExpr3053);
            	    shiftExpr374=shiftExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr374.getTree());

            	    }
            	    break;

            	default :
            	    break loop111;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 99, bitAndExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "bitAndExpr"

    public static class shiftExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "shiftExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:425:1: shiftExpr : addExpr ( ( OP_LSHIFT | OP_RSHIFT ) addExpr )* ;
    public final FanParser.shiftExpr_return shiftExpr() throws RecognitionException {
        FanParser.shiftExpr_return retval = new FanParser.shiftExpr_return();
        retval.start = input.LT(1);
        int shiftExpr_StartIndex = input.index();
        Object root_0 = null;

        Token set376=null;
        FanParser.addExpr_return addExpr375 = null;

        FanParser.addExpr_return addExpr377 = null;


        Object set376_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 100) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:425:12: ( addExpr ( ( OP_LSHIFT | OP_RSHIFT ) addExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:425:14: addExpr ( ( OP_LSHIFT | OP_RSHIFT ) addExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_addExpr_in_shiftExpr3065);
            addExpr375=addExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr375.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:425:22: ( ( OP_LSHIFT | OP_RSHIFT ) addExpr )*
            loop112:
            do {
                int alt112=2;
                int LA112_0 = input.LA(1);

                if ( ((LA112_0>=OP_LSHIFT && LA112_0<=OP_RSHIFT)) ) {
                    alt112=1;
                }


                switch (alt112) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:425:23: ( OP_LSHIFT | OP_RSHIFT ) addExpr
            	    {
            	    set376=(Token)input.LT(1);
            	    if ( (input.LA(1)>=OP_LSHIFT && input.LA(1)<=OP_RSHIFT) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set376));
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_addExpr_in_shiftExpr3076);
            	    addExpr377=addExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr377.getTree());

            	    }
            	    break;

            	default :
            	    break loop112;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 100, shiftExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "shiftExpr"

    public static class addExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "addExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:426:1: addExpr : multExpr ( ( OP_PLUS | OP_MINUS ) multExpr )* ;
    public final FanParser.addExpr_return addExpr() throws RecognitionException {
        FanParser.addExpr_return retval = new FanParser.addExpr_return();
        retval.start = input.LT(1);
        int addExpr_StartIndex = input.index();
        Object root_0 = null;

        Token set379=null;
        FanParser.multExpr_return multExpr378 = null;

        FanParser.multExpr_return multExpr380 = null;


        Object set379_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 101) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:426:10: ( multExpr ( ( OP_PLUS | OP_MINUS ) multExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:426:12: multExpr ( ( OP_PLUS | OP_MINUS ) multExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multExpr_in_addExpr3087);
            multExpr378=multExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multExpr378.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:426:21: ( ( OP_PLUS | OP_MINUS ) multExpr )*
            loop113:
            do {
                int alt113=2;
                alt113 = dfa113.predict(input);
                switch (alt113) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:426:22: ( OP_PLUS | OP_MINUS ) multExpr
            	    {
            	    set379=(Token)input.LT(1);
            	    if ( (input.LA(1)>=OP_PLUS && input.LA(1)<=OP_MINUS) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set379));
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_multExpr_in_addExpr3098);
            	    multExpr380=multExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multExpr380.getTree());

            	    }
            	    break;

            	default :
            	    break loop113;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 101, addExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "addExpr"

    public static class addAppend_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "addAppend"
    // src/net/colar/netbeans/fan/antlr/Fan.g:427:1: addAppend : ( OP_PLUS | OP_MINUS ) parenExpr ;
    public final FanParser.addAppend_return addAppend() throws RecognitionException {
        FanParser.addAppend_return retval = new FanParser.addAppend_return();
        retval.start = input.LT(1);
        int addAppend_StartIndex = input.index();
        Object root_0 = null;

        Token set381=null;
        FanParser.parenExpr_return parenExpr382 = null;


        Object set381_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 102) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:427:11: ( ( OP_PLUS | OP_MINUS ) parenExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:427:13: ( OP_PLUS | OP_MINUS ) parenExpr
            {
            root_0 = (Object)adaptor.nil();

            set381=(Token)input.LT(1);
            if ( (input.LA(1)>=OP_PLUS && input.LA(1)<=OP_MINUS) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set381));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            pushFollow(FOLLOW_parenExpr_in_addAppend3116);
            parenExpr382=parenExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parenExpr382.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 102, addAppend_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "addAppend"

    public static class multExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:428:1: multExpr : parenExpr ( ( OP_MULTI | OP_DIV | OP_MOD ) parenExpr )* ;
    public final FanParser.multExpr_return multExpr() throws RecognitionException {
        FanParser.multExpr_return retval = new FanParser.multExpr_return();
        retval.start = input.LT(1);
        int multExpr_StartIndex = input.index();
        Object root_0 = null;

        Token set384=null;
        FanParser.parenExpr_return parenExpr383 = null;

        FanParser.parenExpr_return parenExpr385 = null;


        Object set384_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 103) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:428:11: ( parenExpr ( ( OP_MULTI | OP_DIV | OP_MOD ) parenExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:428:13: parenExpr ( ( OP_MULTI | OP_DIV | OP_MOD ) parenExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_parenExpr_in_multExpr3124);
            parenExpr383=parenExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parenExpr383.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:428:23: ( ( OP_MULTI | OP_DIV | OP_MOD ) parenExpr )*
            loop114:
            do {
                int alt114=2;
                int LA114_0 = input.LA(1);

                if ( (LA114_0==OP_MULTI) ) {
                    int LA114_2 = input.LA(2);

                    if ( (LA114_2==ID) ) {
                        int LA114_4 = input.LA(3);

                        if ( (synpred172_Fan()) ) {
                            alt114=1;
                        }


                    }
                    else if ( ((LA114_2>=KW_THIS && LA114_2<=KW_SUPER)||(LA114_2>=KW_NULL && LA114_2<=KW_FALSE)||LA114_2==SP_PIPE||LA114_2==OP_CURRY||(LA114_2>=OP_PLUS && LA114_2<=OP_MULTI)||(LA114_2>=OP_BANG && LA114_2<=OP_TILDA)||(LA114_2>=URI && LA114_2<=AT)||(LA114_2>=NUMBER && LA114_2<=SQ_BRACKET_L)||LA114_2==PAR_L) ) {
                        alt114=1;
                    }


                }
                else if ( ((LA114_0>=OP_DIV && LA114_0<=OP_MOD)) ) {
                    alt114=1;
                }


                switch (alt114) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:428:24: ( OP_MULTI | OP_DIV | OP_MOD ) parenExpr
            	    {
            	    set384=(Token)input.LT(1);
            	    if ( (input.LA(1)>=OP_MULTI && input.LA(1)<=OP_MOD) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set384));
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_parenExpr_in_multExpr3139);
            	    parenExpr385=parenExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, parenExpr385.getTree());

            	    }
            	    break;

            	default :
            	    break loop114;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 103, multExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "multExpr"

    public static class parenExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parenExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:429:1: parenExpr : ( castExpr | groupedExpr | unaryExpr );
    public final FanParser.parenExpr_return parenExpr() throws RecognitionException {
        FanParser.parenExpr_return retval = new FanParser.parenExpr_return();
        retval.start = input.LT(1);
        int parenExpr_StartIndex = input.index();
        Object root_0 = null;

        FanParser.castExpr_return castExpr386 = null;

        FanParser.groupedExpr_return groupedExpr387 = null;

        FanParser.unaryExpr_return unaryExpr388 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 104) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:429:12: ( castExpr | groupedExpr | unaryExpr )
            int alt115=3;
            alt115 = dfa115.predict(input);
            switch (alt115) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:429:14: castExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_castExpr_in_parenExpr3150);
                    castExpr386=castExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, castExpr386.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:429:25: groupedExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_groupedExpr_in_parenExpr3154);
                    groupedExpr387=groupedExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, groupedExpr387.getTree());

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:429:39: unaryExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_unaryExpr_in_parenExpr3158);
                    unaryExpr388=unaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpr388.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 104, parenExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "parenExpr"

    public static class castExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "castExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:431:1: castExpr : {...}? parL type parR parenExpr ;
    public final FanParser.castExpr_return castExpr() throws RecognitionException {
        FanParser.castExpr_return retval = new FanParser.castExpr_return();
        retval.start = input.LT(1);
        int castExpr_StartIndex = input.index();
        Object root_0 = null;

        FanParser.parL_return parL389 = null;

        FanParser.type_return type390 = null;

        FanParser.parR_return parR391 = null;

        FanParser.parenExpr_return parenExpr392 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 105) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:431:11: ({...}? parL type parR parenExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:431:13: {...}? parL type parR parenExpr
            {
            root_0 = (Object)adaptor.nil();

            if ( !((notAfterEol())) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "castExpr", "notAfterEol()");
            }
            pushFollow(FOLLOW_parL_in_castExpr3169);
            parL389=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parL389.getTree());
            pushFollow(FOLLOW_type_in_castExpr3171);
            type390=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type390.getTree());
            pushFollow(FOLLOW_parR_in_castExpr3173);
            parR391=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parR391.getTree());
            pushFollow(FOLLOW_parenExpr_in_castExpr3175);
            parenExpr392=parenExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parenExpr392.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 105, castExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "castExpr"

    public static class groupedExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "groupedExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:433:1: groupedExpr : parL expr parR ( termChain )* ;
    public final FanParser.groupedExpr_return groupedExpr() throws RecognitionException {
        FanParser.groupedExpr_return retval = new FanParser.groupedExpr_return();
        retval.start = input.LT(1);
        int groupedExpr_StartIndex = input.index();
        Object root_0 = null;

        FanParser.parL_return parL393 = null;

        FanParser.expr_return expr394 = null;

        FanParser.parR_return parR395 = null;

        FanParser.termChain_return termChain396 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 106) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:433:14: ( parL expr parR ( termChain )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:433:16: parL expr parR ( termChain )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_parL_in_groupedExpr3184);
            parL393=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parL393.getTree());
            pushFollow(FOLLOW_expr_in_groupedExpr3186);
            expr394=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr394.getTree());
            pushFollow(FOLLOW_parR_in_groupedExpr3188);
            parR395=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parR395.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:433:31: ( termChain )*
            loop116:
            do {
                int alt116=2;
                alt116 = dfa116.predict(input);
                switch (alt116) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: termChain
            	    {
            	    pushFollow(FOLLOW_termChain_in_groupedExpr3190);
            	    termChain396=termChain();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, termChain396.getTree());

            	    }
            	    break;

            	default :
            	    break loop116;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 106, groupedExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "groupedExpr"

    public static class unaryExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unaryExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:434:1: unaryExpr : ( prefixExpr | postfixExpr | termExpr );
    public final FanParser.unaryExpr_return unaryExpr() throws RecognitionException {
        FanParser.unaryExpr_return retval = new FanParser.unaryExpr_return();
        retval.start = input.LT(1);
        int unaryExpr_StartIndex = input.index();
        Object root_0 = null;

        FanParser.prefixExpr_return prefixExpr397 = null;

        FanParser.postfixExpr_return postfixExpr398 = null;

        FanParser.termExpr_return termExpr399 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 107) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:434:12: ( prefixExpr | postfixExpr | termExpr )
            int alt117=3;
            alt117 = dfa117.predict(input);
            switch (alt117) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:434:14: prefixExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_prefixExpr_in_unaryExpr3199);
                    prefixExpr397=prefixExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, prefixExpr397.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:434:27: postfixExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_postfixExpr_in_unaryExpr3203);
                    postfixExpr398=postfixExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, postfixExpr398.getTree());

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:434:41: termExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_termExpr_in_unaryExpr3207);
                    termExpr399=termExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, termExpr399.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 107, unaryExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "unaryExpr"

    public static class prefixExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prefixExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:435:1: prefixExpr : ( OP_CURRY | OP_BANG | OP_2PLUS | OP_2MINUS | OP_TILDA | OP_PLUS | OP_MINUS ) parenExpr ;
    public final FanParser.prefixExpr_return prefixExpr() throws RecognitionException {
        FanParser.prefixExpr_return retval = new FanParser.prefixExpr_return();
        retval.start = input.LT(1);
        int prefixExpr_StartIndex = input.index();
        Object root_0 = null;

        Token set400=null;
        FanParser.parenExpr_return parenExpr401 = null;


        Object set400_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 108) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:435:13: ( ( OP_CURRY | OP_BANG | OP_2PLUS | OP_2MINUS | OP_TILDA | OP_PLUS | OP_MINUS ) parenExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:435:15: ( OP_CURRY | OP_BANG | OP_2PLUS | OP_2MINUS | OP_TILDA | OP_PLUS | OP_MINUS ) parenExpr
            {
            root_0 = (Object)adaptor.nil();

            set400=(Token)input.LT(1);
            if ( input.LA(1)==OP_CURRY||(input.LA(1)>=OP_PLUS && input.LA(1)<=OP_MINUS)||(input.LA(1)>=OP_BANG && input.LA(1)<=OP_TILDA) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set400));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            pushFollow(FOLLOW_parenExpr_in_prefixExpr3243);
            parenExpr401=parenExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parenExpr401.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 108, prefixExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "prefixExpr"

    public static class postfixExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "postfixExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:436:1: postfixExpr : termExpr ( OP_2PLUS | OP_2MINUS ) ;
    public final FanParser.postfixExpr_return postfixExpr() throws RecognitionException {
        FanParser.postfixExpr_return retval = new FanParser.postfixExpr_return();
        retval.start = input.LT(1);
        int postfixExpr_StartIndex = input.index();
        Object root_0 = null;

        Token set403=null;
        FanParser.termExpr_return termExpr402 = null;


        Object set403_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 109) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:436:14: ( termExpr ( OP_2PLUS | OP_2MINUS ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:436:16: termExpr ( OP_2PLUS | OP_2MINUS )
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_termExpr_in_postfixExpr3252);
            termExpr402=termExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, termExpr402.getTree());
            set403=(Token)input.LT(1);
            if ( (input.LA(1)>=OP_2PLUS && input.LA(1)<=OP_2MINUS) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set403));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 109, postfixExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "postfixExpr"

    public static class termExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "termExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:437:1: termExpr : termBase ( termChain )* -> ^( AST_TERM_EXPR ^( AST_CHILD termBase ) ^( AST_CHILD ( termChain )* ) ) ;
    public final FanParser.termExpr_return termExpr() throws RecognitionException {
        FanParser.termExpr_return retval = new FanParser.termExpr_return();
        retval.start = input.LT(1);
        int termExpr_StartIndex = input.index();
        Object root_0 = null;

        FanParser.termBase_return termBase404 = null;

        FanParser.termChain_return termChain405 = null;


        RewriteRuleSubtreeStream stream_termBase=new RewriteRuleSubtreeStream(adaptor,"rule termBase");
        RewriteRuleSubtreeStream stream_termChain=new RewriteRuleSubtreeStream(adaptor,"rule termChain");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 110) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:437:11: ( termBase ( termChain )* -> ^( AST_TERM_EXPR ^( AST_CHILD termBase ) ^( AST_CHILD ( termChain )* ) ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:437:13: termBase ( termChain )*
            {
            pushFollow(FOLLOW_termBase_in_termExpr3269);
            termBase404=termBase();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_termBase.add(termBase404.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:437:22: ( termChain )*
            loop118:
            do {
                int alt118=2;
                alt118 = dfa118.predict(input);
                switch (alt118) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: termChain
            	    {
            	    pushFollow(FOLLOW_termChain_in_termExpr3271);
            	    termChain405=termChain();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_termChain.add(termChain405.getTree());

            	    }
            	    break;

            	default :
            	    break loop118;
                }
            } while (true);



            // AST REWRITE
            // elements: termChain, termBase
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 438:4: -> ^( AST_TERM_EXPR ^( AST_CHILD termBase ) ^( AST_CHILD ( termChain )* ) )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:438:7: ^( AST_TERM_EXPR ^( AST_CHILD termBase ) ^( AST_CHILD ( termChain )* ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_TERM_EXPR, "AST_TERM_EXPR"), root_1);

                // src/net/colar/netbeans/fan/antlr/Fan.g:438:23: ^( AST_CHILD termBase )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CHILD, "AST_CHILD"), root_2);

                adaptor.addChild(root_2, stream_termBase.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // src/net/colar/netbeans/fan/antlr/Fan.g:438:45: ^( AST_CHILD ( termChain )* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CHILD, "AST_CHILD"), root_2);

                // src/net/colar/netbeans/fan/antlr/Fan.g:438:57: ( termChain )*
                while ( stream_termChain.hasNext() ) {
                    adaptor.addChild(root_2, stream_termChain.nextTree());

                }
                stream_termChain.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 110, termExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "termExpr"

    public static class termBase_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "termBase"
    // src/net/colar/netbeans/fan/antlr/Fan.g:440:1: termBase : ( idExprReq | literal | typeBase | id );
    public final FanParser.termBase_return termBase() throws RecognitionException {
        FanParser.termBase_return retval = new FanParser.termBase_return();
        retval.start = input.LT(1);
        int termBase_StartIndex = input.index();
        Object root_0 = null;

        FanParser.idExprReq_return idExprReq406 = null;

        FanParser.literal_return literal407 = null;

        FanParser.typeBase_return typeBase408 = null;

        FanParser.id_return id409 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 111) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:440:11: ( idExprReq | literal | typeBase | id )
            int alt119=4;
            alt119 = dfa119.predict(input);
            switch (alt119) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:440:13: idExprReq
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_idExprReq_in_termBase3303);
                    idExprReq406=idExprReq();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, idExprReq406.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:440:25: literal
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_literal_in_termBase3307);
                    literal407=literal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, literal407.getTree());

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:440:35: typeBase
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_typeBase_in_termBase3311);
                    typeBase408=typeBase();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeBase408.getTree());

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:440:46: id
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_id_in_termBase3315);
                    id409=id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, id409.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 111, termBase_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "termBase"

    public static class typeBase_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeBase"
    // src/net/colar/netbeans/fan/antlr/Fan.g:441:1: typeBase : ( typeLiteral | slotLiteral | namedSuper | staticCall | dsl | closure | simple | ctorBlock );
    public final FanParser.typeBase_return typeBase() throws RecognitionException {
        FanParser.typeBase_return retval = new FanParser.typeBase_return();
        retval.start = input.LT(1);
        int typeBase_StartIndex = input.index();
        Object root_0 = null;

        FanParser.typeLiteral_return typeLiteral410 = null;

        FanParser.slotLiteral_return slotLiteral411 = null;

        FanParser.namedSuper_return namedSuper412 = null;

        FanParser.staticCall_return staticCall413 = null;

        FanParser.dsl_return dsl414 = null;

        FanParser.closure_return closure415 = null;

        FanParser.simple_return simple416 = null;

        FanParser.ctorBlock_return ctorBlock417 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 112) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:441:10: ( typeLiteral | slotLiteral | namedSuper | staticCall | dsl | closure | simple | ctorBlock )
            int alt120=8;
            alt120 = dfa120.predict(input);
            switch (alt120) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:441:12: typeLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_typeLiteral_in_typeBase3322);
                    typeLiteral410=typeLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeLiteral410.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:441:26: slotLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_slotLiteral_in_typeBase3326);
                    slotLiteral411=slotLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, slotLiteral411.getTree());

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:441:40: namedSuper
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_namedSuper_in_typeBase3330);
                    namedSuper412=namedSuper();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, namedSuper412.getTree());

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:441:53: staticCall
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_staticCall_in_typeBase3334);
                    staticCall413=staticCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, staticCall413.getTree());

                    }
                    break;
                case 5 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:442:19: dsl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_dsl_in_typeBase3356);
                    dsl414=dsl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dsl414.getTree());

                    }
                    break;
                case 6 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:442:25: closure
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_closure_in_typeBase3360);
                    closure415=closure();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, closure415.getTree());

                    }
                    break;
                case 7 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:442:35: simple
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_simple_in_typeBase3364);
                    simple416=simple();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, simple416.getTree());

                    }
                    break;
                case 8 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:442:44: ctorBlock
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ctorBlock_in_typeBase3368);
                    ctorBlock417=ctorBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ctorBlock417.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 112, typeBase_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeBase"

    public static class ctorBlock_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ctorBlock"
    // src/net/colar/netbeans/fan/antlr/Fan.g:443:1: ctorBlock : type itBlock ;
    public final FanParser.ctorBlock_return ctorBlock() throws RecognitionException {
        FanParser.ctorBlock_return retval = new FanParser.ctorBlock_return();
        retval.start = input.LT(1);
        int ctorBlock_StartIndex = input.index();
        Object root_0 = null;

        FanParser.type_return type418 = null;

        FanParser.itBlock_return itBlock419 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 113) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:443:11: ( type itBlock )
            // src/net/colar/netbeans/fan/antlr/Fan.g:443:13: type itBlock
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_type_in_ctorBlock3375);
            type418=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type418.getTree());
            pushFollow(FOLLOW_itBlock_in_ctorBlock3377);
            itBlock419=itBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, itBlock419.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 113, ctorBlock_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ctorBlock"

    public static class staticCall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "staticCall"
    // src/net/colar/netbeans/fan/antlr/Fan.g:444:1: staticCall : type DOT idExpr -> ^( AST_STATIC_CALL ^( AST_TYPE type ) ^( AST_CHILD idExpr ) ) ;
    public final FanParser.staticCall_return staticCall() throws RecognitionException {
        FanParser.staticCall_return retval = new FanParser.staticCall_return();
        retval.start = input.LT(1);
        int staticCall_StartIndex = input.index();
        Object root_0 = null;

        Token DOT421=null;
        FanParser.type_return type420 = null;

        FanParser.idExpr_return idExpr422 = null;


        Object DOT421_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_idExpr=new RewriteRuleSubtreeStream(adaptor,"rule idExpr");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 114) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:444:12: ( type DOT idExpr -> ^( AST_STATIC_CALL ^( AST_TYPE type ) ^( AST_CHILD idExpr ) ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:444:14: type DOT idExpr
            {
            pushFollow(FOLLOW_type_in_staticCall3384);
            type420=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type420.getTree());
            DOT421=(Token)match(input,DOT,FOLLOW_DOT_in_staticCall3386); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DOT.add(DOT421);

            pushFollow(FOLLOW_idExpr_in_staticCall3388);
            idExpr422=idExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_idExpr.add(idExpr422.getTree());


            // AST REWRITE
            // elements: idExpr, type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 445:5: -> ^( AST_STATIC_CALL ^( AST_TYPE type ) ^( AST_CHILD idExpr ) )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:445:8: ^( AST_STATIC_CALL ^( AST_TYPE type ) ^( AST_CHILD idExpr ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_STATIC_CALL, "AST_STATIC_CALL"), root_1);

                // src/net/colar/netbeans/fan/antlr/Fan.g:445:26: ^( AST_TYPE type )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_TYPE, "AST_TYPE"), root_2);

                adaptor.addChild(root_2, stream_type.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // src/net/colar/netbeans/fan/antlr/Fan.g:445:43: ^( AST_CHILD idExpr )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CHILD, "AST_CHILD"), root_2);

                adaptor.addChild(root_2, stream_idExpr.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 114, staticCall_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "staticCall"

    public static class termChain_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "termChain"
    // src/net/colar/netbeans/fan/antlr/Fan.g:447:1: termChain : ( dotCall | dynCall | safeDotCall | safeDynCall | indexExpr | callOp | itBlock | incDotCall | incSafeDotCall );
    public final FanParser.termChain_return termChain() throws RecognitionException {
        FanParser.termChain_return retval = new FanParser.termChain_return();
        retval.start = input.LT(1);
        int termChain_StartIndex = input.index();
        Object root_0 = null;

        FanParser.dotCall_return dotCall423 = null;

        FanParser.dynCall_return dynCall424 = null;

        FanParser.safeDotCall_return safeDotCall425 = null;

        FanParser.safeDynCall_return safeDynCall426 = null;

        FanParser.indexExpr_return indexExpr427 = null;

        FanParser.callOp_return callOp428 = null;

        FanParser.itBlock_return itBlock429 = null;

        FanParser.incDotCall_return incDotCall430 = null;

        FanParser.incSafeDotCall_return incSafeDotCall431 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 115) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:447:12: ( dotCall | dynCall | safeDotCall | safeDynCall | indexExpr | callOp | itBlock | incDotCall | incSafeDotCall )
            int alt121=9;
            alt121 = dfa121.predict(input);
            switch (alt121) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:447:14: dotCall
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_dotCall_in_termChain3419);
                    dotCall423=dotCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dotCall423.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:447:24: dynCall
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_dynCall_in_termChain3423);
                    dynCall424=dynCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dynCall424.getTree());

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:447:34: safeDotCall
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_safeDotCall_in_termChain3427);
                    safeDotCall425=safeDotCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, safeDotCall425.getTree());

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:447:48: safeDynCall
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_safeDynCall_in_termChain3431);
                    safeDynCall426=safeDynCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, safeDynCall426.getTree());

                    }
                    break;
                case 5 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:448:4: indexExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_indexExpr_in_termChain3438);
                    indexExpr427=indexExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, indexExpr427.getTree());

                    }
                    break;
                case 6 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:448:16: callOp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_callOp_in_termChain3442);
                    callOp428=callOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, callOp428.getTree());

                    }
                    break;
                case 7 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:448:25: itBlock
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_itBlock_in_termChain3446);
                    itBlock429=itBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, itBlock429.getTree());

                    }
                    break;
                case 8 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:448:35: incDotCall
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_incDotCall_in_termChain3450);
                    incDotCall430=incDotCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, incDotCall430.getTree());

                    }
                    break;
                case 9 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:448:48: incSafeDotCall
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_incSafeDotCall_in_termChain3454);
                    incSafeDotCall431=incSafeDotCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, incSafeDotCall431.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 115, termChain_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "termChain"

    public static class dsl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dsl"
    // src/net/colar/netbeans/fan/antlr/Fan.g:449:1: dsl : simpleType DSL ;
    public final FanParser.dsl_return dsl() throws RecognitionException {
        FanParser.dsl_return retval = new FanParser.dsl_return();
        retval.start = input.LT(1);
        int dsl_StartIndex = input.index();
        Object root_0 = null;

        Token DSL433=null;
        FanParser.simpleType_return simpleType432 = null;


        Object DSL433_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 116) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:449:13: ( simpleType DSL )
            // src/net/colar/netbeans/fan/antlr/Fan.g:449:15: simpleType DSL
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_simpleType_in_dsl3469);
            simpleType432=simpleType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleType432.getTree());
            DSL433=(Token)match(input,DSL,FOLLOW_DSL_in_dsl3471); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DSL433_tree = (Object)adaptor.create(DSL433);
            adaptor.addChild(root_0, DSL433_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 116, dsl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "dsl"

    public static class incDotCall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "incDotCall"
    // src/net/colar/netbeans/fan/antlr/Fan.g:451:1: incDotCall : DOT -> ^( AST_INC_DOTCALL ) ;
    public final FanParser.incDotCall_return incDotCall() throws RecognitionException {
        FanParser.incDotCall_return retval = new FanParser.incDotCall_return();
        retval.start = input.LT(1);
        int incDotCall_StartIndex = input.index();
        Object root_0 = null;

        Token DOT434=null;

        Object DOT434_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 117) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:451:12: ( DOT -> ^( AST_INC_DOTCALL ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:451:14: DOT
            {
            DOT434=(Token)match(input,DOT,FOLLOW_DOT_in_incDotCall3479); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DOT.add(DOT434);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 452:5: -> ^( AST_INC_DOTCALL )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:452:8: ^( AST_INC_DOTCALL )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_INC_DOTCALL, "AST_INC_DOTCALL"), root_1);

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 117, incDotCall_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "incDotCall"

    public static class incSafeDotCall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "incSafeDotCall"
    // src/net/colar/netbeans/fan/antlr/Fan.g:453:1: incSafeDotCall : OP_SAFE_CALL -> ^( AST_INC_SAFEDOTCALL ) ;
    public final FanParser.incSafeDotCall_return incSafeDotCall() throws RecognitionException {
        FanParser.incSafeDotCall_return retval = new FanParser.incSafeDotCall_return();
        retval.start = input.LT(1);
        int incSafeDotCall_StartIndex = input.index();
        Object root_0 = null;

        Token OP_SAFE_CALL435=null;

        Object OP_SAFE_CALL435_tree=null;
        RewriteRuleTokenStream stream_OP_SAFE_CALL=new RewriteRuleTokenStream(adaptor,"token OP_SAFE_CALL");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 118) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:453:15: ( OP_SAFE_CALL -> ^( AST_INC_SAFEDOTCALL ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:453:17: OP_SAFE_CALL
            {
            OP_SAFE_CALL435=(Token)match(input,OP_SAFE_CALL,FOLLOW_OP_SAFE_CALL_in_incSafeDotCall3495); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OP_SAFE_CALL.add(OP_SAFE_CALL435);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 454:5: -> ^( AST_INC_SAFEDOTCALL )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:454:8: ^( AST_INC_SAFEDOTCALL )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_INC_SAFEDOTCALL, "AST_INC_SAFEDOTCALL"), root_1);

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 118, incSafeDotCall_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "incSafeDotCall"

    public static class itBlock_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "itBlock"
    // src/net/colar/netbeans/fan/antlr/Fan.g:457:1: itBlock : bracketL ( stmt ( SP_COMMA )? ( SP_SEMI )? )* bracketR ;
    public final FanParser.itBlock_return itBlock() throws RecognitionException {
        FanParser.itBlock_return retval = new FanParser.itBlock_return();
        retval.start = input.LT(1);
        int itBlock_StartIndex = input.index();
        Object root_0 = null;

        Token SP_COMMA438=null;
        Token SP_SEMI439=null;
        FanParser.bracketL_return bracketL436 = null;

        FanParser.stmt_return stmt437 = null;

        FanParser.bracketR_return bracketR440 = null;


        Object SP_COMMA438_tree=null;
        Object SP_SEMI439_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 119) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:457:10: ( bracketL ( stmt ( SP_COMMA )? ( SP_SEMI )? )* bracketR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:457:12: bracketL ( stmt ( SP_COMMA )? ( SP_SEMI )? )* bracketR
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bracketL_in_itBlock3515);
            bracketL436=bracketL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bracketL436.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:457:21: ( stmt ( SP_COMMA )? ( SP_SEMI )? )*
            loop124:
            do {
                int alt124=2;
                int LA124_0 = input.LA(1);

                if ( ((LA124_0>=KW_BREAK && LA124_0<=KW_TRY)||(LA124_0>=KW_THIS && LA124_0<=KW_SUPER)||(LA124_0>=KW_NULL && LA124_0<=KW_FALSE)||LA124_0==SP_PIPE||LA124_0==OP_CURRY||(LA124_0>=OP_PLUS && LA124_0<=OP_MULTI)||(LA124_0>=OP_BANG && LA124_0<=OP_TILDA)||(LA124_0>=ID && LA124_0<=AT)||(LA124_0>=NUMBER && LA124_0<=SQ_BRACKET_L)||LA124_0==PAR_L) ) {
                    alt124=1;
                }


                switch (alt124) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:457:22: stmt ( SP_COMMA )? ( SP_SEMI )?
            	    {
            	    pushFollow(FOLLOW_stmt_in_itBlock3518);
            	    stmt437=stmt();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmt437.getTree());
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:457:27: ( SP_COMMA )?
            	    int alt122=2;
            	    int LA122_0 = input.LA(1);

            	    if ( (LA122_0==SP_COMMA) ) {
            	        alt122=1;
            	    }
            	    switch (alt122) {
            	        case 1 :
            	            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_COMMA
            	            {
            	            SP_COMMA438=(Token)match(input,SP_COMMA,FOLLOW_SP_COMMA_in_itBlock3520); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SP_COMMA438_tree = (Object)adaptor.create(SP_COMMA438);
            	            adaptor.addChild(root_0, SP_COMMA438_tree);
            	            }

            	            }
            	            break;

            	    }

            	    // src/net/colar/netbeans/fan/antlr/Fan.g:457:37: ( SP_SEMI )?
            	    int alt123=2;
            	    int LA123_0 = input.LA(1);

            	    if ( (LA123_0==SP_SEMI) ) {
            	        alt123=1;
            	    }
            	    switch (alt123) {
            	        case 1 :
            	            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_SEMI
            	            {
            	            SP_SEMI439=(Token)match(input,SP_SEMI,FOLLOW_SP_SEMI_in_itBlock3523); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SP_SEMI439_tree = (Object)adaptor.create(SP_SEMI439);
            	            adaptor.addChild(root_0, SP_SEMI439_tree);
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop124;
                }
            } while (true);

            pushFollow(FOLLOW_bracketR_in_itBlock3528);
            bracketR440=bracketR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bracketR440.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 119, itBlock_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "itBlock"

    public static class dotCall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dotCall"
    // src/net/colar/netbeans/fan/antlr/Fan.g:458:1: dotCall : DOT idExpr -> ^( AST_DOT_CALL idExpr ) ;
    public final FanParser.dotCall_return dotCall() throws RecognitionException {
        FanParser.dotCall_return retval = new FanParser.dotCall_return();
        retval.start = input.LT(1);
        int dotCall_StartIndex = input.index();
        Object root_0 = null;

        Token DOT441=null;
        FanParser.idExpr_return idExpr442 = null;


        Object DOT441_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_idExpr=new RewriteRuleSubtreeStream(adaptor,"rule idExpr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 120) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:458:10: ( DOT idExpr -> ^( AST_DOT_CALL idExpr ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:458:12: DOT idExpr
            {
            DOT441=(Token)match(input,DOT,FOLLOW_DOT_in_dotCall3536); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DOT.add(DOT441);

            pushFollow(FOLLOW_idExpr_in_dotCall3538);
            idExpr442=idExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_idExpr.add(idExpr442.getTree());


            // AST REWRITE
            // elements: idExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 459:5: -> ^( AST_DOT_CALL idExpr )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:459:8: ^( AST_DOT_CALL idExpr )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_DOT_CALL, "AST_DOT_CALL"), root_1);

                adaptor.addChild(root_1, stream_idExpr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 120, dotCall_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "dotCall"

    public static class dynCall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dynCall"
    // src/net/colar/netbeans/fan/antlr/Fan.g:460:1: dynCall : OP_ARROW idExpr ;
    public final FanParser.dynCall_return dynCall() throws RecognitionException {
        FanParser.dynCall_return retval = new FanParser.dynCall_return();
        retval.start = input.LT(1);
        int dynCall_StartIndex = input.index();
        Object root_0 = null;

        Token OP_ARROW443=null;
        FanParser.idExpr_return idExpr444 = null;


        Object OP_ARROW443_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 121) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:460:10: ( OP_ARROW idExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:460:12: OP_ARROW idExpr
            {
            root_0 = (Object)adaptor.nil();

            OP_ARROW443=(Token)match(input,OP_ARROW,FOLLOW_OP_ARROW_in_dynCall3558); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            OP_ARROW443_tree = (Object)adaptor.create(OP_ARROW443);
            adaptor.addChild(root_0, OP_ARROW443_tree);
            }
            pushFollow(FOLLOW_idExpr_in_dynCall3560);
            idExpr444=idExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, idExpr444.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 121, dynCall_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "dynCall"

    public static class safeDotCall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "safeDotCall"
    // src/net/colar/netbeans/fan/antlr/Fan.g:461:1: safeDotCall : OP_SAFE_CALL idExpr -> ^( AST_SAFE_DOT_CALL idExpr ) ;
    public final FanParser.safeDotCall_return safeDotCall() throws RecognitionException {
        FanParser.safeDotCall_return retval = new FanParser.safeDotCall_return();
        retval.start = input.LT(1);
        int safeDotCall_StartIndex = input.index();
        Object root_0 = null;

        Token OP_SAFE_CALL445=null;
        FanParser.idExpr_return idExpr446 = null;


        Object OP_SAFE_CALL445_tree=null;
        RewriteRuleTokenStream stream_OP_SAFE_CALL=new RewriteRuleTokenStream(adaptor,"token OP_SAFE_CALL");
        RewriteRuleSubtreeStream stream_idExpr=new RewriteRuleSubtreeStream(adaptor,"rule idExpr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 122) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:461:14: ( OP_SAFE_CALL idExpr -> ^( AST_SAFE_DOT_CALL idExpr ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:461:16: OP_SAFE_CALL idExpr
            {
            OP_SAFE_CALL445=(Token)match(input,OP_SAFE_CALL,FOLLOW_OP_SAFE_CALL_in_safeDotCall3568); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OP_SAFE_CALL.add(OP_SAFE_CALL445);

            pushFollow(FOLLOW_idExpr_in_safeDotCall3570);
            idExpr446=idExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_idExpr.add(idExpr446.getTree());


            // AST REWRITE
            // elements: idExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 462:5: -> ^( AST_SAFE_DOT_CALL idExpr )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:462:8: ^( AST_SAFE_DOT_CALL idExpr )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_SAFE_DOT_CALL, "AST_SAFE_DOT_CALL"), root_1);

                adaptor.addChild(root_1, stream_idExpr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 122, safeDotCall_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "safeDotCall"

    public static class safeDynCall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "safeDynCall"
    // src/net/colar/netbeans/fan/antlr/Fan.g:463:1: safeDynCall : OP_SAFEDYN_CALL idExpr ;
    public final FanParser.safeDynCall_return safeDynCall() throws RecognitionException {
        FanParser.safeDynCall_return retval = new FanParser.safeDynCall_return();
        retval.start = input.LT(1);
        int safeDynCall_StartIndex = input.index();
        Object root_0 = null;

        Token OP_SAFEDYN_CALL447=null;
        FanParser.idExpr_return idExpr448 = null;


        Object OP_SAFEDYN_CALL447_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 123) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:463:13: ( OP_SAFEDYN_CALL idExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:463:15: OP_SAFEDYN_CALL idExpr
            {
            root_0 = (Object)adaptor.nil();

            OP_SAFEDYN_CALL447=(Token)match(input,OP_SAFEDYN_CALL,FOLLOW_OP_SAFEDYN_CALL_in_safeDynCall3589); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            OP_SAFEDYN_CALL447_tree = (Object)adaptor.create(OP_SAFEDYN_CALL447);
            adaptor.addChild(root_0, OP_SAFEDYN_CALL447_tree);
            }
            pushFollow(FOLLOW_idExpr_in_safeDynCall3591);
            idExpr448=idExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, idExpr448.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 123, safeDynCall_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "safeDynCall"

    public static class indexExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "indexExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:464:1: indexExpr : {...}? sq_bracketL expr sq_bracketR ;
    public final FanParser.indexExpr_return indexExpr() throws RecognitionException {
        FanParser.indexExpr_return retval = new FanParser.indexExpr_return();
        retval.start = input.LT(1);
        int indexExpr_StartIndex = input.index();
        Object root_0 = null;

        FanParser.sq_bracketL_return sq_bracketL449 = null;

        FanParser.expr_return expr450 = null;

        FanParser.sq_bracketR_return sq_bracketR451 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 124) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:464:12: ({...}? sq_bracketL expr sq_bracketR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:464:14: {...}? sq_bracketL expr sq_bracketR
            {
            root_0 = (Object)adaptor.nil();

            if ( !((notAfterEol())) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "indexExpr", "notAfterEol()");
            }
            pushFollow(FOLLOW_sq_bracketL_in_indexExpr3601);
            sq_bracketL449=sq_bracketL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, sq_bracketL449.getTree());
            pushFollow(FOLLOW_expr_in_indexExpr3603);
            expr450=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr450.getTree());
            pushFollow(FOLLOW_sq_bracketR_in_indexExpr3605);
            sq_bracketR451=sq_bracketR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, sq_bracketR451.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 124, indexExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "indexExpr"

    public static class callOp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "callOp"
    // src/net/colar/netbeans/fan/antlr/Fan.g:466:1: callOp : {...}? parL ( args )? parR ( closure )* ;
    public final FanParser.callOp_return callOp() throws RecognitionException {
        FanParser.callOp_return retval = new FanParser.callOp_return();
        retval.start = input.LT(1);
        int callOp_StartIndex = input.index();
        Object root_0 = null;

        FanParser.parL_return parL452 = null;

        FanParser.args_return args453 = null;

        FanParser.parR_return parR454 = null;

        FanParser.closure_return closure455 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 125) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:466:9: ({...}? parL ( args )? parR ( closure )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:466:11: {...}? parL ( args )? parR ( closure )*
            {
            root_0 = (Object)adaptor.nil();

            if ( !((notAfterEol())) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "callOp", "notAfterEol()");
            }
            pushFollow(FOLLOW_parL_in_callOp3616);
            parL452=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parL452.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:466:33: ( args )?
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( ((LA125_0>=KW_THIS && LA125_0<=KW_SUPER)||(LA125_0>=KW_NULL && LA125_0<=KW_FALSE)||LA125_0==SP_PIPE||LA125_0==OP_CURRY||(LA125_0>=OP_PLUS && LA125_0<=OP_MULTI)||(LA125_0>=OP_BANG && LA125_0<=OP_TILDA)||(LA125_0>=ID && LA125_0<=AT)||(LA125_0>=NUMBER && LA125_0<=SQ_BRACKET_L)||LA125_0==PAR_L) ) {
                alt125=1;
            }
            switch (alt125) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: args
                    {
                    pushFollow(FOLLOW_args_in_callOp3618);
                    args453=args();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, args453.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_parR_in_callOp3622);
            parR454=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parR454.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:466:45: ( closure )*
            loop126:
            do {
                int alt126=2;
                alt126 = dfa126.predict(input);
                switch (alt126) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: closure
            	    {
            	    pushFollow(FOLLOW_closure_in_callOp3624);
            	    closure455=closure();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, closure455.getTree());

            	    }
            	    break;

            	default :
            	    break loop126;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 125, callOp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "callOp"

    public static class closure_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "closure"
    // src/net/colar/netbeans/fan/antlr/Fan.g:467:1: closure : funcType multiStmt ;
    public final FanParser.closure_return closure() throws RecognitionException {
        FanParser.closure_return retval = new FanParser.closure_return();
        retval.start = input.LT(1);
        int closure_StartIndex = input.index();
        Object root_0 = null;

        FanParser.funcType_return funcType456 = null;

        FanParser.multiStmt_return multiStmt457 = null;



        paraphrase.push("Closure");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 126) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:468:3: ( funcType multiStmt )
            // src/net/colar/netbeans/fan/antlr/Fan.g:468:7: funcType multiStmt
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_funcType_in_closure3646);
            funcType456=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType456.getTree());
            pushFollow(FOLLOW_multiStmt_in_closure3648);
            multiStmt457=multiStmt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiStmt457.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 126, closure_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "closure"

    public static class idExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "idExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:470:1: idExpr : ( idExprReq | id );
    public final FanParser.idExpr_return idExpr() throws RecognitionException {
        FanParser.idExpr_return retval = new FanParser.idExpr_return();
        retval.start = input.LT(1);
        int idExpr_StartIndex = input.index();
        Object root_0 = null;

        FanParser.idExprReq_return idExprReq458 = null;

        FanParser.id_return id459 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 127) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:470:10: ( idExprReq | id )
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==OP_MULTI) ) {
                alt127=1;
            }
            else if ( (LA127_0==ID) ) {
                int LA127_2 = input.LA(2);

                if ( (synpred209_Fan()) ) {
                    alt127=1;
                }
                else if ( (true) ) {
                    alt127=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 127, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 127, 0, input);

                throw nvae;
            }
            switch (alt127) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:470:12: idExprReq
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_idExprReq_in_idExpr3658);
                    idExprReq458=idExprReq();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, idExprReq458.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:470:24: id
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_id_in_idExpr3662);
                    id459=id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, id459.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 127, idExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "idExpr"

    public static class idExprReq_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "idExprReq"
    // src/net/colar/netbeans/fan/antlr/Fan.g:472:1: idExprReq : ( field | call );
    public final FanParser.idExprReq_return idExprReq() throws RecognitionException {
        FanParser.idExprReq_return retval = new FanParser.idExprReq_return();
        retval.start = input.LT(1);
        int idExprReq_StartIndex = input.index();
        Object root_0 = null;

        FanParser.field_return field460 = null;

        FanParser.call_return call461 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 128) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:472:11: ( field | call )
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==OP_MULTI) ) {
                alt128=1;
            }
            else if ( (LA128_0==ID) ) {
                alt128=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 128, 0, input);

                throw nvae;
            }
            switch (alt128) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:472:13: field
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_field_in_idExprReq3670);
                    field460=field();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, field460.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:472:21: call
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_call_in_idExprReq3674);
                    call461=call();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, call461.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 128, idExprReq_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "idExprReq"

    public static class field_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "field"
    // src/net/colar/netbeans/fan/antlr/Fan.g:474:1: field : OP_MULTI ID ;
    public final FanParser.field_return field() throws RecognitionException {
        FanParser.field_return retval = new FanParser.field_return();
        retval.start = input.LT(1);
        int field_StartIndex = input.index();
        Object root_0 = null;

        Token OP_MULTI462=null;
        Token ID463=null;

        Object OP_MULTI462_tree=null;
        Object ID463_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 129) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:474:8: ( OP_MULTI ID )
            // src/net/colar/netbeans/fan/antlr/Fan.g:474:10: OP_MULTI ID
            {
            root_0 = (Object)adaptor.nil();

            OP_MULTI462=(Token)match(input,OP_MULTI,FOLLOW_OP_MULTI_in_field3683); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            OP_MULTI462_tree = (Object)adaptor.create(OP_MULTI462);
            adaptor.addChild(root_0, OP_MULTI462_tree);
            }
            ID463=(Token)match(input,ID,FOLLOW_ID_in_field3685); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID463_tree = (Object)adaptor.create(ID463);
            adaptor.addChild(root_0, ID463_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 129, field_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "field"

    public static class call_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "call"
    // src/net/colar/netbeans/fan/antlr/Fan.g:476:1: call : ( id ( (p= callParams c= closure ) | p= callParams | c= closure ) ) -> ^( AST_CALL id ^( AST_CHILD ( $p)? ( $c)? ) ) ;
    public final FanParser.call_return call() throws RecognitionException {
        FanParser.call_return retval = new FanParser.call_return();
        retval.start = input.LT(1);
        int call_StartIndex = input.index();
        Object root_0 = null;

        FanParser.callParams_return p = null;

        FanParser.closure_return c = null;

        FanParser.id_return id464 = null;


        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_closure=new RewriteRuleSubtreeStream(adaptor,"rule closure");
        RewriteRuleSubtreeStream stream_callParams=new RewriteRuleSubtreeStream(adaptor,"rule callParams");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 130) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:476:7: ( ( id ( (p= callParams c= closure ) | p= callParams | c= closure ) ) -> ^( AST_CALL id ^( AST_CHILD ( $p)? ( $c)? ) ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:476:9: ( id ( (p= callParams c= closure ) | p= callParams | c= closure ) )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:476:9: ( id ( (p= callParams c= closure ) | p= callParams | c= closure ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:476:10: id ( (p= callParams c= closure ) | p= callParams | c= closure )
            {
            pushFollow(FOLLOW_id_in_call3697);
            id464=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id464.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:476:13: ( (p= callParams c= closure ) | p= callParams | c= closure )
            int alt129=3;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==PAR_L) ) {
                int LA129_1 = input.LA(2);

                if ( ((synpred211_Fan()&&(notAfterEol()))) ) {
                    alt129=1;
                }
                else if ( ((synpred212_Fan()&&(notAfterEol()))) ) {
                    alt129=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 129, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA129_0==SP_PIPE) ) {
                alt129=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 129, 0, input);

                throw nvae;
            }
            switch (alt129) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:476:14: (p= callParams c= closure )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:476:14: (p= callParams c= closure )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:476:15: p= callParams c= closure
                    {
                    pushFollow(FOLLOW_callParams_in_call3703);
                    p=callParams();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_callParams.add(p.getTree());
                    pushFollow(FOLLOW_closure_in_call3707);
                    c=closure();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_closure.add(c.getTree());

                    }


                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:476:41: p= callParams
                    {
                    pushFollow(FOLLOW_callParams_in_call3714);
                    p=callParams();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_callParams.add(p.getTree());

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:476:56: c= closure
                    {
                    pushFollow(FOLLOW_closure_in_call3720);
                    c=closure();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_closure.add(c.getTree());

                    }
                    break;

            }


            }



            // AST REWRITE
            // elements: id, c, p
            // token labels: 
            // rule labels: retval, c, p
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.tree:null);
            RewriteRuleSubtreeStream stream_p=new RewriteRuleSubtreeStream(adaptor,"rule p",p!=null?p.tree:null);

            root_0 = (Object)adaptor.nil();
            // 477:4: -> ^( AST_CALL id ^( AST_CHILD ( $p)? ( $c)? ) )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:477:7: ^( AST_CALL id ^( AST_CHILD ( $p)? ( $c)? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CALL, "AST_CALL"), root_1);

                adaptor.addChild(root_1, stream_id.nextTree());
                // src/net/colar/netbeans/fan/antlr/Fan.g:477:21: ^( AST_CHILD ( $p)? ( $c)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CHILD, "AST_CHILD"), root_2);

                // src/net/colar/netbeans/fan/antlr/Fan.g:477:33: ( $p)?
                if ( stream_p.hasNext() ) {
                    adaptor.addChild(root_2, stream_p.nextTree());

                }
                stream_p.reset();
                // src/net/colar/netbeans/fan/antlr/Fan.g:477:37: ( $c)?
                if ( stream_c.hasNext() ) {
                    adaptor.addChild(root_2, stream_c.nextTree());

                }
                stream_c.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 130, call_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "call"

    public static class callParams_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "callParams"
    // src/net/colar/netbeans/fan/antlr/Fan.g:479:1: callParams : {...}? parL ( args )? parR ;
    public final FanParser.callParams_return callParams() throws RecognitionException {
        FanParser.callParams_return retval = new FanParser.callParams_return();
        retval.start = input.LT(1);
        int callParams_StartIndex = input.index();
        Object root_0 = null;

        FanParser.parL_return parL465 = null;

        FanParser.args_return args466 = null;

        FanParser.parR_return parR467 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 131) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:479:12: ({...}? parL ( args )? parR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:479:14: {...}? parL ( args )? parR
            {
            root_0 = (Object)adaptor.nil();

            if ( !((notAfterEol())) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "callParams", "notAfterEol()");
            }
            pushFollow(FOLLOW_parL_in_callParams3755);
            parL465=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parL465.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:479:36: ( args )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( ((LA130_0>=KW_THIS && LA130_0<=KW_SUPER)||(LA130_0>=KW_NULL && LA130_0<=KW_FALSE)||LA130_0==SP_PIPE||LA130_0==OP_CURRY||(LA130_0>=OP_PLUS && LA130_0<=OP_MULTI)||(LA130_0>=OP_BANG && LA130_0<=OP_TILDA)||(LA130_0>=ID && LA130_0<=AT)||(LA130_0>=NUMBER && LA130_0<=SQ_BRACKET_L)||LA130_0==PAR_L) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: args
                    {
                    pushFollow(FOLLOW_args_in_callParams3757);
                    args466=args();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, args466.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_parR_in_callParams3760);
            parR467=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parR467.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 131, callParams_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "callParams"

    public static class args_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "args"
    // src/net/colar/netbeans/fan/antlr/Fan.g:480:1: args : expr ( SP_COMMA expr )* ;
    public final FanParser.args_return args() throws RecognitionException {
        FanParser.args_return retval = new FanParser.args_return();
        retval.start = input.LT(1);
        int args_StartIndex = input.index();
        Object root_0 = null;

        Token SP_COMMA469=null;
        FanParser.expr_return expr468 = null;

        FanParser.expr_return expr470 = null;


        Object SP_COMMA469_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 132) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:480:8: ( expr ( SP_COMMA expr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:480:10: expr ( SP_COMMA expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expr_in_args3769);
            expr468=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr468.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:480:15: ( SP_COMMA expr )*
            loop131:
            do {
                int alt131=2;
                int LA131_0 = input.LA(1);

                if ( (LA131_0==SP_COMMA) ) {
                    alt131=1;
                }


                switch (alt131) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:480:16: SP_COMMA expr
            	    {
            	    SP_COMMA469=(Token)match(input,SP_COMMA,FOLLOW_SP_COMMA_in_args3772); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    SP_COMMA469_tree = (Object)adaptor.create(SP_COMMA469);
            	    adaptor.addChild(root_0, SP_COMMA469_tree);
            	    }
            	    pushFollow(FOLLOW_expr_in_args3775);
            	    expr470=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr470.getTree());

            	    }
            	    break;

            	default :
            	    break loop131;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 132, args_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "args"

    public static class literal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "literal"
    // src/net/colar/netbeans/fan/antlr/Fan.g:482:1: literal : ( KW_NULL | KW_THIS | KW_SUPER | KW_IT | KW_TRUE | KW_FALSE | strs | URI | number | CHAR | namedSuper | slotLiteral | typeLiteral | list | map | symbLiteral | simple );
    public final FanParser.literal_return literal() throws RecognitionException {
        FanParser.literal_return retval = new FanParser.literal_return();
        retval.start = input.LT(1);
        int literal_StartIndex = input.index();
        Object root_0 = null;

        Token KW_NULL471=null;
        Token KW_THIS472=null;
        Token KW_SUPER473=null;
        Token KW_IT474=null;
        Token KW_TRUE475=null;
        Token KW_FALSE476=null;
        Token URI478=null;
        Token CHAR480=null;
        FanParser.strs_return strs477 = null;

        FanParser.number_return number479 = null;

        FanParser.namedSuper_return namedSuper481 = null;

        FanParser.slotLiteral_return slotLiteral482 = null;

        FanParser.typeLiteral_return typeLiteral483 = null;

        FanParser.list_return list484 = null;

        FanParser.map_return map485 = null;

        FanParser.symbLiteral_return symbLiteral486 = null;

        FanParser.simple_return simple487 = null;


        Object KW_NULL471_tree=null;
        Object KW_THIS472_tree=null;
        Object KW_SUPER473_tree=null;
        Object KW_IT474_tree=null;
        Object KW_TRUE475_tree=null;
        Object KW_FALSE476_tree=null;
        Object URI478_tree=null;
        Object CHAR480_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 133) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:482:10: ( KW_NULL | KW_THIS | KW_SUPER | KW_IT | KW_TRUE | KW_FALSE | strs | URI | number | CHAR | namedSuper | slotLiteral | typeLiteral | list | map | symbLiteral | simple )
            int alt132=17;
            alt132 = dfa132.predict(input);
            switch (alt132) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:482:12: KW_NULL
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_NULL471=(Token)match(input,KW_NULL,FOLLOW_KW_NULL_in_literal3786); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_NULL471_tree = (Object)adaptor.create(KW_NULL471);
                    adaptor.addChild(root_0, KW_NULL471_tree);
                    }

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:482:22: KW_THIS
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_THIS472=(Token)match(input,KW_THIS,FOLLOW_KW_THIS_in_literal3790); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_THIS472_tree = (Object)adaptor.create(KW_THIS472);
                    adaptor.addChild(root_0, KW_THIS472_tree);
                    }

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:482:32: KW_SUPER
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_SUPER473=(Token)match(input,KW_SUPER,FOLLOW_KW_SUPER_in_literal3794); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_SUPER473_tree = (Object)adaptor.create(KW_SUPER473);
                    adaptor.addChild(root_0, KW_SUPER473_tree);
                    }

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:482:43: KW_IT
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_IT474=(Token)match(input,KW_IT,FOLLOW_KW_IT_in_literal3798); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_IT474_tree = (Object)adaptor.create(KW_IT474);
                    adaptor.addChild(root_0, KW_IT474_tree);
                    }

                    }
                    break;
                case 5 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:482:51: KW_TRUE
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_TRUE475=(Token)match(input,KW_TRUE,FOLLOW_KW_TRUE_in_literal3802); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_TRUE475_tree = (Object)adaptor.create(KW_TRUE475);
                    adaptor.addChild(root_0, KW_TRUE475_tree);
                    }

                    }
                    break;
                case 6 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:482:61: KW_FALSE
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_FALSE476=(Token)match(input,KW_FALSE,FOLLOW_KW_FALSE_in_literal3806); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_FALSE476_tree = (Object)adaptor.create(KW_FALSE476);
                    adaptor.addChild(root_0, KW_FALSE476_tree);
                    }

                    }
                    break;
                case 7 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:482:72: strs
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_strs_in_literal3810);
                    strs477=strs();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, strs477.getTree());

                    }
                    break;
                case 8 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:482:79: URI
                    {
                    root_0 = (Object)adaptor.nil();

                    URI478=(Token)match(input,URI,FOLLOW_URI_in_literal3814); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    URI478_tree = (Object)adaptor.create(URI478);
                    adaptor.addChild(root_0, URI478_tree);
                    }

                    }
                    break;
                case 9 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:483:4: number
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_number_in_literal3821);
                    number479=number();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, number479.getTree());

                    }
                    break;
                case 10 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:483:13: CHAR
                    {
                    root_0 = (Object)adaptor.nil();

                    CHAR480=(Token)match(input,CHAR,FOLLOW_CHAR_in_literal3825); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CHAR480_tree = (Object)adaptor.create(CHAR480);
                    adaptor.addChild(root_0, CHAR480_tree);
                    }

                    }
                    break;
                case 11 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:483:20: namedSuper
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_namedSuper_in_literal3829);
                    namedSuper481=namedSuper();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, namedSuper481.getTree());

                    }
                    break;
                case 12 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:484:4: slotLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_slotLiteral_in_literal3836);
                    slotLiteral482=slotLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, slotLiteral482.getTree());

                    }
                    break;
                case 13 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:484:18: typeLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_typeLiteral_in_literal3840);
                    typeLiteral483=typeLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeLiteral483.getTree());

                    }
                    break;
                case 14 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:484:32: list
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_list_in_literal3844);
                    list484=list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, list484.getTree());

                    }
                    break;
                case 15 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:484:39: map
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_map_in_literal3848);
                    map485=map();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, map485.getTree());

                    }
                    break;
                case 16 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:484:45: symbLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_symbLiteral_in_literal3852);
                    symbLiteral486=symbLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, symbLiteral486.getTree());

                    }
                    break;
                case 17 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:484:59: simple
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_simple_in_literal3856);
                    simple487=simple();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, simple487.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 133, literal_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "literal"

    public static class strs_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "strs"
    // src/net/colar/netbeans/fan/antlr/Fan.g:485:1: strs : (qs= QUOTSTR | s= STR ) -> ( ^( AST_STR $s) )? ( ^( AST_STR $qs) )? ;
    public final FanParser.strs_return strs() throws RecognitionException {
        FanParser.strs_return retval = new FanParser.strs_return();
        retval.start = input.LT(1);
        int strs_StartIndex = input.index();
        Object root_0 = null;

        Token qs=null;
        Token s=null;

        Object qs_tree=null;
        Object s_tree=null;
        RewriteRuleTokenStream stream_QUOTSTR=new RewriteRuleTokenStream(adaptor,"token QUOTSTR");
        RewriteRuleTokenStream stream_STR=new RewriteRuleTokenStream(adaptor,"token STR");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 134) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:485:7: ( (qs= QUOTSTR | s= STR ) -> ( ^( AST_STR $s) )? ( ^( AST_STR $qs) )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:485:9: (qs= QUOTSTR | s= STR )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:485:9: (qs= QUOTSTR | s= STR )
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==QUOTSTR) ) {
                alt133=1;
            }
            else if ( (LA133_0==STR) ) {
                alt133=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 133, 0, input);

                throw nvae;
            }
            switch (alt133) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:485:10: qs= QUOTSTR
                    {
                    qs=(Token)match(input,QUOTSTR,FOLLOW_QUOTSTR_in_strs3867); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUOTSTR.add(qs);


                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:485:23: s= STR
                    {
                    s=(Token)match(input,STR,FOLLOW_STR_in_strs3873); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STR.add(s);


                    }
                    break;

            }



            // AST REWRITE
            // elements: s, qs
            // token labels: s, qs
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_s=new RewriteRuleTokenStream(adaptor,"token s",s);
            RewriteRuleTokenStream stream_qs=new RewriteRuleTokenStream(adaptor,"token qs",qs);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 486:5: -> ( ^( AST_STR $s) )? ( ^( AST_STR $qs) )?
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:486:8: ( ^( AST_STR $s) )?
                if ( stream_s.hasNext() ) {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:486:8: ^( AST_STR $s)
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_STR, "AST_STR"), root_1);

                    adaptor.addChild(root_1, stream_s.nextNode());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_s.reset();
                // src/net/colar/netbeans/fan/antlr/Fan.g:486:23: ( ^( AST_STR $qs) )?
                if ( stream_qs.hasNext() ) {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:486:23: ^( AST_STR $qs)
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_STR, "AST_STR"), root_1);

                    adaptor.addChild(root_1, stream_qs.nextNode());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_qs.reset();

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 134, strs_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "strs"

    public static class typeLiteral_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeLiteral"
    // src/net/colar/netbeans/fan/antlr/Fan.g:487:1: typeLiteral : ( type {...}? OP_POUND ) -> ^( AST_TYPE_LIT type OP_POUND ) ;
    public final FanParser.typeLiteral_return typeLiteral() throws RecognitionException {
        FanParser.typeLiteral_return retval = new FanParser.typeLiteral_return();
        retval.start = input.LT(1);
        int typeLiteral_StartIndex = input.index();
        Object root_0 = null;

        Token OP_POUND489=null;
        FanParser.type_return type488 = null;


        Object OP_POUND489_tree=null;
        RewriteRuleTokenStream stream_OP_POUND=new RewriteRuleTokenStream(adaptor,"token OP_POUND");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 135) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:487:13: ( ( type {...}? OP_POUND ) -> ^( AST_TYPE_LIT type OP_POUND ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:487:17: ( type {...}? OP_POUND )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:487:17: ( type {...}? OP_POUND )
            // src/net/colar/netbeans/fan/antlr/Fan.g:487:18: type {...}? OP_POUND
            {
            pushFollow(FOLLOW_type_in_typeLiteral3906);
            type488=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type488.getTree());
            if ( !((notAfterEol())) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "typeLiteral", "notAfterEol()");
            }
            OP_POUND489=(Token)match(input,OP_POUND,FOLLOW_OP_POUND_in_typeLiteral3910); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OP_POUND.add(OP_POUND489);


            }



            // AST REWRITE
            // elements: OP_POUND, type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 488:5: -> ^( AST_TYPE_LIT type OP_POUND )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:488:8: ^( AST_TYPE_LIT type OP_POUND )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_TYPE_LIT, "AST_TYPE_LIT"), root_1);

                adaptor.addChild(root_1, stream_type.nextTree());
                adaptor.addChild(root_1, stream_OP_POUND.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 135, typeLiteral_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeLiteral"

    public static class slotLiteral_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "slotLiteral"
    // src/net/colar/netbeans/fan/antlr/Fan.g:489:1: slotLiteral : ( ( type )? OP_POUND {...}? id ) -> ^( AST_SLOT_LIT ( type )? OP_POUND id ) ;
    public final FanParser.slotLiteral_return slotLiteral() throws RecognitionException {
        FanParser.slotLiteral_return retval = new FanParser.slotLiteral_return();
        retval.start = input.LT(1);
        int slotLiteral_StartIndex = input.index();
        Object root_0 = null;

        Token OP_POUND491=null;
        FanParser.type_return type490 = null;

        FanParser.id_return id492 = null;


        Object OP_POUND491_tree=null;
        RewriteRuleTokenStream stream_OP_POUND=new RewriteRuleTokenStream(adaptor,"token OP_POUND");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 136) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:489:13: ( ( ( type )? OP_POUND {...}? id ) -> ^( AST_SLOT_LIT ( type )? OP_POUND id ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:489:17: ( ( type )? OP_POUND {...}? id )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:489:17: ( ( type )? OP_POUND {...}? id )
            // src/net/colar/netbeans/fan/antlr/Fan.g:489:18: ( type )? OP_POUND {...}? id
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:489:18: ( type )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==SP_PIPE||LA134_0==ID||LA134_0==SQ_BRACKET_L) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: type
                    {
                    pushFollow(FOLLOW_type_in_slotLiteral3935);
                    type490=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type490.getTree());

                    }
                    break;

            }

            OP_POUND491=(Token)match(input,OP_POUND,FOLLOW_OP_POUND_in_slotLiteral3938); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OP_POUND.add(OP_POUND491);

            if ( !((notAfterEol())) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "slotLiteral", "notAfterEol()");
            }
            pushFollow(FOLLOW_id_in_slotLiteral3942);
            id492=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id492.getTree());

            }



            // AST REWRITE
            // elements: type, OP_POUND, id
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 490:5: -> ^( AST_SLOT_LIT ( type )? OP_POUND id )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:490:8: ^( AST_SLOT_LIT ( type )? OP_POUND id )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_SLOT_LIT, "AST_SLOT_LIT"), root_1);

                // src/net/colar/netbeans/fan/antlr/Fan.g:490:23: ( type )?
                if ( stream_type.hasNext() ) {
                    adaptor.addChild(root_1, stream_type.nextTree());

                }
                stream_type.reset();
                adaptor.addChild(root_1, stream_OP_POUND.nextNode());
                adaptor.addChild(root_1, stream_id.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 136, slotLiteral_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "slotLiteral"

    public static class symbLiteral_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "symbLiteral"
    // src/net/colar/netbeans/fan/antlr/Fan.g:491:1: symbLiteral : ( AT ( id SP_COLON SP_COLON )? id ) -> ^( AST_SYMBOL AT ( id SP_COLON SP_COLON )? id ) ;
    public final FanParser.symbLiteral_return symbLiteral() throws RecognitionException {
        FanParser.symbLiteral_return retval = new FanParser.symbLiteral_return();
        retval.start = input.LT(1);
        int symbLiteral_StartIndex = input.index();
        Object root_0 = null;

        Token AT493=null;
        Token SP_COLON495=null;
        Token SP_COLON496=null;
        FanParser.id_return id494 = null;

        FanParser.id_return id497 = null;


        Object AT493_tree=null;
        Object SP_COLON495_tree=null;
        Object SP_COLON496_tree=null;
        RewriteRuleTokenStream stream_AT=new RewriteRuleTokenStream(adaptor,"token AT");
        RewriteRuleTokenStream stream_SP_COLON=new RewriteRuleTokenStream(adaptor,"token SP_COLON");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 137) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:491:13: ( ( AT ( id SP_COLON SP_COLON )? id ) -> ^( AST_SYMBOL AT ( id SP_COLON SP_COLON )? id ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:491:17: ( AT ( id SP_COLON SP_COLON )? id )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:491:17: ( AT ( id SP_COLON SP_COLON )? id )
            // src/net/colar/netbeans/fan/antlr/Fan.g:491:18: AT ( id SP_COLON SP_COLON )? id
            {
            AT493=(Token)match(input,AT,FOLLOW_AT_in_symbLiteral3970); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_AT.add(AT493);

            // src/net/colar/netbeans/fan/antlr/Fan.g:491:21: ( id SP_COLON SP_COLON )?
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==ID) ) {
                int LA135_1 = input.LA(2);

                if ( (LA135_1==SP_COLON) ) {
                    int LA135_3 = input.LA(3);

                    if ( (LA135_3==SP_COLON) ) {
                        alt135=1;
                    }
                }
            }
            switch (alt135) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:491:22: id SP_COLON SP_COLON
                    {
                    pushFollow(FOLLOW_id_in_symbLiteral3973);
                    id494=id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_id.add(id494.getTree());
                    SP_COLON495=(Token)match(input,SP_COLON,FOLLOW_SP_COLON_in_symbLiteral3975); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SP_COLON.add(SP_COLON495);

                    SP_COLON496=(Token)match(input,SP_COLON,FOLLOW_SP_COLON_in_symbLiteral3977); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SP_COLON.add(SP_COLON496);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_symbLiteral3981);
            id497=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id497.getTree());

            }



            // AST REWRITE
            // elements: id, SP_COLON, id, AT, SP_COLON
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 492:5: -> ^( AST_SYMBOL AT ( id SP_COLON SP_COLON )? id )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:492:8: ^( AST_SYMBOL AT ( id SP_COLON SP_COLON )? id )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_SYMBOL, "AST_SYMBOL"), root_1);

                adaptor.addChild(root_1, stream_AT.nextNode());
                // src/net/colar/netbeans/fan/antlr/Fan.g:492:24: ( id SP_COLON SP_COLON )?
                if ( stream_id.hasNext()||stream_SP_COLON.hasNext()||stream_SP_COLON.hasNext() ) {
                    adaptor.addChild(root_1, stream_id.nextTree());
                    adaptor.addChild(root_1, stream_SP_COLON.nextNode());
                    adaptor.addChild(root_1, stream_SP_COLON.nextNode());

                }
                stream_id.reset();
                stream_SP_COLON.reset();
                stream_SP_COLON.reset();
                adaptor.addChild(root_1, stream_id.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 137, symbLiteral_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "symbLiteral"

    public static class namedSuper_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "namedSuper"
    // src/net/colar/netbeans/fan/antlr/Fan.g:493:1: namedSuper : ( simpleType DOT KW_SUPER ) -> ^( AST_NAMED_SUPER simpleType DOT KW_SUPER ) ;
    public final FanParser.namedSuper_return namedSuper() throws RecognitionException {
        FanParser.namedSuper_return retval = new FanParser.namedSuper_return();
        retval.start = input.LT(1);
        int namedSuper_StartIndex = input.index();
        Object root_0 = null;

        Token DOT499=null;
        Token KW_SUPER500=null;
        FanParser.simpleType_return simpleType498 = null;


        Object DOT499_tree=null;
        Object KW_SUPER500_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_KW_SUPER=new RewriteRuleTokenStream(adaptor,"token KW_SUPER");
        RewriteRuleSubtreeStream stream_simpleType=new RewriteRuleSubtreeStream(adaptor,"rule simpleType");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 138) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:493:13: ( ( simpleType DOT KW_SUPER ) -> ^( AST_NAMED_SUPER simpleType DOT KW_SUPER ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:493:15: ( simpleType DOT KW_SUPER )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:493:15: ( simpleType DOT KW_SUPER )
            // src/net/colar/netbeans/fan/antlr/Fan.g:493:16: simpleType DOT KW_SUPER
            {
            pushFollow(FOLLOW_simpleType_in_namedSuper4014);
            simpleType498=simpleType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_simpleType.add(simpleType498.getTree());
            DOT499=(Token)match(input,DOT,FOLLOW_DOT_in_namedSuper4016); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DOT.add(DOT499);

            KW_SUPER500=(Token)match(input,KW_SUPER,FOLLOW_KW_SUPER_in_namedSuper4018); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_SUPER.add(KW_SUPER500);


            }



            // AST REWRITE
            // elements: KW_SUPER, simpleType, DOT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 494:5: -> ^( AST_NAMED_SUPER simpleType DOT KW_SUPER )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:494:8: ^( AST_NAMED_SUPER simpleType DOT KW_SUPER )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_NAMED_SUPER, "AST_NAMED_SUPER"), root_1);

                adaptor.addChild(root_1, stream_simpleType.nextTree());
                adaptor.addChild(root_1, stream_DOT.nextNode());
                adaptor.addChild(root_1, stream_KW_SUPER.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 138, namedSuper_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "namedSuper"

    public static class list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "list"
    // src/net/colar/netbeans/fan/antlr/Fan.g:495:1: list : ( ( type {...}?)? sq_bracketL listItems sq_bracketR ) -> ^( AST_LIST type sq_bracketL listItems sq_bracketR ) ;
    public final FanParser.list_return list() throws RecognitionException {
        FanParser.list_return retval = new FanParser.list_return();
        retval.start = input.LT(1);
        int list_StartIndex = input.index();
        Object root_0 = null;

        FanParser.type_return type501 = null;

        FanParser.sq_bracketL_return sq_bracketL502 = null;

        FanParser.listItems_return listItems503 = null;

        FanParser.sq_bracketR_return sq_bracketR504 = null;


        RewriteRuleSubtreeStream stream_listItems=new RewriteRuleSubtreeStream(adaptor,"rule listItems");
        RewriteRuleSubtreeStream stream_sq_bracketR=new RewriteRuleSubtreeStream(adaptor,"rule sq_bracketR");
        RewriteRuleSubtreeStream stream_sq_bracketL=new RewriteRuleSubtreeStream(adaptor,"rule sq_bracketL");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 139) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:495:8: ( ( ( type {...}?)? sq_bracketL listItems sq_bracketR ) -> ^( AST_LIST type sq_bracketL listItems sq_bracketR ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:495:10: ( ( type {...}?)? sq_bracketL listItems sq_bracketR )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:495:10: ( ( type {...}?)? sq_bracketL listItems sq_bracketR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:495:11: ( type {...}?)? sq_bracketL listItems sq_bracketR
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:495:11: ( type {...}?)?
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( (LA136_0==SQ_BRACKET_L) ) {
                int LA136_1 = input.LA(2);

                if ( (synpred234_Fan()) ) {
                    alt136=1;
                }
            }
            else if ( (LA136_0==SP_PIPE||LA136_0==ID) ) {
                alt136=1;
            }
            switch (alt136) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:495:12: type {...}?
                    {
                    pushFollow(FOLLOW_type_in_list4046);
                    type501=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type501.getTree());
                    if ( !((notAfterEol())) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "list", "notAfterEol()");
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_sq_bracketL_in_list4052);
            sq_bracketL502=sq_bracketL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sq_bracketL.add(sq_bracketL502.getTree());
            pushFollow(FOLLOW_listItems_in_list4054);
            listItems503=listItems();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_listItems.add(listItems503.getTree());
            pushFollow(FOLLOW_sq_bracketR_in_list4056);
            sq_bracketR504=sq_bracketR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sq_bracketR.add(sq_bracketR504.getTree());

            }



            // AST REWRITE
            // elements: sq_bracketR, listItems, sq_bracketL, type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 496:5: -> ^( AST_LIST type sq_bracketL listItems sq_bracketR )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:496:8: ^( AST_LIST type sq_bracketL listItems sq_bracketR )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_LIST, "AST_LIST"), root_1);

                adaptor.addChild(root_1, stream_type.nextTree());
                adaptor.addChild(root_1, stream_sq_bracketL.nextTree());
                adaptor.addChild(root_1, stream_listItems.nextTree());
                adaptor.addChild(root_1, stream_sq_bracketR.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 139, list_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "list"

    public static class listItems_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "listItems"
    // src/net/colar/netbeans/fan/antlr/Fan.g:497:1: listItems : ( ( expr ( SP_COMMA expr )* ( SP_COMMA )? ) | SP_COMMA );
    public final FanParser.listItems_return listItems() throws RecognitionException {
        FanParser.listItems_return retval = new FanParser.listItems_return();
        retval.start = input.LT(1);
        int listItems_StartIndex = input.index();
        Object root_0 = null;

        Token SP_COMMA506=null;
        Token SP_COMMA508=null;
        Token SP_COMMA509=null;
        FanParser.expr_return expr505 = null;

        FanParser.expr_return expr507 = null;


        Object SP_COMMA506_tree=null;
        Object SP_COMMA508_tree=null;
        Object SP_COMMA509_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 140) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:497:12: ( ( expr ( SP_COMMA expr )* ( SP_COMMA )? ) | SP_COMMA )
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( ((LA139_0>=KW_THIS && LA139_0<=KW_SUPER)||(LA139_0>=KW_NULL && LA139_0<=KW_FALSE)||LA139_0==SP_PIPE||LA139_0==OP_CURRY||(LA139_0>=OP_PLUS && LA139_0<=OP_MULTI)||(LA139_0>=OP_BANG && LA139_0<=OP_TILDA)||(LA139_0>=ID && LA139_0<=AT)||(LA139_0>=NUMBER && LA139_0<=SQ_BRACKET_L)||LA139_0==PAR_L) ) {
                alt139=1;
            }
            else if ( (LA139_0==SP_COMMA) ) {
                alt139=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 139, 0, input);

                throw nvae;
            }
            switch (alt139) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:497:14: ( expr ( SP_COMMA expr )* ( SP_COMMA )? )
                    {
                    root_0 = (Object)adaptor.nil();

                    // src/net/colar/netbeans/fan/antlr/Fan.g:497:14: ( expr ( SP_COMMA expr )* ( SP_COMMA )? )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:497:15: expr ( SP_COMMA expr )* ( SP_COMMA )?
                    {
                    pushFollow(FOLLOW_expr_in_listItems4084);
                    expr505=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr505.getTree());
                    // src/net/colar/netbeans/fan/antlr/Fan.g:497:20: ( SP_COMMA expr )*
                    loop137:
                    do {
                        int alt137=2;
                        int LA137_0 = input.LA(1);

                        if ( (LA137_0==SP_COMMA) ) {
                            int LA137_1 = input.LA(2);

                            if ( ((LA137_1>=KW_THIS && LA137_1<=KW_SUPER)||(LA137_1>=KW_NULL && LA137_1<=KW_FALSE)||LA137_1==SP_PIPE||LA137_1==OP_CURRY||(LA137_1>=OP_PLUS && LA137_1<=OP_MULTI)||(LA137_1>=OP_BANG && LA137_1<=OP_TILDA)||(LA137_1>=ID && LA137_1<=AT)||(LA137_1>=NUMBER && LA137_1<=SQ_BRACKET_L)||LA137_1==PAR_L) ) {
                                alt137=1;
                            }


                        }


                        switch (alt137) {
                    	case 1 :
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:497:21: SP_COMMA expr
                    	    {
                    	    SP_COMMA506=(Token)match(input,SP_COMMA,FOLLOW_SP_COMMA_in_listItems4087); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    SP_COMMA506_tree = (Object)adaptor.create(SP_COMMA506);
                    	    adaptor.addChild(root_0, SP_COMMA506_tree);
                    	    }
                    	    pushFollow(FOLLOW_expr_in_listItems4089);
                    	    expr507=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr507.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop137;
                        }
                    } while (true);

                    // src/net/colar/netbeans/fan/antlr/Fan.g:497:38: ( SP_COMMA )?
                    int alt138=2;
                    int LA138_0 = input.LA(1);

                    if ( (LA138_0==SP_COMMA) ) {
                        alt138=1;
                    }
                    switch (alt138) {
                        case 1 :
                            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_COMMA
                            {
                            SP_COMMA508=(Token)match(input,SP_COMMA,FOLLOW_SP_COMMA_in_listItems4094); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            SP_COMMA508_tree = (Object)adaptor.create(SP_COMMA508);
                            adaptor.addChild(root_0, SP_COMMA508_tree);
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:497:51: SP_COMMA
                    {
                    root_0 = (Object)adaptor.nil();

                    SP_COMMA509=(Token)match(input,SP_COMMA,FOLLOW_SP_COMMA_in_listItems4100); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SP_COMMA509_tree = (Object)adaptor.create(SP_COMMA509);
                    adaptor.addChild(root_0, SP_COMMA509_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 140, listItems_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "listItems"

    public static class map_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "map"
    // src/net/colar/netbeans/fan/antlr/Fan.g:498:1: map : ( ( mapType {...}?)? sq_bracketL mapItems sq_bracketR ) -> ^( AST_MAP mapType sq_bracketL mapItems sq_bracketR ) ;
    public final FanParser.map_return map() throws RecognitionException {
        FanParser.map_return retval = new FanParser.map_return();
        retval.start = input.LT(1);
        int map_StartIndex = input.index();
        Object root_0 = null;

        FanParser.mapType_return mapType510 = null;

        FanParser.sq_bracketL_return sq_bracketL511 = null;

        FanParser.mapItems_return mapItems512 = null;

        FanParser.sq_bracketR_return sq_bracketR513 = null;


        RewriteRuleSubtreeStream stream_sq_bracketR=new RewriteRuleSubtreeStream(adaptor,"rule sq_bracketR");
        RewriteRuleSubtreeStream stream_sq_bracketL=new RewriteRuleSubtreeStream(adaptor,"rule sq_bracketL");
        RewriteRuleSubtreeStream stream_mapItems=new RewriteRuleSubtreeStream(adaptor,"rule mapItems");
        RewriteRuleSubtreeStream stream_mapType=new RewriteRuleSubtreeStream(adaptor,"rule mapType");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 141) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:498:7: ( ( ( mapType {...}?)? sq_bracketL mapItems sq_bracketR ) -> ^( AST_MAP mapType sq_bracketL mapItems sq_bracketR ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:498:9: ( ( mapType {...}?)? sq_bracketL mapItems sq_bracketR )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:498:9: ( ( mapType {...}?)? sq_bracketL mapItems sq_bracketR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:498:10: ( mapType {...}?)? sq_bracketL mapItems sq_bracketR
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:498:10: ( mapType {...}?)?
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==SQ_BRACKET_L) ) {
                int LA140_1 = input.LA(2);

                if ( (synpred238_Fan()) ) {
                    alt140=1;
                }
            }
            else if ( (LA140_0==SP_PIPE||LA140_0==ID) ) {
                alt140=1;
            }
            switch (alt140) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:498:11: mapType {...}?
                    {
                    pushFollow(FOLLOW_mapType_in_map4111);
                    mapType510=mapType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_mapType.add(mapType510.getTree());
                    if ( !((notAfterEol())) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "map", "notAfterEol()");
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_sq_bracketL_in_map4117);
            sq_bracketL511=sq_bracketL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sq_bracketL.add(sq_bracketL511.getTree());
            pushFollow(FOLLOW_mapItems_in_map4119);
            mapItems512=mapItems();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_mapItems.add(mapItems512.getTree());
            pushFollow(FOLLOW_sq_bracketR_in_map4121);
            sq_bracketR513=sq_bracketR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sq_bracketR.add(sq_bracketR513.getTree());

            }



            // AST REWRITE
            // elements: mapType, sq_bracketL, mapItems, sq_bracketR
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 499:5: -> ^( AST_MAP mapType sq_bracketL mapItems sq_bracketR )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:499:8: ^( AST_MAP mapType sq_bracketL mapItems sq_bracketR )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_MAP, "AST_MAP"), root_1);

                adaptor.addChild(root_1, stream_mapType.nextTree());
                adaptor.addChild(root_1, stream_sq_bracketL.nextTree());
                adaptor.addChild(root_1, stream_mapItems.nextTree());
                adaptor.addChild(root_1, stream_sq_bracketR.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 141, map_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "map"

    public static class mapItems_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mapItems"
    // src/net/colar/netbeans/fan/antlr/Fan.g:500:1: mapItems : ( ( mapPair ( SP_COMMA mapPair )* ( SP_COMMA )? ) | SP_COLON );
    public final FanParser.mapItems_return mapItems() throws RecognitionException {
        FanParser.mapItems_return retval = new FanParser.mapItems_return();
        retval.start = input.LT(1);
        int mapItems_StartIndex = input.index();
        Object root_0 = null;

        Token SP_COMMA515=null;
        Token SP_COMMA517=null;
        Token SP_COLON518=null;
        FanParser.mapPair_return mapPair514 = null;

        FanParser.mapPair_return mapPair516 = null;


        Object SP_COMMA515_tree=null;
        Object SP_COMMA517_tree=null;
        Object SP_COLON518_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 142) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:500:11: ( ( mapPair ( SP_COMMA mapPair )* ( SP_COMMA )? ) | SP_COLON )
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( ((LA143_0>=KW_THIS && LA143_0<=KW_SUPER)||(LA143_0>=KW_NULL && LA143_0<=KW_FALSE)||LA143_0==SP_PIPE||LA143_0==OP_CURRY||(LA143_0>=OP_PLUS && LA143_0<=OP_MULTI)||(LA143_0>=OP_BANG && LA143_0<=OP_TILDA)||(LA143_0>=ID && LA143_0<=AT)||(LA143_0>=NUMBER && LA143_0<=SQ_BRACKET_L)||LA143_0==PAR_L) ) {
                alt143=1;
            }
            else if ( (LA143_0==SP_COLON) ) {
                alt143=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 143, 0, input);

                throw nvae;
            }
            switch (alt143) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:500:13: ( mapPair ( SP_COMMA mapPair )* ( SP_COMMA )? )
                    {
                    root_0 = (Object)adaptor.nil();

                    // src/net/colar/netbeans/fan/antlr/Fan.g:500:13: ( mapPair ( SP_COMMA mapPair )* ( SP_COMMA )? )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:500:14: mapPair ( SP_COMMA mapPair )* ( SP_COMMA )?
                    {
                    pushFollow(FOLLOW_mapPair_in_mapItems4149);
                    mapPair514=mapPair();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, mapPair514.getTree());
                    // src/net/colar/netbeans/fan/antlr/Fan.g:500:22: ( SP_COMMA mapPair )*
                    loop141:
                    do {
                        int alt141=2;
                        int LA141_0 = input.LA(1);

                        if ( (LA141_0==SP_COMMA) ) {
                            int LA141_1 = input.LA(2);

                            if ( ((LA141_1>=KW_THIS && LA141_1<=KW_SUPER)||(LA141_1>=KW_NULL && LA141_1<=KW_FALSE)||LA141_1==SP_PIPE||LA141_1==OP_CURRY||(LA141_1>=OP_PLUS && LA141_1<=OP_MULTI)||(LA141_1>=OP_BANG && LA141_1<=OP_TILDA)||(LA141_1>=ID && LA141_1<=AT)||(LA141_1>=NUMBER && LA141_1<=SQ_BRACKET_L)||LA141_1==PAR_L) ) {
                                alt141=1;
                            }


                        }


                        switch (alt141) {
                    	case 1 :
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:500:23: SP_COMMA mapPair
                    	    {
                    	    SP_COMMA515=(Token)match(input,SP_COMMA,FOLLOW_SP_COMMA_in_mapItems4152); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    SP_COMMA515_tree = (Object)adaptor.create(SP_COMMA515);
                    	    adaptor.addChild(root_0, SP_COMMA515_tree);
                    	    }
                    	    pushFollow(FOLLOW_mapPair_in_mapItems4154);
                    	    mapPair516=mapPair();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, mapPair516.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop141;
                        }
                    } while (true);

                    // src/net/colar/netbeans/fan/antlr/Fan.g:500:42: ( SP_COMMA )?
                    int alt142=2;
                    int LA142_0 = input.LA(1);

                    if ( (LA142_0==SP_COMMA) ) {
                        alt142=1;
                    }
                    switch (alt142) {
                        case 1 :
                            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_COMMA
                            {
                            SP_COMMA517=(Token)match(input,SP_COMMA,FOLLOW_SP_COMMA_in_mapItems4158); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            SP_COMMA517_tree = (Object)adaptor.create(SP_COMMA517);
                            adaptor.addChild(root_0, SP_COMMA517_tree);
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:500:55: SP_COLON
                    {
                    root_0 = (Object)adaptor.nil();

                    SP_COLON518=(Token)match(input,SP_COLON,FOLLOW_SP_COLON_in_mapItems4164); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SP_COLON518_tree = (Object)adaptor.create(SP_COLON518);
                    adaptor.addChild(root_0, SP_COLON518_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 142, mapItems_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "mapItems"

    public static class mapPair_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mapPair"
    // src/net/colar/netbeans/fan/antlr/Fan.g:501:1: mapPair : expr SP_COLON expr ;
    public final FanParser.mapPair_return mapPair() throws RecognitionException {
        FanParser.mapPair_return retval = new FanParser.mapPair_return();
        retval.start = input.LT(1);
        int mapPair_StartIndex = input.index();
        Object root_0 = null;

        Token SP_COLON520=null;
        FanParser.expr_return expr519 = null;

        FanParser.expr_return expr521 = null;


        Object SP_COLON520_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 143) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:501:10: ( expr SP_COLON expr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:501:12: expr SP_COLON expr
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expr_in_mapPair4172);
            expr519=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr519.getTree());
            SP_COLON520=(Token)match(input,SP_COLON,FOLLOW_SP_COLON_in_mapPair4174); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SP_COLON520_tree = (Object)adaptor.create(SP_COLON520);
            adaptor.addChild(root_0, SP_COLON520_tree);
            }
            pushFollow(FOLLOW_expr_in_mapPair4176);
            expr521=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr521.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 143, mapPair_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "mapPair"

    public static class simple_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "simple"
    // src/net/colar/netbeans/fan/antlr/Fan.g:502:1: simple : type parL expr parR ;
    public final FanParser.simple_return simple() throws RecognitionException {
        FanParser.simple_return retval = new FanParser.simple_return();
        retval.start = input.LT(1);
        int simple_StartIndex = input.index();
        Object root_0 = null;

        FanParser.type_return type522 = null;

        FanParser.parL_return parL523 = null;

        FanParser.expr_return expr524 = null;

        FanParser.parR_return parR525 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 144) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:502:9: ( type parL expr parR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:502:11: type parL expr parR
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_type_in_simple4184);
            type522=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type522.getTree());
            pushFollow(FOLLOW_parL_in_simple4186);
            parL523=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parL523.getTree());
            pushFollow(FOLLOW_expr_in_simple4188);
            expr524=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr524.getTree());
            pushFollow(FOLLOW_parR_in_simple4190);
            parR525=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parR525.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 144, simple_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "simple"

    public static class docs_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "docs"
    // src/net/colar/netbeans/fan/antlr/Fan.g:504:1: docs : d= ( ( DOC )* ) -> ^( AST_DOCS ( $d)? ) ;
    public final FanParser.docs_return docs() throws RecognitionException {
        FanParser.docs_return retval = new FanParser.docs_return();
        retval.start = input.LT(1);
        int docs_StartIndex = input.index();
        Object root_0 = null;

        Token d=null;
        Token DOC526=null;

        Object d_tree=null;
        Object DOC526_tree=null;
        RewriteRuleTokenStream stream_DOC=new RewriteRuleTokenStream(adaptor,"token DOC");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 145) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:504:7: (d= ( ( DOC )* ) -> ^( AST_DOCS ( $d)? ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:504:9: d= ( ( DOC )* )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:504:11: ( ( DOC )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:504:12: ( DOC )*
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:504:12: ( DOC )*
            loop144:
            do {
                int alt144=2;
                int LA144_0 = input.LA(1);

                if ( (LA144_0==DOC) ) {
                    int LA144_2 = input.LA(2);

                    if ( (synpred242_Fan()) ) {
                        alt144=1;
                    }


                }


                switch (alt144) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: DOC
            	    {
            	    DOC526=(Token)match(input,DOC,FOLLOW_DOC_in_docs4202); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOC.add(DOC526);


            	    }
            	    break;

            	default :
            	    break loop144;
                }
            } while (true);


            }



            // AST REWRITE
            // elements: d
            // token labels: d
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_d=new RewriteRuleTokenStream(adaptor,"token d",d);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 504:18: -> ^( AST_DOCS ( $d)? )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:504:21: ^( AST_DOCS ( $d)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_DOCS, "AST_DOCS"), root_1);

                // src/net/colar/netbeans/fan/antlr/Fan.g:504:32: ( $d)?
                if ( stream_d.hasNext() ) {
                    adaptor.addChild(root_1, stream_d.nextNode());

                }
                stream_d.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 145, docs_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "docs"

    public static class number_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "number"
    // src/net/colar/netbeans/fan/antlr/Fan.g:506:1: number : ( OP_MINUS )? NUMBER ;
    public final FanParser.number_return number() throws RecognitionException {
        FanParser.number_return retval = new FanParser.number_return();
        retval.start = input.LT(1);
        int number_StartIndex = input.index();
        Object root_0 = null;

        Token OP_MINUS527=null;
        Token NUMBER528=null;

        Object OP_MINUS527_tree=null;
        Object NUMBER528_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 146) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:506:9: ( ( OP_MINUS )? NUMBER )
            // src/net/colar/netbeans/fan/antlr/Fan.g:506:12: ( OP_MINUS )? NUMBER
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:506:12: ( OP_MINUS )?
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( (LA145_0==OP_MINUS) ) {
                alt145=1;
            }
            switch (alt145) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: OP_MINUS
                    {
                    OP_MINUS527=(Token)match(input,OP_MINUS,FOLLOW_OP_MINUS_in_number4224); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OP_MINUS527_tree = (Object)adaptor.create(OP_MINUS527);
                    adaptor.addChild(root_0, OP_MINUS527_tree);
                    }

                    }
                    break;

            }

            NUMBER528=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_number4227); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NUMBER528_tree = (Object)adaptor.create(NUMBER528);
            adaptor.addChild(root_0, NUMBER528_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 146, number_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "number"

    public static class facet_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "facet"
    // src/net/colar/netbeans/fan/antlr/Fan.g:507:1: facet : AT id ( AS_EQUAL expr )? ;
    public final FanParser.facet_return facet() throws RecognitionException {
        FanParser.facet_return retval = new FanParser.facet_return();
        retval.start = input.LT(1);
        int facet_StartIndex = input.index();
        Object root_0 = null;

        Token AT529=null;
        Token AS_EQUAL531=null;
        FanParser.id_return id530 = null;

        FanParser.expr_return expr532 = null;


        Object AT529_tree=null;
        Object AS_EQUAL531_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 147) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:507:8: ( AT id ( AS_EQUAL expr )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:507:10: AT id ( AS_EQUAL expr )?
            {
            root_0 = (Object)adaptor.nil();

            AT529=(Token)match(input,AT,FOLLOW_AT_in_facet4235); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            AT529_tree = (Object)adaptor.create(AT529);
            adaptor.addChild(root_0, AT529_tree);
            }
            pushFollow(FOLLOW_id_in_facet4237);
            id530=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id530.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:507:16: ( AS_EQUAL expr )?
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==AS_EQUAL) ) {
                alt146=1;
            }
            switch (alt146) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:507:17: AS_EQUAL expr
                    {
                    AS_EQUAL531=(Token)match(input,AS_EQUAL,FOLLOW_AS_EQUAL_in_facet4240); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AS_EQUAL531_tree = (Object)adaptor.create(AS_EQUAL531);
                    adaptor.addChild(root_0, AS_EQUAL531_tree);
                    }
                    pushFollow(FOLLOW_expr_in_facet4242);
                    expr532=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr532.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 147, facet_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "facet"

    public static class eos_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "eos"
    // src/net/colar/netbeans/fan/antlr/Fan.g:510:1: eos : ( SP_SEMI | {...}?);
    public final FanParser.eos_return eos() throws RecognitionException {
        FanParser.eos_return retval = new FanParser.eos_return();
        retval.start = input.LT(1);
        int eos_StartIndex = input.index();
        Object root_0 = null;

        Token SP_SEMI533=null;

        Object SP_SEMI533_tree=null;

        paraphrase.push("Semicolumn or LineBreak");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 148) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:512:3: ( SP_SEMI | {...}?)
            int alt147=2;
            int LA147_0 = input.LA(1);

            if ( (LA147_0==SP_SEMI) ) {
                int LA147_1 = input.LA(2);

                if ( (synpred245_Fan()) ) {
                    alt147=1;
                }
                else if ( ((lookupNL())) ) {
                    alt147=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 147, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA147_0==EOF||(LA147_0>=KW_BREAK && LA147_0<=KW_USING)||(LA147_0>=KW_RD_ONLY && LA147_0<=KW_FINAL)||(LA147_0>=KW_CLASS && LA147_0<=KW_ELSE)||(LA147_0>=KW_NULL && LA147_0<=KW_FALSE)||LA147_0==BRACKET_R||LA147_0==SP_COMMA||LA147_0==SP_PIPE||LA147_0==OP_CURRY||(LA147_0>=OP_PLUS && LA147_0<=OP_MULTI)||(LA147_0>=OP_BANG && LA147_0<=OP_TILDA)||(LA147_0>=ID && LA147_0<=SQ_BRACKET_L)||LA147_0==PAR_L) ) {
                alt147=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 147, 0, input);

                throw nvae;
            }
            switch (alt147) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:512:5: SP_SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    SP_SEMI533=(Token)match(input,SP_SEMI,FOLLOW_SP_SEMI_in_eos4264); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SP_SEMI533_tree = (Object)adaptor.create(SP_SEMI533);
                    adaptor.addChild(root_0, SP_SEMI533_tree);
                    }

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:512:15: {...}?
                    {
                    root_0 = (Object)adaptor.nil();

                    if ( !((lookupNL())) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "eos", "lookupNL()");
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 148, eos_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "eos"

    public static class id_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "id"
    // src/net/colar/netbeans/fan/antlr/Fan.g:514:1: id : ID -> ^( AST_ID ID ) ;
    public final FanParser.id_return id() throws RecognitionException {
        FanParser.id_return retval = new FanParser.id_return();
        retval.start = input.LT(1);
        int id_StartIndex = input.index();
        Object root_0 = null;

        Token ID534=null;

        Object ID534_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        paraphrase.push("Identifier");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 149) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:516:3: ( ID -> ^( AST_ID ID ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:516:6: ID
            {
            ID534=(Token)match(input,ID,FOLLOW_ID_in_id4288); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID534);



            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 516:9: -> ^( AST_ID ID )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:516:12: ^( AST_ID ID )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_ID, "AST_ID"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 149, id_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "id"

    public static class getter_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "getter"
    // src/net/colar/netbeans/fan/antlr/Fan.g:522:1: getter : t= ID {...}?;
    public final FanParser.getter_return getter() throws RecognitionException {
        FanParser.getter_return retval = new FanParser.getter_return();
        retval.start = input.LT(1);
        int getter_StartIndex = input.index();
        Object root_0 = null;

        Token t=null;

        Object t_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 150) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:522:10: (t= ID {...}?)
            // src/net/colar/netbeans/fan/antlr/Fan.g:522:12: t= ID {...}?
            {
            root_0 = (Object)adaptor.nil();

            t=(Token)match(input,ID,FOLLOW_ID_in_getter4309); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            t_tree = (Object)adaptor.create(t);
            adaptor.addChild(root_0, t_tree);
            }
            if ( !((t.getText().equals("get"))) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "getter", "t.getText().equals(\"get\")");
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 150, getter_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "getter"

    public static class setter_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "setter"
    // src/net/colar/netbeans/fan/antlr/Fan.g:523:1: setter : t= ID {...}?;
    public final FanParser.setter_return setter() throws RecognitionException {
        FanParser.setter_return retval = new FanParser.setter_return();
        retval.start = input.LT(1);
        int setter_StartIndex = input.index();
        Object root_0 = null;

        Token t=null;

        Object t_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 151) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:523:10: (t= ID {...}?)
            // src/net/colar/netbeans/fan/antlr/Fan.g:523:12: t= ID {...}?
            {
            root_0 = (Object)adaptor.nil();

            t=(Token)match(input,ID,FOLLOW_ID_in_setter4322); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            t_tree = (Object)adaptor.create(t);
            adaptor.addChild(root_0, t_tree);
            }
            if ( !((t.getText().equals("set"))) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "setter", "t.getText().equals(\"set\")");
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 151, setter_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "setter"

    public static class pod_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pod"
    // src/net/colar/netbeans/fan/antlr/Fan.g:524:1: pod : t= ID {...}?;
    public final FanParser.pod_return pod() throws RecognitionException {
        FanParser.pod_return retval = new FanParser.pod_return();
        retval.start = input.LT(1);
        int pod_StartIndex = input.index();
        Object root_0 = null;

        Token t=null;

        Object t_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 152) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:524:8: (t= ID {...}?)
            // src/net/colar/netbeans/fan/antlr/Fan.g:524:10: t= ID {...}?
            {
            root_0 = (Object)adaptor.nil();

            t=(Token)match(input,ID,FOLLOW_ID_in_pod4336); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            t_tree = (Object)adaptor.create(t);
            adaptor.addChild(root_0, t_tree);
            }
            if ( !((t.getText().equals("pod"))) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "pod", "t.getText().equals(\"pod\")");
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 152, pod_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "pod"

    public static class bracketL_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bracketL"
    // src/net/colar/netbeans/fan/antlr/Fan.g:527:1: bracketL : BRACKET_L ;
    public final FanParser.bracketL_return bracketL() throws RecognitionException {
        FanParser.bracketL_return retval = new FanParser.bracketL_return();
        retval.start = input.LT(1);
        int bracketL_StartIndex = input.index();
        Object root_0 = null;

        Token BRACKET_L535=null;

        Object BRACKET_L535_tree=null;

        paraphrase.push("{");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 153) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:529:3: ( BRACKET_L )
            // src/net/colar/netbeans/fan/antlr/Fan.g:529:5: BRACKET_L
            {
            root_0 = (Object)adaptor.nil();

            BRACKET_L535=(Token)match(input,BRACKET_L,FOLLOW_BRACKET_L_in_bracketL4358); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BRACKET_L535_tree = (Object)adaptor.create(BRACKET_L535);
            adaptor.addChild(root_0, BRACKET_L535_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 153, bracketL_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "bracketL"

    public static class bracketR_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bracketR"
    // src/net/colar/netbeans/fan/antlr/Fan.g:530:1: bracketR : BRACKET_R ;
    public final FanParser.bracketR_return bracketR() throws RecognitionException {
        FanParser.bracketR_return retval = new FanParser.bracketR_return();
        retval.start = input.LT(1);
        int bracketR_StartIndex = input.index();
        Object root_0 = null;

        Token BRACKET_R536=null;

        Object BRACKET_R536_tree=null;

        paraphrase.push("}");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 154) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:532:3: ( BRACKET_R )
            // src/net/colar/netbeans/fan/antlr/Fan.g:532:5: BRACKET_R
            {
            root_0 = (Object)adaptor.nil();

            BRACKET_R536=(Token)match(input,BRACKET_R,FOLLOW_BRACKET_R_in_bracketR4376); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BRACKET_R536_tree = (Object)adaptor.create(BRACKET_R536);
            adaptor.addChild(root_0, BRACKET_R536_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 154, bracketR_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "bracketR"

    public static class sq_bracketL_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sq_bracketL"
    // src/net/colar/netbeans/fan/antlr/Fan.g:533:1: sq_bracketL : SQ_BRACKET_L ;
    public final FanParser.sq_bracketL_return sq_bracketL() throws RecognitionException {
        FanParser.sq_bracketL_return retval = new FanParser.sq_bracketL_return();
        retval.start = input.LT(1);
        int sq_bracketL_StartIndex = input.index();
        Object root_0 = null;

        Token SQ_BRACKET_L537=null;

        Object SQ_BRACKET_L537_tree=null;

        paraphrase.push("[");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 155) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:535:3: ( SQ_BRACKET_L )
            // src/net/colar/netbeans/fan/antlr/Fan.g:535:5: SQ_BRACKET_L
            {
            root_0 = (Object)adaptor.nil();

            SQ_BRACKET_L537=(Token)match(input,SQ_BRACKET_L,FOLLOW_SQ_BRACKET_L_in_sq_bracketL4394); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SQ_BRACKET_L537_tree = (Object)adaptor.create(SQ_BRACKET_L537);
            adaptor.addChild(root_0, SQ_BRACKET_L537_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 155, sq_bracketL_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "sq_bracketL"

    public static class sq_bracketR_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sq_bracketR"
    // src/net/colar/netbeans/fan/antlr/Fan.g:536:1: sq_bracketR : SQ_BRACKET_R ;
    public final FanParser.sq_bracketR_return sq_bracketR() throws RecognitionException {
        FanParser.sq_bracketR_return retval = new FanParser.sq_bracketR_return();
        retval.start = input.LT(1);
        int sq_bracketR_StartIndex = input.index();
        Object root_0 = null;

        Token SQ_BRACKET_R538=null;

        Object SQ_BRACKET_R538_tree=null;

        paraphrase.push("]");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 156) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:538:3: ( SQ_BRACKET_R )
            // src/net/colar/netbeans/fan/antlr/Fan.g:538:5: SQ_BRACKET_R
            {
            root_0 = (Object)adaptor.nil();

            SQ_BRACKET_R538=(Token)match(input,SQ_BRACKET_R,FOLLOW_SQ_BRACKET_R_in_sq_bracketR4412); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SQ_BRACKET_R538_tree = (Object)adaptor.create(SQ_BRACKET_R538);
            adaptor.addChild(root_0, SQ_BRACKET_R538_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 156, sq_bracketR_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "sq_bracketR"

    public static class parL_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parL"
    // src/net/colar/netbeans/fan/antlr/Fan.g:539:1: parL : PAR_L ;
    public final FanParser.parL_return parL() throws RecognitionException {
        FanParser.parL_return retval = new FanParser.parL_return();
        retval.start = input.LT(1);
        int parL_StartIndex = input.index();
        Object root_0 = null;

        Token PAR_L539=null;

        Object PAR_L539_tree=null;

        paraphrase.push("(");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 157) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:541:3: ( PAR_L )
            // src/net/colar/netbeans/fan/antlr/Fan.g:541:5: PAR_L
            {
            root_0 = (Object)adaptor.nil();

            PAR_L539=(Token)match(input,PAR_L,FOLLOW_PAR_L_in_parL4430); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            PAR_L539_tree = (Object)adaptor.create(PAR_L539);
            adaptor.addChild(root_0, PAR_L539_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 157, parL_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "parL"

    public static class parR_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parR"
    // src/net/colar/netbeans/fan/antlr/Fan.g:542:1: parR : PAR_R ;
    public final FanParser.parR_return parR() throws RecognitionException {
        FanParser.parR_return retval = new FanParser.parR_return();
        retval.start = input.LT(1);
        int parR_StartIndex = input.index();
        Object root_0 = null;

        Token PAR_R540=null;

        Object PAR_R540_tree=null;

        paraphrase.push(")");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 158) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:544:3: ( PAR_R )
            // src/net/colar/netbeans/fan/antlr/Fan.g:544:5: PAR_R
            {
            root_0 = (Object)adaptor.nil();

            PAR_R540=(Token)match(input,PAR_R,FOLLOW_PAR_R_in_parR4448); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            PAR_R540_tree = (Object)adaptor.create(PAR_R540);
            adaptor.addChild(root_0, PAR_R540_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 158, parR_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "parR"

    // $ANTLR start synpred2_Fan
    public final void synpred2_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:253:19: ( podDef )
        // src/net/colar/netbeans/fan/antlr/Fan.g:253:19: podDef
        {
        pushFollow(FOLLOW_podDef_in_synpred2_Fan469);
        podDef();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_Fan

    // $ANTLR start synpred17_Fan
    public final void synpred17_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:278:17: ( facet )
        // src/net/colar/netbeans/fan/antlr/Fan.g:278:17: facet
        {
        pushFollow(FOLLOW_facet_in_synpred17_Fan835);
        facet();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred17_Fan

    // $ANTLR start synpred19_Fan
    public final void synpred19_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:278:25: ( ( classFlags )* KW_CLASS )
        // src/net/colar/netbeans/fan/antlr/Fan.g:278:26: ( classFlags )* KW_CLASS
        {
        // src/net/colar/netbeans/fan/antlr/Fan.g:278:26: ( classFlags )*
        loop148:
        do {
            int alt148=2;
            int LA148_0 = input.LA(1);

            if ( ((LA148_0>=KW_CONST && LA148_0<=KW_STATIC)||LA148_0==KW_FINAL||(LA148_0>=KW_ABSTRACT && LA148_0<=KW_INTERNAL)) ) {
                alt148=1;
            }


            switch (alt148) {
        	case 1 :
        	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: classFlags
        	    {
        	    pushFollow(FOLLOW_classFlags_in_synpred19_Fan840);
        	    classFlags();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop148;
            }
        } while (true);

        match(input,KW_CLASS,FOLLOW_KW_CLASS_in_synpred19_Fan843); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred19_Fan

    // $ANTLR start synpred21_Fan
    public final void synpred21_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:279:4: ( ( protection )? KW_ENUM )
        // src/net/colar/netbeans/fan/antlr/Fan.g:279:5: ( protection )? KW_ENUM
        {
        // src/net/colar/netbeans/fan/antlr/Fan.g:279:5: ( protection )?
        int alt149=2;
        int LA149_0 = input.LA(1);

        if ( ((LA149_0>=KW_PRIVATE && LA149_0<=KW_INTERNAL)) ) {
            alt149=1;
        }
        switch (alt149) {
            case 1 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: protection
                {
                pushFollow(FOLLOW_protection_in_synpred21_Fan854);
                protection();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        match(input,KW_ENUM,FOLLOW_KW_ENUM_in_synpred21_Fan857); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred21_Fan

    // $ANTLR start synpred48_Fan
    public final void synpred48_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:307:28: ( SP_QMARK )
        // src/net/colar/netbeans/fan/antlr/Fan.g:307:28: SP_QMARK
        {
        match(input,SP_QMARK,FOLLOW_SP_QMARK_in_synpred48_Fan1374); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred48_Fan

    // $ANTLR start synpred49_Fan
    public final void synpred49_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:307:49: ( SP_QMARK )
        // src/net/colar/netbeans/fan/antlr/Fan.g:307:49: SP_QMARK
        {
        match(input,SP_QMARK,FOLLOW_SP_QMARK_in_synpred49_Fan1380); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred49_Fan

    // $ANTLR start synpred50_Fan
    public final void synpred50_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:307:39: ( LIST_TYPE ( SP_QMARK )? )
        // src/net/colar/netbeans/fan/antlr/Fan.g:307:39: LIST_TYPE ( SP_QMARK )?
        {
        match(input,LIST_TYPE,FOLLOW_LIST_TYPE_in_synpred50_Fan1378); if (state.failed) return ;
        // src/net/colar/netbeans/fan/antlr/Fan.g:307:49: ( SP_QMARK )?
        int alt151=2;
        int LA151_0 = input.LA(1);

        if ( (LA151_0==SP_QMARK) ) {
            alt151=1;
        }
        switch (alt151) {
            case 1 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_QMARK
                {
                match(input,SP_QMARK,FOLLOW_SP_QMARK_in_synpred50_Fan1380); if (state.failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred50_Fan

    // $ANTLR start synpred51_Fan
    public final void synpred51_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:308:12: ( mapType )
        // src/net/colar/netbeans/fan/antlr/Fan.g:308:12: mapType
        {
        pushFollow(FOLLOW_mapType_in_synpred51_Fan1391);
        mapType();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred51_Fan

    // $ANTLR start synpred58_Fan
    public final void synpred58_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:313:6: ({...}? SP_COLON {...}? type )
        // src/net/colar/netbeans/fan/antlr/Fan.g:313:6: {...}? SP_COLON {...}? type
        {
        if ( !((notAfterEol())) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred58_Fan", "notAfterEol()");
        }
        match(input,SP_COLON,FOLLOW_SP_COLON_in_synpred58_Fan1459); if (state.failed) return ;
        if ( !((notAfterEol())) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred58_Fan", "notAfterEol()");
        }
        pushFollow(FOLLOW_type_in_synpred58_Fan1463);
        type();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred58_Fan

    // $ANTLR start synpred59_Fan
    public final void synpred59_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:313:56: ( sq_bracketR )
        // src/net/colar/netbeans/fan/antlr/Fan.g:313:56: sq_bracketR
        {
        pushFollow(FOLLOW_sq_bracketR_in_synpred59_Fan1467);
        sq_bracketR();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred59_Fan

    // $ANTLR start synpred61_Fan
    public final void synpred61_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:316:43: ( OP_ARROW )
        // src/net/colar/netbeans/fan/antlr/Fan.g:316:44: OP_ARROW
        {
        match(input,OP_ARROW,FOLLOW_OP_ARROW_in_synpred61_Fan1510); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred61_Fan

    // $ANTLR start synpred63_Fan
    public final void synpred63_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:316:74: ( OP_ARROW )
        // src/net/colar/netbeans/fan/antlr/Fan.g:316:75: OP_ARROW
        {
        match(input,OP_ARROW,FOLLOW_OP_ARROW_in_synpred63_Fan1522); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred63_Fan

    // $ANTLR start synpred64_Fan
    public final void synpred64_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:317:25: ( type )
        // src/net/colar/netbeans/fan/antlr/Fan.g:317:25: type
        {
        pushFollow(FOLLOW_type_in_synpred64_Fan1538);
        type();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred64_Fan

    // $ANTLR start synpred66_Fan
    public final void synpred66_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:319:11: ( formalFull )
        // src/net/colar/netbeans/fan/antlr/Fan.g:319:11: formalFull
        {
        pushFollow(FOLLOW_formalFull_in_synpred66_Fan1564);
        formalFull();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred66_Fan

    // $ANTLR start synpred67_Fan
    public final void synpred67_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:319:24: ( formalTypeOnly )
        // src/net/colar/netbeans/fan/antlr/Fan.g:319:24: formalTypeOnly
        {
        pushFollow(FOLLOW_formalTypeOnly_in_synpred67_Fan1568);
        formalTypeOnly();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred67_Fan

    // $ANTLR start synpred68_Fan
    public final void synpred68_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:323:13: ( KW_STATIC bracketL )
        // src/net/colar/netbeans/fan/antlr/Fan.g:323:14: KW_STATIC bracketL
        {
        match(input,KW_STATIC,FOLLOW_KW_STATIC_in_synpred68_Fan1616); if (state.failed) return ;
        pushFollow(FOLLOW_bracketL_in_synpred68_Fan1618);
        bracketL();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred68_Fan

    // $ANTLR start synpred69_Fan
    public final void synpred69_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:324:11: ( facet )
        // src/net/colar/netbeans/fan/antlr/Fan.g:324:11: facet
        {
        pushFollow(FOLLOW_facet_in_synpred69_Fan1632);
        facet();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred69_Fan

    // $ANTLR start synpred71_Fan
    public final void synpred71_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:326:7: ( ( ctorFlags )* KW_NEW )
        // src/net/colar/netbeans/fan/antlr/Fan.g:326:8: ( ctorFlags )* KW_NEW
        {
        // src/net/colar/netbeans/fan/antlr/Fan.g:326:8: ( ctorFlags )*
        loop154:
        do {
            int alt154=2;
            int LA154_0 = input.LA(1);

            if ( ((LA154_0>=KW_PRIVATE && LA154_0<=KW_INTERNAL)) ) {
                alt154=1;
            }


            switch (alt154) {
        	case 1 :
        	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: ctorFlags
        	    {
        	    pushFollow(FOLLOW_ctorFlags_in_synpred71_Fan1649);
        	    ctorFlags();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop154;
            }
        } while (true);

        match(input,KW_NEW,FOLLOW_KW_NEW_in_synpred71_Fan1652); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred71_Fan

    // $ANTLR start synpred74_Fan
    public final void synpred74_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:327:7: ( ( methodFlags )* ( type | KW_VOID ) id parL )
        // src/net/colar/netbeans/fan/antlr/Fan.g:327:8: ( methodFlags )* ( type | KW_VOID ) id parL
        {
        // src/net/colar/netbeans/fan/antlr/Fan.g:327:8: ( methodFlags )*
        loop155:
        do {
            int alt155=2;
            int LA155_0 = input.LA(1);

            if ( ((LA155_0>=KW_STATIC && LA155_0<=KW_NATIVE)||(LA155_0>=KW_OVERRIDE && LA155_0<=KW_FINAL)||(LA155_0>=KW_ABSTRACT && LA155_0<=KW_INTERNAL)||LA155_0==KW_ONCE) ) {
                alt155=1;
            }


            switch (alt155) {
        	case 1 :
        	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: methodFlags
        	    {
        	    pushFollow(FOLLOW_methodFlags_in_synpred74_Fan1666);
        	    methodFlags();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop155;
            }
        } while (true);

        // src/net/colar/netbeans/fan/antlr/Fan.g:327:21: ( type | KW_VOID )
        int alt156=2;
        int LA156_0 = input.LA(1);

        if ( (LA156_0==SP_PIPE||LA156_0==ID||LA156_0==SQ_BRACKET_L) ) {
            alt156=1;
        }
        else if ( (LA156_0==KW_VOID) ) {
            alt156=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 156, 0, input);

            throw nvae;
        }
        switch (alt156) {
            case 1 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:327:22: type
                {
                pushFollow(FOLLOW_type_in_synpred74_Fan1670);
                type();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:327:29: KW_VOID
                {
                match(input,KW_VOID,FOLLOW_KW_VOID_in_synpred74_Fan1674); if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_id_in_synpred74_Fan1677);
        id();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_parL_in_synpred74_Fan1679);
        parL();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred74_Fan

    // $ANTLR start synpred78_Fan
    public final void synpred78_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:335:29: ( getter )
        // src/net/colar/netbeans/fan/antlr/Fan.g:335:29: getter
        {
        pushFollow(FOLLOW_getter_in_synpred78_Fan1764);
        getter();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred78_Fan

    // $ANTLR start synpred80_Fan
    public final void synpred80_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:335:55: ( block )
        // src/net/colar/netbeans/fan/antlr/Fan.g:335:55: block
        {
        pushFollow(FOLLOW_block_in_synpred80_Fan1774);
        block();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred80_Fan

    // $ANTLR start synpred83_Fan
    public final void synpred83_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:338:12: ( type id )
        // src/net/colar/netbeans/fan/antlr/Fan.g:338:13: type id
        {
        pushFollow(FOLLOW_type_in_synpred83_Fan1821);
        type();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_id_in_synpred83_Fan1823);
        id();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred83_Fan

    // $ANTLR start synpred106_Fan
    public final void synpred106_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:351:15: ( multiStmt )
        // src/net/colar/netbeans/fan/antlr/Fan.g:351:16: multiStmt
        {
        pushFollow(FOLLOW_multiStmt_in_synpred106_Fan2105);
        multiStmt();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred106_Fan

    // $ANTLR start synpred115_Fan
    public final void synpred115_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:363:6: ( bracketL )
        // src/net/colar/netbeans/fan/antlr/Fan.g:363:7: bracketL
        {
        pushFollow(FOLLOW_bracketL_in_synpred115_Fan2299);
        bracketL();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred115_Fan

    // $ANTLR start synpred126_Fan
    public final void synpred126_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:369:22: ( exprStmt )
        // src/net/colar/netbeans/fan/antlr/Fan.g:369:22: exprStmt
        {
        pushFollow(FOLLOW_exprStmt_in_synpred126_Fan2396);
        exprStmt();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred126_Fan

    // $ANTLR start synpred127_Fan
    public final void synpred127_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:371:15: ( stmt )
        // src/net/colar/netbeans/fan/antlr/Fan.g:371:15: stmt
        {
        pushFollow(FOLLOW_stmt_in_synpred127_Fan2413);
        stmt();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred127_Fan

    // $ANTLR start synpred131_Fan
    public final void synpred131_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:381:6: ( KW_ELSE block )
        // src/net/colar/netbeans/fan/antlr/Fan.g:381:6: KW_ELSE block
        {
        match(input,KW_ELSE,FOLLOW_KW_ELSE_in_synpred131_Fan2497); if (state.failed) return ;
        pushFollow(FOLLOW_block_in_synpred131_Fan2499);
        block();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred131_Fan

    // $ANTLR start synpred132_Fan
    public final void synpred132_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:382:23: ( eos )
        // src/net/colar/netbeans/fan/antlr/Fan.g:382:23: eos
        {
        pushFollow(FOLLOW_eos_in_synpred132_Fan2511);
        eos();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred132_Fan

    // $ANTLR start synpred135_Fan
    public final void synpred135_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:386:18: ( bracketL )
        // src/net/colar/netbeans/fan/antlr/Fan.g:386:19: bracketL
        {
        pushFollow(FOLLOW_bracketL_in_synpred135_Fan2585);
        bracketL();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred135_Fan

    // $ANTLR start synpred136_Fan
    public final void synpred136_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:386:52: ( KW_CATCH )
        // src/net/colar/netbeans/fan/antlr/Fan.g:386:53: KW_CATCH
        {
        match(input,KW_CATCH,FOLLOW_KW_CATCH_in_synpred136_Fan2597); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred136_Fan

    // $ANTLR start synpred137_Fan
    public final void synpred137_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:386:75: ( KW_FINALLY )
        // src/net/colar/netbeans/fan/antlr/Fan.g:386:76: KW_FINALLY
        {
        match(input,KW_FINALLY,FOLLOW_KW_FINALLY_in_synpred137_Fan2606); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred137_Fan

    // $ANTLR start synpred139_Fan
    public final void synpred139_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:391:12: ( forInitDef )
        // src/net/colar/netbeans/fan/antlr/Fan.g:391:12: forInitDef
        {
        pushFollow(FOLLOW_forInitDef_in_synpred139_Fan2671);
        forInitDef();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred139_Fan

    // $ANTLR start synpred141_Fan
    public final void synpred141_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:394:21: ( catchDef )
        // src/net/colar/netbeans/fan/antlr/Fan.g:394:21: catchDef
        {
        pushFollow(FOLLOW_catchDef_in_synpred141_Fan2700);
        catchDef();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred141_Fan

    // $ANTLR start synpred142_Fan
    public final void synpred142_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:394:32: ( bracketL )
        // src/net/colar/netbeans/fan/antlr/Fan.g:394:33: bracketL
        {
        pushFollow(FOLLOW_bracketL_in_synpred142_Fan2705);
        bracketL();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred142_Fan

    // $ANTLR start synpred143_Fan
    public final void synpred143_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:398:25: ( bracketL )
        // src/net/colar/netbeans/fan/antlr/Fan.g:398:26: bracketL
        {
        pushFollow(FOLLOW_bracketL_in_synpred143_Fan2746);
        bracketL();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred143_Fan

    // $ANTLR start synpred163_Fan
    public final void synpred163_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:423:26: ( ( OP_BITOR | SP_PIPE ) bitAndExpr )
        // src/net/colar/netbeans/fan/antlr/Fan.g:423:26: ( OP_BITOR | SP_PIPE ) bitAndExpr
        {
        if ( input.LA(1)==SP_PIPE||input.LA(1)==OP_BITOR ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }

        pushFollow(FOLLOW_bitAndExpr_in_synpred163_Fan3037);
        bitAndExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred163_Fan

    // $ANTLR start synpred164_Fan
    public final void synpred164_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:424:26: ( OP_CURRY shiftExpr )
        // src/net/colar/netbeans/fan/antlr/Fan.g:424:26: OP_CURRY shiftExpr
        {
        match(input,OP_CURRY,FOLLOW_OP_CURRY_in_synpred164_Fan3051); if (state.failed) return ;
        pushFollow(FOLLOW_shiftExpr_in_synpred164_Fan3053);
        shiftExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred164_Fan

    // $ANTLR start synpred168_Fan
    public final void synpred168_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:426:22: ( ( OP_PLUS | OP_MINUS ) multExpr )
        // src/net/colar/netbeans/fan/antlr/Fan.g:426:22: ( OP_PLUS | OP_MINUS ) multExpr
        {
        if ( (input.LA(1)>=OP_PLUS && input.LA(1)<=OP_MINUS) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }

        pushFollow(FOLLOW_multExpr_in_synpred168_Fan3098);
        multExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred168_Fan

    // $ANTLR start synpred172_Fan
    public final void synpred172_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:428:24: ( ( OP_MULTI | OP_DIV | OP_MOD ) parenExpr )
        // src/net/colar/netbeans/fan/antlr/Fan.g:428:24: ( OP_MULTI | OP_DIV | OP_MOD ) parenExpr
        {
        if ( (input.LA(1)>=OP_MULTI && input.LA(1)<=OP_MOD) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }

        pushFollow(FOLLOW_parenExpr_in_synpred172_Fan3139);
        parenExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred172_Fan

    // $ANTLR start synpred173_Fan
    public final void synpred173_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:429:14: ( castExpr )
        // src/net/colar/netbeans/fan/antlr/Fan.g:429:14: castExpr
        {
        pushFollow(FOLLOW_castExpr_in_synpred173_Fan3150);
        castExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred173_Fan

    // $ANTLR start synpred174_Fan
    public final void synpred174_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:429:25: ( groupedExpr )
        // src/net/colar/netbeans/fan/antlr/Fan.g:429:25: groupedExpr
        {
        pushFollow(FOLLOW_groupedExpr_in_synpred174_Fan3154);
        groupedExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred174_Fan

    // $ANTLR start synpred175_Fan
    public final void synpred175_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:433:31: ( termChain )
        // src/net/colar/netbeans/fan/antlr/Fan.g:433:31: termChain
        {
        pushFollow(FOLLOW_termChain_in_synpred175_Fan3190);
        termChain();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred175_Fan

    // $ANTLR start synpred176_Fan
    public final void synpred176_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:434:14: ( prefixExpr )
        // src/net/colar/netbeans/fan/antlr/Fan.g:434:14: prefixExpr
        {
        pushFollow(FOLLOW_prefixExpr_in_synpred176_Fan3199);
        prefixExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred176_Fan

    // $ANTLR start synpred177_Fan
    public final void synpred177_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:434:27: ( postfixExpr )
        // src/net/colar/netbeans/fan/antlr/Fan.g:434:27: postfixExpr
        {
        pushFollow(FOLLOW_postfixExpr_in_synpred177_Fan3203);
        postfixExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred177_Fan

    // $ANTLR start synpred185_Fan
    public final void synpred185_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:437:22: ( termChain )
        // src/net/colar/netbeans/fan/antlr/Fan.g:437:22: termChain
        {
        pushFollow(FOLLOW_termChain_in_synpred185_Fan3271);
        termChain();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred185_Fan

    // $ANTLR start synpred186_Fan
    public final void synpred186_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:440:13: ( idExprReq )
        // src/net/colar/netbeans/fan/antlr/Fan.g:440:13: idExprReq
        {
        pushFollow(FOLLOW_idExprReq_in_synpred186_Fan3303);
        idExprReq();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred186_Fan

    // $ANTLR start synpred187_Fan
    public final void synpred187_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:440:25: ( literal )
        // src/net/colar/netbeans/fan/antlr/Fan.g:440:25: literal
        {
        pushFollow(FOLLOW_literal_in_synpred187_Fan3307);
        literal();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred187_Fan

    // $ANTLR start synpred188_Fan
    public final void synpred188_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:440:35: ( typeBase )
        // src/net/colar/netbeans/fan/antlr/Fan.g:440:35: typeBase
        {
        pushFollow(FOLLOW_typeBase_in_synpred188_Fan3311);
        typeBase();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred188_Fan

    // $ANTLR start synpred189_Fan
    public final void synpred189_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:441:12: ( typeLiteral )
        // src/net/colar/netbeans/fan/antlr/Fan.g:441:12: typeLiteral
        {
        pushFollow(FOLLOW_typeLiteral_in_synpred189_Fan3322);
        typeLiteral();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred189_Fan

    // $ANTLR start synpred190_Fan
    public final void synpred190_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:441:26: ( slotLiteral )
        // src/net/colar/netbeans/fan/antlr/Fan.g:441:26: slotLiteral
        {
        pushFollow(FOLLOW_slotLiteral_in_synpred190_Fan3326);
        slotLiteral();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred190_Fan

    // $ANTLR start synpred191_Fan
    public final void synpred191_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:441:40: ( namedSuper )
        // src/net/colar/netbeans/fan/antlr/Fan.g:441:40: namedSuper
        {
        pushFollow(FOLLOW_namedSuper_in_synpred191_Fan3330);
        namedSuper();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred191_Fan

    // $ANTLR start synpred192_Fan
    public final void synpred192_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:441:53: ( staticCall )
        // src/net/colar/netbeans/fan/antlr/Fan.g:441:53: staticCall
        {
        pushFollow(FOLLOW_staticCall_in_synpred192_Fan3334);
        staticCall();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred192_Fan

    // $ANTLR start synpred193_Fan
    public final void synpred193_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:442:19: ( dsl )
        // src/net/colar/netbeans/fan/antlr/Fan.g:442:19: dsl
        {
        pushFollow(FOLLOW_dsl_in_synpred193_Fan3356);
        dsl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred193_Fan

    // $ANTLR start synpred194_Fan
    public final void synpred194_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:442:25: ( closure )
        // src/net/colar/netbeans/fan/antlr/Fan.g:442:25: closure
        {
        pushFollow(FOLLOW_closure_in_synpred194_Fan3360);
        closure();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred194_Fan

    // $ANTLR start synpred195_Fan
    public final void synpred195_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:442:35: ( simple )
        // src/net/colar/netbeans/fan/antlr/Fan.g:442:35: simple
        {
        pushFollow(FOLLOW_simple_in_synpred195_Fan3364);
        simple();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred195_Fan

    // $ANTLR start synpred196_Fan
    public final void synpred196_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:447:14: ( dotCall )
        // src/net/colar/netbeans/fan/antlr/Fan.g:447:14: dotCall
        {
        pushFollow(FOLLOW_dotCall_in_synpred196_Fan3419);
        dotCall();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred196_Fan

    // $ANTLR start synpred198_Fan
    public final void synpred198_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:447:34: ( safeDotCall )
        // src/net/colar/netbeans/fan/antlr/Fan.g:447:34: safeDotCall
        {
        pushFollow(FOLLOW_safeDotCall_in_synpred198_Fan3427);
        safeDotCall();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred198_Fan

    // $ANTLR start synpred203_Fan
    public final void synpred203_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:448:35: ( incDotCall )
        // src/net/colar/netbeans/fan/antlr/Fan.g:448:35: incDotCall
        {
        pushFollow(FOLLOW_incDotCall_in_synpred203_Fan3450);
        incDotCall();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred203_Fan

    // $ANTLR start synpred208_Fan
    public final void synpred208_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:466:45: ( closure )
        // src/net/colar/netbeans/fan/antlr/Fan.g:466:45: closure
        {
        pushFollow(FOLLOW_closure_in_synpred208_Fan3624);
        closure();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred208_Fan

    // $ANTLR start synpred209_Fan
    public final void synpred209_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:470:12: ( idExprReq )
        // src/net/colar/netbeans/fan/antlr/Fan.g:470:12: idExprReq
        {
        pushFollow(FOLLOW_idExprReq_in_synpred209_Fan3658);
        idExprReq();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred209_Fan

    // $ANTLR start synpred211_Fan
    public final void synpred211_Fan_fragment() throws RecognitionException {   
        FanParser.callParams_return p = null;

        FanParser.closure_return c = null;


        // src/net/colar/netbeans/fan/antlr/Fan.g:476:14: ( (p= callParams c= closure ) )
        // src/net/colar/netbeans/fan/antlr/Fan.g:476:14: (p= callParams c= closure )
        {
        // src/net/colar/netbeans/fan/antlr/Fan.g:476:14: (p= callParams c= closure )
        // src/net/colar/netbeans/fan/antlr/Fan.g:476:15: p= callParams c= closure
        {
        pushFollow(FOLLOW_callParams_in_synpred211_Fan3703);
        p=callParams();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_closure_in_synpred211_Fan3707);
        c=closure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred211_Fan

    // $ANTLR start synpred212_Fan
    public final void synpred212_Fan_fragment() throws RecognitionException {   
        FanParser.callParams_return p = null;


        // src/net/colar/netbeans/fan/antlr/Fan.g:476:41: (p= callParams )
        // src/net/colar/netbeans/fan/antlr/Fan.g:476:41: p= callParams
        {
        pushFollow(FOLLOW_callParams_in_synpred212_Fan3714);
        p=callParams();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred212_Fan

    // $ANTLR start synpred225_Fan
    public final void synpred225_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:483:20: ( namedSuper )
        // src/net/colar/netbeans/fan/antlr/Fan.g:483:20: namedSuper
        {
        pushFollow(FOLLOW_namedSuper_in_synpred225_Fan3829);
        namedSuper();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred225_Fan

    // $ANTLR start synpred226_Fan
    public final void synpred226_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:484:4: ( slotLiteral )
        // src/net/colar/netbeans/fan/antlr/Fan.g:484:4: slotLiteral
        {
        pushFollow(FOLLOW_slotLiteral_in_synpred226_Fan3836);
        slotLiteral();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred226_Fan

    // $ANTLR start synpred227_Fan
    public final void synpred227_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:484:18: ( typeLiteral )
        // src/net/colar/netbeans/fan/antlr/Fan.g:484:18: typeLiteral
        {
        pushFollow(FOLLOW_typeLiteral_in_synpred227_Fan3840);
        typeLiteral();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred227_Fan

    // $ANTLR start synpred228_Fan
    public final void synpred228_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:484:32: ( list )
        // src/net/colar/netbeans/fan/antlr/Fan.g:484:32: list
        {
        pushFollow(FOLLOW_list_in_synpred228_Fan3844);
        list();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred228_Fan

    // $ANTLR start synpred229_Fan
    public final void synpred229_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:484:39: ( map )
        // src/net/colar/netbeans/fan/antlr/Fan.g:484:39: map
        {
        pushFollow(FOLLOW_map_in_synpred229_Fan3848);
        map();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred229_Fan

    // $ANTLR start synpred234_Fan
    public final void synpred234_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:495:12: ( type {...}?)
        // src/net/colar/netbeans/fan/antlr/Fan.g:495:12: type {...}?
        {
        pushFollow(FOLLOW_type_in_synpred234_Fan4046);
        type();

        state._fsp--;
        if (state.failed) return ;
        if ( !((notAfterEol())) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred234_Fan", "notAfterEol()");
        }

        }
    }
    // $ANTLR end synpred234_Fan

    // $ANTLR start synpred238_Fan
    public final void synpred238_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:498:11: ( mapType {...}?)
        // src/net/colar/netbeans/fan/antlr/Fan.g:498:11: mapType {...}?
        {
        pushFollow(FOLLOW_mapType_in_synpred238_Fan4111);
        mapType();

        state._fsp--;
        if (state.failed) return ;
        if ( !((notAfterEol())) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred238_Fan", "notAfterEol()");
        }

        }
    }
    // $ANTLR end synpred238_Fan

    // $ANTLR start synpred242_Fan
    public final void synpred242_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:504:12: ( DOC )
        // src/net/colar/netbeans/fan/antlr/Fan.g:504:12: DOC
        {
        match(input,DOC,FOLLOW_DOC_in_synpred242_Fan4202); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred242_Fan

    // $ANTLR start synpred245_Fan
    public final void synpred245_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:512:5: ( SP_SEMI )
        // src/net/colar/netbeans/fan/antlr/Fan.g:512:5: SP_SEMI
        {
        match(input,SP_SEMI,FOLLOW_SP_SEMI_in_synpred245_Fan4264); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred245_Fan

    // Delegated rules

    public final boolean synpred189_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred189_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred228_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred228_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred227_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred227_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred245_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred245_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred51_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred51_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred193_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred193_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred135_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred135_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred48_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred48_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred132_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred132_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred195_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred195_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred203_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred203_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred211_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred211_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred63_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred63_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred64_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred64_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred208_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred208_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred61_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred61_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred234_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred234_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred172_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred172_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred174_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred174_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred188_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred188_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred191_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred191_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred127_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred127_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred229_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred229_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred50_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred50_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred194_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred194_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred136_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred136_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred168_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred168_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred198_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred198_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred66_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred66_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred80_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred80_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred209_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred209_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred226_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred226_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred58_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred58_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred238_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred238_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred187_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred187_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred74_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred74_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred192_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred192_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred49_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred49_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred196_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred196_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred164_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred164_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred71_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred71_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred137_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred137_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred126_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred126_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred225_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred225_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred190_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred190_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred212_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred212_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred131_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred131_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred83_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred83_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred68_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred68_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred59_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred59_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred175_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred175_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred139_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred139_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred78_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred78_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred242_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred242_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred141_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred141_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred142_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred142_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred106_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred106_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred186_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred186_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred69_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred69_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred115_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred115_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred143_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred143_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred173_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred173_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred185_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred185_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred67_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred67_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred177_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred177_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred176_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred176_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred163_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred163_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA2 dfa2 = new DFA2(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA52 dfa52 = new DFA52(this);
    protected DFA51 dfa51 = new DFA51(this);
    protected DFA61 dfa61 = new DFA61(this);
    protected DFA79 dfa79 = new DFA79(this);
    protected DFA80 dfa80 = new DFA80(this);
    protected DFA85 dfa85 = new DFA85(this);
    protected DFA92 dfa92 = new DFA92(this);
    protected DFA94 dfa94 = new DFA94(this);
    protected DFA110 dfa110 = new DFA110(this);
    protected DFA111 dfa111 = new DFA111(this);
    protected DFA113 dfa113 = new DFA113(this);
    protected DFA115 dfa115 = new DFA115(this);
    protected DFA116 dfa116 = new DFA116(this);
    protected DFA117 dfa117 = new DFA117(this);
    protected DFA118 dfa118 = new DFA118(this);
    protected DFA119 dfa119 = new DFA119(this);
    protected DFA120 dfa120 = new DFA120(this);
    protected DFA121 dfa121 = new DFA121(this);
    protected DFA126 dfa126 = new DFA126(this);
    protected DFA132 dfa132 = new DFA132(this);
    static final String DFA3_eotS =
        "\15\uffff";
    static final String DFA3_eofS =
        "\1\4\14\uffff";
    static final String DFA3_minS =
        "\1\24\2\0\12\uffff";
    static final String DFA3_maxS =
        "\1\u0080\2\0\12\uffff";
    static final String DFA3_acceptS =
        "\3\uffff\1\1\1\2\10\uffff";
    static final String DFA3_specialS =
        "\1\uffff\1\0\1\1\12\uffff}>";
    static final String[] DFA3_transitionS = {
            "\2\4\4\uffff\1\4\1\uffff\10\4\125\uffff\1\3\5\uffff\1\2\1\1",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "253:18: ( podDef | ( typeDef )* )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA3_1 = input.LA(1);

                         
                        int index3_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Fan()) ) {s = 3;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index3_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA3_2 = input.LA(1);

                         
                        int index3_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Fan()) ) {s = 3;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index3_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 3, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA2_eotS =
        "\4\uffff";
    static final String DFA2_eofS =
        "\2\2\2\uffff";
    static final String DFA2_minS =
        "\2\24\2\uffff";
    static final String DFA2_maxS =
        "\2\u0080\2\uffff";
    static final String DFA2_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA2_specialS =
        "\4\uffff}>";
    static final String[] DFA2_transitionS = {
            "\2\3\4\uffff\1\3\1\uffff\10\3\133\uffff\1\3\1\1",
            "\2\3\4\uffff\1\3\1\uffff\10\3\133\uffff\1\3\1\1",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "()* loopback of 253:28: ( typeDef )*";
        }
    }
    static final String DFA4_eotS =
        "\20\uffff";
    static final String DFA4_eofS =
        "\1\uffff\1\2\1\uffff\1\10\1\uffff\2\2\3\uffff\1\10\1\17\1\2\3\uffff";
    static final String DFA4_minS =
        "\2\21\1\uffff\1\21\1\171\2\21\1\125\1\uffff\1\u0083\3\21\1\125\2"+
        "\uffff";
    static final String DFA4_maxS =
        "\1\21\1\u0082\1\uffff\1\u0080\1\171\2\u0080\1\171\1\uffff\1\u0083"+
        "\1\u0080\1\u009e\1\u0080\1\171\2\uffff";
    static final String DFA4_acceptS =
        "\2\uffff\1\4\5\uffff\1\1\5\uffff\1\3\1\2";
    static final String DFA4_specialS =
        "\20\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\1",
            "\1\2\2\uffff\2\2\4\uffff\1\2\1\uffff\10\2\72\uffff\1\2\32\uffff"+
            "\1\3\5\uffff\2\2\1\uffff\1\4",
            "",
            "\1\10\2\uffff\2\10\4\uffff\1\10\1\uffff\10\10\57\uffff\1\6"+
            "\1\5\11\uffff\1\10\32\uffff\1\7\5\uffff\2\10",
            "\1\11",
            "\1\2\2\uffff\2\2\4\uffff\1\2\1\uffff\10\2\72\uffff\1\2\32\uffff"+
            "\1\12\5\uffff\2\2",
            "\1\2\2\uffff\2\2\4\uffff\1\2\1\uffff\10\2\72\uffff\1\2\32\uffff"+
            "\1\13\5\uffff\2\2",
            "\1\2\43\uffff\1\10",
            "",
            "\1\14",
            "\1\10\2\uffff\2\10\4\uffff\1\10\1\uffff\10\10\57\uffff\1\6"+
            "\1\5\11\uffff\1\10\32\uffff\1\7\5\uffff\2\10",
            "\1\17\1\16\1\uffff\2\17\4\uffff\1\17\1\uffff\10\17\72\uffff"+
            "\1\17\32\uffff\1\15\5\uffff\2\17\35\uffff\1\16",
            "\1\2\2\uffff\2\2\4\uffff\1\2\1\uffff\10\2\72\uffff\1\2\32\uffff"+
            "\1\3\5\uffff\2\2",
            "\1\2\43\uffff\1\17",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "255:5: ( usingPod | usingType | usingAs | incUsing )";
        }
    }
    static final String DFA6_eotS =
        "\15\uffff";
    static final String DFA6_eofS =
        "\1\uffff\1\4\4\uffff\1\11\1\uffff\1\13\4\uffff";
    static final String DFA6_minS =
        "\2\21\1\171\1\123\1\uffff\1\u0083\1\21\1\uffff\1\21\1\uffff\1\123"+
        "\1\uffff\1\123";
    static final String DFA6_maxS =
        "\1\21\1\u0082\2\171\1\uffff\1\u0083\1\u0080\1\uffff\1\u0080\1\uffff"+
        "\1\171\1\uffff\1\171";
    static final String DFA6_acceptS =
        "\4\uffff\1\1\2\uffff\1\4\1\uffff\1\3\1\uffff\1\2\1\uffff";
    static final String DFA6_specialS =
        "\15\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\1",
            "\1\4\2\uffff\2\4\4\uffff\1\4\1\uffff\10\4\72\uffff\1\4\32\uffff"+
            "\1\3\5\uffff\2\4\1\uffff\1\2",
            "\1\5",
            "\1\7\1\6\44\uffff\1\4",
            "",
            "\1\10",
            "\1\11\2\uffff\2\11\4\uffff\1\11\1\uffff\10\11\72\uffff\1\11"+
            "\32\uffff\1\12\5\uffff\2\11",
            "",
            "\1\13\2\uffff\2\13\4\uffff\1\13\1\uffff\10\13\72\uffff\1\13"+
            "\32\uffff\1\14\5\uffff\2\13",
            "",
            "\1\7\1\6\44\uffff\1\11",
            "",
            "\1\7\1\6\44\uffff\1\13"
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "267:14: ( ( KW_USING eos ) | ( KW_USING ffi eos ) | ( KW_USING podSpec DOT eos ) | ( KW_USING podSpec SP_COLCOL eos ) )";
        }
    }
    static final String DFA14_eotS =
        "\13\uffff";
    static final String DFA14_eofS =
        "\13\uffff";
    static final String DFA14_minS =
        "\1\24\3\0\1\uffff\3\0\3\uffff";
    static final String DFA14_maxS =
        "\1\u0080\3\0\1\uffff\3\0\3\uffff";
    static final String DFA14_acceptS =
        "\4\uffff\1\1\3\uffff\1\1\1\2\1\3";
    static final String DFA14_specialS =
        "\1\0\1\1\1\2\1\3\1\uffff\1\4\1\5\1\6\3\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\6\1\7\4\uffff\1\5\1\uffff\1\10\1\11\1\12\1\4\4\3\133\uffff"+
            "\1\2\1\1",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "278:24: ( ( ( classFlags )* KW_CLASS )=> classDef | ( ( protection )? KW_ENUM )=> enumDef | mixinDef )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_0 = input.LA(1);

                         
                        int index14_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA14_0==DOC) ) {s = 1;}

                        else if ( (LA14_0==AT) ) {s = 2;}

                        else if ( ((LA14_0>=KW_PRIVATE && LA14_0<=KW_INTERNAL)) ) {s = 3;}

                        else if ( (LA14_0==KW_ABSTRACT) && (synpred19_Fan())) {s = 4;}

                        else if ( (LA14_0==KW_FINAL) ) {s = 5;}

                        else if ( (LA14_0==KW_CONST) ) {s = 6;}

                        else if ( (LA14_0==KW_STATIC) ) {s = 7;}

                        else if ( (LA14_0==KW_CLASS) && (synpred19_Fan())) {s = 8;}

                        else if ( (LA14_0==KW_ENUM) && (synpred21_Fan())) {s = 9;}

                        else if ( (LA14_0==KW_MIXIN) ) {s = 10;}

                         
                        input.seek(index14_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_1 = input.LA(1);

                         
                        int index14_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_Fan()) ) {s = 8;}

                        else if ( (synpred21_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index14_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_2 = input.LA(1);

                         
                        int index14_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_Fan()) ) {s = 8;}

                        else if ( (synpred21_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index14_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA14_3 = input.LA(1);

                         
                        int index14_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_Fan()) ) {s = 8;}

                        else if ( (synpred21_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index14_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA14_5 = input.LA(1);

                         
                        int index14_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_Fan()) ) {s = 8;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index14_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA14_6 = input.LA(1);

                         
                        int index14_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_Fan()) ) {s = 8;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index14_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA14_7 = input.LA(1);

                         
                        int index14_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_Fan()) ) {s = 8;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index14_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA52_eotS =
        "\23\uffff";
    static final String DFA52_eofS =
        "\23\uffff";
    static final String DFA52_minS =
        "\1\23\1\0\21\uffff";
    static final String DFA52_maxS =
        "\1\u0082\1\0\21\uffff";
    static final String DFA52_acceptS =
        "\2\uffff\1\2\17\uffff\1\1";
    static final String DFA52_specialS =
        "\1\uffff\1\0\21\uffff}>";
    static final String[] DFA52_transitionS = {
            "\2\2\1\1\5\2\4\uffff\7\2\66\uffff\1\2\34\uffff\1\2\5\uffff\2"+
            "\2\1\uffff\1\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA52_eot = DFA.unpackEncodedString(DFA52_eotS);
    static final short[] DFA52_eof = DFA.unpackEncodedString(DFA52_eofS);
    static final char[] DFA52_min = DFA.unpackEncodedStringToUnsignedChars(DFA52_minS);
    static final char[] DFA52_max = DFA.unpackEncodedStringToUnsignedChars(DFA52_maxS);
    static final short[] DFA52_accept = DFA.unpackEncodedString(DFA52_acceptS);
    static final short[] DFA52_special = DFA.unpackEncodedString(DFA52_specialS);
    static final short[][] DFA52_transition;

    static {
        int numStates = DFA52_transitionS.length;
        DFA52_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA52_transition[i] = DFA.unpackEncodedString(DFA52_transitionS[i]);
        }
    }

    class DFA52 extends DFA {

        public DFA52(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 52;
            this.eot = DFA52_eot;
            this.eof = DFA52_eof;
            this.min = DFA52_min;
            this.max = DFA52_max;
            this.accept = DFA52_accept;
            this.special = DFA52_special;
            this.transition = DFA52_transition;
        }
        public String getDescription() {
            return "323:12: ( ( KW_STATIC bracketL )=> staticBlock | ( docs ( facet )* ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef | fieldDef ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA52_1 = input.LA(1);

                         
                        int index52_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred68_Fan()) ) {s = 18;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index52_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 52, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA51_eotS =
        "\22\uffff";
    static final String DFA51_eofS =
        "\22\uffff";
    static final String DFA51_minS =
        "\1\23\3\0\1\uffff\4\0\1\uffff\5\0\3\uffff";
    static final String DFA51_maxS =
        "\1\u0082\3\0\1\uffff\4\0\1\uffff\5\0\3\uffff";
    static final String DFA51_acceptS =
        "\4\uffff\1\1\4\uffff\1\2\5\uffff\1\3\2\uffff";
    static final String DFA51_specialS =
        "\1\0\1\1\1\2\1\3\1\uffff\1\4\1\5\1\6\1\7\1\uffff\1\10\1\11\1\12"+
        "\1\13\1\14\3\uffff}>";
    static final String[] DFA51_transitionS = {
            "\2\17\1\10\1\12\1\17\1\6\1\5\1\13\4\uffff\1\7\4\3\1\4\1\11\66"+
            "\uffff\1\15\34\uffff\1\16\5\uffff\1\2\1\1\1\uffff\1\14",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            ""
    };

    static final short[] DFA51_eot = DFA.unpackEncodedString(DFA51_eotS);
    static final short[] DFA51_eof = DFA.unpackEncodedString(DFA51_eofS);
    static final char[] DFA51_min = DFA.unpackEncodedStringToUnsignedChars(DFA51_minS);
    static final char[] DFA51_max = DFA.unpackEncodedStringToUnsignedChars(DFA51_maxS);
    static final short[] DFA51_accept = DFA.unpackEncodedString(DFA51_acceptS);
    static final short[] DFA51_special = DFA.unpackEncodedString(DFA51_specialS);
    static final short[][] DFA51_transition;

    static {
        int numStates = DFA51_transitionS.length;
        DFA51_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA51_transition[i] = DFA.unpackEncodedString(DFA51_transitionS[i]);
        }
    }

    class DFA51 extends DFA {

        public DFA51(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 51;
            this.eot = DFA51_eot;
            this.eof = DFA51_eof;
            this.min = DFA51_min;
            this.max = DFA51_max;
            this.accept = DFA51_accept;
            this.special = DFA51_special;
            this.transition = DFA51_transition;
        }
        public String getDescription() {
            return "325:6: ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef | fieldDef )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA51_0 = input.LA(1);

                         
                        int index51_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA51_0==DOC) ) {s = 1;}

                        else if ( (LA51_0==AT) ) {s = 2;}

                        else if ( ((LA51_0>=KW_PRIVATE && LA51_0<=KW_INTERNAL)) ) {s = 3;}

                        else if ( (LA51_0==KW_NEW) && (synpred71_Fan())) {s = 4;}

                        else if ( (LA51_0==KW_VIRTUAL) ) {s = 5;}

                        else if ( (LA51_0==KW_OVERRIDE) ) {s = 6;}

                        else if ( (LA51_0==KW_ABSTRACT) ) {s = 7;}

                        else if ( (LA51_0==KW_STATIC) ) {s = 8;}

                        else if ( (LA51_0==KW_ONCE) && (synpred74_Fan())) {s = 9;}

                        else if ( (LA51_0==KW_NATIVE) ) {s = 10;}

                        else if ( (LA51_0==KW_FINAL) ) {s = 11;}

                        else if ( (LA51_0==SQ_BRACKET_L) ) {s = 12;}

                        else if ( (LA51_0==SP_PIPE) ) {s = 13;}

                        else if ( (LA51_0==ID) ) {s = 14;}

                        else if ( ((LA51_0>=KW_RD_ONLY && LA51_0<=KW_CONST)||LA51_0==KW_VOLATILE) ) {s = 15;}

                         
                        input.seek(index51_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA51_1 = input.LA(1);

                         
                        int index51_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred71_Fan()) ) {s = 4;}

                        else if ( (synpred74_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index51_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA51_2 = input.LA(1);

                         
                        int index51_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred71_Fan()) ) {s = 4;}

                        else if ( (synpred74_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index51_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA51_3 = input.LA(1);

                         
                        int index51_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred71_Fan()) ) {s = 4;}

                        else if ( (synpred74_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index51_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA51_5 = input.LA(1);

                         
                        int index51_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index51_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA51_6 = input.LA(1);

                         
                        int index51_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index51_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA51_7 = input.LA(1);

                         
                        int index51_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index51_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA51_8 = input.LA(1);

                         
                        int index51_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index51_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA51_10 = input.LA(1);

                         
                        int index51_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index51_10);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA51_11 = input.LA(1);

                         
                        int index51_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index51_11);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA51_12 = input.LA(1);

                         
                        int index51_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index51_12);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA51_13 = input.LA(1);

                         
                        int index51_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index51_13);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA51_14 = input.LA(1);

                         
                        int index51_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index51_14);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 51, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA61_eotS =
        "\12\uffff";
    static final String DFA61_eofS =
        "\3\uffff\1\4\6\uffff";
    static final String DFA61_minS =
        "\1\134\2\uffff\1\4\1\uffff\1\0\4\uffff";
    static final String DFA61_maxS =
        "\1\u0082\2\uffff\1\u0084\1\uffff\1\0\4\uffff";
    static final String DFA61_acceptS =
        "\1\uffff\2\1\1\uffff\1\2\1\uffff\4\1";
    static final String DFA61_specialS =
        "\1\1\2\uffff\1\0\1\uffff\1\2\4\uffff}>";
    static final String[] DFA61_transitionS = {
            "\1\2\34\uffff\1\3\10\uffff\1\1",
            "",
            "",
            "\15\4\2\uffff\10\4\4\uffff\12\4\2\uffff\4\4\44\uffff\1\6\1"+
            "\uffff\3\4\1\11\1\4\1\7\1\10\1\4\1\uffff\1\4\13\uffff\1\4\2"+
            "\uffff\3\4\2\uffff\4\4\3\uffff\1\5\11\4\1\uffff\1\4",
            "",
            "\1\uffff",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA61_eot = DFA.unpackEncodedString(DFA61_eotS);
    static final short[] DFA61_eof = DFA.unpackEncodedString(DFA61_eofS);
    static final char[] DFA61_min = DFA.unpackEncodedStringToUnsignedChars(DFA61_minS);
    static final char[] DFA61_max = DFA.unpackEncodedStringToUnsignedChars(DFA61_maxS);
    static final short[] DFA61_accept = DFA.unpackEncodedString(DFA61_acceptS);
    static final short[] DFA61_special = DFA.unpackEncodedString(DFA61_specialS);
    static final short[][] DFA61_transition;

    static {
        int numStates = DFA61_transitionS.length;
        DFA61_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA61_transition[i] = DFA.unpackEncodedString(DFA61_transitionS[i]);
        }
    }

    class DFA61 extends DFA {

        public DFA61(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 61;
            this.eot = DFA61_eot;
            this.eof = DFA61_eof;
            this.min = DFA61_min;
            this.max = DFA61_max;
            this.accept = DFA61_accept;
            this.special = DFA61_special;
            this.transition = DFA61_transition;
        }
        public String getDescription() {
            return "338:11: ( ( type id )=> typeAndId | fieldId )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA61_3 = input.LA(1);

                         
                        int index61_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA61_3==EOF||(LA61_3>=KW_BREAK && LA61_3<=KW_FINALLY)||(LA61_3>=KW_RD_ONLY && LA61_3<=KW_FINAL)||(LA61_3>=KW_ABSTRACT && LA61_3<=KW_ELSE)||(LA61_3>=KW_NULL && LA61_3<=KW_FALSE)||(LA61_3>=BRACKET_L && LA61_3<=AS_INIT_VAL)||LA61_3==SP_COMMA||LA61_3==SP_PIPE||LA61_3==SP_SEMI||LA61_3==OP_CURRY||(LA61_3>=OP_PLUS && LA61_3<=OP_MULTI)||(LA61_3>=OP_BANG && LA61_3<=OP_TILDA)||(LA61_3>=URI && LA61_3<=SQ_BRACKET_L)||LA61_3==PAR_L) ) {s = 4;}

                        else if ( (LA61_3==ID) ) {s = 5;}

                        else if ( (LA61_3==SP_COLCOL) && (synpred83_Fan())) {s = 6;}

                        else if ( (LA61_3==SP_QMARK) && (synpred83_Fan())) {s = 7;}

                        else if ( (LA61_3==LIST_TYPE) && (synpred83_Fan())) {s = 8;}

                        else if ( (LA61_3==SP_COLON) && (synpred83_Fan())) {s = 9;}

                         
                        input.seek(index61_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA61_0 = input.LA(1);

                         
                        int index61_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA61_0==SQ_BRACKET_L) && (synpred83_Fan())) {s = 1;}

                        else if ( (LA61_0==SP_PIPE) && (synpred83_Fan())) {s = 2;}

                        else if ( (LA61_0==ID) ) {s = 3;}

                         
                        input.seek(index61_0);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA61_5 = input.LA(1);

                         
                        int index61_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred83_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index61_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 61, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA79_eotS =
        "\37\uffff";
    static final String DFA79_eofS =
        "\37\uffff";
    static final String DFA79_minS =
        "\1\4\14\uffff\1\0\14\uffff\2\0\3\uffff";
    static final String DFA79_maxS =
        "\1\u0084\14\uffff\1\0\14\uffff\2\0\3\uffff";
    static final String DFA79_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\23\uffff\1\13";
    static final String DFA79_specialS =
        "\15\uffff\1\0\14\uffff\1\1\1\2\3\uffff}>";
    static final String[] DFA79_transitionS = {
            "\1\4\1\5\1\2\1\1\1\6\1\7\1\10\1\3\1\11\31\uffff\2\12\3\uffff"+
            "\4\12\55\uffff\1\33\15\uffff\1\12\2\uffff\3\12\2\uffff\4\12"+
            "\3\uffff\1\15\6\12\1\uffff\1\12\1\32\1\uffff\1\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            ""
    };

    static final short[] DFA79_eot = DFA.unpackEncodedString(DFA79_eotS);
    static final short[] DFA79_eof = DFA.unpackEncodedString(DFA79_eofS);
    static final char[] DFA79_min = DFA.unpackEncodedStringToUnsignedChars(DFA79_minS);
    static final char[] DFA79_max = DFA.unpackEncodedStringToUnsignedChars(DFA79_maxS);
    static final short[] DFA79_accept = DFA.unpackEncodedString(DFA79_acceptS);
    static final short[] DFA79_special = DFA.unpackEncodedString(DFA79_specialS);
    static final short[][] DFA79_transition;

    static {
        int numStates = DFA79_transitionS.length;
        DFA79_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA79_transition[i] = DFA.unpackEncodedString(DFA79_transitionS[i]);
        }
    }

    class DFA79 extends DFA {

        public DFA79(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 79;
            this.eot = DFA79_eot;
            this.eof = DFA79_eof;
            this.min = DFA79_min;
            this.max = DFA79_max;
            this.accept = DFA79_accept;
            this.special = DFA79_special;
            this.transition = DFA79_transition;
        }
        public String getDescription() {
            return "367:5: ( g_if | g_for | g_while | g_break | g_continue | g_return | g_switch | g_throw | g_try | exprStmt | localDef )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA79_13 = input.LA(1);

                         
                        int index79_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred126_Fan()) ) {s = 10;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index79_13);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA79_26 = input.LA(1);

                         
                        int index79_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred126_Fan()) ) {s = 10;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index79_26);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA79_27 = input.LA(1);

                         
                        int index79_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred126_Fan()) ) {s = 10;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index79_27);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 79, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA80_eotS =
        "\65\uffff";
    static final String DFA80_eofS =
        "\1\1\64\uffff";
    static final String DFA80_minS =
        "\1\4\4\uffff\1\0\2\uffff\1\0\7\uffff\2\0\5\uffff\31\0\5\uffff";
    static final String DFA80_maxS =
        "\1\u0084\4\uffff\1\0\2\uffff\1\0\7\uffff\2\0\5\uffff\31\0\5\uffff";
    static final String DFA80_acceptS =
        "\1\uffff\1\2\62\uffff\1\1";
    static final String DFA80_specialS =
        "\5\uffff\1\0\2\uffff\1\1\7\uffff\1\2\1\3\5\uffff\1\4\1\5\1\6\1\7"+
        "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24"+
        "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\5\uffff}>";
    static final String[] DFA80_transitionS = {
            "\1\32\1\33\1\30\1\27\1\34\1\35\1\36\1\31\1\37\4\1\2\uffff\10"+
            "\1\4\uffff\7\1\1\44\1\45\1\1\2\uffff\1\43\1\46\1\47\1\50\47"+
            "\uffff\1\1\2\uffff\1\1\2\uffff\1\21\1\uffff\1\1\13\uffff\1\54"+
            "\2\uffff\1\54\1\41\1\42\2\uffff\4\54\3\uffff\1\5\1\53\1\56\1"+
            "\51\1\52\1\57\1\10\1\1\1\55\1\20\1\uffff\1\40",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA80_eot = DFA.unpackEncodedString(DFA80_eotS);
    static final short[] DFA80_eof = DFA.unpackEncodedString(DFA80_eofS);
    static final char[] DFA80_min = DFA.unpackEncodedStringToUnsignedChars(DFA80_minS);
    static final char[] DFA80_max = DFA.unpackEncodedStringToUnsignedChars(DFA80_maxS);
    static final short[] DFA80_accept = DFA.unpackEncodedString(DFA80_acceptS);
    static final short[] DFA80_special = DFA.unpackEncodedString(DFA80_specialS);
    static final short[][] DFA80_transition;

    static {
        int numStates = DFA80_transitionS.length;
        DFA80_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA80_transition[i] = DFA.unpackEncodedString(DFA80_transitionS[i]);
        }
    }

    class DFA80 extends DFA {

        public DFA80(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 80;
            this.eot = DFA80_eot;
            this.eof = DFA80_eof;
            this.min = DFA80_min;
            this.max = DFA80_max;
            this.accept = DFA80_accept;
            this.special = DFA80_special;
            this.transition = DFA80_transition;
        }
        public String getDescription() {
            return "()* loopback of 371:15: ( stmt )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA80_5 = input.LA(1);

                         
                        int index80_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred127_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA80_8 = input.LA(1);

                         
                        int index80_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred127_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_8);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA80_16 = input.LA(1);

                         
                        int index80_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred127_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_16);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA80_17 = input.LA(1);

                         
                        int index80_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred127_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_17);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA80_23 = input.LA(1);

                         
                        int index80_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred127_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_23);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA80_24 = input.LA(1);

                         
                        int index80_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred127_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_24);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA80_25 = input.LA(1);

                         
                        int index80_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred127_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_25);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA80_26 = input.LA(1);

                         
                        int index80_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred127_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_26);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA80_27 = input.LA(1);

                         
                        int index80_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred127_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_27);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA80_28 = input.LA(1);

                         
                        int index80_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred127_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_28);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA80_29 = input.LA(1);

                         
                        int index80_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred127_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_29);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA80_30 = input.LA(1);

                         
                        int index80_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred127_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_30);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA80_31 = input.LA(1);

                         
                        int index80_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred127_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_31);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA80_32 = input.LA(1);

                         
                        int index80_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (((synpred127_Fan()&&(notAfterEol()))||synpred127_Fan())) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_32);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA80_33 = input.LA(1);

                         
                        int index80_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred127_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_33);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA80_34 = input.LA(1);

                         
                        int index80_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred127_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_34);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA80_35 = input.LA(1);

                         
                        int index80_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred127_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_35);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA80_36 = input.LA(1);

                         
                        int index80_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred127_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_36);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA80_37 = input.LA(1);

                         
                        int index80_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred127_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_37);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA80_38 = input.LA(1);

                         
                        int index80_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred127_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_38);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA80_39 = input.LA(1);

                         
                        int index80_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred127_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_39);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA80_40 = input.LA(1);

                         
                        int index80_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred127_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_40);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA80_41 = input.LA(1);

                         
                        int index80_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred127_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_41);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA80_42 = input.LA(1);

                         
                        int index80_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred127_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_42);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA80_43 = input.LA(1);

                         
                        int index80_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred127_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_43);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA80_44 = input.LA(1);

                         
                        int index80_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred127_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_44);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA80_45 = input.LA(1);

                         
                        int index80_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred127_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_45);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA80_46 = input.LA(1);

                         
                        int index80_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred127_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_46);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA80_47 = input.LA(1);

                         
                        int index80_47 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred127_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_47);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 80, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA85_eotS =
        "\65\uffff";
    static final String DFA85_eofS =
        "\1\1\64\uffff";
    static final String DFA85_minS =
        "\1\4\3\uffff\1\0\2\uffff\1\0\7\uffff\2\0\16\uffff\20\0\6\uffff";
    static final String DFA85_maxS =
        "\1\u0084\3\uffff\1\0\2\uffff\1\0\7\uffff\2\0\16\uffff\20\0\6\uffff";
    static final String DFA85_acceptS =
        "\1\uffff\1\1\62\uffff\1\2";
    static final String DFA85_specialS =
        "\4\uffff\1\0\2\uffff\1\1\7\uffff\1\2\1\3\16\uffff\1\4\1\5\1\6\1"+
        "\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\6"+
        "\uffff}>";
    static final String[] DFA85_transitionS = {
            "\15\1\2\uffff\10\1\4\uffff\7\1\1\43\1\44\1\1\2\uffff\1\42\1"+
            "\45\1\46\1\47\47\uffff\1\1\2\uffff\1\1\2\uffff\1\20\1\uffff"+
            "\1\1\13\uffff\1\53\2\uffff\1\53\1\40\1\41\2\uffff\4\53\3\uffff"+
            "\1\4\1\52\1\55\1\50\1\51\1\56\1\7\1\1\1\54\1\17\1\uffff\1\37",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA85_eot = DFA.unpackEncodedString(DFA85_eotS);
    static final short[] DFA85_eof = DFA.unpackEncodedString(DFA85_eofS);
    static final char[] DFA85_min = DFA.unpackEncodedStringToUnsignedChars(DFA85_minS);
    static final char[] DFA85_max = DFA.unpackEncodedStringToUnsignedChars(DFA85_maxS);
    static final short[] DFA85_accept = DFA.unpackEncodedString(DFA85_acceptS);
    static final short[] DFA85_special = DFA.unpackEncodedString(DFA85_specialS);
    static final short[][] DFA85_transition;

    static {
        int numStates = DFA85_transitionS.length;
        DFA85_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA85_transition[i] = DFA.unpackEncodedString(DFA85_transitionS[i]);
        }
    }

    class DFA85 extends DFA {

        public DFA85(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 85;
            this.eot = DFA85_eot;
            this.eof = DFA85_eof;
            this.min = DFA85_min;
            this.max = DFA85_max;
            this.accept = DFA85_accept;
            this.special = DFA85_special;
            this.transition = DFA85_transition;
        }
        public String getDescription() {
            return "382:22: ( eos | expr eos )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA85_4 = input.LA(1);

                         
                        int index85_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred132_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index85_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA85_7 = input.LA(1);

                         
                        int index85_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred132_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index85_7);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA85_15 = input.LA(1);

                         
                        int index85_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred132_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index85_15);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA85_16 = input.LA(1);

                         
                        int index85_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred132_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index85_16);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA85_31 = input.LA(1);

                         
                        int index85_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((((synpred132_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred132_Fan()&&(lookupNL()))&&(notAfterEol()))||(synpred132_Fan()&&(lookupNL()))||((synpred132_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred132_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred132_Fan()&&(lookupNL()))&&(notAfterEol())))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index85_31);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA85_32 = input.LA(1);

                         
                        int index85_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred132_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index85_32);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA85_33 = input.LA(1);

                         
                        int index85_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred132_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index85_33);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA85_34 = input.LA(1);

                         
                        int index85_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred132_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index85_34);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA85_35 = input.LA(1);

                         
                        int index85_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred132_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index85_35);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA85_36 = input.LA(1);

                         
                        int index85_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred132_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index85_36);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA85_37 = input.LA(1);

                         
                        int index85_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred132_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index85_37);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA85_38 = input.LA(1);

                         
                        int index85_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred132_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index85_38);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA85_39 = input.LA(1);

                         
                        int index85_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred132_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index85_39);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA85_40 = input.LA(1);

                         
                        int index85_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred132_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index85_40);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA85_41 = input.LA(1);

                         
                        int index85_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred132_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index85_41);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA85_42 = input.LA(1);

                         
                        int index85_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred132_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index85_42);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA85_43 = input.LA(1);

                         
                        int index85_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred132_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index85_43);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA85_44 = input.LA(1);

                         
                        int index85_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred132_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index85_44);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA85_45 = input.LA(1);

                         
                        int index85_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred132_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index85_45);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA85_46 = input.LA(1);

                         
                        int index85_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred132_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index85_46);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 85, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA92_eotS =
        "\26\uffff";
    static final String DFA92_eofS =
        "\26\uffff";
    static final String DFA92_minS =
        "\1\46\3\0\22\uffff";
    static final String DFA92_maxS =
        "\1\u0084\3\0\22\uffff";
    static final String DFA92_acceptS =
        "\4\uffff\1\2\20\uffff\1\1";
    static final String DFA92_specialS =
        "\1\uffff\1\0\1\1\1\2\22\uffff}>";
    static final String[] DFA92_transitionS = {
            "\2\4\3\uffff\4\4\55\uffff\1\2\15\uffff\1\4\2\uffff\3\4\2\uffff"+
            "\4\4\3\uffff\1\3\6\4\1\uffff\1\4\1\1\1\uffff\1\4",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA92_eot = DFA.unpackEncodedString(DFA92_eotS);
    static final short[] DFA92_eof = DFA.unpackEncodedString(DFA92_eofS);
    static final char[] DFA92_min = DFA.unpackEncodedStringToUnsignedChars(DFA92_minS);
    static final char[] DFA92_max = DFA.unpackEncodedStringToUnsignedChars(DFA92_maxS);
    static final short[] DFA92_accept = DFA.unpackEncodedString(DFA92_acceptS);
    static final short[] DFA92_special = DFA.unpackEncodedString(DFA92_specialS);
    static final short[][] DFA92_transition;

    static {
        int numStates = DFA92_transitionS.length;
        DFA92_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA92_transition[i] = DFA.unpackEncodedString(DFA92_transitionS[i]);
        }
    }

    class DFA92 extends DFA {

        public DFA92(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 92;
            this.eot = DFA92_eot;
            this.eof = DFA92_eof;
            this.min = DFA92_min;
            this.max = DFA92_max;
            this.accept = DFA92_accept;
            this.special = DFA92_special;
            this.transition = DFA92_transition;
        }
        public String getDescription() {
            return "391:1: forInit : ( forInitDef | expr );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA92_1 = input.LA(1);

                         
                        int index92_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred139_Fan()) ) {s = 21;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index92_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA92_2 = input.LA(1);

                         
                        int index92_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred139_Fan()) ) {s = 21;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index92_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA92_3 = input.LA(1);

                         
                        int index92_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred139_Fan()) ) {s = 21;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index92_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 92, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA94_eotS =
        "\66\uffff";
    static final String DFA94_eofS =
        "\1\2\65\uffff";
    static final String DFA94_minS =
        "\1\4\1\0\64\uffff";
    static final String DFA94_maxS =
        "\1\u0084\1\0\64\uffff";
    static final String DFA94_acceptS =
        "\2\uffff\1\2\62\uffff\1\1";
    static final String DFA94_specialS =
        "\1\uffff\1\0\64\uffff}>";
    static final String[] DFA94_transitionS = {
            "\15\2\2\uffff\10\2\4\uffff\12\2\2\uffff\4\2\46\uffff\2\2\2\uffff"+
            "\1\2\2\uffff\1\2\1\uffff\1\2\13\uffff\1\2\2\uffff\3\2\2\uffff"+
            "\4\2\3\uffff\12\2\1\uffff\1\1",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA94_eot = DFA.unpackEncodedString(DFA94_eotS);
    static final short[] DFA94_eof = DFA.unpackEncodedString(DFA94_eofS);
    static final char[] DFA94_min = DFA.unpackEncodedStringToUnsignedChars(DFA94_minS);
    static final char[] DFA94_max = DFA.unpackEncodedStringToUnsignedChars(DFA94_maxS);
    static final short[] DFA94_accept = DFA.unpackEncodedString(DFA94_acceptS);
    static final short[] DFA94_special = DFA.unpackEncodedString(DFA94_specialS);
    static final short[][] DFA94_transition;

    static {
        int numStates = DFA94_transitionS.length;
        DFA94_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA94_transition[i] = DFA.unpackEncodedString(DFA94_transitionS[i]);
        }
    }

    class DFA94 extends DFA {

        public DFA94(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 94;
            this.eot = DFA94_eot;
            this.eof = DFA94_eof;
            this.min = DFA94_min;
            this.max = DFA94_max;
            this.accept = DFA94_accept;
            this.special = DFA94_special;
            this.transition = DFA94_transition;
        }
        public String getDescription() {
            return "394:21: ( catchDef )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA94_1 = input.LA(1);

                         
                        int index94_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred141_Fan()) ) {s = 53;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index94_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 94, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA110_eotS =
        "\105\uffff";
    static final String DFA110_eofS =
        "\1\1\104\uffff";
    static final String DFA110_minS =
        "\1\4\17\uffff\1\0\64\uffff";
    static final String DFA110_maxS =
        "\1\u0085\17\uffff\1\0\64\uffff";
    static final String DFA110_acceptS =
        "\1\uffff\1\2\102\uffff\1\1";
    static final String DFA110_specialS =
        "\20\uffff\1\0\64\uffff}>";
    static final String[] DFA110_transitionS = {
            "\15\1\1\uffff\11\1\1\uffff\23\1\46\uffff\2\1\1\uffff\3\1\1\uffff"+
            "\1\20\1\uffff\13\1\1\104\1\1\2\uffff\3\1\2\uffff\4\1\3\uffff"+
            "\15\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA110_eot = DFA.unpackEncodedString(DFA110_eotS);
    static final short[] DFA110_eof = DFA.unpackEncodedString(DFA110_eofS);
    static final char[] DFA110_min = DFA.unpackEncodedStringToUnsignedChars(DFA110_minS);
    static final char[] DFA110_max = DFA.unpackEncodedStringToUnsignedChars(DFA110_maxS);
    static final short[] DFA110_accept = DFA.unpackEncodedString(DFA110_acceptS);
    static final short[] DFA110_special = DFA.unpackEncodedString(DFA110_specialS);
    static final short[][] DFA110_transition;

    static {
        int numStates = DFA110_transitionS.length;
        DFA110_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA110_transition[i] = DFA.unpackEncodedString(DFA110_transitionS[i]);
        }
    }

    class DFA110 extends DFA {

        public DFA110(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 110;
            this.eot = DFA110_eot;
            this.eof = DFA110_eof;
            this.min = DFA110_min;
            this.max = DFA110_max;
            this.accept = DFA110_accept;
            this.special = DFA110_special;
            this.transition = DFA110_transition;
        }
        public String getDescription() {
            return "()* loopback of 423:25: ( ( OP_BITOR | SP_PIPE ) bitAndExpr )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA110_16 = input.LA(1);

                         
                        int index110_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred163_Fan()) ) {s = 68;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index110_16);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 110, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA111_eotS =
        "\107\uffff";
    static final String DFA111_eofS =
        "\1\1\106\uffff";
    static final String DFA111_minS =
        "\1\4\67\uffff\1\0\16\uffff";
    static final String DFA111_maxS =
        "\1\u0085\67\uffff\1\0\16\uffff";
    static final String DFA111_acceptS =
        "\1\uffff\1\2\104\uffff\1\1";
    static final String DFA111_specialS =
        "\70\uffff\1\0\16\uffff}>";
    static final String[] DFA111_transitionS = {
            "\15\1\1\uffff\11\1\1\uffff\23\1\46\uffff\2\1\1\uffff\3\1\1\uffff"+
            "\1\1\1\uffff\14\1\1\70\2\uffff\3\1\2\uffff\4\1\3\uffff\15\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA111_eot = DFA.unpackEncodedString(DFA111_eotS);
    static final short[] DFA111_eof = DFA.unpackEncodedString(DFA111_eofS);
    static final char[] DFA111_min = DFA.unpackEncodedStringToUnsignedChars(DFA111_minS);
    static final char[] DFA111_max = DFA.unpackEncodedStringToUnsignedChars(DFA111_maxS);
    static final short[] DFA111_accept = DFA.unpackEncodedString(DFA111_acceptS);
    static final short[] DFA111_special = DFA.unpackEncodedString(DFA111_specialS);
    static final short[][] DFA111_transition;

    static {
        int numStates = DFA111_transitionS.length;
        DFA111_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA111_transition[i] = DFA.unpackEncodedString(DFA111_transitionS[i]);
        }
    }

    class DFA111 extends DFA {

        public DFA111(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 111;
            this.eot = DFA111_eot;
            this.eof = DFA111_eof;
            this.min = DFA111_min;
            this.max = DFA111_max;
            this.accept = DFA111_accept;
            this.special = DFA111_special;
            this.transition = DFA111_transition;
        }
        public String getDescription() {
            return "()* loopback of 424:25: ( OP_CURRY shiftExpr )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA111_56 = input.LA(1);

                         
                        int index111_56 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred164_Fan()) ) {s = 70;}

                        else if ( ((lookupNL())) ) {s = 1;}

                         
                        input.seek(index111_56);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 111, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA113_eotS =
        "\111\uffff";
    static final String DFA113_eofS =
        "\1\1\110\uffff";
    static final String DFA113_minS =
        "\1\4\56\uffff\1\0\12\uffff\1\0\16\uffff";
    static final String DFA113_maxS =
        "\1\u0085\56\uffff\1\0\12\uffff\1\0\16\uffff";
    static final String DFA113_acceptS =
        "\1\uffff\1\2\106\uffff\1\1";
    static final String DFA113_specialS =
        "\57\uffff\1\0\12\uffff\1\1\16\uffff}>";
    static final String[] DFA113_transitionS = {
            "\15\1\1\uffff\11\1\1\uffff\23\1\46\uffff\2\1\1\uffff\3\1\1\uffff"+
            "\1\1\1\uffff\17\1\1\72\1\57\1\1\2\uffff\4\1\3\uffff\15\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA113_eot = DFA.unpackEncodedString(DFA113_eotS);
    static final short[] DFA113_eof = DFA.unpackEncodedString(DFA113_eofS);
    static final char[] DFA113_min = DFA.unpackEncodedStringToUnsignedChars(DFA113_minS);
    static final char[] DFA113_max = DFA.unpackEncodedStringToUnsignedChars(DFA113_maxS);
    static final short[] DFA113_accept = DFA.unpackEncodedString(DFA113_acceptS);
    static final short[] DFA113_special = DFA.unpackEncodedString(DFA113_specialS);
    static final short[][] DFA113_transition;

    static {
        int numStates = DFA113_transitionS.length;
        DFA113_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA113_transition[i] = DFA.unpackEncodedString(DFA113_transitionS[i]);
        }
    }

    class DFA113 extends DFA {

        public DFA113(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 113;
            this.eot = DFA113_eot;
            this.eof = DFA113_eof;
            this.min = DFA113_min;
            this.max = DFA113_max;
            this.accept = DFA113_accept;
            this.special = DFA113_special;
            this.transition = DFA113_transition;
        }
        public String getDescription() {
            return "()* loopback of 426:21: ( ( OP_PLUS | OP_MINUS ) multExpr )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA113_47 = input.LA(1);

                         
                        int index113_47 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred168_Fan()) ) {s = 72;}

                        else if ( ((lookupNL())) ) {s = 1;}

                         
                        input.seek(index113_47);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA113_58 = input.LA(1);

                         
                        int index113_58 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred168_Fan()) ) {s = 72;}

                        else if ( ((lookupNL())) ) {s = 1;}

                         
                        input.seek(index113_58);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 113, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA115_eotS =
        "\27\uffff";
    static final String DFA115_eofS =
        "\27\uffff";
    static final String DFA115_minS =
        "\1\46\1\0\25\uffff";
    static final String DFA115_maxS =
        "\1\u0084\1\0\25\uffff";
    static final String DFA115_acceptS =
        "\2\uffff\1\3\22\uffff\1\1\1\2";
    static final String DFA115_specialS =
        "\1\uffff\1\0\25\uffff}>";
    static final String[] DFA115_transitionS = {
            "\2\2\3\uffff\4\2\55\uffff\1\2\15\uffff\1\2\2\uffff\3\2\2\uffff"+
            "\4\2\3\uffff\7\2\1\uffff\2\2\1\uffff\1\1",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA115_eot = DFA.unpackEncodedString(DFA115_eotS);
    static final short[] DFA115_eof = DFA.unpackEncodedString(DFA115_eofS);
    static final char[] DFA115_min = DFA.unpackEncodedStringToUnsignedChars(DFA115_minS);
    static final char[] DFA115_max = DFA.unpackEncodedStringToUnsignedChars(DFA115_maxS);
    static final short[] DFA115_accept = DFA.unpackEncodedString(DFA115_acceptS);
    static final short[] DFA115_special = DFA.unpackEncodedString(DFA115_specialS);
    static final short[][] DFA115_transition;

    static {
        int numStates = DFA115_transitionS.length;
        DFA115_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA115_transition[i] = DFA.unpackEncodedString(DFA115_transitionS[i]);
        }
    }

    class DFA115 extends DFA {

        public DFA115(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 115;
            this.eot = DFA115_eot;
            this.eof = DFA115_eof;
            this.min = DFA115_min;
            this.max = DFA115_max;
            this.accept = DFA115_accept;
            this.special = DFA115_special;
            this.transition = DFA115_transition;
        }
        public String getDescription() {
            return "429:1: parenExpr : ( castExpr | groupedExpr | unaryExpr );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA115_1 = input.LA(1);

                         
                        int index115_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred173_Fan()&&(notAfterEol()))) ) {s = 21;}

                        else if ( (synpred174_Fan()) ) {s = 22;}

                         
                        input.seek(index115_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 115, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA116_eotS =
        "\115\uffff";
    static final String DFA116_eofS =
        "\1\1\114\uffff";
    static final String DFA116_minS =
        "\1\4\24\uffff\1\0\2\uffff\1\0\27\uffff\1\0\34\uffff";
    static final String DFA116_maxS =
        "\1\u0085\24\uffff\1\0\2\uffff\1\0\27\uffff\1\0\34\uffff";
    static final String DFA116_acceptS =
        "\1\uffff\1\2\107\uffff\1\1\3\uffff";
    static final String DFA116_specialS =
        "\25\uffff\1\0\2\uffff\1\1\27\uffff\1\2\34\uffff}>";
    static final String[] DFA116_transitionS = {
            "\15\1\1\uffff\11\1\1\uffff\23\1\45\uffff\1\111\1\30\1\1\1\uffff"+
            "\3\1\1\uffff\1\1\1\111\30\1\1\uffff\2\111\11\1\1\25\1\1\1\60"+
            "\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA116_eot = DFA.unpackEncodedString(DFA116_eotS);
    static final short[] DFA116_eof = DFA.unpackEncodedString(DFA116_eofS);
    static final char[] DFA116_min = DFA.unpackEncodedStringToUnsignedChars(DFA116_minS);
    static final char[] DFA116_max = DFA.unpackEncodedStringToUnsignedChars(DFA116_maxS);
    static final short[] DFA116_accept = DFA.unpackEncodedString(DFA116_acceptS);
    static final short[] DFA116_special = DFA.unpackEncodedString(DFA116_specialS);
    static final short[][] DFA116_transition;

    static {
        int numStates = DFA116_transitionS.length;
        DFA116_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA116_transition[i] = DFA.unpackEncodedString(DFA116_transitionS[i]);
        }
    }

    class DFA116 extends DFA {

        public DFA116(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 116;
            this.eot = DFA116_eot;
            this.eof = DFA116_eof;
            this.min = DFA116_min;
            this.max = DFA116_max;
            this.accept = DFA116_accept;
            this.special = DFA116_special;
            this.transition = DFA116_transition;
        }
        public String getDescription() {
            return "()* loopback of 433:31: ( termChain )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA116_21 = input.LA(1);

                         
                        int index116_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred175_Fan()&&(notAfterEol()))) ) {s = 73;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index116_21);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA116_24 = input.LA(1);

                         
                        int index116_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred175_Fan()) ) {s = 73;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index116_24);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA116_48 = input.LA(1);

                         
                        int index116_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred175_Fan()&&(notAfterEol()))) ) {s = 73;}

                        else if ( ((((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||(lookupNL())||((lookupNL())&&(notAfterEol())))) ) {s = 1;}

                         
                        input.seek(index116_48);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 116, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA117_eotS =
        "\26\uffff";
    static final String DFA117_eofS =
        "\26\uffff";
    static final String DFA117_minS =
        "\1\46\14\0\1\uffff\6\0\2\uffff";
    static final String DFA117_maxS =
        "\1\u0082\14\0\1\uffff\6\0\2\uffff";
    static final String DFA117_acceptS =
        "\15\uffff\1\1\6\uffff\1\2\1\3";
    static final String DFA117_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\uffff"+
        "\1\14\1\15\1\16\1\17\1\20\1\21\2\uffff}>";
    static final String[] DFA117_transitionS = {
            "\1\5\1\6\3\uffff\1\4\1\7\1\10\1\11\55\uffff\1\21\15\uffff\1"+
            "\15\2\uffff\1\15\1\1\1\2\2\uffff\4\15\3\uffff\1\3\1\14\1\17"+
            "\1\12\1\13\1\22\1\23\1\uffff\1\16\1\20",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] DFA117_eot = DFA.unpackEncodedString(DFA117_eotS);
    static final short[] DFA117_eof = DFA.unpackEncodedString(DFA117_eofS);
    static final char[] DFA117_min = DFA.unpackEncodedStringToUnsignedChars(DFA117_minS);
    static final char[] DFA117_max = DFA.unpackEncodedStringToUnsignedChars(DFA117_maxS);
    static final short[] DFA117_accept = DFA.unpackEncodedString(DFA117_acceptS);
    static final short[] DFA117_special = DFA.unpackEncodedString(DFA117_specialS);
    static final short[][] DFA117_transition;

    static {
        int numStates = DFA117_transitionS.length;
        DFA117_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA117_transition[i] = DFA.unpackEncodedString(DFA117_transitionS[i]);
        }
    }

    class DFA117 extends DFA {

        public DFA117(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 117;
            this.eot = DFA117_eot;
            this.eof = DFA117_eof;
            this.min = DFA117_min;
            this.max = DFA117_max;
            this.accept = DFA117_accept;
            this.special = DFA117_special;
            this.transition = DFA117_transition;
        }
        public String getDescription() {
            return "434:1: unaryExpr : ( prefixExpr | postfixExpr | termExpr );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA117_1 = input.LA(1);

                         
                        int index117_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred176_Fan()) ) {s = 13;}

                        else if ( (synpred177_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index117_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA117_2 = input.LA(1);

                         
                        int index117_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred177_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index117_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA117_3 = input.LA(1);

                         
                        int index117_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred177_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index117_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA117_4 = input.LA(1);

                         
                        int index117_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred177_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index117_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA117_5 = input.LA(1);

                         
                        int index117_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred177_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index117_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA117_6 = input.LA(1);

                         
                        int index117_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred177_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index117_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA117_7 = input.LA(1);

                         
                        int index117_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred177_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index117_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA117_8 = input.LA(1);

                         
                        int index117_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred177_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index117_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA117_9 = input.LA(1);

                         
                        int index117_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred177_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index117_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA117_10 = input.LA(1);

                         
                        int index117_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred177_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index117_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA117_11 = input.LA(1);

                         
                        int index117_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred177_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index117_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA117_12 = input.LA(1);

                         
                        int index117_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred177_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index117_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA117_14 = input.LA(1);

                         
                        int index117_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred177_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index117_14);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA117_15 = input.LA(1);

                         
                        int index117_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred177_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index117_15);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA117_16 = input.LA(1);

                         
                        int index117_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred177_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index117_16);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA117_17 = input.LA(1);

                         
                        int index117_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred177_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index117_17);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA117_18 = input.LA(1);

                         
                        int index117_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred177_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index117_18);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA117_19 = input.LA(1);

                         
                        int index117_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred177_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index117_19);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 117, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA118_eotS =
        "\116\uffff";
    static final String DFA118_eofS =
        "\1\1\115\uffff";
    static final String DFA118_minS =
        "\1\4\24\uffff\1\0\2\uffff\1\0\27\uffff\1\0\35\uffff";
    static final String DFA118_maxS =
        "\1\u0085\24\uffff\1\0\2\uffff\1\0\27\uffff\1\0\35\uffff";
    static final String DFA118_acceptS =
        "\1\uffff\1\2\110\uffff\1\1\3\uffff";
    static final String DFA118_specialS =
        "\25\uffff\1\0\2\uffff\1\1\27\uffff\1\2\35\uffff}>";
    static final String[] DFA118_transitionS = {
            "\15\1\1\uffff\11\1\1\uffff\23\1\45\uffff\1\112\1\30\1\1\1\uffff"+
            "\3\1\1\uffff\1\1\1\112\30\1\1\uffff\2\112\11\1\1\25\1\1\1\60"+
            "\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA118_eot = DFA.unpackEncodedString(DFA118_eotS);
    static final short[] DFA118_eof = DFA.unpackEncodedString(DFA118_eofS);
    static final char[] DFA118_min = DFA.unpackEncodedStringToUnsignedChars(DFA118_minS);
    static final char[] DFA118_max = DFA.unpackEncodedStringToUnsignedChars(DFA118_maxS);
    static final short[] DFA118_accept = DFA.unpackEncodedString(DFA118_acceptS);
    static final short[] DFA118_special = DFA.unpackEncodedString(DFA118_specialS);
    static final short[][] DFA118_transition;

    static {
        int numStates = DFA118_transitionS.length;
        DFA118_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA118_transition[i] = DFA.unpackEncodedString(DFA118_transitionS[i]);
        }
    }

    class DFA118 extends DFA {

        public DFA118(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 118;
            this.eot = DFA118_eot;
            this.eof = DFA118_eof;
            this.min = DFA118_min;
            this.max = DFA118_max;
            this.accept = DFA118_accept;
            this.special = DFA118_special;
            this.transition = DFA118_transition;
        }
        public String getDescription() {
            return "()* loopback of 437:22: ( termChain )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA118_21 = input.LA(1);

                         
                        int index118_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred185_Fan()&&(notAfterEol()))) ) {s = 74;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index118_21);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA118_24 = input.LA(1);

                         
                        int index118_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred185_Fan()) ) {s = 74;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index118_24);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA118_48 = input.LA(1);

                         
                        int index118_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred185_Fan()&&(notAfterEol()))) ) {s = 74;}

                        else if ( ((((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||(lookupNL())||((lookupNL())&&(notAfterEol())))) ) {s = 1;}

                         
                        input.seek(index118_48);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 118, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA119_eotS =
        "\25\uffff";
    static final String DFA119_eofS =
        "\25\uffff";
    static final String DFA119_minS =
        "\1\46\1\uffff\1\0\14\uffff\3\0\3\uffff";
    static final String DFA119_maxS =
        "\1\u0082\1\uffff\1\0\14\uffff\3\0\3\uffff";
    static final String DFA119_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\17\uffff\1\3\1\4";
    static final String DFA119_specialS =
        "\2\uffff\1\0\14\uffff\1\1\1\2\1\3\3\uffff}>";
    static final String[] DFA119_transitionS = {
            "\2\3\3\uffff\4\3\55\uffff\1\20\21\uffff\1\3\1\1\11\uffff\1\2"+
            "\4\3\1\21\1\3\1\uffff\1\3\1\17",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            ""
    };

    static final short[] DFA119_eot = DFA.unpackEncodedString(DFA119_eotS);
    static final short[] DFA119_eof = DFA.unpackEncodedString(DFA119_eofS);
    static final char[] DFA119_min = DFA.unpackEncodedStringToUnsignedChars(DFA119_minS);
    static final char[] DFA119_max = DFA.unpackEncodedStringToUnsignedChars(DFA119_maxS);
    static final short[] DFA119_accept = DFA.unpackEncodedString(DFA119_acceptS);
    static final short[] DFA119_special = DFA.unpackEncodedString(DFA119_specialS);
    static final short[][] DFA119_transition;

    static {
        int numStates = DFA119_transitionS.length;
        DFA119_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA119_transition[i] = DFA.unpackEncodedString(DFA119_transitionS[i]);
        }
    }

    class DFA119 extends DFA {

        public DFA119(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 119;
            this.eot = DFA119_eot;
            this.eof = DFA119_eof;
            this.min = DFA119_min;
            this.max = DFA119_max;
            this.accept = DFA119_accept;
            this.special = DFA119_special;
            this.transition = DFA119_transition;
        }
        public String getDescription() {
            return "440:1: termBase : ( idExprReq | literal | typeBase | id );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA119_2 = input.LA(1);

                         
                        int index119_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred186_Fan()) ) {s = 1;}

                        else if ( (synpred187_Fan()) ) {s = 3;}

                        else if ( (synpred188_Fan()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index119_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA119_15 = input.LA(1);

                         
                        int index119_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred187_Fan()) ) {s = 3;}

                        else if ( (synpred188_Fan()) ) {s = 19;}

                         
                        input.seek(index119_15);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA119_16 = input.LA(1);

                         
                        int index119_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred187_Fan()) ) {s = 3;}

                        else if ( (synpred188_Fan()) ) {s = 19;}

                         
                        input.seek(index119_16);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA119_17 = input.LA(1);

                         
                        int index119_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred187_Fan()) ) {s = 3;}

                        else if ( (synpred188_Fan()) ) {s = 19;}

                         
                        input.seek(index119_17);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 119, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA120_eotS =
        "\14\uffff";
    static final String DFA120_eofS =
        "\14\uffff";
    static final String DFA120_minS =
        "\1\134\3\0\10\uffff";
    static final String DFA120_maxS =
        "\1\u0082\3\0\10\uffff";
    static final String DFA120_acceptS =
        "\4\uffff\1\2\1\1\1\4\1\7\1\10\1\6\1\3\1\5";
    static final String DFA120_specialS =
        "\1\uffff\1\0\1\1\1\2\10\uffff}>";
    static final String[] DFA120_transitionS = {
            "\1\2\34\uffff\1\3\4\uffff\1\4\3\uffff\1\1",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA120_eot = DFA.unpackEncodedString(DFA120_eotS);
    static final short[] DFA120_eof = DFA.unpackEncodedString(DFA120_eofS);
    static final char[] DFA120_min = DFA.unpackEncodedStringToUnsignedChars(DFA120_minS);
    static final char[] DFA120_max = DFA.unpackEncodedStringToUnsignedChars(DFA120_maxS);
    static final short[] DFA120_accept = DFA.unpackEncodedString(DFA120_acceptS);
    static final short[] DFA120_special = DFA.unpackEncodedString(DFA120_specialS);
    static final short[][] DFA120_transition;

    static {
        int numStates = DFA120_transitionS.length;
        DFA120_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA120_transition[i] = DFA.unpackEncodedString(DFA120_transitionS[i]);
        }
    }

    class DFA120 extends DFA {

        public DFA120(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 120;
            this.eot = DFA120_eot;
            this.eof = DFA120_eof;
            this.min = DFA120_min;
            this.max = DFA120_max;
            this.accept = DFA120_accept;
            this.special = DFA120_special;
            this.transition = DFA120_transition;
        }
        public String getDescription() {
            return "441:1: typeBase : ( typeLiteral | slotLiteral | namedSuper | staticCall | dsl | closure | simple | ctorBlock );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA120_1 = input.LA(1);

                         
                        int index120_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred189_Fan()) ) {s = 5;}

                        else if ( (synpred190_Fan()) ) {s = 4;}

                        else if ( (synpred192_Fan()) ) {s = 6;}

                        else if ( (synpred195_Fan()) ) {s = 7;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index120_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA120_2 = input.LA(1);

                         
                        int index120_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred189_Fan()) ) {s = 5;}

                        else if ( (synpred190_Fan()) ) {s = 4;}

                        else if ( (synpred192_Fan()) ) {s = 6;}

                        else if ( (synpred194_Fan()) ) {s = 9;}

                        else if ( (synpred195_Fan()) ) {s = 7;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index120_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA120_3 = input.LA(1);

                         
                        int index120_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred189_Fan()) ) {s = 5;}

                        else if ( (synpred190_Fan()) ) {s = 4;}

                        else if ( (synpred191_Fan()) ) {s = 10;}

                        else if ( (synpred192_Fan()) ) {s = 6;}

                        else if ( (synpred193_Fan()) ) {s = 11;}

                        else if ( (synpred195_Fan()) ) {s = 7;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index120_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 120, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA121_eotS =
        "\22\uffff";
    static final String DFA121_eofS =
        "\1\uffff\1\12\1\uffff\1\15\16\uffff";
    static final String DFA121_minS =
        "\1\124\1\4\1\uffff\1\4\4\uffff\1\46\1\0\1\uffff\1\46\1\0\1\uffff"+
        "\1\0\1\uffff\1\0\1\uffff";
    static final String DFA121_maxS =
        "\1\u0084\1\u0085\1\uffff\1\u0085\4\uffff\1\u0084\1\0\1\uffff\1\u0084"+
        "\1\0\1\uffff\1\0\1\uffff\1\0\1\uffff";
    static final String DFA121_acceptS =
        "\2\uffff\1\2\1\uffff\1\4\1\5\1\6\1\7\2\uffff\1\10\2\uffff\1\11\1"+
        "\uffff\1\1\1\uffff\1\3";
    static final String DFA121_specialS =
        "\11\uffff\1\3\2\uffff\1\1\1\uffff\1\2\1\uffff\1\0\1\uffff}>";
    static final String[] DFA121_transitionS = {
            "\1\1\1\7\7\uffff\1\2\31\uffff\1\3\1\4\11\uffff\1\5\1\uffff\1"+
            "\6",
            "\15\12\1\uffff\11\12\1\uffff\23\12\45\uffff\3\12\1\uffff\3"+
            "\12\1\uffff\23\12\1\10\6\12\1\uffff\2\12\1\11\14\12",
            "",
            "\15\15\1\uffff\11\15\1\uffff\23\15\45\uffff\3\15\1\uffff\3"+
            "\15\1\uffff\23\15\1\13\6\15\1\uffff\2\15\1\14\14\15",
            "",
            "",
            "",
            "",
            "\2\12\3\uffff\4\12\55\uffff\1\12\15\uffff\1\12\2\uffff\3\12"+
            "\2\uffff\4\12\3\uffff\1\16\6\12\1\uffff\2\12\1\uffff\1\12",
            "\1\uffff",
            "",
            "\2\15\3\uffff\4\15\55\uffff\1\15\15\uffff\1\15\2\uffff\3\15"+
            "\2\uffff\4\15\3\uffff\1\20\6\15\1\uffff\2\15\1\uffff\1\15",
            "\1\uffff",
            "",
            "\1\uffff",
            "",
            "\1\uffff",
            ""
    };

    static final short[] DFA121_eot = DFA.unpackEncodedString(DFA121_eotS);
    static final short[] DFA121_eof = DFA.unpackEncodedString(DFA121_eofS);
    static final char[] DFA121_min = DFA.unpackEncodedStringToUnsignedChars(DFA121_minS);
    static final char[] DFA121_max = DFA.unpackEncodedStringToUnsignedChars(DFA121_maxS);
    static final short[] DFA121_accept = DFA.unpackEncodedString(DFA121_acceptS);
    static final short[] DFA121_special = DFA.unpackEncodedString(DFA121_specialS);
    static final short[][] DFA121_transition;

    static {
        int numStates = DFA121_transitionS.length;
        DFA121_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA121_transition[i] = DFA.unpackEncodedString(DFA121_transitionS[i]);
        }
    }

    class DFA121 extends DFA {

        public DFA121(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 121;
            this.eot = DFA121_eot;
            this.eof = DFA121_eof;
            this.min = DFA121_min;
            this.max = DFA121_max;
            this.accept = DFA121_accept;
            this.special = DFA121_special;
            this.transition = DFA121_transition;
        }
        public String getDescription() {
            return "447:1: termChain : ( dotCall | dynCall | safeDotCall | safeDynCall | indexExpr | callOp | itBlock | incDotCall | incSafeDotCall );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA121_16 = input.LA(1);

                         
                        int index121_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred198_Fan()) ) {s = 17;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index121_16);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA121_12 = input.LA(1);

                         
                        int index121_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred198_Fan()) ) {s = 17;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index121_12);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA121_14 = input.LA(1);

                         
                        int index121_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred196_Fan()) ) {s = 15;}

                        else if ( (synpred203_Fan()) ) {s = 10;}

                         
                        input.seek(index121_14);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA121_9 = input.LA(1);

                         
                        int index121_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred196_Fan()) ) {s = 15;}

                        else if ( (synpred203_Fan()) ) {s = 10;}

                         
                        input.seek(index121_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 121, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA126_eotS =
        "\117\uffff";
    static final String DFA126_eofS =
        "\1\1\116\uffff";
    static final String DFA126_minS =
        "\1\4\5\uffff\1\0\110\uffff";
    static final String DFA126_maxS =
        "\1\u0085\5\uffff\1\0\110\uffff";
    static final String DFA126_acceptS =
        "\1\uffff\1\2\114\uffff\1\1";
    static final String DFA126_specialS =
        "\6\uffff\1\0\110\uffff}>";
    static final String[] DFA126_transitionS = {
            "\15\1\1\uffff\11\1\1\uffff\23\1\45\uffff\3\1\1\uffff\3\1\1\uffff"+
            "\1\6\31\1\1\uffff\17\1",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA126_eot = DFA.unpackEncodedString(DFA126_eotS);
    static final short[] DFA126_eof = DFA.unpackEncodedString(DFA126_eofS);
    static final char[] DFA126_min = DFA.unpackEncodedStringToUnsignedChars(DFA126_minS);
    static final char[] DFA126_max = DFA.unpackEncodedStringToUnsignedChars(DFA126_maxS);
    static final short[] DFA126_accept = DFA.unpackEncodedString(DFA126_acceptS);
    static final short[] DFA126_special = DFA.unpackEncodedString(DFA126_specialS);
    static final short[][] DFA126_transition;

    static {
        int numStates = DFA126_transitionS.length;
        DFA126_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA126_transition[i] = DFA.unpackEncodedString(DFA126_transitionS[i]);
        }
    }

    class DFA126 extends DFA {

        public DFA126(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 126;
            this.eot = DFA126_eot;
            this.eof = DFA126_eof;
            this.min = DFA126_min;
            this.max = DFA126_max;
            this.accept = DFA126_accept;
            this.special = DFA126_special;
            this.transition = DFA126_transition;
        }
        public String getDescription() {
            return "()* loopback of 466:45: ( closure )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA126_6 = input.LA(1);

                         
                        int index126_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred208_Fan()) ) {s = 78;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index126_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 126, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA132_eotS =
        "\27\uffff";
    static final String DFA132_eofS =
        "\27\uffff";
    static final String DFA132_minS =
        "\1\46\14\uffff\3\0\7\uffff";
    static final String DFA132_maxS =
        "\1\u0082\14\uffff\3\0\7\uffff";
    static final String DFA132_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff\1\10\1\11\1\uffff\1"+
        "\12\3\uffff\1\14\1\20\1\13\1\15\1\16\1\17\1\21";
    static final String DFA132_specialS =
        "\15\uffff\1\0\1\1\1\2\7\uffff}>";
    static final String[] DFA132_transitionS = {
            "\1\2\1\3\3\uffff\1\1\1\4\1\5\1\6\55\uffff\1\17\21\uffff\1\12"+
            "\12\uffff\1\15\1\11\1\14\2\7\1\20\1\21\1\uffff\1\12\1\16",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA132_eot = DFA.unpackEncodedString(DFA132_eotS);
    static final short[] DFA132_eof = DFA.unpackEncodedString(DFA132_eofS);
    static final char[] DFA132_min = DFA.unpackEncodedStringToUnsignedChars(DFA132_minS);
    static final char[] DFA132_max = DFA.unpackEncodedStringToUnsignedChars(DFA132_maxS);
    static final short[] DFA132_accept = DFA.unpackEncodedString(DFA132_acceptS);
    static final short[] DFA132_special = DFA.unpackEncodedString(DFA132_specialS);
    static final short[][] DFA132_transition;

    static {
        int numStates = DFA132_transitionS.length;
        DFA132_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA132_transition[i] = DFA.unpackEncodedString(DFA132_transitionS[i]);
        }
    }

    class DFA132 extends DFA {

        public DFA132(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 132;
            this.eot = DFA132_eot;
            this.eof = DFA132_eof;
            this.min = DFA132_min;
            this.max = DFA132_max;
            this.accept = DFA132_accept;
            this.special = DFA132_special;
            this.transition = DFA132_transition;
        }
        public String getDescription() {
            return "482:1: literal : ( KW_NULL | KW_THIS | KW_SUPER | KW_IT | KW_TRUE | KW_FALSE | strs | URI | number | CHAR | namedSuper | slotLiteral | typeLiteral | list | map | symbLiteral | simple );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA132_13 = input.LA(1);

                         
                        int index132_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred225_Fan()) ) {s = 18;}

                        else if ( (synpred226_Fan()) ) {s = 16;}

                        else if ( (synpred227_Fan()) ) {s = 19;}

                        else if ( (synpred228_Fan()) ) {s = 20;}

                        else if ( (synpred229_Fan()) ) {s = 21;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index132_13);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA132_14 = input.LA(1);

                         
                        int index132_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred226_Fan()) ) {s = 16;}

                        else if ( (synpred227_Fan()) ) {s = 19;}

                        else if ( (synpred228_Fan()) ) {s = 20;}

                        else if ( (synpred229_Fan()) ) {s = 21;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index132_14);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA132_15 = input.LA(1);

                         
                        int index132_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred226_Fan()) ) {s = 16;}

                        else if ( (synpred227_Fan()) ) {s = 19;}

                        else if ( (synpred228_Fan()) ) {s = 20;}

                        else if ( (synpred229_Fan()) ) {s = 21;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index132_15);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 132, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_using_in_prog465 = new BitSet(new long[]{0x0000000FF4320000L,0x8200000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_podDef_in_prog469 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_typeDef_in_prog473 = new BitSet(new long[]{0x0000000FF4300000L,0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_docs_in_prog477 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_prog479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_usingPod_in_using499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_usingType_in_using503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_usingAs_in_using507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_incUsing_in_using511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_USING_in_usingPod522 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_podSpec_in_usingPod524 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_eos_in_usingPod526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_USING_in_usingType555 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_podSpec_in_usingType557 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_SP_COLCOL_in_usingType559 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_id_in_usingType561 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_eos_in_usingType563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_USING_in_usingAs595 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_podSpec_in_usingAs597 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_SP_COLCOL_in_usingAs599 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_podId_in_usingAs601 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_KW_AS_in_usingAs603 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_id_in_usingAs607 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_eos_in_usingAs609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_podId647 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_158_in_podId650 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_id_in_podId652 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_KW_USING_in_incUsing665 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_eos_in_incUsing667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_USING_in_incUsing673 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ffi_in_incUsing675 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_eos_in_incUsing677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_USING_in_incUsing683 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_podSpec_in_incUsing685 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_DOT_in_incUsing687 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_eos_in_incUsing689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_USING_in_incUsing695 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_podSpec_in_incUsing697 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_SP_COLCOL_in_incUsing699 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_eos_in_incUsing701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ffi_in_podSpec742 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_id_in_podSpec745 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_DOT_in_podSpec748 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_id_in_podSpec750 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_sq_bracketL_in_ffi761 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_id_in_ffi763 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_sq_bracketR_in_ffi765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_podHeader_in_podDef774 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_BRACKET_L_in_podDef776 = new BitSet(new long[]{0x0000000002000000L,0x8200000010400000L,0x0000000000000005L});
    public static final BitSet FOLLOW_symbolDef_in_podDef778 = new BitSet(new long[]{0x0000000002000000L,0x8200000010400000L,0x0000000000000005L});
    public static final BitSet FOLLOW_BRACKET_R_in_podDef781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_podHeader788 = new BitSet(new long[]{0x0000000000000000L,0x8200000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_facet_in_podHeader790 = new BitSet(new long[]{0x0000000000000000L,0x8200000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_pod_in_podHeader793 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_id_in_podHeader795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_symbolDef802 = new BitSet(new long[]{0x0000000002000000L,0x8200000010000000L,0x0000000000000005L});
    public static final BitSet FOLLOW_facet_in_symbolDef804 = new BitSet(new long[]{0x0000000002000000L,0x8200000010000000L,0x0000000000000005L});
    public static final BitSet FOLLOW_symbolFlag_in_symbolDef807 = new BitSet(new long[]{0x0000000002000000L,0x8200000010000000L,0x0000000000000005L});
    public static final BitSet FOLLOW_typeId_in_symbolDef810 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_AS_INIT_VAL_in_symbolDef812 = new BitSet(new long[]{0x000078C000000000L,0xFE3CE40010000000L,0x0000000000000016L});
    public static final BitSet FOLLOW_expr_in_symbolDef814 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_eos_in_symbolDef816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_VIRTUAL_in_symbolFlag823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_typeDef833 = new BitSet(new long[]{0x0000000FF4300000L,0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_facet_in_typeDef835 = new BitSet(new long[]{0x0000000FF4300000L,0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_classDef_in_typeDef846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDef_in_typeDef860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mixinDef_in_typeDef864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classHeader_in_classDef887 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_classBody_in_classDef889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_classHeader914 = new BitSet(new long[]{0x0000000F94300000L,0x8000000000000000L});
    public static final BitSet FOLLOW_facet_in_classHeader916 = new BitSet(new long[]{0x0000000F94300000L,0x8000000000000000L});
    public static final BitSet FOLLOW_classFlags_in_classHeader921 = new BitSet(new long[]{0x0000000F94300000L});
    public static final BitSet FOLLOW_KW_CLASS_in_classHeader924 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_id_in_classHeader928 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_inheritance_in_classHeader930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protection_in_classFlags965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ABSTRACT_in_classFlags969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FINAL_in_classFlags973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CONST_in_classFlags977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_STATIC_in_classFlags981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketL_in_classBody990 = new BitSet(new long[]{0x0000003F87F80000L,0x8200000010400000L,0x0000000000000005L});
    public static final BitSet FOLLOW_slotDef_in_classBody992 = new BitSet(new long[]{0x0000003F87F80000L,0x8200000010400000L,0x0000000000000005L});
    public static final BitSet FOLLOW_bracketR_in_classBody995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_protection0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mixinHeader_in_mixinDef1048 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_mixinBody_in_mixinDef1050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_mixinHeader1075 = new BitSet(new long[]{0x0000000F44300000L,0x8000000000000000L});
    public static final BitSet FOLLOW_facet_in_mixinHeader1077 = new BitSet(new long[]{0x0000000F44300000L,0x8000000000000000L});
    public static final BitSet FOLLOW_mixinFlags_in_mixinHeader1082 = new BitSet(new long[]{0x0000000F44300000L});
    public static final BitSet FOLLOW_KW_MIXIN_in_mixinHeader1085 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_id_in_mixinHeader1089 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_inheritance_in_mixinHeader1091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protection_in_mixinFlags1125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CONST_in_mixinFlags1129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_STATIC_in_mixinFlags1133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FINAL_in_mixinFlags1137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketL_in_mixinBody1144 = new BitSet(new long[]{0x0000003F87F80000L,0x8200000010400000L,0x0000000000000005L});
    public static final BitSet FOLLOW_slotDef_in_mixinBody1146 = new BitSet(new long[]{0x0000003F87F80000L,0x8200000010400000L,0x0000000000000005L});
    public static final BitSet FOLLOW_bracketR_in_mixinBody1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumHeader_in_enumDef1183 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_enumBody_in_enumDef1185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_enumHeader1213 = new BitSet(new long[]{0x0000000F20000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_facet_in_enumHeader1215 = new BitSet(new long[]{0x0000000F20000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_protection_in_enumHeader1220 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_KW_ENUM_in_enumHeader1223 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_id_in_enumHeader1227 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_inheritance_in_enumHeader1229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketL_in_enumBody1263 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L,0x0000000000000005L});
    public static final BitSet FOLLOW_enumValDefs_in_enumBody1265 = new BitSet(new long[]{0x0000003F87F80000L,0x8200000010400000L,0x0000000000000005L});
    public static final BitSet FOLLOW_slotDef_in_enumBody1267 = new BitSet(new long[]{0x0000003F87F80000L,0x8200000010400000L,0x0000000000000005L});
    public static final BitSet FOLLOW_bracketR_in_enumBody1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_COLON_in_inheritance1295 = new BitSet(new long[]{0x0000000000000000L,0x0200000010000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_typeList_in_inheritance1297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumValDef_in_enumValDefs1307 = new BitSet(new long[]{0x0000000000000000L,0x0000000042000000L});
    public static final BitSet FOLLOW_SP_COMMA_in_enumValDefs1310 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L,0x0000000000000005L});
    public static final BitSet FOLLOW_enumValDef_in_enumValDefs1313 = new BitSet(new long[]{0x0000000000000000L,0x0000000042000000L});
    public static final BitSet FOLLOW_eos_in_enumValDefs1317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_enumValDef1325 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_id_in_enumValDef1327 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_parL_in_enumValDef1330 = new BitSet(new long[]{0x000078C000000000L,0xFE3CE40010000000L,0x0000000000000036L});
    public static final BitSet FOLLOW_args_in_enumValDef1332 = new BitSet(new long[]{0x000078C000000000L,0xFE3CE40010000000L,0x0000000000000036L});
    public static final BitSet FOLLOW_parR_in_enumValDef1335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeList1346 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_SP_COMMA_in_typeList1349 = new BitSet(new long[]{0x0000000000000000L,0x0200000010000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_typeList1351 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_typeRoot_in_type1371 = new BitSet(new long[]{0x0000000000000002L,0x000000000C000000L});
    public static final BitSet FOLLOW_SP_QMARK_in_type1374 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_LIST_TYPE_in_type1378 = new BitSet(new long[]{0x0000000000000002L,0x000000000C000000L});
    public static final BitSet FOLLOW_SP_QMARK_in_type1380 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_mapType_in_typeRoot1391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonMapType_in_typeRoot1395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcType_in_nonMapType1402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleType_in_nonMapType1406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_simpleType1420 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_SP_COLCOL_in_simpleType1423 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_id_in_simpleType1425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sq_bracketL_in_mapType1436 = new BitSet(new long[]{0x0000000000000000L,0x0200000010000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_nonMapType_in_mapType1439 = new BitSet(new long[]{0x0000000000000000L,0x000000000D000000L});
    public static final BitSet FOLLOW_SP_QMARK_in_mapType1441 = new BitSet(new long[]{0x0000000000000000L,0x0000000009000000L});
    public static final BitSet FOLLOW_LIST_TYPE_in_mapType1445 = new BitSet(new long[]{0x0000000000000000L,0x000000000D000000L});
    public static final BitSet FOLLOW_SP_QMARK_in_mapType1447 = new BitSet(new long[]{0x0000000000000000L,0x0000000009000000L});
    public static final BitSet FOLLOW_SP_COLON_in_mapType1459 = new BitSet(new long[]{0x0000000000000000L,0x0200000010000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_mapType1463 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_sq_bracketR_in_mapType1467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_PIPE_in_funcType1498 = new BitSet(new long[]{0x0000000000000000L,0x0200000032000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SP_COMMA_in_funcType1501 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_formals_in_funcType1506 = new BitSet(new long[]{0x0000000000000000L,0x0200000032000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_assignedType_in_funcType1513 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_assignedType_in_funcType1525 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_SP_PIPE_in_funcType1529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_ARROW_in_assignedType1536 = new BitSet(new long[]{0x0000000000000002L,0x0200000010000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_assignedType1538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formal_in_formals1549 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_SP_COMMA_in_formals1552 = new BitSet(new long[]{0x0000000000000000L,0x0200000010000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_formal_in_formals1554 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_formalFull_in_formal1564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formalTypeOnly_in_formal1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formalInferred_in_formal1572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_formalFull1584 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_id_in_formalFull1586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_formalTypeOnly1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_formalInferred1606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_staticBlock_in_slotDef1622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_slotDef1630 = new BitSet(new long[]{0x0000003F87F80000L,0x8200000010000000L,0x0000000000000005L});
    public static final BitSet FOLLOW_facet_in_slotDef1632 = new BitSet(new long[]{0x0000003F87F80000L,0x8200000010000000L,0x0000000000000005L});
    public static final BitSet FOLLOW_ctorDef_in_slotDef1655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodDef_in_slotDef1682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldDef_in_slotDef1692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_fieldDef1728 = new BitSet(new long[]{0x0000000F87F80000L,0x8200000010000000L,0x0000000000000005L});
    public static final BitSet FOLLOW_facet_in_fieldDef1730 = new BitSet(new long[]{0x0000000F87F80000L,0x8200000010000000L,0x0000000000000005L});
    public static final BitSet FOLLOW_fieldFlags_in_fieldDef1735 = new BitSet(new long[]{0x0000000002000000L,0x8200000010000000L,0x0000000000000005L});
    public static final BitSet FOLLOW_typeId_in_fieldDef1737 = new BitSet(new long[]{0x0000000000000000L,0x0000000040A00000L});
    public static final BitSet FOLLOW_AS_INIT_VAL_in_fieldDef1740 = new BitSet(new long[]{0x000078C000000000L,0xFE3CE40010000000L,0x0000000000000016L});
    public static final BitSet FOLLOW_expr_in_fieldDef1742 = new BitSet(new long[]{0x0000000000000000L,0x0000000040200000L});
    public static final BitSet FOLLOW_bracketL_in_fieldDef1757 = new BitSet(new long[]{0x0000000F00000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_protection_in_fieldDef1760 = new BitSet(new long[]{0x0000000F00000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_getter_in_fieldDef1764 = new BitSet(new long[]{0x000078FF87F81FF0L,0xFE3CE40050600000L,0x0000000000000017L});
    public static final BitSet FOLLOW_setter_in_fieldDef1768 = new BitSet(new long[]{0x000078FF87F81FF0L,0xFE3CE40050600000L,0x0000000000000017L});
    public static final BitSet FOLLOW_SP_SEMI_in_fieldDef1771 = new BitSet(new long[]{0x000078FF87F81FF0L,0xFE3CE40010600000L,0x0000000000000017L});
    public static final BitSet FOLLOW_block_in_fieldDef1774 = new BitSet(new long[]{0x0000003F87F80000L,0x8200000010400000L,0x0000000000000005L});
    public static final BitSet FOLLOW_bracketR_in_fieldDef1779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_eos_in_fieldDef1788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeAndId_in_typeId1826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldId_in_typeId1830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_fieldId1839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeAndId1846 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_id_in_typeAndId1848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ABSTRACT_in_fieldFlags1874 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_KW_RD_ONLY_in_fieldFlags1878 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_KW_CONST_in_fieldFlags1882 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_KW_STATIC_in_fieldFlags1886 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_KW_NATIVE_in_fieldFlags1890 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_KW_VOLATILE_in_fieldFlags1894 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_KW_OVERRIDE_in_fieldFlags1898 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_KW_VIRTUAL_in_fieldFlags1902 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_KW_FINAL_in_fieldFlags1906 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_protection_in_fieldFlags1910 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_docs_in_methodDef1930 = new BitSet(new long[]{0x0000002F87600000L,0x8200000010000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_facet_in_methodDef1932 = new BitSet(new long[]{0x0000002F87600000L,0x8200000010000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_methodFlags_in_methodDef1937 = new BitSet(new long[]{0x0000002F87600000L,0x0200000010000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_methodDef1942 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_id_in_methodDef1948 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_parL_in_methodDef1950 = new BitSet(new long[]{0x000078C000000000L,0xFE3CE40010000000L,0x0000000000000036L});
    public static final BitSet FOLLOW_params_in_methodDef1952 = new BitSet(new long[]{0x000078C000000000L,0xFE3CE40010000000L,0x0000000000000036L});
    public static final BitSet FOLLOW_parR_in_methodDef1954 = new BitSet(new long[]{0x0000000000000000L,0x0000000040200000L});
    public static final BitSet FOLLOW_methodBody_in_methodDef1956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protection_in_methodFlags2002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_VIRTUAL_in_methodFlags2006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_OVERRIDE_in_methodFlags2010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ABSTRACT_in_methodFlags2014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_STATIC_in_methodFlags2018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ONCE_in_methodFlags2022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_NATIVE_in_methodFlags2030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FINAL_in_methodFlags2034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_params2043 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_SP_COMMA_in_params2046 = new BitSet(new long[]{0x0000000000000000L,0x0200000010000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_param_in_params2048 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_type_in_param2062 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_id_in_param2064 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_AS_INIT_VAL_in_param2067 = new BitSet(new long[]{0x000078C000000000L,0xFE3CE40010000000L,0x0000000000000016L});
    public static final BitSet FOLLOW_expr_in_param2069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiStmt_in_methodBody2108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_eos_in_methodBody2112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_ctorDef2132 = new BitSet(new long[]{0x0000001F00000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_facet_in_ctorDef2134 = new BitSet(new long[]{0x0000001F00000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_ctorFlags_in_ctorDef2139 = new BitSet(new long[]{0x0000001F00000000L});
    public static final BitSet FOLLOW_KW_NEW_in_ctorDef2142 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_id_in_ctorDef2146 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_parL_in_ctorDef2148 = new BitSet(new long[]{0x000078C000000000L,0xFE3CE40010000000L,0x0000000000000036L});
    public static final BitSet FOLLOW_params_in_ctorDef2150 = new BitSet(new long[]{0x000078C000000000L,0xFE3CE40010000000L,0x0000000000000036L});
    public static final BitSet FOLLOW_parR_in_ctorDef2152 = new BitSet(new long[]{0x0000000000000000L,0x0000000041200000L});
    public static final BitSet FOLLOW_ctorChain_in_ctorDef2161 = new BitSet(new long[]{0x0000000000000000L,0x0000000040200000L});
    public static final BitSet FOLLOW_methodBody_in_ctorDef2165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protection_in_ctorFlags2212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_COLON_in_ctorChain2219 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_ctorChainThis_in_ctorChain2222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctorChainSuper_in_ctorChain2226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_THIS_in_ctorChainThis2235 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_DOT_in_ctorChainThis2237 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_id_in_ctorChainThis2239 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_parL_in_ctorChainThis2241 = new BitSet(new long[]{0x000078C000000000L,0xFE3CE40010000000L,0x0000000000000036L});
    public static final BitSet FOLLOW_args_in_ctorChainThis2243 = new BitSet(new long[]{0x000078C000000000L,0xFE3CE40010000000L,0x0000000000000036L});
    public static final BitSet FOLLOW_parR_in_ctorChainThis2246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_SUPER_in_ctorChainSuper2253 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L,0x0000000000000010L});
    public static final BitSet FOLLOW_DOT_in_ctorChainSuper2256 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_id_in_ctorChainSuper2258 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_parL_in_ctorChainSuper2262 = new BitSet(new long[]{0x000078C000000000L,0xFE3CE40010000000L,0x0000000000000036L});
    public static final BitSet FOLLOW_args_in_ctorChainSuper2264 = new BitSet(new long[]{0x000078C000000000L,0xFE3CE40010000000L,0x0000000000000036L});
    public static final BitSet FOLLOW_parR_in_ctorChainSuper2267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_STATIC_in_staticBlock2275 = new BitSet(new long[]{0x000078C002001FF0L,0xFE3CE40010200000L,0x0000000000000017L});
    public static final BitSet FOLLOW_block_in_staticBlock2277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiStmt_in_block2302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_block2306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketL_in_multiStmt2314 = new BitSet(new long[]{0x000078FF87F81FF0L,0xFE3CE40010600000L,0x0000000000000017L});
    public static final BitSet FOLLOW_stmt_in_multiStmt2316 = new BitSet(new long[]{0x000078FF87F81FF0L,0xFE3CE40010600000L,0x0000000000000017L});
    public static final BitSet FOLLOW_bracketR_in_multiStmt2319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_if_in_stmt2354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_for_in_stmt2358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_while_in_stmt2362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_break_in_stmt2366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_continue_in_stmt2373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_return_in_stmt2377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_switch_in_stmt2381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_throw_in_stmt2388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_try_in_stmt2392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprStmt_in_stmt2396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localDef_in_stmt2400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_stmtList2413 = new BitSet(new long[]{0x000078C002001FF2L,0xFE3CE40010200000L,0x0000000000000017L});
    public static final BitSet FOLLOW_KW_BREAK_in_g_break2435 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_eos_in_g_break2437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CONTINUE_in_g_continue2444 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_eos_in_g_continue2446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FOR_in_g_for2454 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_parL_in_g_for2456 = new BitSet(new long[]{0x000078C002000000L,0xFE3CE40050000000L,0x0000000000000017L});
    public static final BitSet FOLLOW_forInit_in_g_for2458 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_SP_SEMI_in_g_for2461 = new BitSet(new long[]{0x000078C000000000L,0xFE3CE40050000000L,0x0000000000000016L});
    public static final BitSet FOLLOW_expr_in_g_for2463 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_SP_SEMI_in_g_for2466 = new BitSet(new long[]{0x000078C000000000L,0xFE3CE40010000000L,0x0000000000000036L});
    public static final BitSet FOLLOW_expr_in_g_for2468 = new BitSet(new long[]{0x000078C000000000L,0xFE3CE40010000000L,0x0000000000000036L});
    public static final BitSet FOLLOW_parR_in_g_for2471 = new BitSet(new long[]{0x000078C002001FF0L,0xFE3CE40010200000L,0x0000000000000017L});
    public static final BitSet FOLLOW_block_in_g_for2474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_IF_in_g_if2482 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_parL_in_g_if2484 = new BitSet(new long[]{0x000078C000000000L,0xFE3CE40010000000L,0x0000000000000016L});
    public static final BitSet FOLLOW_expr_in_g_if2486 = new BitSet(new long[]{0x000078C000000000L,0xFE3CE40010000000L,0x0000000000000036L});
    public static final BitSet FOLLOW_parR_in_g_if2488 = new BitSet(new long[]{0x000078C002001FF0L,0xFE3CE40010200000L,0x0000000000000017L});
    public static final BitSet FOLLOW_block_in_g_if2490 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_KW_ELSE_in_g_if2497 = new BitSet(new long[]{0x000078C002001FF0L,0xFE3CE40010200000L,0x0000000000000017L});
    public static final BitSet FOLLOW_block_in_g_if2499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_RETURN_in_g_return2508 = new BitSet(new long[]{0x000078C000000000L,0xFE3CE40050000000L,0x0000000000000016L});
    public static final BitSet FOLLOW_eos_in_g_return2511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_g_return2515 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_eos_in_g_return2517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_SWITCH_in_g_switch2525 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_parL_in_g_switch2527 = new BitSet(new long[]{0x000078C000000000L,0xFE3CE40010000000L,0x0000000000000016L});
    public static final BitSet FOLLOW_expr_in_g_switch2529 = new BitSet(new long[]{0x000078C000000000L,0xFE3CE40010000000L,0x0000000000000036L});
    public static final BitSet FOLLOW_parR_in_g_switch2531 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_bracketL_in_g_switch2533 = new BitSet(new long[]{0x0000003F87F86000L,0x8200000010400000L,0x0000000000000005L});
    public static final BitSet FOLLOW_g_case_in_g_switch2536 = new BitSet(new long[]{0x0000003F87F86000L,0x8200000010400000L,0x0000000000000005L});
    public static final BitSet FOLLOW_g_default_in_g_switch2541 = new BitSet(new long[]{0x0000003F87F80000L,0x8200000010400000L,0x0000000000000005L});
    public static final BitSet FOLLOW_bracketR_in_g_switch2545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_THROW_in_g_throw2553 = new BitSet(new long[]{0x000078C000000000L,0xFE3CE40010000000L,0x0000000000000016L});
    public static final BitSet FOLLOW_expr_in_g_throw2555 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_eos_in_g_throw2557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_WHILE_in_g_while2565 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_parL_in_g_while2567 = new BitSet(new long[]{0x000078C000000000L,0xFE3CE40010000000L,0x0000000000000016L});
    public static final BitSet FOLLOW_expr_in_g_while2569 = new BitSet(new long[]{0x000078C000000000L,0xFE3CE40010000000L,0x0000000000000036L});
    public static final BitSet FOLLOW_parR_in_g_while2571 = new BitSet(new long[]{0x000078C002001FF0L,0xFE3CE40010200000L,0x0000000000000017L});
    public static final BitSet FOLLOW_block_in_g_while2573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_TRY_in_g_try2581 = new BitSet(new long[]{0x000078C002019FF0L,0xFE3CE40010200000L,0x0000000000000017L});
    public static final BitSet FOLLOW_try_long_in_g_try2588 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_stmtList_in_g_try2592 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_g_catch_in_g_try2600 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_g_finally_in_g_try2609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiStmt_in_try_long2618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_exprStmt2625 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_eos_in_exprStmt2627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeId_in_localDef2635 = new BitSet(new long[]{0x0000000000000000L,0x0000000040800000L});
    public static final BitSet FOLLOW_AS_INIT_VAL_in_localDef2638 = new BitSet(new long[]{0x000078C000000000L,0xFE3CE40010000000L,0x0000000000000016L});
    public static final BitSet FOLLOW_expr_in_localDef2640 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_eos_in_localDef2644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forInitDef_in_forInit2671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_forInit2675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeId_in_forInitDef2682 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_AS_INIT_VAL_in_forInitDef2685 = new BitSet(new long[]{0x000078C000000000L,0xFE3CE40010000000L,0x0000000000000016L});
    public static final BitSet FOLLOW_expr_in_forInitDef2687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CATCH_in_g_catch2698 = new BitSet(new long[]{0x000078C002001FF0L,0xFE3CE40010200000L,0x0000000000000017L});
    public static final BitSet FOLLOW_catchDef_in_g_catch2700 = new BitSet(new long[]{0x000078C002001FF0L,0xFE3CE40010200000L,0x0000000000000017L});
    public static final BitSet FOLLOW_catch_long_in_g_catch2708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtList_in_g_catch2712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiStmt_in_catch_long2720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parL_in_catchDef2728 = new BitSet(new long[]{0x0000000000000000L,0x0200000010000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_catchDef2730 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_id_in_catchDef2732 = new BitSet(new long[]{0x000078C000000000L,0xFE3CE40010000000L,0x0000000000000036L});
    public static final BitSet FOLLOW_parR_in_catchDef2734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FINALLY_in_g_finally2742 = new BitSet(new long[]{0x000078C002001FF0L,0xFE3CE40010200000L,0x0000000000000017L});
    public static final BitSet FOLLOW_finally_long_in_g_finally2749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtList_in_g_finally2753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiStmt_in_finally_long2761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CASE_in_g_case2769 = new BitSet(new long[]{0x000078C000000000L,0xFE3CE40010000000L,0x0000000000000016L});
    public static final BitSet FOLLOW_expr_in_g_case2771 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_SP_COLON_in_g_case2773 = new BitSet(new long[]{0x000078C002001FF2L,0xFE3CE40010200000L,0x0000000000000017L});
    public static final BitSet FOLLOW_stmt_in_g_case2775 = new BitSet(new long[]{0x000078C002001FF2L,0xFE3CE40010200000L,0x0000000000000017L});
    public static final BitSet FOLLOW_KW_DEFAULT_in_g_default2783 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_SP_COLON_in_g_default2785 = new BitSet(new long[]{0x000078C002001FF2L,0xFE3CE40010200000L,0x0000000000000017L});
    public static final BitSet FOLLOW_stmt_in_g_default2787 = new BitSet(new long[]{0x000078C002001FF2L,0xFE3CE40010200000L,0x0000000000000017L});
    public static final BitSet FOLLOW_assignExpr_in_expr2808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ternaryExpr_in_assignExpr2815 = new BitSet(new long[]{0x0000000000000002L,0x0000000180000000L});
    public static final BitSet FOLLOW_assignOp_in_assignExpr2818 = new BitSet(new long[]{0x000078C000000000L,0xFE3CE40010000000L,0x0000000000000016L});
    public static final BitSet FOLLOW_assignExpr_in_assignExpr2820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condOrExpr_in_ternaryExpr2829 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_ternaryTail_in_ternaryExpr2832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_QMARK_in_ternaryTail2842 = new BitSet(new long[]{0x000078C000000000L,0xFE3CE40010000000L,0x0000000000000016L});
    public static final BitSet FOLLOW_condOrExpr_in_ternaryTail2844 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_SP_COLON_in_ternaryTail2846 = new BitSet(new long[]{0x000078C000000000L,0xFE3CE40010000000L,0x0000000000000016L});
    public static final BitSet FOLLOW_condOrExpr_in_ternaryTail2848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_assignOp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condAndExpr_in_condOrExpr2867 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_OP_OR_in_condOrExpr2871 = new BitSet(new long[]{0x000078C000000000L,0xFE3CE40010000000L,0x0000000000000016L});
    public static final BitSet FOLLOW_condAndExpr_in_condOrExpr2874 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_equalityExpr_in_condAndExpr2884 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_OP_AND_in_condAndExpr2887 = new BitSet(new long[]{0x000078C000000000L,0xFE3CE40010000000L,0x0000000000000016L});
    public static final BitSet FOLLOW_equalityExpr_in_condAndExpr2890 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_relationalExpr_in_equalityExpr2900 = new BitSet(new long[]{0x0000000000000002L,0x0000000800000000L});
    public static final BitSet FOLLOW_CP_EQUALITY_in_equalityExpr2903 = new BitSet(new long[]{0x000078C000000000L,0xFE3CE40010000000L,0x0000000000000016L});
    public static final BitSet FOLLOW_relationalExpr_in_equalityExpr2905 = new BitSet(new long[]{0x0000000000000002L,0x0000000800000000L});
    public static final BitSet FOLLOW_elvisExpr_in_relationalExpr2918 = new BitSet(new long[]{0x0000060000040000L,0x0000001000000000L});
    public static final BitSet FOLLOW_typeCheck_in_relationalExpr2921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compare_in_relationalExpr2925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_typeCheck2936 = new BitSet(new long[]{0x0000000000000000L,0x0200000010000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_typeRoot_in_typeCheck2948 = new BitSet(new long[]{0x0000000000000002L,0x000000000C000000L});
    public static final BitSet FOLLOW_SP_QMARK_in_typeCheck2951 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_LIST_TYPE_in_typeCheck2956 = new BitSet(new long[]{0x0000000000000002L,0x000000000C000000L});
    public static final BitSet FOLLOW_CP_COMPARATORS_in_compare2969 = new BitSet(new long[]{0x000078C000000000L,0xFE3CE40010000000L,0x0000000000000016L});
    public static final BitSet FOLLOW_elvisExpr_in_compare2971 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
    public static final BitSet FOLLOW_rangeExpr_in_elvisExpr2982 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_OP_ELVIS_in_elvisExpr2985 = new BitSet(new long[]{0x000078C000000000L,0xFE3CE40010000000L,0x0000000000000016L});
    public static final BitSet FOLLOW_rangeExpr_in_elvisExpr2987 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_bitOrExpr_in_rangeExpr2998 = new BitSet(new long[]{0x0000000000000002L,0x000001C000000000L});
    public static final BitSet FOLLOW_set_in_rangeExpr3001 = new BitSet(new long[]{0x000078C000000000L,0xFE3CE40010000000L,0x0000000000000016L});
    public static final BitSet FOLLOW_bitOrExpr_in_rangeExpr3015 = new BitSet(new long[]{0x0000000000000002L,0x000001C000000000L});
    public static final BitSet FOLLOW_bitAndExpr_in_bitOrExpr3026 = new BitSet(new long[]{0x0000000000000002L,0x0000020010000000L});
    public static final BitSet FOLLOW_set_in_bitOrExpr3029 = new BitSet(new long[]{0x000078C000000000L,0xFE3CE40010000000L,0x0000000000000016L});
    public static final BitSet FOLLOW_bitAndExpr_in_bitOrExpr3037 = new BitSet(new long[]{0x0000000000000002L,0x0000020010000000L});
    public static final BitSet FOLLOW_shiftExpr_in_bitAndExpr3048 = new BitSet(new long[]{0x0000000000000002L,0x0000040000000000L});
    public static final BitSet FOLLOW_OP_CURRY_in_bitAndExpr3051 = new BitSet(new long[]{0x000078C000000000L,0xFE3CE40010000000L,0x0000000000000016L});
    public static final BitSet FOLLOW_shiftExpr_in_bitAndExpr3053 = new BitSet(new long[]{0x0000000000000002L,0x0000040000000000L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr3065 = new BitSet(new long[]{0x0000000000000002L,0x0000180000000000L});
    public static final BitSet FOLLOW_set_in_shiftExpr3068 = new BitSet(new long[]{0x000078C000000000L,0xFE3CE40010000000L,0x0000000000000016L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr3076 = new BitSet(new long[]{0x0000000000000002L,0x0000180000000000L});
    public static final BitSet FOLLOW_multExpr_in_addExpr3087 = new BitSet(new long[]{0x0000000000000002L,0x0000600000000000L});
    public static final BitSet FOLLOW_set_in_addExpr3090 = new BitSet(new long[]{0x000078C000000000L,0xFE3CE40010000000L,0x0000000000000016L});
    public static final BitSet FOLLOW_multExpr_in_addExpr3098 = new BitSet(new long[]{0x0000000000000002L,0x0000600000000000L});
    public static final BitSet FOLLOW_set_in_addAppend3108 = new BitSet(new long[]{0x000078C000000000L,0xFE3CE40010000000L,0x0000000000000016L});
    public static final BitSet FOLLOW_parenExpr_in_addAppend3116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parenExpr_in_multExpr3124 = new BitSet(new long[]{0x0000000000000002L,0x0003800000000000L});
    public static final BitSet FOLLOW_set_in_multExpr3127 = new BitSet(new long[]{0x000078C000000000L,0xFE3CE40010000000L,0x0000000000000016L});
    public static final BitSet FOLLOW_parenExpr_in_multExpr3139 = new BitSet(new long[]{0x0000000000000002L,0x0003800000000000L});
    public static final BitSet FOLLOW_castExpr_in_parenExpr3150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_groupedExpr_in_parenExpr3154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpr_in_parenExpr3158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parL_in_castExpr3169 = new BitSet(new long[]{0x0000000000000000L,0x0200000010000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_castExpr3171 = new BitSet(new long[]{0x000078C000000000L,0xFE3CE40010000000L,0x0000000000000036L});
    public static final BitSet FOLLOW_parR_in_castExpr3173 = new BitSet(new long[]{0x000078C000000000L,0xFE3CE40010000000L,0x0000000000000016L});
    public static final BitSet FOLLOW_parenExpr_in_castExpr3175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parL_in_groupedExpr3184 = new BitSet(new long[]{0x000078C000000000L,0xFE3CE40010000000L,0x0000000000000016L});
    public static final BitSet FOLLOW_expr_in_groupedExpr3186 = new BitSet(new long[]{0x000078C000000000L,0xFE3CE40010000000L,0x0000000000000036L});
    public static final BitSet FOLLOW_parR_in_groupedExpr3188 = new BitSet(new long[]{0x0000000000000002L,0x0180000020300000L,0x0000000000000014L});
    public static final BitSet FOLLOW_termChain_in_groupedExpr3190 = new BitSet(new long[]{0x0000000000000002L,0x0180000020300000L,0x0000000000000014L});
    public static final BitSet FOLLOW_prefixExpr_in_unaryExpr3199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpr_in_unaryExpr3203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termExpr_in_unaryExpr3207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_prefixExpr3215 = new BitSet(new long[]{0x000078C000000000L,0xFE3CE40010000000L,0x0000000000000016L});
    public static final BitSet FOLLOW_parenExpr_in_prefixExpr3243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termExpr_in_postfixExpr3252 = new BitSet(new long[]{0x0000000000000000L,0x0018000000000000L});
    public static final BitSet FOLLOW_set_in_postfixExpr3254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termBase_in_termExpr3269 = new BitSet(new long[]{0x0000000000000002L,0x0180000020300000L,0x0000000000000014L});
    public static final BitSet FOLLOW_termChain_in_termExpr3271 = new BitSet(new long[]{0x0000000000000002L,0x0180000020300000L,0x0000000000000014L});
    public static final BitSet FOLLOW_idExprReq_in_termBase3303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_termBase3307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeBase_in_termBase3311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_termBase3315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeLiteral_in_typeBase3322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slotLiteral_in_typeBase3326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namedSuper_in_typeBase3330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_staticCall_in_typeBase3334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dsl_in_typeBase3356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_closure_in_typeBase3360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_in_typeBase3364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctorBlock_in_typeBase3368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_ctorBlock3375 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_itBlock_in_ctorBlock3377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_staticCall3384 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_DOT_in_staticCall3386 = new BitSet(new long[]{0x0000000000000000L,0x0200800000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_idExpr_in_staticCall3388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dotCall_in_termChain3419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dynCall_in_termChain3423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_safeDotCall_in_termChain3427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_safeDynCall_in_termChain3431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_indexExpr_in_termChain3438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callOp_in_termChain3442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_itBlock_in_termChain3446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_incDotCall_in_termChain3450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_incSafeDotCall_in_termChain3454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleType_in_dsl3469 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_DSL_in_dsl3471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_incDotCall3479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_SAFE_CALL_in_incSafeDotCall3495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketL_in_itBlock3515 = new BitSet(new long[]{0x000078FF87F81FF0L,0xFE3CE40010600000L,0x0000000000000017L});
    public static final BitSet FOLLOW_stmt_in_itBlock3518 = new BitSet(new long[]{0x000078FF87F81FF0L,0xFE3CE40052600000L,0x0000000000000017L});
    public static final BitSet FOLLOW_SP_COMMA_in_itBlock3520 = new BitSet(new long[]{0x000078FF87F81FF0L,0xFE3CE40050600000L,0x0000000000000017L});
    public static final BitSet FOLLOW_SP_SEMI_in_itBlock3523 = new BitSet(new long[]{0x000078FF87F81FF0L,0xFE3CE40010600000L,0x0000000000000017L});
    public static final BitSet FOLLOW_bracketR_in_itBlock3528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_dotCall3536 = new BitSet(new long[]{0x0000000000000000L,0x0200800000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_idExpr_in_dotCall3538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_ARROW_in_dynCall3558 = new BitSet(new long[]{0x0000000000000000L,0x0200800000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_idExpr_in_dynCall3560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_SAFE_CALL_in_safeDotCall3568 = new BitSet(new long[]{0x0000000000000000L,0x0200800000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_idExpr_in_safeDotCall3570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_SAFEDYN_CALL_in_safeDynCall3589 = new BitSet(new long[]{0x0000000000000000L,0x0200800000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_idExpr_in_safeDynCall3591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sq_bracketL_in_indexExpr3601 = new BitSet(new long[]{0x000078C000000000L,0xFE3CE40010000000L,0x0000000000000016L});
    public static final BitSet FOLLOW_expr_in_indexExpr3603 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_sq_bracketR_in_indexExpr3605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parL_in_callOp3616 = new BitSet(new long[]{0x000078C000000000L,0xFE3CE40010000000L,0x0000000000000036L});
    public static final BitSet FOLLOW_args_in_callOp3618 = new BitSet(new long[]{0x000078C000000000L,0xFE3CE40010000000L,0x0000000000000036L});
    public static final BitSet FOLLOW_parR_in_callOp3622 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_closure_in_callOp3624 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_funcType_in_closure3646 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_multiStmt_in_closure3648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idExprReq_in_idExpr3658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_idExpr3662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_in_idExprReq3670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_idExprReq3674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_MULTI_in_field3683 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_ID_in_field3685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_call3697 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_callParams_in_call3703 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_closure_in_call3707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callParams_in_call3714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_closure_in_call3720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parL_in_callParams3755 = new BitSet(new long[]{0x000078C000000000L,0xFE3CE40010000000L,0x0000000000000036L});
    public static final BitSet FOLLOW_args_in_callParams3757 = new BitSet(new long[]{0x000078C000000000L,0xFE3CE40010000000L,0x0000000000000036L});
    public static final BitSet FOLLOW_parR_in_callParams3760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_args3769 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_SP_COMMA_in_args3772 = new BitSet(new long[]{0x000078C000000000L,0xFE3CE40010000000L,0x0000000000000016L});
    public static final BitSet FOLLOW_expr_in_args3775 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_KW_NULL_in_literal3786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_THIS_in_literal3790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_SUPER_in_literal3794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_IT_in_literal3798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_TRUE_in_literal3802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FALSE_in_literal3806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_strs_in_literal3810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_URI_in_literal3814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_literal3821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_literal3825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namedSuper_in_literal3829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slotLiteral_in_literal3836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeLiteral_in_literal3840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_list_in_literal3844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_map_in_literal3848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_symbLiteral_in_literal3852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_in_literal3856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTSTR_in_strs3867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_in_strs3873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeLiteral3906 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_OP_POUND_in_typeLiteral3910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_slotLiteral3935 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_OP_POUND_in_slotLiteral3938 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_id_in_slotLiteral3942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_symbLiteral3970 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_id_in_symbLiteral3973 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_SP_COLON_in_symbLiteral3975 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_SP_COLON_in_symbLiteral3977 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_id_in_symbLiteral3981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleType_in_namedSuper4014 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_DOT_in_namedSuper4016 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_KW_SUPER_in_namedSuper4018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_list4046 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_sq_bracketL_in_list4052 = new BitSet(new long[]{0x000078C000000000L,0xFE3CE40012000000L,0x0000000000000016L});
    public static final BitSet FOLLOW_listItems_in_list4054 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_sq_bracketR_in_list4056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_listItems4084 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_SP_COMMA_in_listItems4087 = new BitSet(new long[]{0x000078C000000000L,0xFE3CE40010000000L,0x0000000000000016L});
    public static final BitSet FOLLOW_expr_in_listItems4089 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_SP_COMMA_in_listItems4094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_COMMA_in_listItems4100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mapType_in_map4111 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_sq_bracketL_in_map4117 = new BitSet(new long[]{0x000078C000000000L,0xFE3CE40011000000L,0x0000000000000016L});
    public static final BitSet FOLLOW_mapItems_in_map4119 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_sq_bracketR_in_map4121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mapPair_in_mapItems4149 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_SP_COMMA_in_mapItems4152 = new BitSet(new long[]{0x000078C000000000L,0xFE3CE40010000000L,0x0000000000000016L});
    public static final BitSet FOLLOW_mapPair_in_mapItems4154 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_SP_COMMA_in_mapItems4158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_COLON_in_mapItems4164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_mapPair4172 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_SP_COLON_in_mapPair4174 = new BitSet(new long[]{0x000078C000000000L,0xFE3CE40010000000L,0x0000000000000016L});
    public static final BitSet FOLLOW_expr_in_mapPair4176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_simple4184 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_parL_in_simple4186 = new BitSet(new long[]{0x000078C000000000L,0xFE3CE40010000000L,0x0000000000000016L});
    public static final BitSet FOLLOW_expr_in_simple4188 = new BitSet(new long[]{0x000078C000000000L,0xFE3CE40010000000L,0x0000000000000036L});
    public static final BitSet FOLLOW_parR_in_simple4190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOC_in_docs4202 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_OP_MINUS_in_number4224 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_number4227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_facet4235 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_id_in_facet4237 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_AS_EQUAL_in_facet4240 = new BitSet(new long[]{0x000078C000000000L,0xFE3CE40010000000L,0x0000000000000016L});
    public static final BitSet FOLLOW_expr_in_facet4242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_SEMI_in_eos4264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_id4288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_getter4309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_setter4322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_pod4336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRACKET_L_in_bracketL4358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRACKET_R_in_bracketR4376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SQ_BRACKET_L_in_sq_bracketL4394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SQ_BRACKET_R_in_sq_bracketR4412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_L_in_parL4430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_R_in_parR4448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_podDef_in_synpred2_Fan469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_facet_in_synpred17_Fan835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classFlags_in_synpred19_Fan840 = new BitSet(new long[]{0x0000000F94300000L});
    public static final BitSet FOLLOW_KW_CLASS_in_synpred19_Fan843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protection_in_synpred21_Fan854 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_KW_ENUM_in_synpred21_Fan857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_QMARK_in_synpred48_Fan1374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_QMARK_in_synpred49_Fan1380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIST_TYPE_in_synpred50_Fan1378 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_SP_QMARK_in_synpred50_Fan1380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mapType_in_synpred51_Fan1391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_COLON_in_synpred58_Fan1459 = new BitSet(new long[]{0x0000000000000000L,0x0200000010000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_synpred58_Fan1463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sq_bracketR_in_synpred59_Fan1467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_ARROW_in_synpred61_Fan1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_ARROW_in_synpred63_Fan1522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_synpred64_Fan1538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formalFull_in_synpred66_Fan1564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formalTypeOnly_in_synpred67_Fan1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_STATIC_in_synpred68_Fan1616 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_bracketL_in_synpred68_Fan1618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_facet_in_synpred69_Fan1632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctorFlags_in_synpred71_Fan1649 = new BitSet(new long[]{0x0000001F00000000L});
    public static final BitSet FOLLOW_KW_NEW_in_synpred71_Fan1652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodFlags_in_synpred74_Fan1666 = new BitSet(new long[]{0x0000002F8F600000L,0x0200000010000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_synpred74_Fan1670 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_KW_VOID_in_synpred74_Fan1674 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_id_in_synpred74_Fan1677 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_parL_in_synpred74_Fan1679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_getter_in_synpred78_Fan1764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_synpred80_Fan1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_synpred83_Fan1821 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_id_in_synpred83_Fan1823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiStmt_in_synpred106_Fan2105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketL_in_synpred115_Fan2299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprStmt_in_synpred126_Fan2396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_synpred127_Fan2413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ELSE_in_synpred131_Fan2497 = new BitSet(new long[]{0x000078C002001FF0L,0xFE3CE40010200000L,0x0000000000000017L});
    public static final BitSet FOLLOW_block_in_synpred131_Fan2499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_eos_in_synpred132_Fan2511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketL_in_synpred135_Fan2585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CATCH_in_synpred136_Fan2597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FINALLY_in_synpred137_Fan2606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forInitDef_in_synpred139_Fan2671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_catchDef_in_synpred141_Fan2700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketL_in_synpred142_Fan2705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketL_in_synpred143_Fan2746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred163_Fan3029 = new BitSet(new long[]{0x000078C000000000L,0xFE3CE40010000000L,0x0000000000000016L});
    public static final BitSet FOLLOW_bitAndExpr_in_synpred163_Fan3037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_CURRY_in_synpred164_Fan3051 = new BitSet(new long[]{0x000078C000000000L,0xFE3CE40010000000L,0x0000000000000016L});
    public static final BitSet FOLLOW_shiftExpr_in_synpred164_Fan3053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred168_Fan3090 = new BitSet(new long[]{0x000078C000000000L,0xFE3CE40010000000L,0x0000000000000016L});
    public static final BitSet FOLLOW_multExpr_in_synpred168_Fan3098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred172_Fan3127 = new BitSet(new long[]{0x000078C000000000L,0xFE3CE40010000000L,0x0000000000000016L});
    public static final BitSet FOLLOW_parenExpr_in_synpred172_Fan3139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_castExpr_in_synpred173_Fan3150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_groupedExpr_in_synpred174_Fan3154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termChain_in_synpred175_Fan3190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prefixExpr_in_synpred176_Fan3199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpr_in_synpred177_Fan3203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termChain_in_synpred185_Fan3271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idExprReq_in_synpred186_Fan3303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_synpred187_Fan3307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeBase_in_synpred188_Fan3311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeLiteral_in_synpred189_Fan3322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slotLiteral_in_synpred190_Fan3326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namedSuper_in_synpred191_Fan3330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_staticCall_in_synpred192_Fan3334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dsl_in_synpred193_Fan3356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_closure_in_synpred194_Fan3360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_in_synpred195_Fan3364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dotCall_in_synpred196_Fan3419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_safeDotCall_in_synpred198_Fan3427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_incDotCall_in_synpred203_Fan3450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_closure_in_synpred208_Fan3624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idExprReq_in_synpred209_Fan3658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callParams_in_synpred211_Fan3703 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_closure_in_synpred211_Fan3707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callParams_in_synpred212_Fan3714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namedSuper_in_synpred225_Fan3829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slotLiteral_in_synpred226_Fan3836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeLiteral_in_synpred227_Fan3840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_list_in_synpred228_Fan3844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_map_in_synpred229_Fan3848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_synpred234_Fan4046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mapType_in_synpred238_Fan4111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOC_in_synpred242_Fan4202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_SEMI_in_synpred245_Fan4264 = new BitSet(new long[]{0x0000000000000002L});

}