// $ANTLR 3.1.2 src/net/colar/netbeans/fan/antlr/Fan.g 2009-07-07 16:26:24
package net.colar.netbeans.fan.antlr;
import net.colar.netbeans.fan.FanParserResult;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class FanParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "KW_BREAK", "KW_CONTINUE", "KW_FOR", "KW_IF", "KW_RETURN", "KW_SWITCH", "KW_THROW", "KW_WHILE", "KW_TRY", "KW_CASE", "KW_DEFAULT", "KW_CATCH", "KW_FINALLY", "KW_USING", "KW_AS", "KW_RD_ONLY", "KW_CONST", "KW_STATIC", "KW_NATIVE", "KW_VOLATILE", "KW_OVERRIDE", "KW_VIRTUAL", "KW_FINAL", "KW_VOID", "KW_CLASS", "KW_ENUM", "KW_MIXIN", "KW_ABSTRACT", "KW_PRIVATE", "KW_PROTECTED", "KW_PUBLIC", "KW_INTERNAL", "KW_NEW", "KW_ONCE", "KW_THIS", "KW_SUPER", "KW_ELSE", "KW_IS", "KW_ISNOT", "KW_NULL", "KW_IT", "KW_TRUE", "KW_FALSE", "INC_STR", "INC_URI", "INC_COMMENT", "INC_DSL", "SP_COLCOL", "DOT", "SQ_BRACKET_L", "SQ_BRACKET_R", "BRACKET_L", "BRACKET_R", "SP_COLON", "SP_COMMA", "PAR_L", "PAR_R", "SP_QMARK", "LIST_TYPE", "SP_PIPE", "OP_ARROW", "AS_INIT_VAL", "SP_SEMI", "AS_EQUAL", "AS_ASSIGN_OP", "OP_OR", "OP_AND", "CP_EQUALITY", "CP_COMPARATORS", "OP_ELVIS", "OP_RANG_EXCL_OLD", "OP_RANGE_EXCL", "OP_RANGE", "OP_BITOR", "OP_CURRY", "OP_LSHIFT", "OP_RSHIFT", "OP_PLUS", "OP_MINUS", "OP_MULTI", "OP_DIV", "OP_MOD", "OP_BANG", "OP_2PLUS", "OP_2MINUS", "OP_TILDA", "DSL", "OP_SAFE_CALL", "OP_SAFEDYN_CALL", "AT", "ID", "QUOTSTR", "STR", "URI", "CHAR", "OP_POUND", "DOC", "NUMBER", "LB", "WS", "LINE_COMMENT", "EXEC_COMMENT", "COMPL_ML_COMMENT", "MULTI_COMMENT", "COMPL_DSL", "DIGIT", "HEXLETTER", "COMPL_QSTR", "COMPL_STR", "COMPL_URI", "KEYWORD", "UNDERSCORE", "HEX_HEADER", "HEXNB", "DECIMAL", "FRACTIONAL", "HEXHEADER", "FRACTION", "EXPONENT", "NBTYPE", "LETTER", "INC_UNKNOWN_ITEM"
    };
    public static final int EXPONENT=122;
    public static final int DSL=90;
    public static final int KW_NATIVE=22;
    public static final int OP_AND=70;
    public static final int LETTER=124;
    public static final int HEXNB=117;
    public static final int CHAR=98;
    public static final int KW_DEFAULT=14;
    public static final int OP_2PLUS=87;
    public static final int KW_ONCE=37;
    public static final int SP_SEMI=66;
    public static final int INC_UNKNOWN_ITEM=125;
    public static final int EOF=-1;
    public static final int KW_PUBLIC=34;
    public static final int KW_ISNOT=42;
    public static final int OP_MOD=85;
    public static final int PAR_R=60;
    public static final int OP_MINUS=82;
    public static final int KW_NEW=36;
    public static final int KW_BREAK=4;
    public static final int KW_SWITCH=9;
    public static final int OP_RANG_EXCL_OLD=74;
    public static final int OP_BITOR=77;
    public static final int QUOTSTR=95;
    public static final int OP_BANG=86;
    public static final int PAR_L=59;
    public static final int OP_MULTI=83;
    public static final int KEYWORD=114;
    public static final int KW_PROTECTED=33;
    public static final int LINE_COMMENT=104;
    public static final int CP_COMPARATORS=72;
    public static final int NUMBER=101;
    public static final int KW_CATCH=15;
    public static final int AS_EQUAL=67;
    public static final int UNDERSCORE=115;
    public static final int OP_DIV=84;
    public static final int SP_COMMA=58;
    public static final int URI=97;
    public static final int KW_FINALLY=16;
    public static final int WS=103;
    public static final int KW_THROW=10;
    public static final int OP_POUND=99;
    public static final int KW_STATIC=21;
    public static final int INC_COMMENT=49;
    public static final int SP_QMARK=61;
    public static final int HEXHEADER=120;
    public static final int AS_INIT_VAL=65;
    public static final int COMPL_DSL=108;
    public static final int NBTYPE=123;
    public static final int KW_SUPER=39;
    public static final int OP_2MINUS=88;
    public static final int KW_ELSE=40;
    public static final int OP_RSHIFT=80;
    public static final int OP_OR=69;
    public static final int DOC=100;
    public static final int KW_OVERRIDE=24;
    public static final int KW_ABSTRACT=31;
    public static final int MULTI_COMMENT=107;
    public static final int KW_CONST=20;
    public static final int COMPL_ML_COMMENT=106;
    public static final int OP_ELVIS=73;
    public static final int BRACKET_R=56;
    public static final int KW_TRUE=45;
    public static final int ID=94;
    public static final int SP_COLON=57;
    public static final int BRACKET_L=55;
    public static final int AT=93;
    public static final int STR=96;
    public static final int SP_PIPE=63;
    public static final int OP_RANGE_EXCL=75;
    public static final int COMPL_QSTR=111;
    public static final int KW_VIRTUAL=25;
    public static final int OP_TILDA=89;
    public static final int CP_EQUALITY=71;
    public static final int KW_FOR=6;
    public static final int KW_WHILE=11;
    public static final int COMPL_URI=113;
    public static final int OP_RANGE=76;
    public static final int KW_RETURN=8;
    public static final int INC_DSL=50;
    public static final int SQ_BRACKET_R=54;
    public static final int KW_IS=41;
    public static final int DIGIT=109;
    public static final int KW_TRY=12;
    public static final int KW_IT=44;
    public static final int DOT=52;
    public static final int KW_THIS=38;
    public static final int KW_IF=7;
    public static final int OP_CURRY=78;
    public static final int SQ_BRACKET_L=53;
    public static final int OP_PLUS=81;
    public static final int KW_FALSE=46;
    public static final int KW_INTERNAL=35;
    public static final int KW_FINAL=26;
    public static final int HEXLETTER=110;
    public static final int KW_CONTINUE=5;
    public static final int KW_PRIVATE=32;
    public static final int KW_ENUM=29;
    public static final int HEX_HEADER=116;
    public static final int OP_SAFEDYN_CALL=92;
    public static final int KW_VOLATILE=23;
    public static final int KW_CASE=13;
    public static final int LIST_TYPE=62;
    public static final int FRACTIONAL=119;
    public static final int OP_LSHIFT=79;
    public static final int EXEC_COMMENT=105;
    public static final int KW_MIXIN=30;
    public static final int OP_ARROW=64;
    public static final int KW_VOID=27;
    public static final int DECIMAL=118;
    public static final int INC_URI=48;
    public static final int KW_CLASS=28;
    public static final int AS_ASSIGN_OP=68;
    public static final int KW_RD_ONLY=19;
    public static final int INC_STR=47;
    public static final int KW_AS=18;
    public static final int OP_SAFE_CALL=91;
    public static final int COMPL_STR=112;
    public static final int LB=102;
    public static final int KW_USING=17;
    public static final int KW_NULL=43;
    public static final int FRACTION=121;
    public static final int SP_COLCOL=51;

    // delegates
    // delegators


        public FanParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public FanParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[376+1];
             
             
        }
        

    public String[] getTokenNames() { return FanParser.tokenNames; }
    public String getGrammarFileName() { return "src/net/colar/netbeans/fan/antlr/Fan.g"; }


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
    			// if next token is a BRACKET_R, that counts as a newline
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
    	prog();
    	return this.parsingResult;
        }
        @Override
        public void reportError(RecognitionException e)
        {
        	    parsingResult.addAntlrError(e);
        }
        
        Stack<String> paraphrase = new Stack<String>();




    // $ANTLR start "prog"
    // src/net/colar/netbeans/fan/antlr/Fan.g:210:1: prog : ( using )* ( typeDef )* docs EOF ;
    public final void prog() throws RecognitionException {
        int prog_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:210:7: ( ( using )* ( typeDef )* docs EOF )
            // src/net/colar/netbeans/fan/antlr/Fan.g:210:11: ( using )* ( typeDef )* docs EOF
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:210:11: ( using )*
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
            	    pushFollow(FOLLOW_using_in_prog357);
            	    using();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:210:18: ( typeDef )*
            loop2:
            do {
                int alt2=2;
                alt2 = dfa2.predict(input);
                switch (alt2) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: typeDef
            	    {
            	    pushFollow(FOLLOW_typeDef_in_prog360);
            	    typeDef();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            pushFollow(FOLLOW_docs_in_prog363);
            docs();

            state._fsp--;
            if (state.failed) return ;
            match(input,EOF,FOLLOW_EOF_in_prog365); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 1, prog_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "prog"


    // $ANTLR start "using"
    // src/net/colar/netbeans/fan/antlr/Fan.g:211:1: using : ( usingPod | usingType | usingAs ) ;
    public final void using() throws RecognitionException {
        int using_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:211:8: ( ( usingPod | usingType | usingAs ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:211:10: ( usingPod | usingType | usingAs )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:211:10: ( usingPod | usingType | usingAs )
            int alt3=3;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:211:11: usingPod
                    {
                    pushFollow(FOLLOW_usingPod_in_using374);
                    usingPod();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:211:22: usingType
                    {
                    pushFollow(FOLLOW_usingType_in_using378);
                    usingType();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:211:34: usingAs
                    {
                    pushFollow(FOLLOW_usingAs_in_using382);
                    usingAs();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 2, using_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "using"


    // $ANTLR start "usingPod"
    // src/net/colar/netbeans/fan/antlr/Fan.g:212:1: usingPod : KW_USING podSpec eos ;
    public final void usingPod() throws RecognitionException {
        int usingPod_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:213:3: ( KW_USING podSpec eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:213:5: KW_USING podSpec eos
            {
            match(input,KW_USING,FOLLOW_KW_USING_in_usingPod392); if (state.failed) return ;
            pushFollow(FOLLOW_podSpec_in_usingPod394);
            podSpec();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_eos_in_usingPod396);
            eos();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 3, usingPod_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "usingPod"


    // $ANTLR start "usingType"
    // src/net/colar/netbeans/fan/antlr/Fan.g:214:1: usingType : KW_USING podSpec SP_COLCOL id eos ;
    public final void usingType() throws RecognitionException {
        int usingType_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:215:3: ( KW_USING podSpec SP_COLCOL id eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:215:5: KW_USING podSpec SP_COLCOL id eos
            {
            match(input,KW_USING,FOLLOW_KW_USING_in_usingType406); if (state.failed) return ;
            pushFollow(FOLLOW_podSpec_in_usingType408);
            podSpec();

            state._fsp--;
            if (state.failed) return ;
            match(input,SP_COLCOL,FOLLOW_SP_COLCOL_in_usingType410); if (state.failed) return ;
            pushFollow(FOLLOW_id_in_usingType412);
            id();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_eos_in_usingType414);
            eos();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 4, usingType_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "usingType"


    // $ANTLR start "usingAs"
    // src/net/colar/netbeans/fan/antlr/Fan.g:216:1: usingAs : KW_USING podSpec SP_COLCOL id KW_AS id eos ;
    public final void usingAs() throws RecognitionException {
        int usingAs_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:216:10: ( KW_USING podSpec SP_COLCOL id KW_AS id eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:216:12: KW_USING podSpec SP_COLCOL id KW_AS id eos
            {
            match(input,KW_USING,FOLLOW_KW_USING_in_usingAs422); if (state.failed) return ;
            pushFollow(FOLLOW_podSpec_in_usingAs424);
            podSpec();

            state._fsp--;
            if (state.failed) return ;
            match(input,SP_COLCOL,FOLLOW_SP_COLCOL_in_usingAs426); if (state.failed) return ;
            pushFollow(FOLLOW_id_in_usingAs428);
            id();

            state._fsp--;
            if (state.failed) return ;
            match(input,KW_AS,FOLLOW_KW_AS_in_usingAs430); if (state.failed) return ;
            pushFollow(FOLLOW_id_in_usingAs432);
            id();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_eos_in_usingAs434);
            eos();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 5, usingAs_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "usingAs"


    // $ANTLR start "podSpec"
    // src/net/colar/netbeans/fan/antlr/Fan.g:217:1: podSpec : ( ffi )? id ( DOT id )* ;
    public final void podSpec() throws RecognitionException {
        int podSpec_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:217:10: ( ( ffi )? id ( DOT id )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:217:12: ( ffi )? id ( DOT id )*
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:217:12: ( ffi )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==SQ_BRACKET_L) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: ffi
                    {
                    pushFollow(FOLLOW_ffi_in_podSpec442);
                    ffi();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_podSpec445);
            id();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:217:20: ( DOT id )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==DOT) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:217:21: DOT id
            	    {
            	    match(input,DOT,FOLLOW_DOT_in_podSpec448); if (state.failed) return ;
            	    pushFollow(FOLLOW_id_in_podSpec450);
            	    id();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 6, podSpec_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "podSpec"


    // $ANTLR start "ffi"
    // src/net/colar/netbeans/fan/antlr/Fan.g:218:1: ffi : SQ_BRACKET_L id SQ_BRACKET_R ;
    public final void ffi() throws RecognitionException {
        int ffi_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:218:7: ( SQ_BRACKET_L id SQ_BRACKET_R )
            // src/net/colar/netbeans/fan/antlr/Fan.g:218:9: SQ_BRACKET_L id SQ_BRACKET_R
            {
            match(input,SQ_BRACKET_L,FOLLOW_SQ_BRACKET_L_in_ffi461); if (state.failed) return ;
            pushFollow(FOLLOW_id_in_ffi463);
            id();

            state._fsp--;
            if (state.failed) return ;
            match(input,SQ_BRACKET_R,FOLLOW_SQ_BRACKET_R_in_ffi465); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 7, ffi_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "ffi"


    // $ANTLR start "typeDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:220:1: typeDef : docs ( facet )* ( ( ( classFlags )* KW_CLASS )=> classDef | ( ( protection )? KW_ENUM )=> enumDef | mixinDef ) ;
    public final void typeDef() throws RecognitionException {
        int typeDef_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:220:10: ( docs ( facet )* ( ( ( classFlags )* KW_CLASS )=> classDef | ( ( protection )? KW_ENUM )=> enumDef | mixinDef ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:220:12: docs ( facet )* ( ( ( classFlags )* KW_CLASS )=> classDef | ( ( protection )? KW_ENUM )=> enumDef | mixinDef )
            {
            pushFollow(FOLLOW_docs_in_typeDef474);
            docs();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:220:17: ( facet )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==AT) ) {
                    int LA6_2 = input.LA(2);

                    if ( (LA6_2==ID) ) {
                        int LA6_3 = input.LA(3);

                        if ( (synpred7_Fan()) ) {
                            alt6=1;
                        }


                    }


                }


                switch (alt6) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: facet
            	    {
            	    pushFollow(FOLLOW_facet_in_typeDef476);
            	    facet();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:220:24: ( ( ( classFlags )* KW_CLASS )=> classDef | ( ( protection )? KW_ENUM )=> enumDef | mixinDef )
            int alt7=3;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:220:25: ( ( classFlags )* KW_CLASS )=> classDef
                    {
                    pushFollow(FOLLOW_classDef_in_typeDef487);
                    classDef();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:221:4: ( ( protection )? KW_ENUM )=> enumDef
                    {
                    pushFollow(FOLLOW_enumDef_in_typeDef501);
                    enumDef();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:221:37: mixinDef
                    {
                    pushFollow(FOLLOW_mixinDef_in_typeDef505);
                    mixinDef();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 8, typeDef_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "typeDef"


    // $ANTLR start "classDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:222:1: classDef : classHeader classBody ;
    public final void classDef() throws RecognitionException {
        int classDef_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:222:11: ( classHeader classBody )
            // src/net/colar/netbeans/fan/antlr/Fan.g:222:15: classHeader classBody
            {
            pushFollow(FOLLOW_classHeader_in_classDef516);
            classHeader();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_classBody_in_classDef518);
            classBody();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 9, classDef_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "classDef"


    // $ANTLR start "classHeader"
    // src/net/colar/netbeans/fan/antlr/Fan.g:223:1: classHeader : docs ( facet )* ( classFlags )* KW_CLASS id ( inheritance )? ;
    public final void classHeader() throws RecognitionException {
        int classHeader_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:223:13: ( docs ( facet )* ( classFlags )* KW_CLASS id ( inheritance )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:223:15: docs ( facet )* ( classFlags )* KW_CLASS id ( inheritance )?
            {
            pushFollow(FOLLOW_docs_in_classHeader525);
            docs();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:223:20: ( facet )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==AT) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: facet
            	    {
            	    pushFollow(FOLLOW_facet_in_classHeader527);
            	    facet();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:223:27: ( classFlags )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=KW_CONST && LA9_0<=KW_STATIC)||LA9_0==KW_FINAL||(LA9_0>=KW_ABSTRACT && LA9_0<=KW_INTERNAL)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: classFlags
            	    {
            	    pushFollow(FOLLOW_classFlags_in_classHeader530);
            	    classFlags();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match(input,KW_CLASS,FOLLOW_KW_CLASS_in_classHeader533); if (state.failed) return ;
            pushFollow(FOLLOW_id_in_classHeader535);
            id();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:223:51: ( inheritance )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==SP_COLON) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: inheritance
                    {
                    pushFollow(FOLLOW_inheritance_in_classHeader537);
                    inheritance();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 10, classHeader_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "classHeader"


    // $ANTLR start "classFlags"
    // src/net/colar/netbeans/fan/antlr/Fan.g:224:1: classFlags : ( protection | KW_ABSTRACT | KW_FINAL | KW_CONST | KW_STATIC );
    public final void classFlags() throws RecognitionException {
        int classFlags_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:224:13: ( protection | KW_ABSTRACT | KW_FINAL | KW_CONST | KW_STATIC )
            int alt11=5;
            switch ( input.LA(1) ) {
            case KW_PRIVATE:
            case KW_PROTECTED:
            case KW_PUBLIC:
            case KW_INTERNAL:
                {
                alt11=1;
                }
                break;
            case KW_ABSTRACT:
                {
                alt11=2;
                }
                break;
            case KW_FINAL:
                {
                alt11=3;
                }
                break;
            case KW_CONST:
                {
                alt11=4;
                }
                break;
            case KW_STATIC:
                {
                alt11=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:224:15: protection
                    {
                    pushFollow(FOLLOW_protection_in_classFlags546);
                    protection();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:224:28: KW_ABSTRACT
                    {
                    match(input,KW_ABSTRACT,FOLLOW_KW_ABSTRACT_in_classFlags550); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:224:42: KW_FINAL
                    {
                    match(input,KW_FINAL,FOLLOW_KW_FINAL_in_classFlags554); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:224:53: KW_CONST
                    {
                    match(input,KW_CONST,FOLLOW_KW_CONST_in_classFlags558); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:224:64: KW_STATIC
                    {
                    match(input,KW_STATIC,FOLLOW_KW_STATIC_in_classFlags562); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 11, classFlags_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "classFlags"


    // $ANTLR start "classBody"
    // src/net/colar/netbeans/fan/antlr/Fan.g:225:1: classBody : BRACKET_L ( slotDef )* BRACKET_R ;
    public final void classBody() throws RecognitionException {
        int classBody_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:225:12: ( BRACKET_L ( slotDef )* BRACKET_R )
            // src/net/colar/netbeans/fan/antlr/Fan.g:225:14: BRACKET_L ( slotDef )* BRACKET_R
            {
            match(input,BRACKET_L,FOLLOW_BRACKET_L_in_classBody570); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:225:24: ( slotDef )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=KW_RD_ONLY && LA12_0<=KW_VOID)||(LA12_0>=KW_ABSTRACT && LA12_0<=KW_ONCE)||LA12_0==SQ_BRACKET_L||LA12_0==SP_PIPE||(LA12_0>=AT && LA12_0<=ID)||LA12_0==DOC) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: slotDef
            	    {
            	    pushFollow(FOLLOW_slotDef_in_classBody572);
            	    slotDef();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            match(input,BRACKET_R,FOLLOW_BRACKET_R_in_classBody575); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 12, classBody_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "classBody"


    // $ANTLR start "protection"
    // src/net/colar/netbeans/fan/antlr/Fan.g:226:1: protection : ( KW_PUBLIC | KW_PROTECTED | KW_PRIVATE | KW_INTERNAL );
    public final void protection() throws RecognitionException {
        int protection_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:226:12: ( KW_PUBLIC | KW_PROTECTED | KW_PRIVATE | KW_INTERNAL )
            // src/net/colar/netbeans/fan/antlr/Fan.g:
            {
            if ( (input.LA(1)>=KW_PRIVATE && input.LA(1)<=KW_INTERNAL) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 13, protection_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "protection"


    // $ANTLR start "mixinDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:227:1: mixinDef : mixinHeader mixinBody ;
    public final void mixinDef() throws RecognitionException {
        int mixinDef_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:227:10: ( mixinHeader mixinBody )
            // src/net/colar/netbeans/fan/antlr/Fan.g:227:12: mixinHeader mixinBody
            {
            pushFollow(FOLLOW_mixinHeader_in_mixinDef601);
            mixinHeader();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_mixinBody_in_mixinDef603);
            mixinBody();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 14, mixinDef_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "mixinDef"


    // $ANTLR start "mixinHeader"
    // src/net/colar/netbeans/fan/antlr/Fan.g:228:1: mixinHeader : docs ( facet )* ( mixinFlags )* KW_MIXIN id ( inheritance )? ;
    public final void mixinHeader() throws RecognitionException {
        int mixinHeader_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:228:13: ( docs ( facet )* ( mixinFlags )* KW_MIXIN id ( inheritance )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:228:15: docs ( facet )* ( mixinFlags )* KW_MIXIN id ( inheritance )?
            {
            pushFollow(FOLLOW_docs_in_mixinHeader610);
            docs();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:228:20: ( facet )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==AT) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: facet
            	    {
            	    pushFollow(FOLLOW_facet_in_mixinHeader612);
            	    facet();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:228:27: ( mixinFlags )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=KW_CONST && LA14_0<=KW_STATIC)||LA14_0==KW_FINAL||(LA14_0>=KW_PRIVATE && LA14_0<=KW_INTERNAL)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: mixinFlags
            	    {
            	    pushFollow(FOLLOW_mixinFlags_in_mixinHeader615);
            	    mixinFlags();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            match(input,KW_MIXIN,FOLLOW_KW_MIXIN_in_mixinHeader618); if (state.failed) return ;
            pushFollow(FOLLOW_id_in_mixinHeader620);
            id();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:228:51: ( inheritance )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==SP_COLON) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: inheritance
                    {
                    pushFollow(FOLLOW_inheritance_in_mixinHeader622);
                    inheritance();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 15, mixinHeader_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "mixinHeader"


    // $ANTLR start "mixinFlags"
    // src/net/colar/netbeans/fan/antlr/Fan.g:229:1: mixinFlags : ( protection | KW_CONST | KW_STATIC | KW_FINAL );
    public final void mixinFlags() throws RecognitionException {
        int mixinFlags_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:229:12: ( protection | KW_CONST | KW_STATIC | KW_FINAL )
            int alt16=4;
            switch ( input.LA(1) ) {
            case KW_PRIVATE:
            case KW_PROTECTED:
            case KW_PUBLIC:
            case KW_INTERNAL:
                {
                alt16=1;
                }
                break;
            case KW_CONST:
                {
                alt16=2;
                }
                break;
            case KW_STATIC:
                {
                alt16=3;
                }
                break;
            case KW_FINAL:
                {
                alt16=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:229:14: protection
                    {
                    pushFollow(FOLLOW_protection_in_mixinFlags630);
                    protection();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:229:27: KW_CONST
                    {
                    match(input,KW_CONST,FOLLOW_KW_CONST_in_mixinFlags634); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:229:38: KW_STATIC
                    {
                    match(input,KW_STATIC,FOLLOW_KW_STATIC_in_mixinFlags638); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:229:50: KW_FINAL
                    {
                    match(input,KW_FINAL,FOLLOW_KW_FINAL_in_mixinFlags642); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 16, mixinFlags_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "mixinFlags"


    // $ANTLR start "mixinBody"
    // src/net/colar/netbeans/fan/antlr/Fan.g:230:1: mixinBody : BRACKET_L ( slotDef )* BRACKET_R ;
    public final void mixinBody() throws RecognitionException {
        int mixinBody_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:230:11: ( BRACKET_L ( slotDef )* BRACKET_R )
            // src/net/colar/netbeans/fan/antlr/Fan.g:230:13: BRACKET_L ( slotDef )* BRACKET_R
            {
            match(input,BRACKET_L,FOLLOW_BRACKET_L_in_mixinBody649); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:230:23: ( slotDef )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=KW_RD_ONLY && LA17_0<=KW_VOID)||(LA17_0>=KW_ABSTRACT && LA17_0<=KW_ONCE)||LA17_0==SQ_BRACKET_L||LA17_0==SP_PIPE||(LA17_0>=AT && LA17_0<=ID)||LA17_0==DOC) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: slotDef
            	    {
            	    pushFollow(FOLLOW_slotDef_in_mixinBody651);
            	    slotDef();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            match(input,BRACKET_R,FOLLOW_BRACKET_R_in_mixinBody654); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 17, mixinBody_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "mixinBody"


    // $ANTLR start "enumDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:231:1: enumDef : enumHeader enumBody ;
    public final void enumDef() throws RecognitionException {
        int enumDef_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:231:10: ( enumHeader enumBody )
            // src/net/colar/netbeans/fan/antlr/Fan.g:231:12: enumHeader enumBody
            {
            pushFollow(FOLLOW_enumHeader_in_enumDef662);
            enumHeader();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_enumBody_in_enumDef664);
            enumBody();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 18, enumDef_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "enumDef"


    // $ANTLR start "enumHeader"
    // src/net/colar/netbeans/fan/antlr/Fan.g:232:1: enumHeader : docs ( facet )* ( protection )? KW_ENUM id ( inheritance )? ;
    public final void enumHeader() throws RecognitionException {
        int enumHeader_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:232:12: ( docs ( facet )* ( protection )? KW_ENUM id ( inheritance )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:232:17: docs ( facet )* ( protection )? KW_ENUM id ( inheritance )?
            {
            pushFollow(FOLLOW_docs_in_enumHeader674);
            docs();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:232:22: ( facet )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==AT) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: facet
            	    {
            	    pushFollow(FOLLOW_facet_in_enumHeader676);
            	    facet();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:232:29: ( protection )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=KW_PRIVATE && LA19_0<=KW_INTERNAL)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: protection
                    {
                    pushFollow(FOLLOW_protection_in_enumHeader679);
                    protection();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,KW_ENUM,FOLLOW_KW_ENUM_in_enumHeader682); if (state.failed) return ;
            pushFollow(FOLLOW_id_in_enumHeader684);
            id();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:232:52: ( inheritance )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==SP_COLON) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: inheritance
                    {
                    pushFollow(FOLLOW_inheritance_in_enumHeader686);
                    inheritance();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 19, enumHeader_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "enumHeader"


    // $ANTLR start "enumBody"
    // src/net/colar/netbeans/fan/antlr/Fan.g:233:1: enumBody : BRACKET_L enumValDefs ( slotDef )* BRACKET_R ;
    public final void enumBody() throws RecognitionException {
        int enumBody_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:233:10: ( BRACKET_L enumValDefs ( slotDef )* BRACKET_R )
            // src/net/colar/netbeans/fan/antlr/Fan.g:233:12: BRACKET_L enumValDefs ( slotDef )* BRACKET_R
            {
            match(input,BRACKET_L,FOLLOW_BRACKET_L_in_enumBody694); if (state.failed) return ;
            pushFollow(FOLLOW_enumValDefs_in_enumBody696);
            enumValDefs();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:233:34: ( slotDef )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=KW_RD_ONLY && LA21_0<=KW_VOID)||(LA21_0>=KW_ABSTRACT && LA21_0<=KW_ONCE)||LA21_0==SQ_BRACKET_L||LA21_0==SP_PIPE||(LA21_0>=AT && LA21_0<=ID)||LA21_0==DOC) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: slotDef
            	    {
            	    pushFollow(FOLLOW_slotDef_in_enumBody698);
            	    slotDef();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            match(input,BRACKET_R,FOLLOW_BRACKET_R_in_enumBody701); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 20, enumBody_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "enumBody"


    // $ANTLR start "inheritance"
    // src/net/colar/netbeans/fan/antlr/Fan.g:234:1: inheritance : SP_COLON typeList ;
    public final void inheritance() throws RecognitionException {
        int inheritance_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:234:14: ( SP_COLON typeList )
            // src/net/colar/netbeans/fan/antlr/Fan.g:234:16: SP_COLON typeList
            {
            match(input,SP_COLON,FOLLOW_SP_COLON_in_inheritance710); if (state.failed) return ;
            pushFollow(FOLLOW_typeList_in_inheritance712);
            typeList();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 21, inheritance_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "inheritance"


    // $ANTLR start "enumValDefs"
    // src/net/colar/netbeans/fan/antlr/Fan.g:235:1: enumValDefs : enumValDef ( SP_COMMA enumValDef )* eos ;
    public final void enumValDefs() throws RecognitionException {
        int enumValDefs_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:235:14: ( enumValDef ( SP_COMMA enumValDef )* eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:235:16: enumValDef ( SP_COMMA enumValDef )* eos
            {
            pushFollow(FOLLOW_enumValDef_in_enumValDefs720);
            enumValDef();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:235:27: ( SP_COMMA enumValDef )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==SP_COMMA) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:235:28: SP_COMMA enumValDef
            	    {
            	    match(input,SP_COMMA,FOLLOW_SP_COMMA_in_enumValDefs723); if (state.failed) return ;
            	    pushFollow(FOLLOW_enumValDef_in_enumValDefs726);
            	    enumValDef();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            pushFollow(FOLLOW_eos_in_enumValDefs730);
            eos();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 22, enumValDefs_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "enumValDefs"


    // $ANTLR start "enumValDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:236:1: enumValDef : docs id ( PAR_L ( args )? PAR_R )? ;
    public final void enumValDef() throws RecognitionException {
        int enumValDef_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:236:13: ( docs id ( PAR_L ( args )? PAR_R )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:236:15: docs id ( PAR_L ( args )? PAR_R )?
            {
            pushFollow(FOLLOW_docs_in_enumValDef738);
            docs();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_id_in_enumValDef740);
            id();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:236:23: ( PAR_L ( args )? PAR_R )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==PAR_L) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:236:24: PAR_L ( args )? PAR_R
                    {
                    match(input,PAR_L,FOLLOW_PAR_L_in_enumValDef743); if (state.failed) return ;
                    // src/net/colar/netbeans/fan/antlr/Fan.g:236:30: ( args )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( ((LA23_0>=KW_THIS && LA23_0<=KW_SUPER)||(LA23_0>=KW_NULL && LA23_0<=KW_FALSE)||LA23_0==SQ_BRACKET_L||LA23_0==PAR_L||LA23_0==SP_PIPE||LA23_0==OP_CURRY||(LA23_0>=OP_PLUS && LA23_0<=OP_MINUS)||(LA23_0>=OP_BANG && LA23_0<=OP_TILDA)||(LA23_0>=AT && LA23_0<=OP_POUND)||LA23_0==NUMBER) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: args
                            {
                            pushFollow(FOLLOW_args_in_enumValDef745);
                            args();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }

                    match(input,PAR_R,FOLLOW_PAR_R_in_enumValDef748); if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 23, enumValDef_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "enumValDef"


    // $ANTLR start "typeList"
    // src/net/colar/netbeans/fan/antlr/Fan.g:237:1: typeList : type ( SP_COMMA type )* ;
    public final void typeList() throws RecognitionException {
        int typeList_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:237:10: ( type ( SP_COMMA type )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:237:14: type ( SP_COMMA type )*
            {
            pushFollow(FOLLOW_type_in_typeList759);
            type();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:237:19: ( SP_COMMA type )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==SP_COMMA) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:237:20: SP_COMMA type
            	    {
            	    match(input,SP_COMMA,FOLLOW_SP_COMMA_in_typeList762); if (state.failed) return ;
            	    pushFollow(FOLLOW_type_in_typeList764);
            	    type();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 24, typeList_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "typeList"


    // $ANTLR start "type"
    // src/net/colar/netbeans/fan/antlr/Fan.g:239:1: type : typeRoot ( SP_QMARK )? ( LIST_TYPE ( SP_QMARK )? )* ;
    public final void type() throws RecognitionException {
        int type_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:239:14: ( typeRoot ( SP_QMARK )? ( LIST_TYPE ( SP_QMARK )? )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:239:18: typeRoot ( SP_QMARK )? ( LIST_TYPE ( SP_QMARK )? )*
            {
            pushFollow(FOLLOW_typeRoot_in_type784);
            typeRoot();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:239:28: ( SP_QMARK )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==SP_QMARK) ) {
                int LA26_1 = input.LA(2);

                if ( (synpred38_Fan()) ) {
                    alt26=1;
                }
            }
            switch (alt26) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_QMARK
                    {
                    match(input,SP_QMARK,FOLLOW_SP_QMARK_in_type787); if (state.failed) return ;

                    }
                    break;

            }

            // src/net/colar/netbeans/fan/antlr/Fan.g:239:38: ( LIST_TYPE ( SP_QMARK )? )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==LIST_TYPE) ) {
                    int LA28_2 = input.LA(2);

                    if ( (synpred40_Fan()) ) {
                        alt28=1;
                    }


                }


                switch (alt28) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:239:39: LIST_TYPE ( SP_QMARK )?
            	    {
            	    match(input,LIST_TYPE,FOLLOW_LIST_TYPE_in_type791); if (state.failed) return ;
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:239:49: ( SP_QMARK )?
            	    int alt27=2;
            	    int LA27_0 = input.LA(1);

            	    if ( (LA27_0==SP_QMARK) ) {
            	        int LA27_1 = input.LA(2);

            	        if ( (synpred39_Fan()) ) {
            	            alt27=1;
            	        }
            	    }
            	    switch (alt27) {
            	        case 1 :
            	            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_QMARK
            	            {
            	            match(input,SP_QMARK,FOLLOW_SP_QMARK_in_type793); if (state.failed) return ;

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 25, type_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "type"


    // $ANTLR start "nonMapType"
    // src/net/colar/netbeans/fan/antlr/Fan.g:240:1: nonMapType : ( funcType | simpleType );
    public final void nonMapType() throws RecognitionException {
        int nonMapType_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:240:12: ( funcType | simpleType )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==SP_PIPE) ) {
                alt29=1;
            }
            else if ( (LA29_0==ID) ) {
                alt29=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:240:14: funcType
                    {
                    pushFollow(FOLLOW_funcType_in_nonMapType804);
                    funcType();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:240:25: simpleType
                    {
                    pushFollow(FOLLOW_simpleType_in_nonMapType808);
                    simpleType();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 26, nonMapType_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "nonMapType"


    // $ANTLR start "typeRoot"
    // src/net/colar/netbeans/fan/antlr/Fan.g:241:1: typeRoot : ( mapType | nonMapType );
    public final void typeRoot() throws RecognitionException {
        int typeRoot_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:241:10: ( mapType | nonMapType )
            int alt30=2;
            switch ( input.LA(1) ) {
            case SQ_BRACKET_L:
                {
                alt30=1;
                }
                break;
            case SP_PIPE:
                {
                int LA30_2 = input.LA(2);

                if ( (synpred42_Fan()) ) {
                    alt30=1;
                }
                else if ( (true) ) {
                    alt30=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 2, input);

                    throw nvae;
                }
                }
                break;
            case ID:
                {
                int LA30_3 = input.LA(2);

                if ( (synpred42_Fan()) ) {
                    alt30=1;
                }
                else if ( (true) ) {
                    alt30=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:241:12: mapType
                    {
                    pushFollow(FOLLOW_mapType_in_typeRoot815);
                    mapType();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:241:22: nonMapType
                    {
                    pushFollow(FOLLOW_nonMapType_in_typeRoot819);
                    nonMapType();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 27, typeRoot_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "typeRoot"


    // $ANTLR start "simpleType"
    // src/net/colar/netbeans/fan/antlr/Fan.g:242:1: simpleType : id ( SP_COLCOL id )? ;
    public final void simpleType() throws RecognitionException {
        int simpleType_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:242:17: ( id ( SP_COLCOL id )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:242:21: id ( SP_COLCOL id )?
            {
            pushFollow(FOLLOW_id_in_simpleType833);
            id();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:242:24: ( SP_COLCOL id )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==SP_COLCOL) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:242:25: SP_COLCOL id
                    {
                    match(input,SP_COLCOL,FOLLOW_SP_COLCOL_in_simpleType836); if (state.failed) return ;
                    pushFollow(FOLLOW_id_in_simpleType838);
                    id();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 28, simpleType_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "simpleType"


    // $ANTLR start "mapType"
    // src/net/colar/netbeans/fan/antlr/Fan.g:244:1: mapType : ( SQ_BRACKET_L )? nonMapType ( SP_QMARK )? ( LIST_TYPE ( SP_QMARK )? )* ({...}? SP_COLON {...}? type )+ ( SQ_BRACKET_R )? ;
    public final void mapType() throws RecognitionException {
        int mapType_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:244:10: ( ( SQ_BRACKET_L )? nonMapType ( SP_QMARK )? ( LIST_TYPE ( SP_QMARK )? )* ({...}? SP_COLON {...}? type )+ ( SQ_BRACKET_R )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:244:12: ( SQ_BRACKET_L )? nonMapType ( SP_QMARK )? ( LIST_TYPE ( SP_QMARK )? )* ({...}? SP_COLON {...}? type )+ ( SQ_BRACKET_R )?
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:244:12: ( SQ_BRACKET_L )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==SQ_BRACKET_L) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SQ_BRACKET_L
                    {
                    match(input,SQ_BRACKET_L,FOLLOW_SQ_BRACKET_L_in_mapType849); if (state.failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_nonMapType_in_mapType852);
            nonMapType();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:244:37: ( SP_QMARK )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==SP_QMARK) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_QMARK
                    {
                    match(input,SP_QMARK,FOLLOW_SP_QMARK_in_mapType854); if (state.failed) return ;

                    }
                    break;

            }

            // src/net/colar/netbeans/fan/antlr/Fan.g:244:47: ( LIST_TYPE ( SP_QMARK )? )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==LIST_TYPE) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:244:48: LIST_TYPE ( SP_QMARK )?
            	    {
            	    match(input,LIST_TYPE,FOLLOW_LIST_TYPE_in_mapType858); if (state.failed) return ;
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:244:58: ( SP_QMARK )?
            	    int alt34=2;
            	    int LA34_0 = input.LA(1);

            	    if ( (LA34_0==SP_QMARK) ) {
            	        alt34=1;
            	    }
            	    switch (alt34) {
            	        case 1 :
            	            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_QMARK
            	            {
            	            match(input,SP_QMARK,FOLLOW_SP_QMARK_in_mapType860); if (state.failed) return ;

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:245:5: ({...}? SP_COLON {...}? type )+
            int cnt36=0;
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==SP_COLON) ) {
                    int LA36_2 = input.LA(2);

                    if ( ((synpred48_Fan()&&(notAfterEol()))) ) {
                        alt36=1;
                    }


                }


                switch (alt36) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:245:6: {...}? SP_COLON {...}? type
            	    {
            	    if ( !((notAfterEol())) ) {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        throw new FailedPredicateException(input, "mapType", "notAfterEol()");
            	    }
            	    match(input,SP_COLON,FOLLOW_SP_COLON_in_mapType872); if (state.failed) return ;
            	    if ( !((notAfterEol())) ) {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        throw new FailedPredicateException(input, "mapType", "notAfterEol()");
            	    }
            	    pushFollow(FOLLOW_type_in_mapType876);
            	    type();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt36 >= 1 ) break loop36;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(36, input);
                        throw eee;
                }
                cnt36++;
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:245:56: ( SQ_BRACKET_R )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==SQ_BRACKET_R) ) {
                int LA37_1 = input.LA(2);

                if ( (synpred49_Fan()) ) {
                    alt37=1;
                }
            }
            switch (alt37) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SQ_BRACKET_R
                    {
                    match(input,SQ_BRACKET_R,FOLLOW_SQ_BRACKET_R_in_mapType880); if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 29, mapType_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "mapType"


    // $ANTLR start "funcType"
    // src/net/colar/netbeans/fan/antlr/Fan.g:246:1: funcType : SP_PIPE ( SP_COMMA | ( formals ( ( OP_ARROW )=> assignedType )? ) | ( ( OP_ARROW )=> assignedType ) ) SP_PIPE ;
    public final void funcType() throws RecognitionException {
        int funcType_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:246:11: ( SP_PIPE ( SP_COMMA | ( formals ( ( OP_ARROW )=> assignedType )? ) | ( ( OP_ARROW )=> assignedType ) ) SP_PIPE )
            // src/net/colar/netbeans/fan/antlr/Fan.g:246:13: SP_PIPE ( SP_COMMA | ( formals ( ( OP_ARROW )=> assignedType )? ) | ( ( OP_ARROW )=> assignedType ) ) SP_PIPE
            {
            match(input,SP_PIPE,FOLLOW_SP_PIPE_in_funcType889); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:246:21: ( SP_COMMA | ( formals ( ( OP_ARROW )=> assignedType )? ) | ( ( OP_ARROW )=> assignedType ) )
            int alt39=3;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==SP_COMMA) ) {
                alt39=1;
            }
            else if ( (LA39_0==SQ_BRACKET_L||LA39_0==SP_PIPE||LA39_0==ID) ) {
                alt39=2;
            }
            else if ( (LA39_0==OP_ARROW) && (synpred53_Fan())) {
                alt39=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:246:22: SP_COMMA
                    {
                    match(input,SP_COMMA,FOLLOW_SP_COMMA_in_funcType892); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:246:33: ( formals ( ( OP_ARROW )=> assignedType )? )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:246:33: ( formals ( ( OP_ARROW )=> assignedType )? )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:246:34: formals ( ( OP_ARROW )=> assignedType )?
                    {
                    pushFollow(FOLLOW_formals_in_funcType897);
                    formals();

                    state._fsp--;
                    if (state.failed) return ;
                    // src/net/colar/netbeans/fan/antlr/Fan.g:246:42: ( ( OP_ARROW )=> assignedType )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==OP_ARROW) && (synpred51_Fan())) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // src/net/colar/netbeans/fan/antlr/Fan.g:246:43: ( OP_ARROW )=> assignedType
                            {
                            pushFollow(FOLLOW_assignedType_in_funcType904);
                            assignedType();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:246:73: ( ( OP_ARROW )=> assignedType )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:246:73: ( ( OP_ARROW )=> assignedType )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:246:74: ( OP_ARROW )=> assignedType
                    {
                    pushFollow(FOLLOW_assignedType_in_funcType916);
                    assignedType();

                    state._fsp--;
                    if (state.failed) return ;

                    }


                    }
                    break;

            }

            match(input,SP_PIPE,FOLLOW_SP_PIPE_in_funcType920); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 30, funcType_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "funcType"


    // $ANTLR start "assignedType"
    // src/net/colar/netbeans/fan/antlr/Fan.g:247:1: assignedType : OP_ARROW type ;
    public final void assignedType() throws RecognitionException {
        int assignedType_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:247:14: ( OP_ARROW type )
            // src/net/colar/netbeans/fan/antlr/Fan.g:247:16: OP_ARROW type
            {
            match(input,OP_ARROW,FOLLOW_OP_ARROW_in_assignedType927); if (state.failed) return ;
            pushFollow(FOLLOW_type_in_assignedType929);
            type();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 31, assignedType_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "assignedType"


    // $ANTLR start "formals"
    // src/net/colar/netbeans/fan/antlr/Fan.g:248:1: formals : formal ( SP_COMMA formal )* ;
    public final void formals() throws RecognitionException {
        int formals_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:248:10: ( formal ( SP_COMMA formal )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:248:14: formal ( SP_COMMA formal )*
            {
            pushFollow(FOLLOW_formal_in_formals939);
            formal();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:248:21: ( SP_COMMA formal )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==SP_COMMA) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:248:22: SP_COMMA formal
            	    {
            	    match(input,SP_COMMA,FOLLOW_SP_COMMA_in_formals942); if (state.failed) return ;
            	    pushFollow(FOLLOW_formal_in_formals944);
            	    formal();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 32, formals_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "formals"


    // $ANTLR start "formal"
    // src/net/colar/netbeans/fan/antlr/Fan.g:249:1: formal : ( formalFull | formalTypeOnly | formalInferred );
    public final void formal() throws RecognitionException {
        int formal_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:249:9: ( formalFull | formalTypeOnly | formalInferred )
            int alt41=3;
            switch ( input.LA(1) ) {
            case SQ_BRACKET_L:
                {
                int LA41_1 = input.LA(2);

                if ( (synpred55_Fan()) ) {
                    alt41=1;
                }
                else if ( (synpred56_Fan()) ) {
                    alt41=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 1, input);

                    throw nvae;
                }
                }
                break;
            case SP_PIPE:
                {
                int LA41_2 = input.LA(2);

                if ( (synpred55_Fan()) ) {
                    alt41=1;
                }
                else if ( (synpred56_Fan()) ) {
                    alt41=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 2, input);

                    throw nvae;
                }
                }
                break;
            case ID:
                {
                int LA41_3 = input.LA(2);

                if ( (synpred55_Fan()) ) {
                    alt41=1;
                }
                else if ( (synpred56_Fan()) ) {
                    alt41=2;
                }
                else if ( (true) ) {
                    alt41=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:249:11: formalFull
                    {
                    pushFollow(FOLLOW_formalFull_in_formal954);
                    formalFull();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:249:24: formalTypeOnly
                    {
                    pushFollow(FOLLOW_formalTypeOnly_in_formal958);
                    formalTypeOnly();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:249:41: formalInferred
                    {
                    pushFollow(FOLLOW_formalInferred_in_formal962);
                    formalInferred();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 33, formal_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "formal"


    // $ANTLR start "formalFull"
    // src/net/colar/netbeans/fan/antlr/Fan.g:250:1: formalFull : type id ;
    public final void formalFull() throws RecognitionException {
        int formalFull_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:250:17: ( type id )
            // src/net/colar/netbeans/fan/antlr/Fan.g:250:19: type id
            {
            pushFollow(FOLLOW_type_in_formalFull974);
            type();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_id_in_formalFull976);
            id();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 34, formalFull_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "formalFull"


    // $ANTLR start "formalTypeOnly"
    // src/net/colar/netbeans/fan/antlr/Fan.g:251:1: formalTypeOnly : type ;
    public final void formalTypeOnly() throws RecognitionException {
        int formalTypeOnly_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:251:17: ( type )
            // src/net/colar/netbeans/fan/antlr/Fan.g:251:21: type
            {
            pushFollow(FOLLOW_type_in_formalTypeOnly986);
            type();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 35, formalTypeOnly_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "formalTypeOnly"


    // $ANTLR start "formalInferred"
    // src/net/colar/netbeans/fan/antlr/Fan.g:252:1: formalInferred : id ;
    public final void formalInferred() throws RecognitionException {
        int formalInferred_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:252:17: ( id )
            // src/net/colar/netbeans/fan/antlr/Fan.g:252:21: id
            {
            pushFollow(FOLLOW_id_in_formalInferred996);
            id();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 36, formalInferred_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "formalInferred"


    // $ANTLR start "slotDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:253:1: slotDef : ( ( KW_STATIC BRACKET_L )=> staticBlock | ( docs ( facet )* ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id PAR_L )=> methodDef | fieldDef ) ) ) ;
    public final void slotDef() throws RecognitionException {
        int slotDef_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:253:10: ( ( ( KW_STATIC BRACKET_L )=> staticBlock | ( docs ( facet )* ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id PAR_L )=> methodDef | fieldDef ) ) ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:253:12: ( ( KW_STATIC BRACKET_L )=> staticBlock | ( docs ( facet )* ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id PAR_L )=> methodDef | fieldDef ) ) )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:253:12: ( ( KW_STATIC BRACKET_L )=> staticBlock | ( docs ( facet )* ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id PAR_L )=> methodDef | fieldDef ) ) )
            int alt44=2;
            alt44 = dfa44.predict(input);
            switch (alt44) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:253:13: ( KW_STATIC BRACKET_L )=> staticBlock
                    {
                    pushFollow(FOLLOW_staticBlock_in_slotDef1012);
                    staticBlock();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:254:5: ( docs ( facet )* ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id PAR_L )=> methodDef | fieldDef ) )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:254:5: ( docs ( facet )* ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id PAR_L )=> methodDef | fieldDef ) )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:254:6: docs ( facet )* ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id PAR_L )=> methodDef | fieldDef )
                    {
                    pushFollow(FOLLOW_docs_in_slotDef1020);
                    docs();

                    state._fsp--;
                    if (state.failed) return ;
                    // src/net/colar/netbeans/fan/antlr/Fan.g:254:11: ( facet )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==AT) ) {
                            int LA42_2 = input.LA(2);

                            if ( (LA42_2==ID) ) {
                                int LA42_3 = input.LA(3);

                                if ( (synpred58_Fan()) ) {
                                    alt42=1;
                                }


                            }


                        }


                        switch (alt42) {
                    	case 1 :
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: facet
                    	    {
                    	    pushFollow(FOLLOW_facet_in_slotDef1022);
                    	    facet();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);

                    // src/net/colar/netbeans/fan/antlr/Fan.g:255:6: ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id PAR_L )=> methodDef | fieldDef )
                    int alt43=3;
                    alt43 = dfa43.predict(input);
                    switch (alt43) {
                        case 1 :
                            // src/net/colar/netbeans/fan/antlr/Fan.g:256:7: ( ( ctorFlags )* KW_NEW )=> ctorDef
                            {
                            pushFollow(FOLLOW_ctorDef_in_slotDef1045);
                            ctorDef();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            // src/net/colar/netbeans/fan/antlr/Fan.g:257:7: ( ( methodFlags )* ( type | KW_VOID ) id PAR_L )=> methodDef
                            {
                            pushFollow(FOLLOW_methodDef_in_slotDef1072);
                            methodDef();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 3 :
                            // src/net/colar/netbeans/fan/antlr/Fan.g:258:7: fieldDef
                            {
                            pushFollow(FOLLOW_fieldDef_in_slotDef1082);
                            fieldDef();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 37, slotDef_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "slotDef"


    // $ANTLR start "fieldDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:262:1: fieldDef : docs ( facet )* fieldFlags typeId ( AS_INIT_VAL expr )? ( ( BRACKET_L ( ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )? )+ BRACKET_R ) | eos ) ;
    public final void fieldDef() throws RecognitionException {
        int fieldDef_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:262:10: ( docs ( facet )* fieldFlags typeId ( AS_INIT_VAL expr )? ( ( BRACKET_L ( ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )? )+ BRACKET_R ) | eos ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:262:12: docs ( facet )* fieldFlags typeId ( AS_INIT_VAL expr )? ( ( BRACKET_L ( ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )? )+ BRACKET_R ) | eos )
            {
            pushFollow(FOLLOW_docs_in_fieldDef1107);
            docs();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:262:17: ( facet )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==AT) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: facet
            	    {
            	    pushFollow(FOLLOW_facet_in_fieldDef1109);
            	    facet();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            pushFollow(FOLLOW_fieldFlags_in_fieldDef1112);
            fieldFlags();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_typeId_in_fieldDef1114);
            typeId();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:262:42: ( AS_INIT_VAL expr )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==AS_INIT_VAL) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:262:43: AS_INIT_VAL expr
                    {
                    match(input,AS_INIT_VAL,FOLLOW_AS_INIT_VAL_in_fieldDef1117); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_fieldDef1119);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            // src/net/colar/netbeans/fan/antlr/Fan.g:263:5: ( ( BRACKET_L ( ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )? )+ BRACKET_R ) | eos )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==BRACKET_L) ) {
                alt52=1;
            }
            else if ( (LA52_0==EOF||(LA52_0>=KW_RD_ONLY && LA52_0<=KW_VOID)||(LA52_0>=KW_ABSTRACT && LA52_0<=KW_ONCE)||LA52_0==SQ_BRACKET_L||LA52_0==BRACKET_R||LA52_0==SP_PIPE||LA52_0==SP_SEMI||(LA52_0>=AT && LA52_0<=ID)||LA52_0==DOC) ) {
                alt52=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:264:5: ( BRACKET_L ( ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )? )+ BRACKET_R )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:264:5: ( BRACKET_L ( ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )? )+ BRACKET_R )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:264:6: BRACKET_L ( ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )? )+ BRACKET_R
                    {
                    match(input,BRACKET_L,FOLLOW_BRACKET_L_in_fieldDef1134); if (state.failed) return ;
                    // src/net/colar/netbeans/fan/antlr/Fan.g:264:16: ( ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )? )+
                    int cnt51=0;
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( ((LA51_0>=KW_PRIVATE && LA51_0<=KW_INTERNAL)||LA51_0==ID) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:264:17: ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )?
                    	    {
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:264:17: ( protection )?
                    	    int alt47=2;
                    	    int LA47_0 = input.LA(1);

                    	    if ( ((LA47_0>=KW_PRIVATE && LA47_0<=KW_INTERNAL)) ) {
                    	        alt47=1;
                    	    }
                    	    switch (alt47) {
                    	        case 1 :
                    	            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: protection
                    	            {
                    	            pushFollow(FOLLOW_protection_in_fieldDef1137);
                    	            protection();

                    	            state._fsp--;
                    	            if (state.failed) return ;

                    	            }
                    	            break;

                    	    }

                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:264:29: ( getter | setter )
                    	    int alt48=2;
                    	    int LA48_0 = input.LA(1);

                    	    if ( (LA48_0==ID) ) {
                    	        int LA48_1 = input.LA(2);

                    	        if ( (synpred67_Fan()) ) {
                    	            alt48=1;
                    	        }
                    	        else if ( (true) ) {
                    	            alt48=2;
                    	        }
                    	        else {
                    	            if (state.backtracking>0) {state.failed=true; return ;}
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("", 48, 1, input);

                    	            throw nvae;
                    	        }
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return ;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 48, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt48) {
                    	        case 1 :
                    	            // src/net/colar/netbeans/fan/antlr/Fan.g:264:30: getter
                    	            {
                    	            pushFollow(FOLLOW_getter_in_fieldDef1141);
                    	            getter();

                    	            state._fsp--;
                    	            if (state.failed) return ;

                    	            }
                    	            break;
                    	        case 2 :
                    	            // src/net/colar/netbeans/fan/antlr/Fan.g:264:39: setter
                    	            {
                    	            pushFollow(FOLLOW_setter_in_fieldDef1145);
                    	            setter();

                    	            state._fsp--;
                    	            if (state.failed) return ;

                    	            }
                    	            break;

                    	    }

                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:264:47: ( SP_SEMI )?
                    	    int alt49=2;
                    	    int LA49_0 = input.LA(1);

                    	    if ( (LA49_0==SP_SEMI) ) {
                    	        alt49=1;
                    	    }
                    	    switch (alt49) {
                    	        case 1 :
                    	            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_SEMI
                    	            {
                    	            match(input,SP_SEMI,FOLLOW_SP_SEMI_in_fieldDef1148); if (state.failed) return ;

                    	            }
                    	            break;

                    	    }

                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:264:56: ( block )?
                    	    int alt50=2;
                    	    int LA50_0 = input.LA(1);

                    	    if ( ((LA50_0>=KW_BREAK && LA50_0<=KW_TRY)||(LA50_0>=KW_THIS && LA50_0<=KW_SUPER)||(LA50_0>=KW_NULL && LA50_0<=KW_FALSE)||LA50_0==SQ_BRACKET_L||LA50_0==BRACKET_L||LA50_0==PAR_L||LA50_0==SP_PIPE||LA50_0==OP_CURRY||(LA50_0>=OP_PLUS && LA50_0<=OP_MINUS)||(LA50_0>=OP_BANG && LA50_0<=OP_TILDA)||LA50_0==AT||(LA50_0>=QUOTSTR && LA50_0<=OP_POUND)||LA50_0==NUMBER) ) {
                    	        alt50=1;
                    	    }
                    	    else if ( (LA50_0==ID) ) {
                    	        int LA50_2 = input.LA(2);

                    	        if ( (synpred69_Fan()) ) {
                    	            alt50=1;
                    	        }
                    	    }
                    	    switch (alt50) {
                    	        case 1 :
                    	            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: block
                    	            {
                    	            pushFollow(FOLLOW_block_in_fieldDef1151);
                    	            block();

                    	            state._fsp--;
                    	            if (state.failed) return ;

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt51 >= 1 ) break loop51;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(51, input);
                                throw eee;
                        }
                        cnt51++;
                    } while (true);

                    match(input,BRACKET_R,FOLLOW_BRACKET_R_in_fieldDef1156); if (state.failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:265:7: eos
                    {
                    pushFollow(FOLLOW_eos_in_fieldDef1165);
                    eos();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 38, fieldDef_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "fieldDef"


    // $ANTLR start "typeId"
    // src/net/colar/netbeans/fan/antlr/Fan.g:267:1: typeId : ( ( type id )=> typeAndId | id ) ;
    public final void typeId() throws RecognitionException {
        int typeId_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:267:9: ( ( ( type id )=> typeAndId | id ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:267:11: ( ( type id )=> typeAndId | id )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:267:11: ( ( type id )=> typeAndId | id )
            int alt53=2;
            alt53 = dfa53.predict(input);
            switch (alt53) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:267:12: ( type id )=> typeAndId
                    {
                    pushFollow(FOLLOW_typeAndId_in_typeId1182);
                    typeAndId();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:267:35: id
                    {
                    pushFollow(FOLLOW_id_in_typeId1186);
                    id();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 39, typeId_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "typeId"


    // $ANTLR start "typeAndId"
    // src/net/colar/netbeans/fan/antlr/Fan.g:268:1: typeAndId : type id ;
    public final void typeAndId() throws RecognitionException {
        int typeAndId_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:268:11: ( type id )
            // src/net/colar/netbeans/fan/antlr/Fan.g:268:13: type id
            {
            pushFollow(FOLLOW_type_in_typeAndId1194);
            type();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_id_in_typeAndId1196);
            id();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 40, typeAndId_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "typeAndId"


    // $ANTLR start "fieldFlags"
    // src/net/colar/netbeans/fan/antlr/Fan.g:269:1: fieldFlags : ( KW_ABSTRACT | KW_RD_ONLY | KW_CONST | KW_STATIC | KW_NATIVE | KW_VOLATILE | KW_OVERRIDE | KW_VIRTUAL | KW_FINAL | protection )* ;
    public final void fieldFlags() throws RecognitionException {
        int fieldFlags_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:269:12: ( ( KW_ABSTRACT | KW_RD_ONLY | KW_CONST | KW_STATIC | KW_NATIVE | KW_VOLATILE | KW_OVERRIDE | KW_VIRTUAL | KW_FINAL | protection )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:269:14: ( KW_ABSTRACT | KW_RD_ONLY | KW_CONST | KW_STATIC | KW_NATIVE | KW_VOLATILE | KW_OVERRIDE | KW_VIRTUAL | KW_FINAL | protection )*
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:269:14: ( KW_ABSTRACT | KW_RD_ONLY | KW_CONST | KW_STATIC | KW_NATIVE | KW_VOLATILE | KW_OVERRIDE | KW_VIRTUAL | KW_FINAL | protection )*
            loop54:
            do {
                int alt54=11;
                switch ( input.LA(1) ) {
                case KW_ABSTRACT:
                    {
                    alt54=1;
                    }
                    break;
                case KW_RD_ONLY:
                    {
                    alt54=2;
                    }
                    break;
                case KW_CONST:
                    {
                    alt54=3;
                    }
                    break;
                case KW_STATIC:
                    {
                    alt54=4;
                    }
                    break;
                case KW_NATIVE:
                    {
                    alt54=5;
                    }
                    break;
                case KW_VOLATILE:
                    {
                    alt54=6;
                    }
                    break;
                case KW_OVERRIDE:
                    {
                    alt54=7;
                    }
                    break;
                case KW_VIRTUAL:
                    {
                    alt54=8;
                    }
                    break;
                case KW_FINAL:
                    {
                    alt54=9;
                    }
                    break;
                case KW_PRIVATE:
                case KW_PROTECTED:
                case KW_PUBLIC:
                case KW_INTERNAL:
                    {
                    alt54=10;
                    }
                    break;

                }

                switch (alt54) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:269:15: KW_ABSTRACT
            	    {
            	    match(input,KW_ABSTRACT,FOLLOW_KW_ABSTRACT_in_fieldFlags1204); if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:269:29: KW_RD_ONLY
            	    {
            	    match(input,KW_RD_ONLY,FOLLOW_KW_RD_ONLY_in_fieldFlags1208); if (state.failed) return ;

            	    }
            	    break;
            	case 3 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:269:42: KW_CONST
            	    {
            	    match(input,KW_CONST,FOLLOW_KW_CONST_in_fieldFlags1212); if (state.failed) return ;

            	    }
            	    break;
            	case 4 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:269:53: KW_STATIC
            	    {
            	    match(input,KW_STATIC,FOLLOW_KW_STATIC_in_fieldFlags1216); if (state.failed) return ;

            	    }
            	    break;
            	case 5 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:269:65: KW_NATIVE
            	    {
            	    match(input,KW_NATIVE,FOLLOW_KW_NATIVE_in_fieldFlags1220); if (state.failed) return ;

            	    }
            	    break;
            	case 6 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:269:77: KW_VOLATILE
            	    {
            	    match(input,KW_VOLATILE,FOLLOW_KW_VOLATILE_in_fieldFlags1224); if (state.failed) return ;

            	    }
            	    break;
            	case 7 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:269:91: KW_OVERRIDE
            	    {
            	    match(input,KW_OVERRIDE,FOLLOW_KW_OVERRIDE_in_fieldFlags1228); if (state.failed) return ;

            	    }
            	    break;
            	case 8 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:269:105: KW_VIRTUAL
            	    {
            	    match(input,KW_VIRTUAL,FOLLOW_KW_VIRTUAL_in_fieldFlags1232); if (state.failed) return ;

            	    }
            	    break;
            	case 9 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:269:118: KW_FINAL
            	    {
            	    match(input,KW_FINAL,FOLLOW_KW_FINAL_in_fieldFlags1236); if (state.failed) return ;

            	    }
            	    break;
            	case 10 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:269:129: protection
            	    {
            	    pushFollow(FOLLOW_protection_in_fieldFlags1240);
            	    protection();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 41, fieldFlags_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "fieldFlags"


    // $ANTLR start "methodDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:270:1: methodDef : docs ( facet )* ( methodFlags )* ( type | KW_VOID ) id PAR_L params PAR_R methodBody ;
    public final void methodDef() throws RecognitionException {
        int methodDef_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:270:11: ( docs ( facet )* ( methodFlags )* ( type | KW_VOID ) id PAR_L params PAR_R methodBody )
            // src/net/colar/netbeans/fan/antlr/Fan.g:270:13: docs ( facet )* ( methodFlags )* ( type | KW_VOID ) id PAR_L params PAR_R methodBody
            {
            pushFollow(FOLLOW_docs_in_methodDef1249);
            docs();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:270:18: ( facet )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==AT) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: facet
            	    {
            	    pushFollow(FOLLOW_facet_in_methodDef1251);
            	    facet();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:270:25: ( methodFlags )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( ((LA56_0>=KW_STATIC && LA56_0<=KW_NATIVE)||(LA56_0>=KW_OVERRIDE && LA56_0<=KW_FINAL)||(LA56_0>=KW_ABSTRACT && LA56_0<=KW_INTERNAL)||LA56_0==KW_ONCE) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: methodFlags
            	    {
            	    pushFollow(FOLLOW_methodFlags_in_methodDef1254);
            	    methodFlags();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:270:38: ( type | KW_VOID )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==SQ_BRACKET_L||LA57_0==SP_PIPE||LA57_0==ID) ) {
                alt57=1;
            }
            else if ( (LA57_0==KW_VOID) ) {
                alt57=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:270:39: type
                    {
                    pushFollow(FOLLOW_type_in_methodDef1258);
                    type();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:270:46: KW_VOID
                    {
                    match(input,KW_VOID,FOLLOW_KW_VOID_in_methodDef1262); if (state.failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_methodDef1265);
            id();

            state._fsp--;
            if (state.failed) return ;
            match(input,PAR_L,FOLLOW_PAR_L_in_methodDef1267); if (state.failed) return ;
            pushFollow(FOLLOW_params_in_methodDef1269);
            params();

            state._fsp--;
            if (state.failed) return ;
            match(input,PAR_R,FOLLOW_PAR_R_in_methodDef1271); if (state.failed) return ;
            pushFollow(FOLLOW_methodBody_in_methodDef1273);
            methodBody();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 42, methodDef_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "methodDef"


    // $ANTLR start "methodFlags"
    // src/net/colar/netbeans/fan/antlr/Fan.g:271:1: methodFlags : ( protection | KW_VIRTUAL | KW_OVERRIDE | KW_ABSTRACT | KW_STATIC | KW_ONCE | KW_NATIVE | KW_FINAL );
    public final void methodFlags() throws RecognitionException {
        int methodFlags_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:271:13: ( protection | KW_VIRTUAL | KW_OVERRIDE | KW_ABSTRACT | KW_STATIC | KW_ONCE | KW_NATIVE | KW_FINAL )
            int alt58=8;
            switch ( input.LA(1) ) {
            case KW_PRIVATE:
            case KW_PROTECTED:
            case KW_PUBLIC:
            case KW_INTERNAL:
                {
                alt58=1;
                }
                break;
            case KW_VIRTUAL:
                {
                alt58=2;
                }
                break;
            case KW_OVERRIDE:
                {
                alt58=3;
                }
                break;
            case KW_ABSTRACT:
                {
                alt58=4;
                }
                break;
            case KW_STATIC:
                {
                alt58=5;
                }
                break;
            case KW_ONCE:
                {
                alt58=6;
                }
                break;
            case KW_NATIVE:
                {
                alt58=7;
                }
                break;
            case KW_FINAL:
                {
                alt58=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:271:15: protection
                    {
                    pushFollow(FOLLOW_protection_in_methodFlags1280);
                    protection();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:271:28: KW_VIRTUAL
                    {
                    match(input,KW_VIRTUAL,FOLLOW_KW_VIRTUAL_in_methodFlags1284); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:271:41: KW_OVERRIDE
                    {
                    match(input,KW_OVERRIDE,FOLLOW_KW_OVERRIDE_in_methodFlags1288); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:271:55: KW_ABSTRACT
                    {
                    match(input,KW_ABSTRACT,FOLLOW_KW_ABSTRACT_in_methodFlags1292); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:271:69: KW_STATIC
                    {
                    match(input,KW_STATIC,FOLLOW_KW_STATIC_in_methodFlags1296); if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:271:81: KW_ONCE
                    {
                    match(input,KW_ONCE,FOLLOW_KW_ONCE_in_methodFlags1300); if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:272:5: KW_NATIVE
                    {
                    match(input,KW_NATIVE,FOLLOW_KW_NATIVE_in_methodFlags1308); if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:272:17: KW_FINAL
                    {
                    match(input,KW_FINAL,FOLLOW_KW_FINAL_in_methodFlags1312); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 43, methodFlags_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "methodFlags"


    // $ANTLR start "params"
    // src/net/colar/netbeans/fan/antlr/Fan.g:273:1: params : ( param ( SP_COMMA param )* )? ;
    public final void params() throws RecognitionException {
        int params_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:273:9: ( ( param ( SP_COMMA param )* )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:273:11: ( param ( SP_COMMA param )* )?
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:273:11: ( param ( SP_COMMA param )* )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==SQ_BRACKET_L||LA60_0==SP_PIPE||LA60_0==ID) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:273:12: param ( SP_COMMA param )*
                    {
                    pushFollow(FOLLOW_param_in_params1321);
                    param();

                    state._fsp--;
                    if (state.failed) return ;
                    // src/net/colar/netbeans/fan/antlr/Fan.g:273:18: ( SP_COMMA param )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==SP_COMMA) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:273:19: SP_COMMA param
                    	    {
                    	    match(input,SP_COMMA,FOLLOW_SP_COMMA_in_params1324); if (state.failed) return ;
                    	    pushFollow(FOLLOW_param_in_params1326);
                    	    param();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop59;
                        }
                    } while (true);


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 44, params_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "params"


    // $ANTLR start "param"
    // src/net/colar/netbeans/fan/antlr/Fan.g:274:1: param : type id ( AS_INIT_VAL expr )? ;
    public final void param() throws RecognitionException {
        int param_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:274:9: ( type id ( AS_INIT_VAL expr )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:274:11: type id ( AS_INIT_VAL expr )?
            {
            pushFollow(FOLLOW_type_in_param1339);
            type();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_id_in_param1341);
            id();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:274:19: ( AS_INIT_VAL expr )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==AS_INIT_VAL) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:274:20: AS_INIT_VAL expr
                    {
                    match(input,AS_INIT_VAL,FOLLOW_AS_INIT_VAL_in_param1344); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_param1346);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 45, param_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "param"


    // $ANTLR start "methodBody"
    // src/net/colar/netbeans/fan/antlr/Fan.g:275:1: methodBody : ( ( BRACKET_L ( stmt )* BRACKET_R ) | eos );
    public final void methodBody() throws RecognitionException {
        int methodBody_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:275:12: ( ( BRACKET_L ( stmt )* BRACKET_R ) | eos )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==BRACKET_L) ) {
                alt63=1;
            }
            else if ( (LA63_0==EOF||(LA63_0>=KW_RD_ONLY && LA63_0<=KW_VOID)||(LA63_0>=KW_ABSTRACT && LA63_0<=KW_ONCE)||LA63_0==SQ_BRACKET_L||LA63_0==BRACKET_R||LA63_0==SP_PIPE||LA63_0==SP_SEMI||(LA63_0>=AT && LA63_0<=ID)||LA63_0==DOC) ) {
                alt63=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:275:14: ( BRACKET_L ( stmt )* BRACKET_R )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:275:14: ( BRACKET_L ( stmt )* BRACKET_R )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:275:15: BRACKET_L ( stmt )* BRACKET_R
                    {
                    match(input,BRACKET_L,FOLLOW_BRACKET_L_in_methodBody1356); if (state.failed) return ;
                    // src/net/colar/netbeans/fan/antlr/Fan.g:275:25: ( stmt )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( ((LA62_0>=KW_BREAK && LA62_0<=KW_TRY)||(LA62_0>=KW_THIS && LA62_0<=KW_SUPER)||(LA62_0>=KW_NULL && LA62_0<=KW_FALSE)||LA62_0==SQ_BRACKET_L||LA62_0==PAR_L||LA62_0==SP_PIPE||LA62_0==OP_CURRY||(LA62_0>=OP_PLUS && LA62_0<=OP_MINUS)||(LA62_0>=OP_BANG && LA62_0<=OP_TILDA)||(LA62_0>=AT && LA62_0<=OP_POUND)||LA62_0==NUMBER) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: stmt
                    	    {
                    	    pushFollow(FOLLOW_stmt_in_methodBody1358);
                    	    stmt();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop62;
                        }
                    } while (true);

                    match(input,BRACKET_R,FOLLOW_BRACKET_R_in_methodBody1361); if (state.failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:275:44: eos
                    {
                    pushFollow(FOLLOW_eos_in_methodBody1366);
                    eos();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 46, methodBody_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "methodBody"


    // $ANTLR start "ctorDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:276:1: ctorDef : docs ( facet )* ( ctorFlags )* KW_NEW id PAR_L params PAR_R ( ( SP_COLON )=> ctorChain )? methodBody ;
    public final void ctorDef() throws RecognitionException {
        int ctorDef_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:276:10: ( docs ( facet )* ( ctorFlags )* KW_NEW id PAR_L params PAR_R ( ( SP_COLON )=> ctorChain )? methodBody )
            // src/net/colar/netbeans/fan/antlr/Fan.g:276:12: docs ( facet )* ( ctorFlags )* KW_NEW id PAR_L params PAR_R ( ( SP_COLON )=> ctorChain )? methodBody
            {
            pushFollow(FOLLOW_docs_in_ctorDef1374);
            docs();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:276:17: ( facet )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==AT) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: facet
            	    {
            	    pushFollow(FOLLOW_facet_in_ctorDef1376);
            	    facet();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:276:24: ( ctorFlags )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( ((LA65_0>=KW_PRIVATE && LA65_0<=KW_INTERNAL)) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: ctorFlags
            	    {
            	    pushFollow(FOLLOW_ctorFlags_in_ctorDef1379);
            	    ctorFlags();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);

            match(input,KW_NEW,FOLLOW_KW_NEW_in_ctorDef1382); if (state.failed) return ;
            pushFollow(FOLLOW_id_in_ctorDef1384);
            id();

            state._fsp--;
            if (state.failed) return ;
            match(input,PAR_L,FOLLOW_PAR_L_in_ctorDef1386); if (state.failed) return ;
            pushFollow(FOLLOW_params_in_ctorDef1388);
            params();

            state._fsp--;
            if (state.failed) return ;
            match(input,PAR_R,FOLLOW_PAR_R_in_ctorDef1390); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:276:64: ( ( SP_COLON )=> ctorChain )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==SP_COLON) && (synpred100_Fan())) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:276:65: ( SP_COLON )=> ctorChain
                    {
                    pushFollow(FOLLOW_ctorChain_in_ctorDef1397);
                    ctorChain();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_methodBody_in_ctorDef1401);
            methodBody();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 47, ctorDef_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "ctorDef"


    // $ANTLR start "ctorFlags"
    // src/net/colar/netbeans/fan/antlr/Fan.g:277:1: ctorFlags : protection ;
    public final void ctorFlags() throws RecognitionException {
        int ctorFlags_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:277:11: ( protection )
            // src/net/colar/netbeans/fan/antlr/Fan.g:277:13: protection
            {
            pushFollow(FOLLOW_protection_in_ctorFlags1408);
            protection();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 48, ctorFlags_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "ctorFlags"


    // $ANTLR start "ctorChain"
    // src/net/colar/netbeans/fan/antlr/Fan.g:278:1: ctorChain : SP_COLON ( ctorChainThis | ctorChainSuper ) ;
    public final void ctorChain() throws RecognitionException {
        int ctorChain_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:278:11: ( SP_COLON ( ctorChainThis | ctorChainSuper ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:278:13: SP_COLON ( ctorChainThis | ctorChainSuper )
            {
            match(input,SP_COLON,FOLLOW_SP_COLON_in_ctorChain1415); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:278:22: ( ctorChainThis | ctorChainSuper )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==KW_THIS) ) {
                alt67=1;
            }
            else if ( (LA67_0==KW_SUPER) ) {
                alt67=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:278:23: ctorChainThis
                    {
                    pushFollow(FOLLOW_ctorChainThis_in_ctorChain1418);
                    ctorChainThis();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:278:39: ctorChainSuper
                    {
                    pushFollow(FOLLOW_ctorChainSuper_in_ctorChain1422);
                    ctorChainSuper();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 49, ctorChain_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "ctorChain"


    // $ANTLR start "ctorChainThis"
    // src/net/colar/netbeans/fan/antlr/Fan.g:280:1: ctorChainThis : KW_THIS DOT id PAR_L ( args )? PAR_R ;
    public final void ctorChainThis() throws RecognitionException {
        int ctorChainThis_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:280:15: ( KW_THIS DOT id PAR_L ( args )? PAR_R )
            // src/net/colar/netbeans/fan/antlr/Fan.g:280:17: KW_THIS DOT id PAR_L ( args )? PAR_R
            {
            match(input,KW_THIS,FOLLOW_KW_THIS_in_ctorChainThis1431); if (state.failed) return ;
            match(input,DOT,FOLLOW_DOT_in_ctorChainThis1433); if (state.failed) return ;
            pushFollow(FOLLOW_id_in_ctorChainThis1435);
            id();

            state._fsp--;
            if (state.failed) return ;
            match(input,PAR_L,FOLLOW_PAR_L_in_ctorChainThis1437); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:280:38: ( args )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( ((LA68_0>=KW_THIS && LA68_0<=KW_SUPER)||(LA68_0>=KW_NULL && LA68_0<=KW_FALSE)||LA68_0==SQ_BRACKET_L||LA68_0==PAR_L||LA68_0==SP_PIPE||LA68_0==OP_CURRY||(LA68_0>=OP_PLUS && LA68_0<=OP_MINUS)||(LA68_0>=OP_BANG && LA68_0<=OP_TILDA)||(LA68_0>=AT && LA68_0<=OP_POUND)||LA68_0==NUMBER) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: args
                    {
                    pushFollow(FOLLOW_args_in_ctorChainThis1439);
                    args();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,PAR_R,FOLLOW_PAR_R_in_ctorChainThis1442); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 50, ctorChainThis_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "ctorChainThis"


    // $ANTLR start "ctorChainSuper"
    // src/net/colar/netbeans/fan/antlr/Fan.g:281:1: ctorChainSuper : KW_SUPER ( DOT id )? PAR_L ( args )? PAR_R ;
    public final void ctorChainSuper() throws RecognitionException {
        int ctorChainSuper_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:281:16: ( KW_SUPER ( DOT id )? PAR_L ( args )? PAR_R )
            // src/net/colar/netbeans/fan/antlr/Fan.g:281:18: KW_SUPER ( DOT id )? PAR_L ( args )? PAR_R
            {
            match(input,KW_SUPER,FOLLOW_KW_SUPER_in_ctorChainSuper1449); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:281:27: ( DOT id )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==DOT) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:281:28: DOT id
                    {
                    match(input,DOT,FOLLOW_DOT_in_ctorChainSuper1452); if (state.failed) return ;
                    pushFollow(FOLLOW_id_in_ctorChainSuper1454);
                    id();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,PAR_L,FOLLOW_PAR_L_in_ctorChainSuper1458); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:281:43: ( args )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( ((LA70_0>=KW_THIS && LA70_0<=KW_SUPER)||(LA70_0>=KW_NULL && LA70_0<=KW_FALSE)||LA70_0==SQ_BRACKET_L||LA70_0==PAR_L||LA70_0==SP_PIPE||LA70_0==OP_CURRY||(LA70_0>=OP_PLUS && LA70_0<=OP_MINUS)||(LA70_0>=OP_BANG && LA70_0<=OP_TILDA)||(LA70_0>=AT && LA70_0<=OP_POUND)||LA70_0==NUMBER) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: args
                    {
                    pushFollow(FOLLOW_args_in_ctorChainSuper1460);
                    args();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,PAR_R,FOLLOW_PAR_R_in_ctorChainSuper1463); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 51, ctorChainSuper_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "ctorChainSuper"


    // $ANTLR start "staticBlock"
    // src/net/colar/netbeans/fan/antlr/Fan.g:283:1: staticBlock : KW_STATIC block ;
    public final void staticBlock() throws RecognitionException {
        int staticBlock_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:283:13: ( KW_STATIC block )
            // src/net/colar/netbeans/fan/antlr/Fan.g:283:15: KW_STATIC block
            {
            match(input,KW_STATIC,FOLLOW_KW_STATIC_in_staticBlock1471); if (state.failed) return ;
            pushFollow(FOLLOW_block_in_staticBlock1473);
            block();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 52, staticBlock_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "staticBlock"


    // $ANTLR start "block"
    // src/net/colar/netbeans/fan/antlr/Fan.g:284:1: block : ( ( BRACKET_L )=> multiStmt | stmt ) ;
    public final void block() throws RecognitionException {
        int block_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:284:9: ( ( ( BRACKET_L )=> multiStmt | stmt ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:284:11: ( ( BRACKET_L )=> multiStmt | stmt )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:284:11: ( ( BRACKET_L )=> multiStmt | stmt )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==BRACKET_L) && (synpred105_Fan())) {
                alt71=1;
            }
            else if ( ((LA71_0>=KW_BREAK && LA71_0<=KW_TRY)||(LA71_0>=KW_THIS && LA71_0<=KW_SUPER)||(LA71_0>=KW_NULL && LA71_0<=KW_FALSE)||LA71_0==SQ_BRACKET_L||LA71_0==PAR_L||LA71_0==SP_PIPE||LA71_0==OP_CURRY||(LA71_0>=OP_PLUS && LA71_0<=OP_MINUS)||(LA71_0>=OP_BANG && LA71_0<=OP_TILDA)||(LA71_0>=AT && LA71_0<=OP_POUND)||LA71_0==NUMBER) ) {
                alt71=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:284:12: ( BRACKET_L )=> multiStmt
                    {
                    pushFollow(FOLLOW_multiStmt_in_block1487);
                    multiStmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:284:37: stmt
                    {
                    pushFollow(FOLLOW_stmt_in_block1491);
                    stmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 53, block_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "block"


    // $ANTLR start "multiStmt"
    // src/net/colar/netbeans/fan/antlr/Fan.g:285:1: multiStmt : BRACKET_L ( stmt )* BRACKET_R ;
    public final void multiStmt() throws RecognitionException {
        int multiStmt_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:285:11: ( BRACKET_L ( stmt )* BRACKET_R )
            // src/net/colar/netbeans/fan/antlr/Fan.g:285:13: BRACKET_L ( stmt )* BRACKET_R
            {
            match(input,BRACKET_L,FOLLOW_BRACKET_L_in_multiStmt1499); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:285:24: ( stmt )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( ((LA72_0>=KW_BREAK && LA72_0<=KW_TRY)||(LA72_0>=KW_THIS && LA72_0<=KW_SUPER)||(LA72_0>=KW_NULL && LA72_0<=KW_FALSE)||LA72_0==SQ_BRACKET_L||LA72_0==PAR_L||LA72_0==SP_PIPE||LA72_0==OP_CURRY||(LA72_0>=OP_PLUS && LA72_0<=OP_MINUS)||(LA72_0>=OP_BANG && LA72_0<=OP_TILDA)||(LA72_0>=AT && LA72_0<=OP_POUND)||LA72_0==NUMBER) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_multiStmt1502);
            	    stmt();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop72;
                }
            } while (true);

            match(input,BRACKET_R,FOLLOW_BRACKET_R_in_multiStmt1505); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 54, multiStmt_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "multiStmt"


    // $ANTLR start "stmt"
    // src/net/colar/netbeans/fan/antlr/Fan.g:286:1: stmt : ( g_if | g_for | g_while | g_break | g_continue | g_return | g_switch | g_throw | g_try | exprStmt | localDef ) ;
    public final void stmt() throws RecognitionException {
        int stmt_StartIndex = input.index();
        paraphrase.push("Statement");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:288:3: ( ( g_if | g_for | g_while | g_break | g_continue | g_return | g_switch | g_throw | g_try | exprStmt | localDef ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:288:5: ( g_if | g_for | g_while | g_break | g_continue | g_return | g_switch | g_throw | g_try | exprStmt | localDef )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:288:5: ( g_if | g_for | g_while | g_break | g_continue | g_return | g_switch | g_throw | g_try | exprStmt | localDef )
            int alt73=11;
            alt73 = dfa73.predict(input);
            switch (alt73) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:288:6: g_if
                    {
                    pushFollow(FOLLOW_g_if_in_stmt1524);
                    g_if();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:288:13: g_for
                    {
                    pushFollow(FOLLOW_g_for_in_stmt1528);
                    g_for();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:288:21: g_while
                    {
                    pushFollow(FOLLOW_g_while_in_stmt1532);
                    g_while();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:288:31: g_break
                    {
                    pushFollow(FOLLOW_g_break_in_stmt1536);
                    g_break();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:289:4: g_continue
                    {
                    pushFollow(FOLLOW_g_continue_in_stmt1543);
                    g_continue();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:289:17: g_return
                    {
                    pushFollow(FOLLOW_g_return_in_stmt1547);
                    g_return();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:289:28: g_switch
                    {
                    pushFollow(FOLLOW_g_switch_in_stmt1551);
                    g_switch();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:290:4: g_throw
                    {
                    pushFollow(FOLLOW_g_throw_in_stmt1558);
                    g_throw();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 9 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:290:14: g_try
                    {
                    pushFollow(FOLLOW_g_try_in_stmt1562);
                    g_try();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 10 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:290:22: exprStmt
                    {
                    pushFollow(FOLLOW_exprStmt_in_stmt1566);
                    exprStmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 11 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:290:33: localDef
                    {
                    pushFollow(FOLLOW_localDef_in_stmt1570);
                    localDef();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 55, stmt_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "stmt"


    // $ANTLR start "g_break"
    // src/net/colar/netbeans/fan/antlr/Fan.g:297:1: g_break : KW_BREAK eos ;
    public final void g_break() throws RecognitionException {
        int g_break_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:297:10: ( KW_BREAK eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:297:12: KW_BREAK eos
            {
            match(input,KW_BREAK,FOLLOW_KW_BREAK_in_g_break1583); if (state.failed) return ;
            pushFollow(FOLLOW_eos_in_g_break1585);
            eos();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 56, g_break_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "g_break"


    // $ANTLR start "g_continue"
    // src/net/colar/netbeans/fan/antlr/Fan.g:298:1: g_continue : KW_CONTINUE eos ;
    public final void g_continue() throws RecognitionException {
        int g_continue_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:298:12: ( KW_CONTINUE eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:298:14: KW_CONTINUE eos
            {
            match(input,KW_CONTINUE,FOLLOW_KW_CONTINUE_in_g_continue1592); if (state.failed) return ;
            pushFollow(FOLLOW_eos_in_g_continue1594);
            eos();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 57, g_continue_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "g_continue"


    // $ANTLR start "g_for"
    // src/net/colar/netbeans/fan/antlr/Fan.g:299:1: g_for : KW_FOR PAR_L ( forInit )? SP_SEMI ( expr )? SP_SEMI ( expr )? PAR_R block ;
    public final void g_for() throws RecognitionException {
        int g_for_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:299:8: ( KW_FOR PAR_L ( forInit )? SP_SEMI ( expr )? SP_SEMI ( expr )? PAR_R block )
            // src/net/colar/netbeans/fan/antlr/Fan.g:299:10: KW_FOR PAR_L ( forInit )? SP_SEMI ( expr )? SP_SEMI ( expr )? PAR_R block
            {
            match(input,KW_FOR,FOLLOW_KW_FOR_in_g_for1602); if (state.failed) return ;
            match(input,PAR_L,FOLLOW_PAR_L_in_g_for1604); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:299:23: ( forInit )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( ((LA74_0>=KW_THIS && LA74_0<=KW_SUPER)||(LA74_0>=KW_NULL && LA74_0<=KW_FALSE)||LA74_0==SQ_BRACKET_L||LA74_0==PAR_L||LA74_0==SP_PIPE||LA74_0==OP_CURRY||(LA74_0>=OP_PLUS && LA74_0<=OP_MINUS)||(LA74_0>=OP_BANG && LA74_0<=OP_TILDA)||(LA74_0>=AT && LA74_0<=OP_POUND)||LA74_0==NUMBER) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: forInit
                    {
                    pushFollow(FOLLOW_forInit_in_g_for1606);
                    forInit();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,SP_SEMI,FOLLOW_SP_SEMI_in_g_for1609); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:299:40: ( expr )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( ((LA75_0>=KW_THIS && LA75_0<=KW_SUPER)||(LA75_0>=KW_NULL && LA75_0<=KW_FALSE)||LA75_0==SQ_BRACKET_L||LA75_0==PAR_L||LA75_0==SP_PIPE||LA75_0==OP_CURRY||(LA75_0>=OP_PLUS && LA75_0<=OP_MINUS)||(LA75_0>=OP_BANG && LA75_0<=OP_TILDA)||(LA75_0>=AT && LA75_0<=OP_POUND)||LA75_0==NUMBER) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: expr
                    {
                    pushFollow(FOLLOW_expr_in_g_for1611);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,SP_SEMI,FOLLOW_SP_SEMI_in_g_for1614); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:299:54: ( expr )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( ((LA76_0>=KW_THIS && LA76_0<=KW_SUPER)||(LA76_0>=KW_NULL && LA76_0<=KW_FALSE)||LA76_0==SQ_BRACKET_L||LA76_0==PAR_L||LA76_0==SP_PIPE||LA76_0==OP_CURRY||(LA76_0>=OP_PLUS && LA76_0<=OP_MINUS)||(LA76_0>=OP_BANG && LA76_0<=OP_TILDA)||(LA76_0>=AT && LA76_0<=OP_POUND)||LA76_0==NUMBER) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: expr
                    {
                    pushFollow(FOLLOW_expr_in_g_for1616);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,PAR_R,FOLLOW_PAR_R_in_g_for1619); if (state.failed) return ;
            pushFollow(FOLLOW_block_in_g_for1622);
            block();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 58, g_for_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "g_for"


    // $ANTLR start "g_if"
    // src/net/colar/netbeans/fan/antlr/Fan.g:300:1: g_if : KW_IF PAR_L expr PAR_R block ( KW_ELSE block )? ;
    public final void g_if() throws RecognitionException {
        int g_if_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:300:7: ( KW_IF PAR_L expr PAR_R block ( KW_ELSE block )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:300:9: KW_IF PAR_L expr PAR_R block ( KW_ELSE block )?
            {
            match(input,KW_IF,FOLLOW_KW_IF_in_g_if1630); if (state.failed) return ;
            match(input,PAR_L,FOLLOW_PAR_L_in_g_if1632); if (state.failed) return ;
            pushFollow(FOLLOW_expr_in_g_if1634);
            expr();

            state._fsp--;
            if (state.failed) return ;
            match(input,PAR_R,FOLLOW_PAR_R_in_g_if1636); if (state.failed) return ;
            pushFollow(FOLLOW_block_in_g_if1638);
            block();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:301:5: ( KW_ELSE block )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==KW_ELSE) ) {
                int LA77_1 = input.LA(2);

                if ( (synpred120_Fan()) ) {
                    alt77=1;
                }
            }
            switch (alt77) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:301:6: KW_ELSE block
                    {
                    match(input,KW_ELSE,FOLLOW_KW_ELSE_in_g_if1645); if (state.failed) return ;
                    pushFollow(FOLLOW_block_in_g_if1647);
                    block();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 59, g_if_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "g_if"


    // $ANTLR start "g_return"
    // src/net/colar/netbeans/fan/antlr/Fan.g:302:1: g_return : KW_RETURN ( eos | expr eos ) ;
    public final void g_return() throws RecognitionException {
        int g_return_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:302:10: ( KW_RETURN ( eos | expr eos ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:302:12: KW_RETURN ( eos | expr eos )
            {
            match(input,KW_RETURN,FOLLOW_KW_RETURN_in_g_return1656); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:302:22: ( eos | expr eos )
            int alt78=2;
            alt78 = dfa78.predict(input);
            switch (alt78) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:302:23: eos
                    {
                    pushFollow(FOLLOW_eos_in_g_return1659);
                    eos();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:302:29: expr eos
                    {
                    pushFollow(FOLLOW_expr_in_g_return1663);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_eos_in_g_return1665);
                    eos();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 60, g_return_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "g_return"


    // $ANTLR start "g_switch"
    // src/net/colar/netbeans/fan/antlr/Fan.g:303:1: g_switch : KW_SWITCH PAR_L expr PAR_R BRACKET_L ( g_case )* ( g_default )? BRACKET_R ;
    public final void g_switch() throws RecognitionException {
        int g_switch_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:303:10: ( KW_SWITCH PAR_L expr PAR_R BRACKET_L ( g_case )* ( g_default )? BRACKET_R )
            // src/net/colar/netbeans/fan/antlr/Fan.g:303:12: KW_SWITCH PAR_L expr PAR_R BRACKET_L ( g_case )* ( g_default )? BRACKET_R
            {
            match(input,KW_SWITCH,FOLLOW_KW_SWITCH_in_g_switch1673); if (state.failed) return ;
            match(input,PAR_L,FOLLOW_PAR_L_in_g_switch1675); if (state.failed) return ;
            pushFollow(FOLLOW_expr_in_g_switch1677);
            expr();

            state._fsp--;
            if (state.failed) return ;
            match(input,PAR_R,FOLLOW_PAR_R_in_g_switch1679); if (state.failed) return ;
            match(input,BRACKET_L,FOLLOW_BRACKET_L_in_g_switch1681); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:303:49: ( g_case )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==KW_CASE) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:303:50: g_case
            	    {
            	    pushFollow(FOLLOW_g_case_in_g_switch1684);
            	    g_case();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:303:59: ( g_default )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==KW_DEFAULT) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:303:60: g_default
                    {
                    pushFollow(FOLLOW_g_default_in_g_switch1689);
                    g_default();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,BRACKET_R,FOLLOW_BRACKET_R_in_g_switch1693); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 61, g_switch_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "g_switch"


    // $ANTLR start "g_throw"
    // src/net/colar/netbeans/fan/antlr/Fan.g:304:1: g_throw : KW_THROW expr eos ;
    public final void g_throw() throws RecognitionException {
        int g_throw_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:304:10: ( KW_THROW expr eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:304:12: KW_THROW expr eos
            {
            match(input,KW_THROW,FOLLOW_KW_THROW_in_g_throw1701); if (state.failed) return ;
            pushFollow(FOLLOW_expr_in_g_throw1703);
            expr();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_eos_in_g_throw1705);
            eos();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 62, g_throw_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "g_throw"


    // $ANTLR start "g_while"
    // src/net/colar/netbeans/fan/antlr/Fan.g:305:1: g_while : KW_WHILE PAR_L expr PAR_R block ;
    public final void g_while() throws RecognitionException {
        int g_while_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:305:10: ( KW_WHILE PAR_L expr PAR_R block )
            // src/net/colar/netbeans/fan/antlr/Fan.g:305:12: KW_WHILE PAR_L expr PAR_R block
            {
            match(input,KW_WHILE,FOLLOW_KW_WHILE_in_g_while1713); if (state.failed) return ;
            match(input,PAR_L,FOLLOW_PAR_L_in_g_while1715); if (state.failed) return ;
            pushFollow(FOLLOW_expr_in_g_while1717);
            expr();

            state._fsp--;
            if (state.failed) return ;
            match(input,PAR_R,FOLLOW_PAR_R_in_g_while1719); if (state.failed) return ;
            pushFollow(FOLLOW_block_in_g_while1721);
            block();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 63, g_while_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "g_while"


    // $ANTLR start "g_try"
    // src/net/colar/netbeans/fan/antlr/Fan.g:306:1: g_try : KW_TRY ( ( BRACKET_L )=> try_long | ( stmt )* ) ( ( KW_CATCH )=> g_catch )* ( ( KW_FINALLY )=> g_finally )? ;
    public final void g_try() throws RecognitionException {
        int g_try_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:306:8: ( KW_TRY ( ( BRACKET_L )=> try_long | ( stmt )* ) ( ( KW_CATCH )=> g_catch )* ( ( KW_FINALLY )=> g_finally )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:306:10: KW_TRY ( ( BRACKET_L )=> try_long | ( stmt )* ) ( ( KW_CATCH )=> g_catch )* ( ( KW_FINALLY )=> g_finally )?
            {
            match(input,KW_TRY,FOLLOW_KW_TRY_in_g_try1729); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:306:17: ( ( BRACKET_L )=> try_long | ( stmt )* )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==BRACKET_L) && (synpred124_Fan())) {
                alt82=1;
            }
            else if ( (LA82_0==EOF||(LA82_0>=KW_BREAK && LA82_0<=KW_FINALLY)||(LA82_0>=KW_RD_ONLY && LA82_0<=KW_VOID)||(LA82_0>=KW_ABSTRACT && LA82_0<=KW_ELSE)||(LA82_0>=KW_NULL && LA82_0<=KW_FALSE)||LA82_0==SQ_BRACKET_L||LA82_0==BRACKET_R||(LA82_0>=SP_COMMA && LA82_0<=PAR_L)||LA82_0==SP_PIPE||LA82_0==SP_SEMI||LA82_0==OP_CURRY||(LA82_0>=OP_PLUS && LA82_0<=OP_MINUS)||(LA82_0>=OP_BANG && LA82_0<=OP_TILDA)||(LA82_0>=AT && LA82_0<=NUMBER)) ) {
                alt82=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }
            switch (alt82) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:306:18: ( BRACKET_L )=> try_long
                    {
                    pushFollow(FOLLOW_try_long_in_g_try1736);
                    try_long();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:306:42: ( stmt )*
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:306:42: ( stmt )*
                    loop81:
                    do {
                        int alt81=2;
                        alt81 = dfa81.predict(input);
                        switch (alt81) {
                    	case 1 :
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: stmt
                    	    {
                    	    pushFollow(FOLLOW_stmt_in_g_try1740);
                    	    stmt();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop81;
                        }
                    } while (true);


                    }
                    break;

            }

            // src/net/colar/netbeans/fan/antlr/Fan.g:306:49: ( ( KW_CATCH )=> g_catch )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==KW_CATCH) ) {
                    int LA83_2 = input.LA(2);

                    if ( (synpred126_Fan()) ) {
                        alt83=1;
                    }


                }


                switch (alt83) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:306:50: ( KW_CATCH )=> g_catch
            	    {
            	    pushFollow(FOLLOW_g_catch_in_g_try1749);
            	    g_catch();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop83;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:306:72: ( ( KW_FINALLY )=> g_finally )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==KW_FINALLY) ) {
                int LA84_1 = input.LA(2);

                if ( (synpred127_Fan()) ) {
                    alt84=1;
                }
            }
            switch (alt84) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:306:73: ( KW_FINALLY )=> g_finally
                    {
                    pushFollow(FOLLOW_g_finally_in_g_try1758);
                    g_finally();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 64, g_try_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "g_try"


    // $ANTLR start "try_long"
    // src/net/colar/netbeans/fan/antlr/Fan.g:307:1: try_long : BRACKET_L ( stmt )* BRACKET_R ;
    public final void try_long() throws RecognitionException {
        int try_long_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:307:10: ( BRACKET_L ( stmt )* BRACKET_R )
            // src/net/colar/netbeans/fan/antlr/Fan.g:307:12: BRACKET_L ( stmt )* BRACKET_R
            {
            match(input,BRACKET_L,FOLLOW_BRACKET_L_in_try_long1767); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:307:22: ( stmt )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( ((LA85_0>=KW_BREAK && LA85_0<=KW_TRY)||(LA85_0>=KW_THIS && LA85_0<=KW_SUPER)||(LA85_0>=KW_NULL && LA85_0<=KW_FALSE)||LA85_0==SQ_BRACKET_L||LA85_0==PAR_L||LA85_0==SP_PIPE||LA85_0==OP_CURRY||(LA85_0>=OP_PLUS && LA85_0<=OP_MINUS)||(LA85_0>=OP_BANG && LA85_0<=OP_TILDA)||(LA85_0>=AT && LA85_0<=OP_POUND)||LA85_0==NUMBER) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_try_long1769);
            	    stmt();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop85;
                }
            } while (true);

            match(input,BRACKET_R,FOLLOW_BRACKET_R_in_try_long1772); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 65, try_long_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "try_long"


    // $ANTLR start "exprStmt"
    // src/net/colar/netbeans/fan/antlr/Fan.g:308:1: exprStmt : expr eos ;
    public final void exprStmt() throws RecognitionException {
        int exprStmt_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:308:10: ( expr eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:308:12: expr eos
            {
            pushFollow(FOLLOW_expr_in_exprStmt1779);
            expr();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_eos_in_exprStmt1781);
            eos();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 66, exprStmt_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "exprStmt"


    // $ANTLR start "localDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:309:1: localDef : typeId ( AS_INIT_VAL expr )? eos ;
    public final void localDef() throws RecognitionException {
        int localDef_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:309:10: ( typeId ( AS_INIT_VAL expr )? eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:309:12: typeId ( AS_INIT_VAL expr )? eos
            {
            pushFollow(FOLLOW_typeId_in_localDef1788);
            typeId();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:309:19: ( AS_INIT_VAL expr )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==AS_INIT_VAL) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:309:20: AS_INIT_VAL expr
                    {
                    match(input,AS_INIT_VAL,FOLLOW_AS_INIT_VAL_in_localDef1791); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_localDef1793);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_eos_in_localDef1797);
            eos();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 67, localDef_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "localDef"


    // $ANTLR start "forInit"
    // src/net/colar/netbeans/fan/antlr/Fan.g:310:1: forInit : ( forInitDef | expr );
    public final void forInit() throws RecognitionException {
        int forInit_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:310:10: ( forInitDef | expr )
            int alt87=2;
            alt87 = dfa87.predict(input);
            switch (alt87) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:310:12: forInitDef
                    {
                    pushFollow(FOLLOW_forInitDef_in_forInit1805);
                    forInitDef();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:310:25: expr
                    {
                    pushFollow(FOLLOW_expr_in_forInit1809);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 68, forInit_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "forInit"


    // $ANTLR start "forInitDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:311:1: forInitDef : typeId ( AS_INIT_VAL expr )? ;
    public final void forInitDef() throws RecognitionException {
        int forInitDef_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:311:12: ( typeId ( AS_INIT_VAL expr )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:311:14: typeId ( AS_INIT_VAL expr )?
            {
            pushFollow(FOLLOW_typeId_in_forInitDef1816);
            typeId();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:311:21: ( AS_INIT_VAL expr )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==AS_INIT_VAL) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:311:22: AS_INIT_VAL expr
                    {
                    match(input,AS_INIT_VAL,FOLLOW_AS_INIT_VAL_in_forInitDef1819); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_forInitDef1821);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 69, forInitDef_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "forInitDef"


    // $ANTLR start "g_catch"
    // src/net/colar/netbeans/fan/antlr/Fan.g:313:1: g_catch : KW_CATCH ( catchDef )? ( ( BRACKET_L )=> catch_long | ( stmt )* ) ;
    public final void g_catch() throws RecognitionException {
        int g_catch_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:313:10: ( KW_CATCH ( catchDef )? ( ( BRACKET_L )=> catch_long | ( stmt )* ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:313:12: KW_CATCH ( catchDef )? ( ( BRACKET_L )=> catch_long | ( stmt )* )
            {
            match(input,KW_CATCH,FOLLOW_KW_CATCH_in_g_catch1832); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:313:21: ( catchDef )?
            int alt89=2;
            alt89 = dfa89.predict(input);
            switch (alt89) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: catchDef
                    {
                    pushFollow(FOLLOW_catchDef_in_g_catch1834);
                    catchDef();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            // src/net/colar/netbeans/fan/antlr/Fan.g:313:31: ( ( BRACKET_L )=> catch_long | ( stmt )* )
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==BRACKET_L) && (synpred133_Fan())) {
                alt91=1;
            }
            else if ( (LA91_0==EOF||(LA91_0>=KW_BREAK && LA91_0<=KW_FINALLY)||(LA91_0>=KW_RD_ONLY && LA91_0<=KW_VOID)||(LA91_0>=KW_ABSTRACT && LA91_0<=KW_ELSE)||(LA91_0>=KW_NULL && LA91_0<=KW_FALSE)||LA91_0==SQ_BRACKET_L||LA91_0==BRACKET_R||(LA91_0>=SP_COMMA && LA91_0<=PAR_L)||LA91_0==SP_PIPE||LA91_0==SP_SEMI||LA91_0==OP_CURRY||(LA91_0>=OP_PLUS && LA91_0<=OP_MINUS)||(LA91_0>=OP_BANG && LA91_0<=OP_TILDA)||(LA91_0>=AT && LA91_0<=NUMBER)) ) {
                alt91=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }
            switch (alt91) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:313:32: ( BRACKET_L )=> catch_long
                    {
                    pushFollow(FOLLOW_catch_long_in_g_catch1842);
                    catch_long();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:313:58: ( stmt )*
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:313:58: ( stmt )*
                    loop90:
                    do {
                        int alt90=2;
                        alt90 = dfa90.predict(input);
                        switch (alt90) {
                    	case 1 :
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: stmt
                    	    {
                    	    pushFollow(FOLLOW_stmt_in_g_catch1846);
                    	    stmt();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop90;
                        }
                    } while (true);


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 70, g_catch_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "g_catch"


    // $ANTLR start "catch_long"
    // src/net/colar/netbeans/fan/antlr/Fan.g:314:1: catch_long : BRACKET_L ( stmt )* BRACKET_R ;
    public final void catch_long() throws RecognitionException {
        int catch_long_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:314:12: ( BRACKET_L ( stmt )* BRACKET_R )
            // src/net/colar/netbeans/fan/antlr/Fan.g:314:14: BRACKET_L ( stmt )* BRACKET_R
            {
            match(input,BRACKET_L,FOLLOW_BRACKET_L_in_catch_long1855); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:314:24: ( stmt )*
            loop92:
            do {
                int alt92=2;
                int LA92_0 = input.LA(1);

                if ( ((LA92_0>=KW_BREAK && LA92_0<=KW_TRY)||(LA92_0>=KW_THIS && LA92_0<=KW_SUPER)||(LA92_0>=KW_NULL && LA92_0<=KW_FALSE)||LA92_0==SQ_BRACKET_L||LA92_0==PAR_L||LA92_0==SP_PIPE||LA92_0==OP_CURRY||(LA92_0>=OP_PLUS && LA92_0<=OP_MINUS)||(LA92_0>=OP_BANG && LA92_0<=OP_TILDA)||(LA92_0>=AT && LA92_0<=OP_POUND)||LA92_0==NUMBER) ) {
                    alt92=1;
                }


                switch (alt92) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_catch_long1857);
            	    stmt();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop92;
                }
            } while (true);

            match(input,BRACKET_R,FOLLOW_BRACKET_R_in_catch_long1860); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 71, catch_long_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "catch_long"


    // $ANTLR start "catchDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:315:1: catchDef : PAR_L type id PAR_R ;
    public final void catchDef() throws RecognitionException {
        int catchDef_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:315:11: ( PAR_L type id PAR_R )
            // src/net/colar/netbeans/fan/antlr/Fan.g:315:13: PAR_L type id PAR_R
            {
            match(input,PAR_L,FOLLOW_PAR_L_in_catchDef1868); if (state.failed) return ;
            pushFollow(FOLLOW_type_in_catchDef1870);
            type();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_id_in_catchDef1872);
            id();

            state._fsp--;
            if (state.failed) return ;
            match(input,PAR_R,FOLLOW_PAR_R_in_catchDef1874); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 72, catchDef_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "catchDef"


    // $ANTLR start "g_finally"
    // src/net/colar/netbeans/fan/antlr/Fan.g:317:1: g_finally : KW_FINALLY ( ( BRACKET_L )=> finally_long | ( stmt )* ) ;
    public final void g_finally() throws RecognitionException {
        int g_finally_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:317:11: ( KW_FINALLY ( ( BRACKET_L )=> finally_long | ( stmt )* ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:317:13: KW_FINALLY ( ( BRACKET_L )=> finally_long | ( stmt )* )
            {
            match(input,KW_FINALLY,FOLLOW_KW_FINALLY_in_g_finally1882); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:317:24: ( ( BRACKET_L )=> finally_long | ( stmt )* )
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==BRACKET_L) && (synpred136_Fan())) {
                alt94=1;
            }
            else if ( (LA94_0==EOF||(LA94_0>=KW_BREAK && LA94_0<=KW_FINALLY)||(LA94_0>=KW_RD_ONLY && LA94_0<=KW_VOID)||(LA94_0>=KW_ABSTRACT && LA94_0<=KW_ELSE)||(LA94_0>=KW_NULL && LA94_0<=KW_FALSE)||LA94_0==SQ_BRACKET_L||LA94_0==BRACKET_R||(LA94_0>=SP_COMMA && LA94_0<=PAR_L)||LA94_0==SP_PIPE||LA94_0==SP_SEMI||LA94_0==OP_CURRY||(LA94_0>=OP_PLUS && LA94_0<=OP_MINUS)||(LA94_0>=OP_BANG && LA94_0<=OP_TILDA)||(LA94_0>=AT && LA94_0<=NUMBER)) ) {
                alt94=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }
            switch (alt94) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:317:25: ( BRACKET_L )=> finally_long
                    {
                    pushFollow(FOLLOW_finally_long_in_g_finally1889);
                    finally_long();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:317:53: ( stmt )*
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:317:53: ( stmt )*
                    loop93:
                    do {
                        int alt93=2;
                        alt93 = dfa93.predict(input);
                        switch (alt93) {
                    	case 1 :
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: stmt
                    	    {
                    	    pushFollow(FOLLOW_stmt_in_g_finally1893);
                    	    stmt();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop93;
                        }
                    } while (true);


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 73, g_finally_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "g_finally"


    // $ANTLR start "finally_long"
    // src/net/colar/netbeans/fan/antlr/Fan.g:318:1: finally_long : BRACKET_L ( stmt )* BRACKET_R ;
    public final void finally_long() throws RecognitionException {
        int finally_long_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:318:14: ( BRACKET_L ( stmt )* BRACKET_R )
            // src/net/colar/netbeans/fan/antlr/Fan.g:318:16: BRACKET_L ( stmt )* BRACKET_R
            {
            match(input,BRACKET_L,FOLLOW_BRACKET_L_in_finally_long1902); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:318:26: ( stmt )*
            loop95:
            do {
                int alt95=2;
                int LA95_0 = input.LA(1);

                if ( ((LA95_0>=KW_BREAK && LA95_0<=KW_TRY)||(LA95_0>=KW_THIS && LA95_0<=KW_SUPER)||(LA95_0>=KW_NULL && LA95_0<=KW_FALSE)||LA95_0==SQ_BRACKET_L||LA95_0==PAR_L||LA95_0==SP_PIPE||LA95_0==OP_CURRY||(LA95_0>=OP_PLUS && LA95_0<=OP_MINUS)||(LA95_0>=OP_BANG && LA95_0<=OP_TILDA)||(LA95_0>=AT && LA95_0<=OP_POUND)||LA95_0==NUMBER) ) {
                    alt95=1;
                }


                switch (alt95) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_finally_long1904);
            	    stmt();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop95;
                }
            } while (true);

            match(input,BRACKET_R,FOLLOW_BRACKET_R_in_finally_long1907); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 74, finally_long_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "finally_long"


    // $ANTLR start "g_case"
    // src/net/colar/netbeans/fan/antlr/Fan.g:319:1: g_case : KW_CASE expr SP_COLON ( stmt )* ;
    public final void g_case() throws RecognitionException {
        int g_case_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:319:9: ( KW_CASE expr SP_COLON ( stmt )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:319:11: KW_CASE expr SP_COLON ( stmt )*
            {
            match(input,KW_CASE,FOLLOW_KW_CASE_in_g_case1915); if (state.failed) return ;
            pushFollow(FOLLOW_expr_in_g_case1917);
            expr();

            state._fsp--;
            if (state.failed) return ;
            match(input,SP_COLON,FOLLOW_SP_COLON_in_g_case1919); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:319:33: ( stmt )*
            loop96:
            do {
                int alt96=2;
                int LA96_0 = input.LA(1);

                if ( ((LA96_0>=KW_BREAK && LA96_0<=KW_TRY)||(LA96_0>=KW_THIS && LA96_0<=KW_SUPER)||(LA96_0>=KW_NULL && LA96_0<=KW_FALSE)||LA96_0==SQ_BRACKET_L||LA96_0==PAR_L||LA96_0==SP_PIPE||LA96_0==OP_CURRY||(LA96_0>=OP_PLUS && LA96_0<=OP_MINUS)||(LA96_0>=OP_BANG && LA96_0<=OP_TILDA)||(LA96_0>=AT && LA96_0<=OP_POUND)||LA96_0==NUMBER) ) {
                    alt96=1;
                }


                switch (alt96) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_g_case1921);
            	    stmt();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop96;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 75, g_case_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "g_case"


    // $ANTLR start "g_default"
    // src/net/colar/netbeans/fan/antlr/Fan.g:320:1: g_default : KW_DEFAULT SP_COLON ( stmt )* ;
    public final void g_default() throws RecognitionException {
        int g_default_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:320:11: ( KW_DEFAULT SP_COLON ( stmt )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:320:13: KW_DEFAULT SP_COLON ( stmt )*
            {
            match(input,KW_DEFAULT,FOLLOW_KW_DEFAULT_in_g_default1929); if (state.failed) return ;
            match(input,SP_COLON,FOLLOW_SP_COLON_in_g_default1931); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:320:33: ( stmt )*
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( ((LA97_0>=KW_BREAK && LA97_0<=KW_TRY)||(LA97_0>=KW_THIS && LA97_0<=KW_SUPER)||(LA97_0>=KW_NULL && LA97_0<=KW_FALSE)||LA97_0==SQ_BRACKET_L||LA97_0==PAR_L||LA97_0==SP_PIPE||LA97_0==OP_CURRY||(LA97_0>=OP_PLUS && LA97_0<=OP_MINUS)||(LA97_0>=OP_BANG && LA97_0<=OP_TILDA)||(LA97_0>=AT && LA97_0<=OP_POUND)||LA97_0==NUMBER) ) {
                    alt97=1;
                }


                switch (alt97) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_g_default1933);
            	    stmt();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop97;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 76, g_default_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "g_default"


    // $ANTLR start "expr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:323:1: expr : assignExpr ;
    public final void expr() throws RecognitionException {
        int expr_StartIndex = input.index();
        paraphrase.push("Expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:325:3: ( assignExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:325:5: assignExpr
            {
            pushFollow(FOLLOW_assignExpr_in_expr1954);
            assignExpr();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 77, expr_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "expr"


    // $ANTLR start "assignExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:326:1: assignExpr : ternaryExpr ( assignOp assignExpr )? ;
    public final void assignExpr() throws RecognitionException {
        int assignExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:326:12: ( ternaryExpr ( assignOp assignExpr )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:326:14: ternaryExpr ( assignOp assignExpr )?
            {
            pushFollow(FOLLOW_ternaryExpr_in_assignExpr1961);
            ternaryExpr();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:326:26: ( assignOp assignExpr )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( ((LA98_0>=AS_EQUAL && LA98_0<=AS_ASSIGN_OP)) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:326:27: assignOp assignExpr
                    {
                    pushFollow(FOLLOW_assignOp_in_assignExpr1964);
                    assignOp();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_assignExpr_in_assignExpr1966);
                    assignExpr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 78, assignExpr_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "assignExpr"


    // $ANTLR start "ternaryExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:327:1: ternaryExpr : condOrExpr ( ternaryTail )? ;
    public final void ternaryExpr() throws RecognitionException {
        int ternaryExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:327:13: ( condOrExpr ( ternaryTail )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:327:15: condOrExpr ( ternaryTail )?
            {
            pushFollow(FOLLOW_condOrExpr_in_ternaryExpr1975);
            condOrExpr();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:327:26: ( ternaryTail )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==SP_QMARK) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:327:27: ternaryTail
                    {
                    pushFollow(FOLLOW_ternaryTail_in_ternaryExpr1978);
                    ternaryTail();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 79, ternaryExpr_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "ternaryExpr"


    // $ANTLR start "ternaryTail"
    // src/net/colar/netbeans/fan/antlr/Fan.g:329:1: ternaryTail : SP_QMARK condOrExpr SP_COLON condOrExpr ;
    public final void ternaryTail() throws RecognitionException {
        int ternaryTail_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:329:13: ( SP_QMARK condOrExpr SP_COLON condOrExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:329:15: SP_QMARK condOrExpr SP_COLON condOrExpr
            {
            match(input,SP_QMARK,FOLLOW_SP_QMARK_in_ternaryTail1988); if (state.failed) return ;
            pushFollow(FOLLOW_condOrExpr_in_ternaryTail1990);
            condOrExpr();

            state._fsp--;
            if (state.failed) return ;
            match(input,SP_COLON,FOLLOW_SP_COLON_in_ternaryTail1992); if (state.failed) return ;
            pushFollow(FOLLOW_condOrExpr_in_ternaryTail1994);
            condOrExpr();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 80, ternaryTail_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "ternaryTail"


    // $ANTLR start "assignOp"
    // src/net/colar/netbeans/fan/antlr/Fan.g:330:1: assignOp : ( AS_EQUAL | AS_ASSIGN_OP );
    public final void assignOp() throws RecognitionException {
        int assignOp_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:330:10: ( AS_EQUAL | AS_ASSIGN_OP )
            // src/net/colar/netbeans/fan/antlr/Fan.g:
            {
            if ( (input.LA(1)>=AS_EQUAL && input.LA(1)<=AS_ASSIGN_OP) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 81, assignOp_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "assignOp"


    // $ANTLR start "condOrExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:331:1: condOrExpr : condAndExpr ( OP_OR condAndExpr )* ;
    public final void condOrExpr() throws RecognitionException {
        int condOrExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:331:13: ( condAndExpr ( OP_OR condAndExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:331:15: condAndExpr ( OP_OR condAndExpr )*
            {
            pushFollow(FOLLOW_condAndExpr_in_condOrExpr2013);
            condAndExpr();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:331:28: ( OP_OR condAndExpr )*
            loop100:
            do {
                int alt100=2;
                int LA100_0 = input.LA(1);

                if ( (LA100_0==OP_OR) ) {
                    alt100=1;
                }


                switch (alt100) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:331:29: OP_OR condAndExpr
            	    {
            	    match(input,OP_OR,FOLLOW_OP_OR_in_condOrExpr2017); if (state.failed) return ;
            	    pushFollow(FOLLOW_condAndExpr_in_condOrExpr2020);
            	    condAndExpr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop100;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 82, condOrExpr_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "condOrExpr"


    // $ANTLR start "condAndExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:332:1: condAndExpr : equalityExpr ( OP_AND equalityExpr )* ;
    public final void condAndExpr() throws RecognitionException {
        int condAndExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:332:14: ( equalityExpr ( OP_AND equalityExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:332:16: equalityExpr ( OP_AND equalityExpr )*
            {
            pushFollow(FOLLOW_equalityExpr_in_condAndExpr2030);
            equalityExpr();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:332:29: ( OP_AND equalityExpr )*
            loop101:
            do {
                int alt101=2;
                int LA101_0 = input.LA(1);

                if ( (LA101_0==OP_AND) ) {
                    alt101=1;
                }


                switch (alt101) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:332:30: OP_AND equalityExpr
            	    {
            	    match(input,OP_AND,FOLLOW_OP_AND_in_condAndExpr2033); if (state.failed) return ;
            	    pushFollow(FOLLOW_equalityExpr_in_condAndExpr2036);
            	    equalityExpr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop101;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 83, condAndExpr_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "condAndExpr"


    // $ANTLR start "equalityExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:333:1: equalityExpr : relationalExpr ( CP_EQUALITY relationalExpr )* ;
    public final void equalityExpr() throws RecognitionException {
        int equalityExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:333:14: ( relationalExpr ( CP_EQUALITY relationalExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:333:16: relationalExpr ( CP_EQUALITY relationalExpr )*
            {
            pushFollow(FOLLOW_relationalExpr_in_equalityExpr2046);
            relationalExpr();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:333:31: ( CP_EQUALITY relationalExpr )*
            loop102:
            do {
                int alt102=2;
                int LA102_0 = input.LA(1);

                if ( (LA102_0==CP_EQUALITY) ) {
                    alt102=1;
                }


                switch (alt102) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:333:32: CP_EQUALITY relationalExpr
            	    {
            	    match(input,CP_EQUALITY,FOLLOW_CP_EQUALITY_in_equalityExpr2049); if (state.failed) return ;
            	    pushFollow(FOLLOW_relationalExpr_in_equalityExpr2051);
            	    relationalExpr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop102;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 84, equalityExpr_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "equalityExpr"


    // $ANTLR start "relationalExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:335:1: relationalExpr : elvisExpr ( typeCheck | compare ) ;
    public final void relationalExpr() throws RecognitionException {
        int relationalExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:335:16: ( elvisExpr ( typeCheck | compare ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:335:20: elvisExpr ( typeCheck | compare )
            {
            pushFollow(FOLLOW_elvisExpr_in_relationalExpr2064);
            elvisExpr();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:335:30: ( typeCheck | compare )
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==KW_AS||(LA103_0>=KW_IS && LA103_0<=KW_ISNOT)) ) {
                alt103=1;
            }
            else if ( (LA103_0==EOF||(LA103_0>=KW_BREAK && LA103_0<=KW_USING)||(LA103_0>=KW_RD_ONLY && LA103_0<=KW_ELSE)||(LA103_0>=KW_NULL && LA103_0<=KW_FALSE)||(LA103_0>=SQ_BRACKET_L && LA103_0<=SP_QMARK)||LA103_0==SP_PIPE||(LA103_0>=SP_SEMI && LA103_0<=CP_COMPARATORS)||LA103_0==OP_CURRY||(LA103_0>=OP_PLUS && LA103_0<=OP_MINUS)||(LA103_0>=OP_BANG && LA103_0<=OP_TILDA)||(LA103_0>=AT && LA103_0<=NUMBER)) ) {
                alt103=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 103, 0, input);

                throw nvae;
            }
            switch (alt103) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:335:31: typeCheck
                    {
                    pushFollow(FOLLOW_typeCheck_in_relationalExpr2067);
                    typeCheck();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:335:43: compare
                    {
                    pushFollow(FOLLOW_compare_in_relationalExpr2071);
                    compare();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 85, relationalExpr_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "relationalExpr"


    // $ANTLR start "typeCheck"
    // src/net/colar/netbeans/fan/antlr/Fan.g:337:1: typeCheck : ( KW_ISNOT | KW_IS | KW_AS ) typeRoot ( ( SP_QMARK )? {...}? '[]' )* ;
    public final void typeCheck() throws RecognitionException {
        int typeCheck_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:337:11: ( ( KW_ISNOT | KW_IS | KW_AS ) typeRoot ( ( SP_QMARK )? {...}? '[]' )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:337:15: ( KW_ISNOT | KW_IS | KW_AS ) typeRoot ( ( SP_QMARK )? {...}? '[]' )*
            {
            if ( input.LA(1)==KW_AS||(input.LA(1)>=KW_IS && input.LA(1)<=KW_ISNOT) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            pushFollow(FOLLOW_typeRoot_in_typeCheck2094);
            typeRoot();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:337:51: ( ( SP_QMARK )? {...}? '[]' )*
            loop105:
            do {
                int alt105=2;
                int LA105_0 = input.LA(1);

                if ( (LA105_0==SP_QMARK) ) {
                    int LA105_2 = input.LA(2);

                    if ( (LA105_2==LIST_TYPE) ) {
                        alt105=1;
                    }


                }
                else if ( (LA105_0==LIST_TYPE) ) {
                    alt105=1;
                }


                switch (alt105) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:337:52: ( SP_QMARK )? {...}? '[]'
            	    {
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:337:52: ( SP_QMARK )?
            	    int alt104=2;
            	    int LA104_0 = input.LA(1);

            	    if ( (LA104_0==SP_QMARK) ) {
            	        alt104=1;
            	    }
            	    switch (alt104) {
            	        case 1 :
            	            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_QMARK
            	            {
            	            match(input,SP_QMARK,FOLLOW_SP_QMARK_in_typeCheck2097); if (state.failed) return ;

            	            }
            	            break;

            	    }

            	    if ( !((notAfterEol())) ) {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        throw new FailedPredicateException(input, "typeCheck", "notAfterEol()");
            	    }
            	    match(input,LIST_TYPE,FOLLOW_LIST_TYPE_in_typeCheck2102); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop105;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 86, typeCheck_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "typeCheck"


    // $ANTLR start "compare"
    // src/net/colar/netbeans/fan/antlr/Fan.g:338:1: compare : ( CP_COMPARATORS elvisExpr )* ;
    public final void compare() throws RecognitionException {
        int compare_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:338:10: ( ( CP_COMPARATORS elvisExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:338:14: ( CP_COMPARATORS elvisExpr )*
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:338:14: ( CP_COMPARATORS elvisExpr )*
            loop106:
            do {
                int alt106=2;
                int LA106_0 = input.LA(1);

                if ( (LA106_0==CP_COMPARATORS) ) {
                    alt106=1;
                }


                switch (alt106) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:338:15: CP_COMPARATORS elvisExpr
            	    {
            	    match(input,CP_COMPARATORS,FOLLOW_CP_COMPARATORS_in_compare2115); if (state.failed) return ;
            	    pushFollow(FOLLOW_elvisExpr_in_compare2117);
            	    elvisExpr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop106;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 87, compare_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "compare"


    // $ANTLR start "elvisExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:340:1: elvisExpr : rangeExpr ( OP_ELVIS rangeExpr )* ;
    public final void elvisExpr() throws RecognitionException {
        int elvisExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:340:12: ( rangeExpr ( OP_ELVIS rangeExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:340:14: rangeExpr ( OP_ELVIS rangeExpr )*
            {
            pushFollow(FOLLOW_rangeExpr_in_elvisExpr2128);
            rangeExpr();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:340:24: ( OP_ELVIS rangeExpr )*
            loop107:
            do {
                int alt107=2;
                int LA107_0 = input.LA(1);

                if ( (LA107_0==OP_ELVIS) ) {
                    alt107=1;
                }


                switch (alt107) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:340:25: OP_ELVIS rangeExpr
            	    {
            	    match(input,OP_ELVIS,FOLLOW_OP_ELVIS_in_elvisExpr2131); if (state.failed) return ;
            	    pushFollow(FOLLOW_rangeExpr_in_elvisExpr2133);
            	    rangeExpr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop107;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 88, elvisExpr_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "elvisExpr"


    // $ANTLR start "rangeExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:341:1: rangeExpr : bitOrExpr ( ( OP_RANG_EXCL_OLD | OP_RANGE_EXCL | OP_RANGE ) bitOrExpr )* ;
    public final void rangeExpr() throws RecognitionException {
        int rangeExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:341:12: ( bitOrExpr ( ( OP_RANG_EXCL_OLD | OP_RANGE_EXCL | OP_RANGE ) bitOrExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:341:14: bitOrExpr ( ( OP_RANG_EXCL_OLD | OP_RANGE_EXCL | OP_RANGE ) bitOrExpr )*
            {
            pushFollow(FOLLOW_bitOrExpr_in_rangeExpr2144);
            bitOrExpr();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:341:24: ( ( OP_RANG_EXCL_OLD | OP_RANGE_EXCL | OP_RANGE ) bitOrExpr )*
            loop108:
            do {
                int alt108=2;
                int LA108_0 = input.LA(1);

                if ( ((LA108_0>=OP_RANG_EXCL_OLD && LA108_0<=OP_RANGE)) ) {
                    alt108=1;
                }


                switch (alt108) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:341:25: ( OP_RANG_EXCL_OLD | OP_RANGE_EXCL | OP_RANGE ) bitOrExpr
            	    {
            	    if ( (input.LA(1)>=OP_RANG_EXCL_OLD && input.LA(1)<=OP_RANGE) ) {
            	        input.consume();
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_bitOrExpr_in_rangeExpr2161);
            	    bitOrExpr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop108;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 89, rangeExpr_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "rangeExpr"


    // $ANTLR start "bitOrExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:342:1: bitOrExpr : bitAndExpr ( ( OP_BITOR | SP_PIPE ) bitAndExpr )* ;
    public final void bitOrExpr() throws RecognitionException {
        int bitOrExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:342:12: ( bitAndExpr ( ( OP_BITOR | SP_PIPE ) bitAndExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:342:14: bitAndExpr ( ( OP_BITOR | SP_PIPE ) bitAndExpr )*
            {
            pushFollow(FOLLOW_bitAndExpr_in_bitOrExpr2172);
            bitAndExpr();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:342:25: ( ( OP_BITOR | SP_PIPE ) bitAndExpr )*
            loop109:
            do {
                int alt109=2;
                alt109 = dfa109.predict(input);
                switch (alt109) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:342:26: ( OP_BITOR | SP_PIPE ) bitAndExpr
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

            	    pushFollow(FOLLOW_bitAndExpr_in_bitOrExpr2183);
            	    bitAndExpr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop109;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 90, bitOrExpr_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "bitOrExpr"


    // $ANTLR start "bitAndExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:343:1: bitAndExpr : shiftExpr ( OP_CURRY shiftExpr )* ;
    public final void bitAndExpr() throws RecognitionException {
        int bitAndExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 91) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:343:13: ( shiftExpr ( OP_CURRY shiftExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:343:15: shiftExpr ( OP_CURRY shiftExpr )*
            {
            pushFollow(FOLLOW_shiftExpr_in_bitAndExpr2194);
            shiftExpr();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:343:25: ( OP_CURRY shiftExpr )*
            loop110:
            do {
                int alt110=2;
                alt110 = dfa110.predict(input);
                switch (alt110) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:343:26: OP_CURRY shiftExpr
            	    {
            	    match(input,OP_CURRY,FOLLOW_OP_CURRY_in_bitAndExpr2197); if (state.failed) return ;
            	    pushFollow(FOLLOW_shiftExpr_in_bitAndExpr2199);
            	    shiftExpr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop110;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 91, bitAndExpr_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "bitAndExpr"


    // $ANTLR start "shiftExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:344:1: shiftExpr : addExpr ( ( OP_LSHIFT | OP_RSHIFT ) addExpr )* ;
    public final void shiftExpr() throws RecognitionException {
        int shiftExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 92) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:344:12: ( addExpr ( ( OP_LSHIFT | OP_RSHIFT ) addExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:344:14: addExpr ( ( OP_LSHIFT | OP_RSHIFT ) addExpr )*
            {
            pushFollow(FOLLOW_addExpr_in_shiftExpr2211);
            addExpr();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:344:22: ( ( OP_LSHIFT | OP_RSHIFT ) addExpr )*
            loop111:
            do {
                int alt111=2;
                int LA111_0 = input.LA(1);

                if ( ((LA111_0>=OP_LSHIFT && LA111_0<=OP_RSHIFT)) ) {
                    alt111=1;
                }


                switch (alt111) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:344:23: ( OP_LSHIFT | OP_RSHIFT ) addExpr
            	    {
            	    if ( (input.LA(1)>=OP_LSHIFT && input.LA(1)<=OP_RSHIFT) ) {
            	        input.consume();
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_addExpr_in_shiftExpr2222);
            	    addExpr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop111;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 92, shiftExpr_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "shiftExpr"


    // $ANTLR start "addExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:345:1: addExpr : multExpr ( ( OP_PLUS | OP_MINUS ) multExpr )* ;
    public final void addExpr() throws RecognitionException {
        int addExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 93) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:345:10: ( multExpr ( ( OP_PLUS | OP_MINUS ) multExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:345:12: multExpr ( ( OP_PLUS | OP_MINUS ) multExpr )*
            {
            pushFollow(FOLLOW_multExpr_in_addExpr2233);
            multExpr();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:345:21: ( ( OP_PLUS | OP_MINUS ) multExpr )*
            loop112:
            do {
                int alt112=2;
                alt112 = dfa112.predict(input);
                switch (alt112) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:345:22: ( OP_PLUS | OP_MINUS ) multExpr
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

            	    pushFollow(FOLLOW_multExpr_in_addExpr2244);
            	    multExpr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop112;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 93, addExpr_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "addExpr"


    // $ANTLR start "addAppend"
    // src/net/colar/netbeans/fan/antlr/Fan.g:346:1: addAppend : ( OP_PLUS | OP_MINUS ) parenExpr ;
    public final void addAppend() throws RecognitionException {
        int addAppend_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 94) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:346:11: ( ( OP_PLUS | OP_MINUS ) parenExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:346:13: ( OP_PLUS | OP_MINUS ) parenExpr
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

            pushFollow(FOLLOW_parenExpr_in_addAppend2262);
            parenExpr();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 94, addAppend_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "addAppend"


    // $ANTLR start "multExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:347:1: multExpr : parenExpr ( ( OP_MULTI | OP_DIV | OP_MOD ) parenExpr )* ;
    public final void multExpr() throws RecognitionException {
        int multExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 95) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:347:11: ( parenExpr ( ( OP_MULTI | OP_DIV | OP_MOD ) parenExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:347:13: parenExpr ( ( OP_MULTI | OP_DIV | OP_MOD ) parenExpr )*
            {
            pushFollow(FOLLOW_parenExpr_in_multExpr2270);
            parenExpr();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:347:23: ( ( OP_MULTI | OP_DIV | OP_MOD ) parenExpr )*
            loop113:
            do {
                int alt113=2;
                int LA113_0 = input.LA(1);

                if ( ((LA113_0>=OP_MULTI && LA113_0<=OP_MOD)) ) {
                    alt113=1;
                }


                switch (alt113) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:347:24: ( OP_MULTI | OP_DIV | OP_MOD ) parenExpr
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

            	    pushFollow(FOLLOW_parenExpr_in_multExpr2285);
            	    parenExpr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop113;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 95, multExpr_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "multExpr"


    // $ANTLR start "parenExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:348:1: parenExpr : ( castExpr | groupedExpr | unaryExpr );
    public final void parenExpr() throws RecognitionException {
        int parenExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 96) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:348:12: ( castExpr | groupedExpr | unaryExpr )
            int alt114=3;
            alt114 = dfa114.predict(input);
            switch (alt114) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:348:14: castExpr
                    {
                    pushFollow(FOLLOW_castExpr_in_parenExpr2296);
                    castExpr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:348:25: groupedExpr
                    {
                    pushFollow(FOLLOW_groupedExpr_in_parenExpr2300);
                    groupedExpr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:348:39: unaryExpr
                    {
                    pushFollow(FOLLOW_unaryExpr_in_parenExpr2304);
                    unaryExpr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 96, parenExpr_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "parenExpr"


    // $ANTLR start "castExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:350:1: castExpr : {...}? PAR_L type PAR_R parenExpr ;
    public final void castExpr() throws RecognitionException {
        int castExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 97) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:350:11: ({...}? PAR_L type PAR_R parenExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:350:13: {...}? PAR_L type PAR_R parenExpr
            {
            if ( !((notAfterEol())) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "castExpr", "notAfterEol()");
            }
            match(input,PAR_L,FOLLOW_PAR_L_in_castExpr2315); if (state.failed) return ;
            pushFollow(FOLLOW_type_in_castExpr2317);
            type();

            state._fsp--;
            if (state.failed) return ;
            match(input,PAR_R,FOLLOW_PAR_R_in_castExpr2319); if (state.failed) return ;
            pushFollow(FOLLOW_parenExpr_in_castExpr2321);
            parenExpr();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 97, castExpr_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "castExpr"


    // $ANTLR start "groupedExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:352:1: groupedExpr : PAR_L expr PAR_R ( termChain )* ;
    public final void groupedExpr() throws RecognitionException {
        int groupedExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 98) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:352:14: ( PAR_L expr PAR_R ( termChain )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:352:16: PAR_L expr PAR_R ( termChain )*
            {
            match(input,PAR_L,FOLLOW_PAR_L_in_groupedExpr2330); if (state.failed) return ;
            pushFollow(FOLLOW_expr_in_groupedExpr2332);
            expr();

            state._fsp--;
            if (state.failed) return ;
            match(input,PAR_R,FOLLOW_PAR_R_in_groupedExpr2334); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:352:33: ( termChain )*
            loop115:
            do {
                int alt115=2;
                alt115 = dfa115.predict(input);
                switch (alt115) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: termChain
            	    {
            	    pushFollow(FOLLOW_termChain_in_groupedExpr2336);
            	    termChain();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop115;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 98, groupedExpr_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "groupedExpr"


    // $ANTLR start "unaryExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:353:1: unaryExpr : ( prefixExpr | postfixExpr | termExpr );
    public final void unaryExpr() throws RecognitionException {
        int unaryExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 99) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:353:12: ( prefixExpr | postfixExpr | termExpr )
            int alt116=3;
            alt116 = dfa116.predict(input);
            switch (alt116) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:353:14: prefixExpr
                    {
                    pushFollow(FOLLOW_prefixExpr_in_unaryExpr2345);
                    prefixExpr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:353:27: postfixExpr
                    {
                    pushFollow(FOLLOW_postfixExpr_in_unaryExpr2349);
                    postfixExpr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:353:41: termExpr
                    {
                    pushFollow(FOLLOW_termExpr_in_unaryExpr2353);
                    termExpr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 99, unaryExpr_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "unaryExpr"


    // $ANTLR start "prefixExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:354:1: prefixExpr : ( OP_CURRY | OP_BANG | OP_2PLUS | OP_2MINUS | OP_TILDA | OP_PLUS | OP_MINUS ) parenExpr ;
    public final void prefixExpr() throws RecognitionException {
        int prefixExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 100) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:354:13: ( ( OP_CURRY | OP_BANG | OP_2PLUS | OP_2MINUS | OP_TILDA | OP_PLUS | OP_MINUS ) parenExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:354:15: ( OP_CURRY | OP_BANG | OP_2PLUS | OP_2MINUS | OP_TILDA | OP_PLUS | OP_MINUS ) parenExpr
            {
            if ( input.LA(1)==OP_CURRY||(input.LA(1)>=OP_PLUS && input.LA(1)<=OP_MINUS)||(input.LA(1)>=OP_BANG && input.LA(1)<=OP_TILDA) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            pushFollow(FOLLOW_parenExpr_in_prefixExpr2389);
            parenExpr();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 100, prefixExpr_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "prefixExpr"


    // $ANTLR start "postfixExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:355:1: postfixExpr : termExpr ( OP_2PLUS | OP_2MINUS ) ;
    public final void postfixExpr() throws RecognitionException {
        int postfixExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 101) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:355:14: ( termExpr ( OP_2PLUS | OP_2MINUS ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:355:16: termExpr ( OP_2PLUS | OP_2MINUS )
            {
            pushFollow(FOLLOW_termExpr_in_postfixExpr2398);
            termExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( (input.LA(1)>=OP_2PLUS && input.LA(1)<=OP_2MINUS) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 101, postfixExpr_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "postfixExpr"


    // $ANTLR start "termExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:356:1: termExpr : termBase ( termChain )* ;
    public final void termExpr() throws RecognitionException {
        int termExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 102) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:356:11: ( termBase ( termChain )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:356:13: termBase ( termChain )*
            {
            pushFollow(FOLLOW_termBase_in_termExpr2415);
            termBase();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:356:22: ( termChain )*
            loop117:
            do {
                int alt117=2;
                alt117 = dfa117.predict(input);
                switch (alt117) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: termChain
            	    {
            	    pushFollow(FOLLOW_termChain_in_termExpr2417);
            	    termChain();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop117;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 102, termExpr_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "termExpr"


    // $ANTLR start "termBase"
    // src/net/colar/netbeans/fan/antlr/Fan.g:358:1: termBase : ( idExprReq | literal | typeBase | id );
    public final void termBase() throws RecognitionException {
        int termBase_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 103) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:358:11: ( idExprReq | literal | typeBase | id )
            int alt118=4;
            alt118 = dfa118.predict(input);
            switch (alt118) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:358:13: idExprReq
                    {
                    pushFollow(FOLLOW_idExprReq_in_termBase2427);
                    idExprReq();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:358:25: literal
                    {
                    pushFollow(FOLLOW_literal_in_termBase2431);
                    literal();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:358:35: typeBase
                    {
                    pushFollow(FOLLOW_typeBase_in_termBase2435);
                    typeBase();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:358:46: id
                    {
                    pushFollow(FOLLOW_id_in_termBase2439);
                    id();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 103, termBase_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "termBase"


    // $ANTLR start "typeBase"
    // src/net/colar/netbeans/fan/antlr/Fan.g:359:1: typeBase : ( typeLiteral | slotLiteral | namedSuper | staticCall | dsl | closure | simple | ctorBlock );
    public final void typeBase() throws RecognitionException {
        int typeBase_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 104) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:359:10: ( typeLiteral | slotLiteral | namedSuper | staticCall | dsl | closure | simple | ctorBlock )
            int alt119=8;
            alt119 = dfa119.predict(input);
            switch (alt119) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:359:12: typeLiteral
                    {
                    pushFollow(FOLLOW_typeLiteral_in_typeBase2446);
                    typeLiteral();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:359:26: slotLiteral
                    {
                    pushFollow(FOLLOW_slotLiteral_in_typeBase2450);
                    slotLiteral();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:359:40: namedSuper
                    {
                    pushFollow(FOLLOW_namedSuper_in_typeBase2454);
                    namedSuper();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:359:53: staticCall
                    {
                    pushFollow(FOLLOW_staticCall_in_typeBase2458);
                    staticCall();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:360:19: dsl
                    {
                    pushFollow(FOLLOW_dsl_in_typeBase2480);
                    dsl();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:360:25: closure
                    {
                    pushFollow(FOLLOW_closure_in_typeBase2484);
                    closure();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:360:35: simple
                    {
                    pushFollow(FOLLOW_simple_in_typeBase2488);
                    simple();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:360:44: ctorBlock
                    {
                    pushFollow(FOLLOW_ctorBlock_in_typeBase2492);
                    ctorBlock();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 104, typeBase_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "typeBase"


    // $ANTLR start "ctorBlock"
    // src/net/colar/netbeans/fan/antlr/Fan.g:361:1: ctorBlock : type itBlock ;
    public final void ctorBlock() throws RecognitionException {
        int ctorBlock_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 105) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:361:11: ( type itBlock )
            // src/net/colar/netbeans/fan/antlr/Fan.g:361:13: type itBlock
            {
            pushFollow(FOLLOW_type_in_ctorBlock2499);
            type();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_itBlock_in_ctorBlock2501);
            itBlock();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 105, ctorBlock_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "ctorBlock"


    // $ANTLR start "staticCall"
    // src/net/colar/netbeans/fan/antlr/Fan.g:362:1: staticCall : type DOT idExpr ;
    public final void staticCall() throws RecognitionException {
        int staticCall_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 106) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:362:12: ( type DOT idExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:362:14: type DOT idExpr
            {
            pushFollow(FOLLOW_type_in_staticCall2508);
            type();

            state._fsp--;
            if (state.failed) return ;
            match(input,DOT,FOLLOW_DOT_in_staticCall2510); if (state.failed) return ;
            pushFollow(FOLLOW_idExpr_in_staticCall2512);
            idExpr();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 106, staticCall_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "staticCall"


    // $ANTLR start "termChain"
    // src/net/colar/netbeans/fan/antlr/Fan.g:364:1: termChain : ( dotCall | dynCall | safeDotCall | safeDynCall | indexExpr | callOp | itBlock );
    public final void termChain() throws RecognitionException {
        int termChain_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 107) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:364:12: ( dotCall | dynCall | safeDotCall | safeDynCall | indexExpr | callOp | itBlock )
            int alt120=7;
            switch ( input.LA(1) ) {
            case DOT:
                {
                alt120=1;
                }
                break;
            case OP_ARROW:
                {
                alt120=2;
                }
                break;
            case OP_SAFE_CALL:
                {
                alt120=3;
                }
                break;
            case OP_SAFEDYN_CALL:
                {
                alt120=4;
                }
                break;
            case SQ_BRACKET_L:
                {
                alt120=5;
                }
                break;
            case PAR_L:
                {
                alt120=6;
                }
                break;
            case BRACKET_L:
                {
                alt120=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 120, 0, input);

                throw nvae;
            }

            switch (alt120) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:364:14: dotCall
                    {
                    pushFollow(FOLLOW_dotCall_in_termChain2521);
                    dotCall();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:364:24: dynCall
                    {
                    pushFollow(FOLLOW_dynCall_in_termChain2525);
                    dynCall();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:364:34: safeDotCall
                    {
                    pushFollow(FOLLOW_safeDotCall_in_termChain2529);
                    safeDotCall();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:364:48: safeDynCall
                    {
                    pushFollow(FOLLOW_safeDynCall_in_termChain2533);
                    safeDynCall();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:365:4: indexExpr
                    {
                    pushFollow(FOLLOW_indexExpr_in_termChain2540);
                    indexExpr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:365:16: callOp
                    {
                    pushFollow(FOLLOW_callOp_in_termChain2544);
                    callOp();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:365:25: itBlock
                    {
                    pushFollow(FOLLOW_itBlock_in_termChain2548);
                    itBlock();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 107, termChain_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "termChain"


    // $ANTLR start "dsl"
    // src/net/colar/netbeans/fan/antlr/Fan.g:366:1: dsl : simpleType DSL ;
    public final void dsl() throws RecognitionException {
        int dsl_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 108) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:366:13: ( simpleType DSL )
            // src/net/colar/netbeans/fan/antlr/Fan.g:366:15: simpleType DSL
            {
            pushFollow(FOLLOW_simpleType_in_dsl2563);
            simpleType();

            state._fsp--;
            if (state.failed) return ;
            match(input,DSL,FOLLOW_DSL_in_dsl2565); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 108, dsl_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "dsl"


    // $ANTLR start "itBlock"
    // src/net/colar/netbeans/fan/antlr/Fan.g:369:1: itBlock : BRACKET_L ( stmt ( SP_COMMA )? ( SP_SEMI )? )* BRACKET_R ;
    public final void itBlock() throws RecognitionException {
        int itBlock_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 109) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:369:10: ( BRACKET_L ( stmt ( SP_COMMA )? ( SP_SEMI )? )* BRACKET_R )
            // src/net/colar/netbeans/fan/antlr/Fan.g:369:12: BRACKET_L ( stmt ( SP_COMMA )? ( SP_SEMI )? )* BRACKET_R
            {
            match(input,BRACKET_L,FOLLOW_BRACKET_L_in_itBlock2575); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:369:22: ( stmt ( SP_COMMA )? ( SP_SEMI )? )*
            loop123:
            do {
                int alt123=2;
                int LA123_0 = input.LA(1);

                if ( ((LA123_0>=KW_BREAK && LA123_0<=KW_TRY)||(LA123_0>=KW_THIS && LA123_0<=KW_SUPER)||(LA123_0>=KW_NULL && LA123_0<=KW_FALSE)||LA123_0==SQ_BRACKET_L||LA123_0==PAR_L||LA123_0==SP_PIPE||LA123_0==OP_CURRY||(LA123_0>=OP_PLUS && LA123_0<=OP_MINUS)||(LA123_0>=OP_BANG && LA123_0<=OP_TILDA)||(LA123_0>=AT && LA123_0<=OP_POUND)||LA123_0==NUMBER) ) {
                    alt123=1;
                }


                switch (alt123) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:369:23: stmt ( SP_COMMA )? ( SP_SEMI )?
            	    {
            	    pushFollow(FOLLOW_stmt_in_itBlock2578);
            	    stmt();

            	    state._fsp--;
            	    if (state.failed) return ;
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:369:28: ( SP_COMMA )?
            	    int alt121=2;
            	    int LA121_0 = input.LA(1);

            	    if ( (LA121_0==SP_COMMA) ) {
            	        alt121=1;
            	    }
            	    switch (alt121) {
            	        case 1 :
            	            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_COMMA
            	            {
            	            match(input,SP_COMMA,FOLLOW_SP_COMMA_in_itBlock2580); if (state.failed) return ;

            	            }
            	            break;

            	    }

            	    // src/net/colar/netbeans/fan/antlr/Fan.g:369:38: ( SP_SEMI )?
            	    int alt122=2;
            	    int LA122_0 = input.LA(1);

            	    if ( (LA122_0==SP_SEMI) ) {
            	        alt122=1;
            	    }
            	    switch (alt122) {
            	        case 1 :
            	            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_SEMI
            	            {
            	            match(input,SP_SEMI,FOLLOW_SP_SEMI_in_itBlock2583); if (state.failed) return ;

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop123;
                }
            } while (true);

            match(input,BRACKET_R,FOLLOW_BRACKET_R_in_itBlock2588); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 109, itBlock_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "itBlock"


    // $ANTLR start "dotCall"
    // src/net/colar/netbeans/fan/antlr/Fan.g:370:1: dotCall : DOT idExpr ;
    public final void dotCall() throws RecognitionException {
        int dotCall_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 110) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:370:10: ( DOT idExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:370:12: DOT idExpr
            {
            match(input,DOT,FOLLOW_DOT_in_dotCall2596); if (state.failed) return ;
            pushFollow(FOLLOW_idExpr_in_dotCall2598);
            idExpr();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 110, dotCall_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "dotCall"


    // $ANTLR start "dynCall"
    // src/net/colar/netbeans/fan/antlr/Fan.g:371:1: dynCall : OP_ARROW idExpr ;
    public final void dynCall() throws RecognitionException {
        int dynCall_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 111) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:371:10: ( OP_ARROW idExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:371:12: OP_ARROW idExpr
            {
            match(input,OP_ARROW,FOLLOW_OP_ARROW_in_dynCall2606); if (state.failed) return ;
            pushFollow(FOLLOW_idExpr_in_dynCall2608);
            idExpr();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 111, dynCall_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "dynCall"


    // $ANTLR start "safeDotCall"
    // src/net/colar/netbeans/fan/antlr/Fan.g:372:1: safeDotCall : OP_SAFE_CALL idExpr ;
    public final void safeDotCall() throws RecognitionException {
        int safeDotCall_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 112) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:372:14: ( OP_SAFE_CALL idExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:372:16: OP_SAFE_CALL idExpr
            {
            match(input,OP_SAFE_CALL,FOLLOW_OP_SAFE_CALL_in_safeDotCall2616); if (state.failed) return ;
            pushFollow(FOLLOW_idExpr_in_safeDotCall2618);
            idExpr();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 112, safeDotCall_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "safeDotCall"


    // $ANTLR start "safeDynCall"
    // src/net/colar/netbeans/fan/antlr/Fan.g:373:1: safeDynCall : OP_SAFEDYN_CALL idExpr ;
    public final void safeDynCall() throws RecognitionException {
        int safeDynCall_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 113) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:373:13: ( OP_SAFEDYN_CALL idExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:373:15: OP_SAFEDYN_CALL idExpr
            {
            match(input,OP_SAFEDYN_CALL,FOLLOW_OP_SAFEDYN_CALL_in_safeDynCall2625); if (state.failed) return ;
            pushFollow(FOLLOW_idExpr_in_safeDynCall2627);
            idExpr();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 113, safeDynCall_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "safeDynCall"


    // $ANTLR start "indexExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:374:1: indexExpr : {...}? SQ_BRACKET_L expr SQ_BRACKET_R ;
    public final void indexExpr() throws RecognitionException {
        int indexExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 114) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:374:12: ({...}? SQ_BRACKET_L expr SQ_BRACKET_R )
            // src/net/colar/netbeans/fan/antlr/Fan.g:374:14: {...}? SQ_BRACKET_L expr SQ_BRACKET_R
            {
            if ( !((notAfterEol())) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "indexExpr", "notAfterEol()");
            }
            match(input,SQ_BRACKET_L,FOLLOW_SQ_BRACKET_L_in_indexExpr2637); if (state.failed) return ;
            pushFollow(FOLLOW_expr_in_indexExpr2639);
            expr();

            state._fsp--;
            if (state.failed) return ;
            match(input,SQ_BRACKET_R,FOLLOW_SQ_BRACKET_R_in_indexExpr2641); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 114, indexExpr_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "indexExpr"


    // $ANTLR start "callOp"
    // src/net/colar/netbeans/fan/antlr/Fan.g:376:1: callOp : {...}? PAR_L ( args )? PAR_R ( closure )* ;
    public final void callOp() throws RecognitionException {
        int callOp_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 115) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:376:9: ({...}? PAR_L ( args )? PAR_R ( closure )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:376:11: {...}? PAR_L ( args )? PAR_R ( closure )*
            {
            if ( !((notAfterEol())) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "callOp", "notAfterEol()");
            }
            match(input,PAR_L,FOLLOW_PAR_L_in_callOp2652); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:376:34: ( args )?
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( ((LA124_0>=KW_THIS && LA124_0<=KW_SUPER)||(LA124_0>=KW_NULL && LA124_0<=KW_FALSE)||LA124_0==SQ_BRACKET_L||LA124_0==PAR_L||LA124_0==SP_PIPE||LA124_0==OP_CURRY||(LA124_0>=OP_PLUS && LA124_0<=OP_MINUS)||(LA124_0>=OP_BANG && LA124_0<=OP_TILDA)||(LA124_0>=AT && LA124_0<=OP_POUND)||LA124_0==NUMBER) ) {
                alt124=1;
            }
            switch (alt124) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: args
                    {
                    pushFollow(FOLLOW_args_in_callOp2654);
                    args();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,PAR_R,FOLLOW_PAR_R_in_callOp2658); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:376:47: ( closure )*
            loop125:
            do {
                int alt125=2;
                alt125 = dfa125.predict(input);
                switch (alt125) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: closure
            	    {
            	    pushFollow(FOLLOW_closure_in_callOp2660);
            	    closure();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop125;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 115, callOp_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "callOp"


    // $ANTLR start "closure"
    // src/net/colar/netbeans/fan/antlr/Fan.g:377:1: closure : funcType BRACKET_L ( stmt )* BRACKET_R ;
    public final void closure() throws RecognitionException {
        int closure_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 116) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:377:10: ( funcType BRACKET_L ( stmt )* BRACKET_R )
            // src/net/colar/netbeans/fan/antlr/Fan.g:377:14: funcType BRACKET_L ( stmt )* BRACKET_R
            {
            pushFollow(FOLLOW_funcType_in_closure2671);
            funcType();

            state._fsp--;
            if (state.failed) return ;
            match(input,BRACKET_L,FOLLOW_BRACKET_L_in_closure2673); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:377:33: ( stmt )*
            loop126:
            do {
                int alt126=2;
                int LA126_0 = input.LA(1);

                if ( ((LA126_0>=KW_BREAK && LA126_0<=KW_TRY)||(LA126_0>=KW_THIS && LA126_0<=KW_SUPER)||(LA126_0>=KW_NULL && LA126_0<=KW_FALSE)||LA126_0==SQ_BRACKET_L||LA126_0==PAR_L||LA126_0==SP_PIPE||LA126_0==OP_CURRY||(LA126_0>=OP_PLUS && LA126_0<=OP_MINUS)||(LA126_0>=OP_BANG && LA126_0<=OP_TILDA)||(LA126_0>=AT && LA126_0<=OP_POUND)||LA126_0==NUMBER) ) {
                    alt126=1;
                }


                switch (alt126) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_closure2675);
            	    stmt();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop126;
                }
            } while (true);

            match(input,BRACKET_R,FOLLOW_BRACKET_R_in_closure2678); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 116, closure_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "closure"


    // $ANTLR start "idExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:379:1: idExpr : ( idExprReq | id );
    public final void idExpr() throws RecognitionException {
        int idExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 117) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:379:10: ( idExprReq | id )
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==AT) ) {
                alt127=1;
            }
            else if ( (LA127_0==ID) ) {
                int LA127_2 = input.LA(2);

                if ( (synpred203_Fan()) ) {
                    alt127=1;
                }
                else if ( (true) ) {
                    alt127=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 127, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 127, 0, input);

                throw nvae;
            }
            switch (alt127) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:379:12: idExprReq
                    {
                    pushFollow(FOLLOW_idExprReq_in_idExpr2688);
                    idExprReq();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:379:24: id
                    {
                    pushFollow(FOLLOW_id_in_idExpr2692);
                    id();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 117, idExpr_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "idExpr"


    // $ANTLR start "idExprReq"
    // src/net/colar/netbeans/fan/antlr/Fan.g:381:1: idExprReq : ( field | call );
    public final void idExprReq() throws RecognitionException {
        int idExprReq_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 118) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:381:11: ( field | call )
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==AT) ) {
                alt128=1;
            }
            else if ( (LA128_0==ID) ) {
                alt128=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 128, 0, input);

                throw nvae;
            }
            switch (alt128) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:381:13: field
                    {
                    pushFollow(FOLLOW_field_in_idExprReq2700);
                    field();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:381:21: call
                    {
                    pushFollow(FOLLOW_call_in_idExprReq2704);
                    call();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 118, idExprReq_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "idExprReq"


    // $ANTLR start "field"
    // src/net/colar/netbeans/fan/antlr/Fan.g:383:1: field : AT ID ;
    public final void field() throws RecognitionException {
        int field_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 119) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:383:8: ( AT ID )
            // src/net/colar/netbeans/fan/antlr/Fan.g:383:10: AT ID
            {
            match(input,AT,FOLLOW_AT_in_field2713); if (state.failed) return ;
            match(input,ID,FOLLOW_ID_in_field2715); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 119, field_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "field"


    // $ANTLR start "call"
    // src/net/colar/netbeans/fan/antlr/Fan.g:385:1: call : id ( ( callParams closure ) | callParams | closure ) ;
    public final void call() throws RecognitionException {
        int call_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 120) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:385:7: ( id ( ( callParams closure ) | callParams | closure ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:385:9: id ( ( callParams closure ) | callParams | closure )
            {
            pushFollow(FOLLOW_id_in_call2725);
            id();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:385:12: ( ( callParams closure ) | callParams | closure )
            int alt129=3;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==PAR_L) ) {
                int LA129_1 = input.LA(2);

                if ( ((synpred205_Fan()&&(notAfterEol()))) ) {
                    alt129=1;
                }
                else if ( ((synpred206_Fan()&&(notAfterEol()))) ) {
                    alt129=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 129, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA129_0==SP_PIPE) ) {
                alt129=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 129, 0, input);

                throw nvae;
            }
            switch (alt129) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:385:13: ( callParams closure )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:385:13: ( callParams closure )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:385:14: callParams closure
                    {
                    pushFollow(FOLLOW_callParams_in_call2729);
                    callParams();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_closure_in_call2731);
                    closure();

                    state._fsp--;
                    if (state.failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:385:36: callParams
                    {
                    pushFollow(FOLLOW_callParams_in_call2736);
                    callParams();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:385:49: closure
                    {
                    pushFollow(FOLLOW_closure_in_call2740);
                    closure();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 120, call_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "call"


    // $ANTLR start "callParams"
    // src/net/colar/netbeans/fan/antlr/Fan.g:387:1: callParams : {...}? PAR_L ( args )? PAR_R ;
    public final void callParams() throws RecognitionException {
        int callParams_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 121) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:387:12: ({...}? PAR_L ( args )? PAR_R )
            // src/net/colar/netbeans/fan/antlr/Fan.g:387:14: {...}? PAR_L ( args )? PAR_R
            {
            if ( !((notAfterEol())) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "callParams", "notAfterEol()");
            }
            match(input,PAR_L,FOLLOW_PAR_L_in_callParams2751); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:387:37: ( args )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( ((LA130_0>=KW_THIS && LA130_0<=KW_SUPER)||(LA130_0>=KW_NULL && LA130_0<=KW_FALSE)||LA130_0==SQ_BRACKET_L||LA130_0==PAR_L||LA130_0==SP_PIPE||LA130_0==OP_CURRY||(LA130_0>=OP_PLUS && LA130_0<=OP_MINUS)||(LA130_0>=OP_BANG && LA130_0<=OP_TILDA)||(LA130_0>=AT && LA130_0<=OP_POUND)||LA130_0==NUMBER) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: args
                    {
                    pushFollow(FOLLOW_args_in_callParams2753);
                    args();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,PAR_R,FOLLOW_PAR_R_in_callParams2756); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 121, callParams_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "callParams"


    // $ANTLR start "args"
    // src/net/colar/netbeans/fan/antlr/Fan.g:388:1: args : expr ( SP_COMMA expr )* ;
    public final void args() throws RecognitionException {
        int args_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 122) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:388:8: ( expr ( SP_COMMA expr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:388:10: expr ( SP_COMMA expr )*
            {
            pushFollow(FOLLOW_expr_in_args2765);
            expr();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:388:15: ( SP_COMMA expr )*
            loop131:
            do {
                int alt131=2;
                int LA131_0 = input.LA(1);

                if ( (LA131_0==SP_COMMA) ) {
                    alt131=1;
                }


                switch (alt131) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:388:16: SP_COMMA expr
            	    {
            	    match(input,SP_COMMA,FOLLOW_SP_COMMA_in_args2768); if (state.failed) return ;
            	    pushFollow(FOLLOW_expr_in_args2771);
            	    expr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop131;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 122, args_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "args"


    // $ANTLR start "literal"
    // src/net/colar/netbeans/fan/antlr/Fan.g:390:1: literal : ( KW_NULL | KW_THIS | KW_SUPER | KW_IT | KW_TRUE | KW_FALSE | QUOTSTR | STR | URI | number | CHAR | namedSuper | slotLiteral | typeLiteral | list | map | simple );
    public final void literal() throws RecognitionException {
        int literal_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 123) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:390:10: ( KW_NULL | KW_THIS | KW_SUPER | KW_IT | KW_TRUE | KW_FALSE | QUOTSTR | STR | URI | number | CHAR | namedSuper | slotLiteral | typeLiteral | list | map | simple )
            int alt132=17;
            alt132 = dfa132.predict(input);
            switch (alt132) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:390:12: KW_NULL
                    {
                    match(input,KW_NULL,FOLLOW_KW_NULL_in_literal2782); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:390:22: KW_THIS
                    {
                    match(input,KW_THIS,FOLLOW_KW_THIS_in_literal2786); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:390:32: KW_SUPER
                    {
                    match(input,KW_SUPER,FOLLOW_KW_SUPER_in_literal2790); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:390:43: KW_IT
                    {
                    match(input,KW_IT,FOLLOW_KW_IT_in_literal2794); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:390:51: KW_TRUE
                    {
                    match(input,KW_TRUE,FOLLOW_KW_TRUE_in_literal2798); if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:390:61: KW_FALSE
                    {
                    match(input,KW_FALSE,FOLLOW_KW_FALSE_in_literal2802); if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:390:72: QUOTSTR
                    {
                    match(input,QUOTSTR,FOLLOW_QUOTSTR_in_literal2806); if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:390:82: STR
                    {
                    match(input,STR,FOLLOW_STR_in_literal2810); if (state.failed) return ;

                    }
                    break;
                case 9 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:390:88: URI
                    {
                    match(input,URI,FOLLOW_URI_in_literal2814); if (state.failed) return ;

                    }
                    break;
                case 10 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:391:4: number
                    {
                    pushFollow(FOLLOW_number_in_literal2821);
                    number();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 11 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:391:13: CHAR
                    {
                    match(input,CHAR,FOLLOW_CHAR_in_literal2825); if (state.failed) return ;

                    }
                    break;
                case 12 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:391:20: namedSuper
                    {
                    pushFollow(FOLLOW_namedSuper_in_literal2829);
                    namedSuper();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 13 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:392:4: slotLiteral
                    {
                    pushFollow(FOLLOW_slotLiteral_in_literal2836);
                    slotLiteral();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 14 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:392:18: typeLiteral
                    {
                    pushFollow(FOLLOW_typeLiteral_in_literal2840);
                    typeLiteral();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 15 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:392:32: list
                    {
                    pushFollow(FOLLOW_list_in_literal2844);
                    list();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 16 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:392:39: map
                    {
                    pushFollow(FOLLOW_map_in_literal2848);
                    map();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 17 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:392:45: simple
                    {
                    pushFollow(FOLLOW_simple_in_literal2852);
                    simple();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 123, literal_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "literal"


    // $ANTLR start "typeLiteral"
    // src/net/colar/netbeans/fan/antlr/Fan.g:393:1: typeLiteral : type {...}? OP_POUND ;
    public final void typeLiteral() throws RecognitionException {
        int typeLiteral_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 124) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:393:13: ( type {...}? OP_POUND )
            // src/net/colar/netbeans/fan/antlr/Fan.g:393:17: type {...}? OP_POUND
            {
            pushFollow(FOLLOW_type_in_typeLiteral2861);
            type();

            state._fsp--;
            if (state.failed) return ;
            if ( !((notAfterEol())) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "typeLiteral", "notAfterEol()");
            }
            match(input,OP_POUND,FOLLOW_OP_POUND_in_typeLiteral2865); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 124, typeLiteral_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "typeLiteral"


    // $ANTLR start "slotLiteral"
    // src/net/colar/netbeans/fan/antlr/Fan.g:394:1: slotLiteral : ( type )? OP_POUND {...}? id ;
    public final void slotLiteral() throws RecognitionException {
        int slotLiteral_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 125) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:394:13: ( ( type )? OP_POUND {...}? id )
            // src/net/colar/netbeans/fan/antlr/Fan.g:394:17: ( type )? OP_POUND {...}? id
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:394:17: ( type )?
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==SQ_BRACKET_L||LA133_0==SP_PIPE||LA133_0==ID) ) {
                alt133=1;
            }
            switch (alt133) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: type
                    {
                    pushFollow(FOLLOW_type_in_slotLiteral2874);
                    type();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,OP_POUND,FOLLOW_OP_POUND_in_slotLiteral2877); if (state.failed) return ;
            if ( !((notAfterEol())) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "slotLiteral", "notAfterEol()");
            }
            pushFollow(FOLLOW_id_in_slotLiteral2881);
            id();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 125, slotLiteral_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "slotLiteral"


    // $ANTLR start "namedSuper"
    // src/net/colar/netbeans/fan/antlr/Fan.g:395:1: namedSuper : simpleType DOT KW_SUPER ;
    public final void namedSuper() throws RecognitionException {
        int namedSuper_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 126) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:395:13: ( simpleType DOT KW_SUPER )
            // src/net/colar/netbeans/fan/antlr/Fan.g:395:15: simpleType DOT KW_SUPER
            {
            pushFollow(FOLLOW_simpleType_in_namedSuper2889);
            simpleType();

            state._fsp--;
            if (state.failed) return ;
            match(input,DOT,FOLLOW_DOT_in_namedSuper2891); if (state.failed) return ;
            match(input,KW_SUPER,FOLLOW_KW_SUPER_in_namedSuper2893); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 126, namedSuper_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "namedSuper"


    // $ANTLR start "list"
    // src/net/colar/netbeans/fan/antlr/Fan.g:396:1: list : ( type {...}?)? SQ_BRACKET_L listItems SQ_BRACKET_R ;
    public final void list() throws RecognitionException {
        int list_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 127) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:396:8: ( ( type {...}?)? SQ_BRACKET_L listItems SQ_BRACKET_R )
            // src/net/colar/netbeans/fan/antlr/Fan.g:396:10: ( type {...}?)? SQ_BRACKET_L listItems SQ_BRACKET_R
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:396:10: ( type {...}?)?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==SQ_BRACKET_L) ) {
                int LA134_1 = input.LA(2);

                if ( (synpred226_Fan()) ) {
                    alt134=1;
                }
            }
            else if ( (LA134_0==SP_PIPE||LA134_0==ID) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:396:11: type {...}?
                    {
                    pushFollow(FOLLOW_type_in_list2903);
                    type();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( !((notAfterEol())) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "list", "notAfterEol()");
                    }

                    }
                    break;

            }

            match(input,SQ_BRACKET_L,FOLLOW_SQ_BRACKET_L_in_list2909); if (state.failed) return ;
            pushFollow(FOLLOW_listItems_in_list2911);
            listItems();

            state._fsp--;
            if (state.failed) return ;
            match(input,SQ_BRACKET_R,FOLLOW_SQ_BRACKET_R_in_list2913); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 127, list_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "list"


    // $ANTLR start "listItems"
    // src/net/colar/netbeans/fan/antlr/Fan.g:397:1: listItems : ( ( expr ( SP_COMMA expr )* ( SP_COMMA )? ) | SP_COMMA );
    public final void listItems() throws RecognitionException {
        int listItems_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 128) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:397:12: ( ( expr ( SP_COMMA expr )* ( SP_COMMA )? ) | SP_COMMA )
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( ((LA137_0>=KW_THIS && LA137_0<=KW_SUPER)||(LA137_0>=KW_NULL && LA137_0<=KW_FALSE)||LA137_0==SQ_BRACKET_L||LA137_0==PAR_L||LA137_0==SP_PIPE||LA137_0==OP_CURRY||(LA137_0>=OP_PLUS && LA137_0<=OP_MINUS)||(LA137_0>=OP_BANG && LA137_0<=OP_TILDA)||(LA137_0>=AT && LA137_0<=OP_POUND)||LA137_0==NUMBER) ) {
                alt137=1;
            }
            else if ( (LA137_0==SP_COMMA) ) {
                alt137=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 137, 0, input);

                throw nvae;
            }
            switch (alt137) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:397:14: ( expr ( SP_COMMA expr )* ( SP_COMMA )? )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:397:14: ( expr ( SP_COMMA expr )* ( SP_COMMA )? )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:397:15: expr ( SP_COMMA expr )* ( SP_COMMA )?
                    {
                    pushFollow(FOLLOW_expr_in_listItems2922);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;
                    // src/net/colar/netbeans/fan/antlr/Fan.g:397:20: ( SP_COMMA expr )*
                    loop135:
                    do {
                        int alt135=2;
                        int LA135_0 = input.LA(1);

                        if ( (LA135_0==SP_COMMA) ) {
                            int LA135_1 = input.LA(2);

                            if ( ((LA135_1>=KW_THIS && LA135_1<=KW_SUPER)||(LA135_1>=KW_NULL && LA135_1<=KW_FALSE)||LA135_1==SQ_BRACKET_L||LA135_1==PAR_L||LA135_1==SP_PIPE||LA135_1==OP_CURRY||(LA135_1>=OP_PLUS && LA135_1<=OP_MINUS)||(LA135_1>=OP_BANG && LA135_1<=OP_TILDA)||(LA135_1>=AT && LA135_1<=OP_POUND)||LA135_1==NUMBER) ) {
                                alt135=1;
                            }


                        }


                        switch (alt135) {
                    	case 1 :
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:397:21: SP_COMMA expr
                    	    {
                    	    match(input,SP_COMMA,FOLLOW_SP_COMMA_in_listItems2925); if (state.failed) return ;
                    	    pushFollow(FOLLOW_expr_in_listItems2927);
                    	    expr();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop135;
                        }
                    } while (true);

                    // src/net/colar/netbeans/fan/antlr/Fan.g:397:38: ( SP_COMMA )?
                    int alt136=2;
                    int LA136_0 = input.LA(1);

                    if ( (LA136_0==SP_COMMA) ) {
                        alt136=1;
                    }
                    switch (alt136) {
                        case 1 :
                            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_COMMA
                            {
                            match(input,SP_COMMA,FOLLOW_SP_COMMA_in_listItems2932); if (state.failed) return ;

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:397:51: SP_COMMA
                    {
                    match(input,SP_COMMA,FOLLOW_SP_COMMA_in_listItems2938); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 128, listItems_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "listItems"


    // $ANTLR start "map"
    // src/net/colar/netbeans/fan/antlr/Fan.g:398:1: map : ( mapType {...}?)? SQ_BRACKET_L mapItems SQ_BRACKET_R ;
    public final void map() throws RecognitionException {
        int map_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 129) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:398:7: ( ( mapType {...}?)? SQ_BRACKET_L mapItems SQ_BRACKET_R )
            // src/net/colar/netbeans/fan/antlr/Fan.g:398:9: ( mapType {...}?)? SQ_BRACKET_L mapItems SQ_BRACKET_R
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:398:9: ( mapType {...}?)?
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==SQ_BRACKET_L) ) {
                int LA138_1 = input.LA(2);

                if ( (synpred230_Fan()) ) {
                    alt138=1;
                }
            }
            else if ( (LA138_0==SP_PIPE||LA138_0==ID) ) {
                alt138=1;
            }
            switch (alt138) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:398:10: mapType {...}?
                    {
                    pushFollow(FOLLOW_mapType_in_map2948);
                    mapType();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( !((notAfterEol())) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "map", "notAfterEol()");
                    }

                    }
                    break;

            }

            match(input,SQ_BRACKET_L,FOLLOW_SQ_BRACKET_L_in_map2954); if (state.failed) return ;
            pushFollow(FOLLOW_mapItems_in_map2956);
            mapItems();

            state._fsp--;
            if (state.failed) return ;
            match(input,SQ_BRACKET_R,FOLLOW_SQ_BRACKET_R_in_map2958); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 129, map_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "map"


    // $ANTLR start "mapItems"
    // src/net/colar/netbeans/fan/antlr/Fan.g:399:1: mapItems : ( ( mapPair ( SP_COMMA mapPair )* ( SP_COMMA )? ) | SP_COLON );
    public final void mapItems() throws RecognitionException {
        int mapItems_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 130) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:399:11: ( ( mapPair ( SP_COMMA mapPair )* ( SP_COMMA )? ) | SP_COLON )
            int alt141=2;
            int LA141_0 = input.LA(1);

            if ( ((LA141_0>=KW_THIS && LA141_0<=KW_SUPER)||(LA141_0>=KW_NULL && LA141_0<=KW_FALSE)||LA141_0==SQ_BRACKET_L||LA141_0==PAR_L||LA141_0==SP_PIPE||LA141_0==OP_CURRY||(LA141_0>=OP_PLUS && LA141_0<=OP_MINUS)||(LA141_0>=OP_BANG && LA141_0<=OP_TILDA)||(LA141_0>=AT && LA141_0<=OP_POUND)||LA141_0==NUMBER) ) {
                alt141=1;
            }
            else if ( (LA141_0==SP_COLON) ) {
                alt141=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 141, 0, input);

                throw nvae;
            }
            switch (alt141) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:399:13: ( mapPair ( SP_COMMA mapPair )* ( SP_COMMA )? )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:399:13: ( mapPair ( SP_COMMA mapPair )* ( SP_COMMA )? )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:399:14: mapPair ( SP_COMMA mapPair )* ( SP_COMMA )?
                    {
                    pushFollow(FOLLOW_mapPair_in_mapItems2967);
                    mapPair();

                    state._fsp--;
                    if (state.failed) return ;
                    // src/net/colar/netbeans/fan/antlr/Fan.g:399:22: ( SP_COMMA mapPair )*
                    loop139:
                    do {
                        int alt139=2;
                        int LA139_0 = input.LA(1);

                        if ( (LA139_0==SP_COMMA) ) {
                            int LA139_1 = input.LA(2);

                            if ( ((LA139_1>=KW_THIS && LA139_1<=KW_SUPER)||(LA139_1>=KW_NULL && LA139_1<=KW_FALSE)||LA139_1==SQ_BRACKET_L||LA139_1==PAR_L||LA139_1==SP_PIPE||LA139_1==OP_CURRY||(LA139_1>=OP_PLUS && LA139_1<=OP_MINUS)||(LA139_1>=OP_BANG && LA139_1<=OP_TILDA)||(LA139_1>=AT && LA139_1<=OP_POUND)||LA139_1==NUMBER) ) {
                                alt139=1;
                            }


                        }


                        switch (alt139) {
                    	case 1 :
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:399:23: SP_COMMA mapPair
                    	    {
                    	    match(input,SP_COMMA,FOLLOW_SP_COMMA_in_mapItems2970); if (state.failed) return ;
                    	    pushFollow(FOLLOW_mapPair_in_mapItems2972);
                    	    mapPair();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop139;
                        }
                    } while (true);

                    // src/net/colar/netbeans/fan/antlr/Fan.g:399:42: ( SP_COMMA )?
                    int alt140=2;
                    int LA140_0 = input.LA(1);

                    if ( (LA140_0==SP_COMMA) ) {
                        alt140=1;
                    }
                    switch (alt140) {
                        case 1 :
                            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_COMMA
                            {
                            match(input,SP_COMMA,FOLLOW_SP_COMMA_in_mapItems2976); if (state.failed) return ;

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:399:55: SP_COLON
                    {
                    match(input,SP_COLON,FOLLOW_SP_COLON_in_mapItems2982); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 130, mapItems_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "mapItems"


    // $ANTLR start "mapPair"
    // src/net/colar/netbeans/fan/antlr/Fan.g:400:1: mapPair : expr SP_COLON expr ;
    public final void mapPair() throws RecognitionException {
        int mapPair_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 131) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:400:10: ( expr SP_COLON expr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:400:12: expr SP_COLON expr
            {
            pushFollow(FOLLOW_expr_in_mapPair2990);
            expr();

            state._fsp--;
            if (state.failed) return ;
            match(input,SP_COLON,FOLLOW_SP_COLON_in_mapPair2992); if (state.failed) return ;
            pushFollow(FOLLOW_expr_in_mapPair2994);
            expr();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 131, mapPair_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "mapPair"


    // $ANTLR start "simple"
    // src/net/colar/netbeans/fan/antlr/Fan.g:401:1: simple : type PAR_L expr PAR_R ;
    public final void simple() throws RecognitionException {
        int simple_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 132) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:401:9: ( type PAR_L expr PAR_R )
            // src/net/colar/netbeans/fan/antlr/Fan.g:401:11: type PAR_L expr PAR_R
            {
            pushFollow(FOLLOW_type_in_simple3002);
            type();

            state._fsp--;
            if (state.failed) return ;
            match(input,PAR_L,FOLLOW_PAR_L_in_simple3004); if (state.failed) return ;
            pushFollow(FOLLOW_expr_in_simple3006);
            expr();

            state._fsp--;
            if (state.failed) return ;
            match(input,PAR_R,FOLLOW_PAR_R_in_simple3008); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 132, simple_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "simple"


    // $ANTLR start "docs"
    // src/net/colar/netbeans/fan/antlr/Fan.g:403:1: docs : ( DOC )* ;
    public final void docs() throws RecognitionException {
        int docs_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 133) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:403:7: ( ( DOC )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:403:9: ( DOC )*
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:403:9: ( DOC )*
            loop142:
            do {
                int alt142=2;
                int LA142_0 = input.LA(1);

                if ( (LA142_0==DOC) ) {
                    int LA142_2 = input.LA(2);

                    if ( (synpred234_Fan()) ) {
                        alt142=1;
                    }


                }


                switch (alt142) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: DOC
            	    {
            	    match(input,DOC,FOLLOW_DOC_in_docs3017); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop142;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 133, docs_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "docs"


    // $ANTLR start "number"
    // src/net/colar/netbeans/fan/antlr/Fan.g:405:1: number : ( OP_MINUS )? NUMBER ;
    public final void number() throws RecognitionException {
        int number_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 134) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:405:9: ( ( OP_MINUS )? NUMBER )
            // src/net/colar/netbeans/fan/antlr/Fan.g:405:12: ( OP_MINUS )? NUMBER
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:405:12: ( OP_MINUS )?
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==OP_MINUS) ) {
                alt143=1;
            }
            switch (alt143) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: OP_MINUS
                    {
                    match(input,OP_MINUS,FOLLOW_OP_MINUS_in_number3028); if (state.failed) return ;

                    }
                    break;

            }

            match(input,NUMBER,FOLLOW_NUMBER_in_number3031); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 134, number_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "number"


    // $ANTLR start "facet"
    // src/net/colar/netbeans/fan/antlr/Fan.g:406:1: facet : AT id ( AS_EQUAL expr )? ;
    public final void facet() throws RecognitionException {
        int facet_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 135) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:406:8: ( AT id ( AS_EQUAL expr )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:406:10: AT id ( AS_EQUAL expr )?
            {
            match(input,AT,FOLLOW_AT_in_facet3039); if (state.failed) return ;
            pushFollow(FOLLOW_id_in_facet3041);
            id();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:406:16: ( AS_EQUAL expr )?
            int alt144=2;
            int LA144_0 = input.LA(1);

            if ( (LA144_0==AS_EQUAL) ) {
                alt144=1;
            }
            switch (alt144) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:406:17: AS_EQUAL expr
                    {
                    match(input,AS_EQUAL,FOLLOW_AS_EQUAL_in_facet3044); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_facet3046);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 135, facet_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "facet"


    // $ANTLR start "eos"
    // src/net/colar/netbeans/fan/antlr/Fan.g:409:1: eos : ( SP_SEMI | {...}?);
    public final void eos() throws RecognitionException {
        int eos_StartIndex = input.index();
        paraphrase.push(": or LineBreak");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 136) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:411:3: ( SP_SEMI | {...}?)
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( (LA145_0==SP_SEMI) ) {
                int LA145_1 = input.LA(2);

                if ( (synpred237_Fan()) ) {
                    alt145=1;
                }
                else if ( ((lookupNL())) ) {
                    alt145=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 145, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA145_0==EOF||(LA145_0>=KW_BREAK && LA145_0<=KW_USING)||(LA145_0>=KW_RD_ONLY && LA145_0<=KW_ELSE)||(LA145_0>=KW_NULL && LA145_0<=KW_FALSE)||LA145_0==SQ_BRACKET_L||LA145_0==BRACKET_R||(LA145_0>=SP_COMMA && LA145_0<=PAR_L)||LA145_0==SP_PIPE||LA145_0==OP_CURRY||(LA145_0>=OP_PLUS && LA145_0<=OP_MINUS)||(LA145_0>=OP_BANG && LA145_0<=OP_TILDA)||(LA145_0>=AT && LA145_0<=NUMBER)) ) {
                alt145=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 145, 0, input);

                throw nvae;
            }
            switch (alt145) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:411:5: SP_SEMI
                    {
                    match(input,SP_SEMI,FOLLOW_SP_SEMI_in_eos3068); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:411:15: {...}?
                    {
                    if ( !((lookupNL())) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "eos", "lookupNL()");
                    }

                    }
                    break;

            }
            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 136, eos_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "eos"


    // $ANTLR start "id"
    // src/net/colar/netbeans/fan/antlr/Fan.g:413:1: id : ID ;
    public final void id() throws RecognitionException {
        int id_StartIndex = input.index();
        paraphrase.push("Identifier");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 137) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:415:3: ( ID )
            // src/net/colar/netbeans/fan/antlr/Fan.g:415:6: ID
            {
            match(input,ID,FOLLOW_ID_in_id3092); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 137, id_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "id"


    // $ANTLR start "getter"
    // src/net/colar/netbeans/fan/antlr/Fan.g:421:1: getter : t= ID {...}?;
    public final void getter() throws RecognitionException {
        int getter_StartIndex = input.index();
        Token t=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 138) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:421:10: (t= ID {...}?)
            // src/net/colar/netbeans/fan/antlr/Fan.g:421:12: t= ID {...}?
            {
            t=(Token)match(input,ID,FOLLOW_ID_in_getter3105); if (state.failed) return ;
            if ( !((t.getText().equals("get"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "getter", "t.getText().equals(\"get\")");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 138, getter_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "getter"


    // $ANTLR start "setter"
    // src/net/colar/netbeans/fan/antlr/Fan.g:422:1: setter : t= ID {...}?;
    public final void setter() throws RecognitionException {
        int setter_StartIndex = input.index();
        Token t=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 139) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:422:10: (t= ID {...}?)
            // src/net/colar/netbeans/fan/antlr/Fan.g:422:12: t= ID {...}?
            {
            t=(Token)match(input,ID,FOLLOW_ID_in_setter3118); if (state.failed) return ;
            if ( !((t.getText().equals("set"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "setter", "t.getText().equals(\"set\")");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 139, setter_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "setter"

    // $ANTLR start synpred7_Fan
    public final void synpred7_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:220:17: ( facet )
        // src/net/colar/netbeans/fan/antlr/Fan.g:220:17: facet
        {
        pushFollow(FOLLOW_facet_in_synpred7_Fan476);
        facet();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_Fan

    // $ANTLR start synpred9_Fan
    public final void synpred9_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:220:25: ( ( classFlags )* KW_CLASS )
        // src/net/colar/netbeans/fan/antlr/Fan.g:220:26: ( classFlags )* KW_CLASS
        {
        // src/net/colar/netbeans/fan/antlr/Fan.g:220:26: ( classFlags )*
        loop146:
        do {
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( ((LA146_0>=KW_CONST && LA146_0<=KW_STATIC)||LA146_0==KW_FINAL||(LA146_0>=KW_ABSTRACT && LA146_0<=KW_INTERNAL)) ) {
                alt146=1;
            }


            switch (alt146) {
        	case 1 :
        	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: classFlags
        	    {
        	    pushFollow(FOLLOW_classFlags_in_synpred9_Fan481);
        	    classFlags();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop146;
            }
        } while (true);

        match(input,KW_CLASS,FOLLOW_KW_CLASS_in_synpred9_Fan484); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_Fan

    // $ANTLR start synpred11_Fan
    public final void synpred11_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:221:4: ( ( protection )? KW_ENUM )
        // src/net/colar/netbeans/fan/antlr/Fan.g:221:5: ( protection )? KW_ENUM
        {
        // src/net/colar/netbeans/fan/antlr/Fan.g:221:5: ( protection )?
        int alt147=2;
        int LA147_0 = input.LA(1);

        if ( ((LA147_0>=KW_PRIVATE && LA147_0<=KW_INTERNAL)) ) {
            alt147=1;
        }
        switch (alt147) {
            case 1 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: protection
                {
                pushFollow(FOLLOW_protection_in_synpred11_Fan495);
                protection();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        match(input,KW_ENUM,FOLLOW_KW_ENUM_in_synpred11_Fan498); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred11_Fan

    // $ANTLR start synpred38_Fan
    public final void synpred38_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:239:28: ( SP_QMARK )
        // src/net/colar/netbeans/fan/antlr/Fan.g:239:28: SP_QMARK
        {
        match(input,SP_QMARK,FOLLOW_SP_QMARK_in_synpred38_Fan787); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred38_Fan

    // $ANTLR start synpred39_Fan
    public final void synpred39_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:239:49: ( SP_QMARK )
        // src/net/colar/netbeans/fan/antlr/Fan.g:239:49: SP_QMARK
        {
        match(input,SP_QMARK,FOLLOW_SP_QMARK_in_synpred39_Fan793); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred39_Fan

    // $ANTLR start synpred40_Fan
    public final void synpred40_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:239:39: ( LIST_TYPE ( SP_QMARK )? )
        // src/net/colar/netbeans/fan/antlr/Fan.g:239:39: LIST_TYPE ( SP_QMARK )?
        {
        match(input,LIST_TYPE,FOLLOW_LIST_TYPE_in_synpred40_Fan791); if (state.failed) return ;
        // src/net/colar/netbeans/fan/antlr/Fan.g:239:49: ( SP_QMARK )?
        int alt149=2;
        int LA149_0 = input.LA(1);

        if ( (LA149_0==SP_QMARK) ) {
            alt149=1;
        }
        switch (alt149) {
            case 1 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_QMARK
                {
                match(input,SP_QMARK,FOLLOW_SP_QMARK_in_synpred40_Fan793); if (state.failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred40_Fan

    // $ANTLR start synpred42_Fan
    public final void synpred42_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:241:12: ( mapType )
        // src/net/colar/netbeans/fan/antlr/Fan.g:241:12: mapType
        {
        pushFollow(FOLLOW_mapType_in_synpred42_Fan815);
        mapType();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred42_Fan

    // $ANTLR start synpred48_Fan
    public final void synpred48_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:245:6: ({...}? SP_COLON {...}? type )
        // src/net/colar/netbeans/fan/antlr/Fan.g:245:6: {...}? SP_COLON {...}? type
        {
        if ( !((notAfterEol())) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred48_Fan", "notAfterEol()");
        }
        match(input,SP_COLON,FOLLOW_SP_COLON_in_synpred48_Fan872); if (state.failed) return ;
        if ( !((notAfterEol())) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred48_Fan", "notAfterEol()");
        }
        pushFollow(FOLLOW_type_in_synpred48_Fan876);
        type();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred48_Fan

    // $ANTLR start synpred49_Fan
    public final void synpred49_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:245:56: ( SQ_BRACKET_R )
        // src/net/colar/netbeans/fan/antlr/Fan.g:245:56: SQ_BRACKET_R
        {
        match(input,SQ_BRACKET_R,FOLLOW_SQ_BRACKET_R_in_synpred49_Fan880); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred49_Fan

    // $ANTLR start synpred51_Fan
    public final void synpred51_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:246:43: ( OP_ARROW )
        // src/net/colar/netbeans/fan/antlr/Fan.g:246:44: OP_ARROW
        {
        match(input,OP_ARROW,FOLLOW_OP_ARROW_in_synpred51_Fan901); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred51_Fan

    // $ANTLR start synpred53_Fan
    public final void synpred53_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:246:74: ( OP_ARROW )
        // src/net/colar/netbeans/fan/antlr/Fan.g:246:75: OP_ARROW
        {
        match(input,OP_ARROW,FOLLOW_OP_ARROW_in_synpred53_Fan913); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred53_Fan

    // $ANTLR start synpred55_Fan
    public final void synpred55_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:249:11: ( formalFull )
        // src/net/colar/netbeans/fan/antlr/Fan.g:249:11: formalFull
        {
        pushFollow(FOLLOW_formalFull_in_synpred55_Fan954);
        formalFull();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred55_Fan

    // $ANTLR start synpred56_Fan
    public final void synpred56_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:249:24: ( formalTypeOnly )
        // src/net/colar/netbeans/fan/antlr/Fan.g:249:24: formalTypeOnly
        {
        pushFollow(FOLLOW_formalTypeOnly_in_synpred56_Fan958);
        formalTypeOnly();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred56_Fan

    // $ANTLR start synpred57_Fan
    public final void synpred57_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:253:13: ( KW_STATIC BRACKET_L )
        // src/net/colar/netbeans/fan/antlr/Fan.g:253:14: KW_STATIC BRACKET_L
        {
        match(input,KW_STATIC,FOLLOW_KW_STATIC_in_synpred57_Fan1006); if (state.failed) return ;
        match(input,BRACKET_L,FOLLOW_BRACKET_L_in_synpred57_Fan1008); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred57_Fan

    // $ANTLR start synpred58_Fan
    public final void synpred58_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:254:11: ( facet )
        // src/net/colar/netbeans/fan/antlr/Fan.g:254:11: facet
        {
        pushFollow(FOLLOW_facet_in_synpred58_Fan1022);
        facet();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred58_Fan

    // $ANTLR start synpred60_Fan
    public final void synpred60_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:256:7: ( ( ctorFlags )* KW_NEW )
        // src/net/colar/netbeans/fan/antlr/Fan.g:256:8: ( ctorFlags )* KW_NEW
        {
        // src/net/colar/netbeans/fan/antlr/Fan.g:256:8: ( ctorFlags )*
        loop152:
        do {
            int alt152=2;
            int LA152_0 = input.LA(1);

            if ( ((LA152_0>=KW_PRIVATE && LA152_0<=KW_INTERNAL)) ) {
                alt152=1;
            }


            switch (alt152) {
        	case 1 :
        	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: ctorFlags
        	    {
        	    pushFollow(FOLLOW_ctorFlags_in_synpred60_Fan1039);
        	    ctorFlags();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop152;
            }
        } while (true);

        match(input,KW_NEW,FOLLOW_KW_NEW_in_synpred60_Fan1042); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred60_Fan

    // $ANTLR start synpred63_Fan
    public final void synpred63_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:257:7: ( ( methodFlags )* ( type | KW_VOID ) id PAR_L )
        // src/net/colar/netbeans/fan/antlr/Fan.g:257:8: ( methodFlags )* ( type | KW_VOID ) id PAR_L
        {
        // src/net/colar/netbeans/fan/antlr/Fan.g:257:8: ( methodFlags )*
        loop153:
        do {
            int alt153=2;
            int LA153_0 = input.LA(1);

            if ( ((LA153_0>=KW_STATIC && LA153_0<=KW_NATIVE)||(LA153_0>=KW_OVERRIDE && LA153_0<=KW_FINAL)||(LA153_0>=KW_ABSTRACT && LA153_0<=KW_INTERNAL)||LA153_0==KW_ONCE) ) {
                alt153=1;
            }


            switch (alt153) {
        	case 1 :
        	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: methodFlags
        	    {
        	    pushFollow(FOLLOW_methodFlags_in_synpred63_Fan1056);
        	    methodFlags();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop153;
            }
        } while (true);

        // src/net/colar/netbeans/fan/antlr/Fan.g:257:21: ( type | KW_VOID )
        int alt154=2;
        int LA154_0 = input.LA(1);

        if ( (LA154_0==SQ_BRACKET_L||LA154_0==SP_PIPE||LA154_0==ID) ) {
            alt154=1;
        }
        else if ( (LA154_0==KW_VOID) ) {
            alt154=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 154, 0, input);

            throw nvae;
        }
        switch (alt154) {
            case 1 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:257:22: type
                {
                pushFollow(FOLLOW_type_in_synpred63_Fan1060);
                type();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:257:29: KW_VOID
                {
                match(input,KW_VOID,FOLLOW_KW_VOID_in_synpred63_Fan1064); if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_id_in_synpred63_Fan1067);
        id();

        state._fsp--;
        if (state.failed) return ;
        match(input,PAR_L,FOLLOW_PAR_L_in_synpred63_Fan1069); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred63_Fan

    // $ANTLR start synpred67_Fan
    public final void synpred67_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:264:30: ( getter )
        // src/net/colar/netbeans/fan/antlr/Fan.g:264:30: getter
        {
        pushFollow(FOLLOW_getter_in_synpred67_Fan1141);
        getter();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred67_Fan

    // $ANTLR start synpred69_Fan
    public final void synpred69_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:264:56: ( block )
        // src/net/colar/netbeans/fan/antlr/Fan.g:264:56: block
        {
        pushFollow(FOLLOW_block_in_synpred69_Fan1151);
        block();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred69_Fan

    // $ANTLR start synpred72_Fan
    public final void synpred72_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:267:12: ( type id )
        // src/net/colar/netbeans/fan/antlr/Fan.g:267:13: type id
        {
        pushFollow(FOLLOW_type_in_synpred72_Fan1177);
        type();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_id_in_synpred72_Fan1179);
        id();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred72_Fan

    // $ANTLR start synpred100_Fan
    public final void synpred100_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:276:65: ( SP_COLON )
        // src/net/colar/netbeans/fan/antlr/Fan.g:276:66: SP_COLON
        {
        match(input,SP_COLON,FOLLOW_SP_COLON_in_synpred100_Fan1394); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred100_Fan

    // $ANTLR start synpred105_Fan
    public final void synpred105_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:284:12: ( BRACKET_L )
        // src/net/colar/netbeans/fan/antlr/Fan.g:284:13: BRACKET_L
        {
        match(input,BRACKET_L,FOLLOW_BRACKET_L_in_synpred105_Fan1484); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred105_Fan

    // $ANTLR start synpred116_Fan
    public final void synpred116_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:290:22: ( exprStmt )
        // src/net/colar/netbeans/fan/antlr/Fan.g:290:22: exprStmt
        {
        pushFollow(FOLLOW_exprStmt_in_synpred116_Fan1566);
        exprStmt();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred116_Fan

    // $ANTLR start synpred120_Fan
    public final void synpred120_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:301:6: ( KW_ELSE block )
        // src/net/colar/netbeans/fan/antlr/Fan.g:301:6: KW_ELSE block
        {
        match(input,KW_ELSE,FOLLOW_KW_ELSE_in_synpred120_Fan1645); if (state.failed) return ;
        pushFollow(FOLLOW_block_in_synpred120_Fan1647);
        block();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred120_Fan

    // $ANTLR start synpred121_Fan
    public final void synpred121_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:302:23: ( eos )
        // src/net/colar/netbeans/fan/antlr/Fan.g:302:23: eos
        {
        pushFollow(FOLLOW_eos_in_synpred121_Fan1659);
        eos();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred121_Fan

    // $ANTLR start synpred124_Fan
    public final void synpred124_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:306:18: ( BRACKET_L )
        // src/net/colar/netbeans/fan/antlr/Fan.g:306:19: BRACKET_L
        {
        match(input,BRACKET_L,FOLLOW_BRACKET_L_in_synpred124_Fan1733); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred124_Fan

    // $ANTLR start synpred125_Fan
    public final void synpred125_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:306:42: ( stmt )
        // src/net/colar/netbeans/fan/antlr/Fan.g:306:42: stmt
        {
        pushFollow(FOLLOW_stmt_in_synpred125_Fan1740);
        stmt();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred125_Fan

    // $ANTLR start synpred126_Fan
    public final void synpred126_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:306:50: ( KW_CATCH )
        // src/net/colar/netbeans/fan/antlr/Fan.g:306:51: KW_CATCH
        {
        match(input,KW_CATCH,FOLLOW_KW_CATCH_in_synpred126_Fan1746); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred126_Fan

    // $ANTLR start synpred127_Fan
    public final void synpred127_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:306:73: ( KW_FINALLY )
        // src/net/colar/netbeans/fan/antlr/Fan.g:306:74: KW_FINALLY
        {
        match(input,KW_FINALLY,FOLLOW_KW_FINALLY_in_synpred127_Fan1755); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred127_Fan

    // $ANTLR start synpred130_Fan
    public final void synpred130_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:310:12: ( forInitDef )
        // src/net/colar/netbeans/fan/antlr/Fan.g:310:12: forInitDef
        {
        pushFollow(FOLLOW_forInitDef_in_synpred130_Fan1805);
        forInitDef();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred130_Fan

    // $ANTLR start synpred132_Fan
    public final void synpred132_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:313:21: ( catchDef )
        // src/net/colar/netbeans/fan/antlr/Fan.g:313:21: catchDef
        {
        pushFollow(FOLLOW_catchDef_in_synpred132_Fan1834);
        catchDef();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred132_Fan

    // $ANTLR start synpred133_Fan
    public final void synpred133_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:313:32: ( BRACKET_L )
        // src/net/colar/netbeans/fan/antlr/Fan.g:313:33: BRACKET_L
        {
        match(input,BRACKET_L,FOLLOW_BRACKET_L_in_synpred133_Fan1839); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred133_Fan

    // $ANTLR start synpred134_Fan
    public final void synpred134_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:313:58: ( stmt )
        // src/net/colar/netbeans/fan/antlr/Fan.g:313:58: stmt
        {
        pushFollow(FOLLOW_stmt_in_synpred134_Fan1846);
        stmt();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred134_Fan

    // $ANTLR start synpred136_Fan
    public final void synpred136_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:317:25: ( BRACKET_L )
        // src/net/colar/netbeans/fan/antlr/Fan.g:317:26: BRACKET_L
        {
        match(input,BRACKET_L,FOLLOW_BRACKET_L_in_synpred136_Fan1886); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred136_Fan

    // $ANTLR start synpred137_Fan
    public final void synpred137_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:317:53: ( stmt )
        // src/net/colar/netbeans/fan/antlr/Fan.g:317:53: stmt
        {
        pushFollow(FOLLOW_stmt_in_synpred137_Fan1893);
        stmt();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred137_Fan

    // $ANTLR start synpred158_Fan
    public final void synpred158_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:342:26: ( ( OP_BITOR | SP_PIPE ) bitAndExpr )
        // src/net/colar/netbeans/fan/antlr/Fan.g:342:26: ( OP_BITOR | SP_PIPE ) bitAndExpr
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

        pushFollow(FOLLOW_bitAndExpr_in_synpred158_Fan2183);
        bitAndExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred158_Fan

    // $ANTLR start synpred159_Fan
    public final void synpred159_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:343:26: ( OP_CURRY shiftExpr )
        // src/net/colar/netbeans/fan/antlr/Fan.g:343:26: OP_CURRY shiftExpr
        {
        match(input,OP_CURRY,FOLLOW_OP_CURRY_in_synpred159_Fan2197); if (state.failed) return ;
        pushFollow(FOLLOW_shiftExpr_in_synpred159_Fan2199);
        shiftExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred159_Fan

    // $ANTLR start synpred163_Fan
    public final void synpred163_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:345:22: ( ( OP_PLUS | OP_MINUS ) multExpr )
        // src/net/colar/netbeans/fan/antlr/Fan.g:345:22: ( OP_PLUS | OP_MINUS ) multExpr
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

        pushFollow(FOLLOW_multExpr_in_synpred163_Fan2244);
        multExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred163_Fan

    // $ANTLR start synpred168_Fan
    public final void synpred168_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:348:14: ( castExpr )
        // src/net/colar/netbeans/fan/antlr/Fan.g:348:14: castExpr
        {
        pushFollow(FOLLOW_castExpr_in_synpred168_Fan2296);
        castExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred168_Fan

    // $ANTLR start synpred169_Fan
    public final void synpred169_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:348:25: ( groupedExpr )
        // src/net/colar/netbeans/fan/antlr/Fan.g:348:25: groupedExpr
        {
        pushFollow(FOLLOW_groupedExpr_in_synpred169_Fan2300);
        groupedExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred169_Fan

    // $ANTLR start synpred170_Fan
    public final void synpred170_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:352:33: ( termChain )
        // src/net/colar/netbeans/fan/antlr/Fan.g:352:33: termChain
        {
        pushFollow(FOLLOW_termChain_in_synpred170_Fan2336);
        termChain();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred170_Fan

    // $ANTLR start synpred171_Fan
    public final void synpred171_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:353:14: ( prefixExpr )
        // src/net/colar/netbeans/fan/antlr/Fan.g:353:14: prefixExpr
        {
        pushFollow(FOLLOW_prefixExpr_in_synpred171_Fan2345);
        prefixExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred171_Fan

    // $ANTLR start synpred172_Fan
    public final void synpred172_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:353:27: ( postfixExpr )
        // src/net/colar/netbeans/fan/antlr/Fan.g:353:27: postfixExpr
        {
        pushFollow(FOLLOW_postfixExpr_in_synpred172_Fan2349);
        postfixExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred172_Fan

    // $ANTLR start synpred180_Fan
    public final void synpred180_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:356:22: ( termChain )
        // src/net/colar/netbeans/fan/antlr/Fan.g:356:22: termChain
        {
        pushFollow(FOLLOW_termChain_in_synpred180_Fan2417);
        termChain();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred180_Fan

    // $ANTLR start synpred181_Fan
    public final void synpred181_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:358:13: ( idExprReq )
        // src/net/colar/netbeans/fan/antlr/Fan.g:358:13: idExprReq
        {
        pushFollow(FOLLOW_idExprReq_in_synpred181_Fan2427);
        idExprReq();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred181_Fan

    // $ANTLR start synpred182_Fan
    public final void synpred182_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:358:25: ( literal )
        // src/net/colar/netbeans/fan/antlr/Fan.g:358:25: literal
        {
        pushFollow(FOLLOW_literal_in_synpred182_Fan2431);
        literal();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred182_Fan

    // $ANTLR start synpred183_Fan
    public final void synpred183_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:358:35: ( typeBase )
        // src/net/colar/netbeans/fan/antlr/Fan.g:358:35: typeBase
        {
        pushFollow(FOLLOW_typeBase_in_synpred183_Fan2435);
        typeBase();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred183_Fan

    // $ANTLR start synpred184_Fan
    public final void synpred184_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:359:12: ( typeLiteral )
        // src/net/colar/netbeans/fan/antlr/Fan.g:359:12: typeLiteral
        {
        pushFollow(FOLLOW_typeLiteral_in_synpred184_Fan2446);
        typeLiteral();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred184_Fan

    // $ANTLR start synpred185_Fan
    public final void synpred185_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:359:26: ( slotLiteral )
        // src/net/colar/netbeans/fan/antlr/Fan.g:359:26: slotLiteral
        {
        pushFollow(FOLLOW_slotLiteral_in_synpred185_Fan2450);
        slotLiteral();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred185_Fan

    // $ANTLR start synpred186_Fan
    public final void synpred186_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:359:40: ( namedSuper )
        // src/net/colar/netbeans/fan/antlr/Fan.g:359:40: namedSuper
        {
        pushFollow(FOLLOW_namedSuper_in_synpred186_Fan2454);
        namedSuper();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred186_Fan

    // $ANTLR start synpred187_Fan
    public final void synpred187_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:359:53: ( staticCall )
        // src/net/colar/netbeans/fan/antlr/Fan.g:359:53: staticCall
        {
        pushFollow(FOLLOW_staticCall_in_synpred187_Fan2458);
        staticCall();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred187_Fan

    // $ANTLR start synpred188_Fan
    public final void synpred188_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:360:19: ( dsl )
        // src/net/colar/netbeans/fan/antlr/Fan.g:360:19: dsl
        {
        pushFollow(FOLLOW_dsl_in_synpred188_Fan2480);
        dsl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred188_Fan

    // $ANTLR start synpred189_Fan
    public final void synpred189_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:360:25: ( closure )
        // src/net/colar/netbeans/fan/antlr/Fan.g:360:25: closure
        {
        pushFollow(FOLLOW_closure_in_synpred189_Fan2484);
        closure();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred189_Fan

    // $ANTLR start synpred190_Fan
    public final void synpred190_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:360:35: ( simple )
        // src/net/colar/netbeans/fan/antlr/Fan.g:360:35: simple
        {
        pushFollow(FOLLOW_simple_in_synpred190_Fan2488);
        simple();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred190_Fan

    // $ANTLR start synpred201_Fan
    public final void synpred201_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:376:47: ( closure )
        // src/net/colar/netbeans/fan/antlr/Fan.g:376:47: closure
        {
        pushFollow(FOLLOW_closure_in_synpred201_Fan2660);
        closure();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred201_Fan

    // $ANTLR start synpred203_Fan
    public final void synpred203_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:379:12: ( idExprReq )
        // src/net/colar/netbeans/fan/antlr/Fan.g:379:12: idExprReq
        {
        pushFollow(FOLLOW_idExprReq_in_synpred203_Fan2688);
        idExprReq();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred203_Fan

    // $ANTLR start synpred205_Fan
    public final void synpred205_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:385:13: ( ( callParams closure ) )
        // src/net/colar/netbeans/fan/antlr/Fan.g:385:13: ( callParams closure )
        {
        // src/net/colar/netbeans/fan/antlr/Fan.g:385:13: ( callParams closure )
        // src/net/colar/netbeans/fan/antlr/Fan.g:385:14: callParams closure
        {
        pushFollow(FOLLOW_callParams_in_synpred205_Fan2729);
        callParams();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_closure_in_synpred205_Fan2731);
        closure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred205_Fan

    // $ANTLR start synpred206_Fan
    public final void synpred206_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:385:36: ( callParams )
        // src/net/colar/netbeans/fan/antlr/Fan.g:385:36: callParams
        {
        pushFollow(FOLLOW_callParams_in_synpred206_Fan2736);
        callParams();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred206_Fan

    // $ANTLR start synpred220_Fan
    public final void synpred220_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:391:20: ( namedSuper )
        // src/net/colar/netbeans/fan/antlr/Fan.g:391:20: namedSuper
        {
        pushFollow(FOLLOW_namedSuper_in_synpred220_Fan2829);
        namedSuper();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred220_Fan

    // $ANTLR start synpred221_Fan
    public final void synpred221_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:392:4: ( slotLiteral )
        // src/net/colar/netbeans/fan/antlr/Fan.g:392:4: slotLiteral
        {
        pushFollow(FOLLOW_slotLiteral_in_synpred221_Fan2836);
        slotLiteral();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred221_Fan

    // $ANTLR start synpred222_Fan
    public final void synpred222_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:392:18: ( typeLiteral )
        // src/net/colar/netbeans/fan/antlr/Fan.g:392:18: typeLiteral
        {
        pushFollow(FOLLOW_typeLiteral_in_synpred222_Fan2840);
        typeLiteral();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred222_Fan

    // $ANTLR start synpred223_Fan
    public final void synpred223_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:392:32: ( list )
        // src/net/colar/netbeans/fan/antlr/Fan.g:392:32: list
        {
        pushFollow(FOLLOW_list_in_synpred223_Fan2844);
        list();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred223_Fan

    // $ANTLR start synpred224_Fan
    public final void synpred224_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:392:39: ( map )
        // src/net/colar/netbeans/fan/antlr/Fan.g:392:39: map
        {
        pushFollow(FOLLOW_map_in_synpred224_Fan2848);
        map();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred224_Fan

    // $ANTLR start synpred226_Fan
    public final void synpred226_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:396:11: ( type {...}?)
        // src/net/colar/netbeans/fan/antlr/Fan.g:396:11: type {...}?
        {
        pushFollow(FOLLOW_type_in_synpred226_Fan2903);
        type();

        state._fsp--;
        if (state.failed) return ;
        if ( !((notAfterEol())) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred226_Fan", "notAfterEol()");
        }

        }
    }
    // $ANTLR end synpred226_Fan

    // $ANTLR start synpred230_Fan
    public final void synpred230_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:398:10: ( mapType {...}?)
        // src/net/colar/netbeans/fan/antlr/Fan.g:398:10: mapType {...}?
        {
        pushFollow(FOLLOW_mapType_in_synpred230_Fan2948);
        mapType();

        state._fsp--;
        if (state.failed) return ;
        if ( !((notAfterEol())) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred230_Fan", "notAfterEol()");
        }

        }
    }
    // $ANTLR end synpred230_Fan

    // $ANTLR start synpred234_Fan
    public final void synpred234_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:403:9: ( DOC )
        // src/net/colar/netbeans/fan/antlr/Fan.g:403:9: DOC
        {
        match(input,DOC,FOLLOW_DOC_in_synpred234_Fan3017); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred234_Fan

    // $ANTLR start synpred237_Fan
    public final void synpred237_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:411:5: ( SP_SEMI )
        // src/net/colar/netbeans/fan/antlr/Fan.g:411:5: SP_SEMI
        {
        match(input,SP_SEMI,FOLLOW_SP_SEMI_in_synpred237_Fan3068); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred237_Fan

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
    public final boolean synpred42_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred42_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred159_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred159_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred184_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred184_Fan_fragment(); // can never throw exception
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
    public final boolean synpred116_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred116_Fan_fragment(); // can never throw exception
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
    public final boolean synpred183_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred183_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred180_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred180_Fan_fragment(); // can never throw exception
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
    public final boolean synpred169_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred169_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred224_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred224_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred124_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred124_Fan_fragment(); // can never throw exception
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
    public final boolean synpred206_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred206_Fan_fragment(); // can never throw exception
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
    public final boolean synpred120_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred120_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred72_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred72_Fan_fragment(); // can never throw exception
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
    public final boolean synpred223_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred223_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred170_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred170_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred220_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred220_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred60_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred60_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_Fan_fragment(); // can never throw exception
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
    public final boolean synpred56_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred56_Fan_fragment(); // can never throw exception
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
    public final boolean synpred105_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred105_Fan_fragment(); // can never throw exception
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
    public final boolean synpred40_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred40_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred201_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred201_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred39_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_Fan_fragment(); // can never throw exception
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
    public final boolean synpred121_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred121_Fan_fragment(); // can never throw exception
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
    public final boolean synpred125_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred125_Fan_fragment(); // can never throw exception
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
    public final boolean synpred171_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred171_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred100_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred100_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred237_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred237_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred181_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred181_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred38_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred221_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred221_Fan_fragment(); // can never throw exception
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
    public final boolean synpred230_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred230_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred134_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred134_Fan_fragment(); // can never throw exception
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
    public final boolean synpred55_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred55_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred57_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred57_Fan_fragment(); // can never throw exception
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
    public final boolean synpred133_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred133_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred158_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred158_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred130_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred130_Fan_fragment(); // can never throw exception
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
    public final boolean synpred222_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred222_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred205_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred205_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred53_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred53_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred182_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred182_Fan_fragment(); // can never throw exception
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


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA3 dfa3 = new DFA3(this);
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA44 dfa44 = new DFA44(this);
    protected DFA43 dfa43 = new DFA43(this);
    protected DFA53 dfa53 = new DFA53(this);
    protected DFA73 dfa73 = new DFA73(this);
    protected DFA78 dfa78 = new DFA78(this);
    protected DFA81 dfa81 = new DFA81(this);
    protected DFA87 dfa87 = new DFA87(this);
    protected DFA89 dfa89 = new DFA89(this);
    protected DFA90 dfa90 = new DFA90(this);
    protected DFA93 dfa93 = new DFA93(this);
    protected DFA109 dfa109 = new DFA109(this);
    protected DFA110 dfa110 = new DFA110(this);
    protected DFA112 dfa112 = new DFA112(this);
    protected DFA114 dfa114 = new DFA114(this);
    protected DFA115 dfa115 = new DFA115(this);
    protected DFA116 dfa116 = new DFA116(this);
    protected DFA117 dfa117 = new DFA117(this);
    protected DFA118 dfa118 = new DFA118(this);
    protected DFA119 dfa119 = new DFA119(this);
    protected DFA125 dfa125 = new DFA125(this);
    protected DFA132 dfa132 = new DFA132(this);
    static final String DFA2_eotS =
        "\4\uffff";
    static final String DFA2_eofS =
        "\2\2\2\uffff";
    static final String DFA2_minS =
        "\2\24\2\uffff";
    static final String DFA2_maxS =
        "\2\144\2\uffff";
    static final String DFA2_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA2_specialS =
        "\4\uffff}>";
    static final String[] DFA2_transitionS = {
            "\2\3\4\uffff\1\3\1\uffff\10\3\71\uffff\1\3\6\uffff\1\1",
            "\2\3\4\uffff\1\3\1\uffff\10\3\71\uffff\1\3\6\uffff\1\1",
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
            return "()* loopback of 210:18: ( typeDef )*";
        }
    }
    static final String DFA3_eotS =
        "\15\uffff";
    static final String DFA3_eofS =
        "\3\uffff\1\7\5\uffff\1\7\1\13\2\uffff";
    static final String DFA3_minS =
        "\1\21\1\65\1\136\1\21\1\66\2\136\1\uffff\1\136\2\21\2\uffff";
    static final String DFA3_maxS =
        "\1\21\2\136\1\144\1\66\2\136\1\uffff\1\136\2\144\2\uffff";
    static final String DFA3_acceptS =
        "\7\uffff\1\1\3\uffff\1\2\1\3";
    static final String DFA3_specialS =
        "\15\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\1",
            "\1\2\50\uffff\1\3",
            "\1\4",
            "\1\7\2\uffff\2\7\4\uffff\1\7\1\uffff\10\7\17\uffff\1\6\1\5"+
            "\15\uffff\1\7\32\uffff\1\7\6\uffff\1\7",
            "\1\10",
            "\1\11",
            "\1\12",
            "",
            "\1\3",
            "\1\7\2\uffff\2\7\4\uffff\1\7\1\uffff\10\7\17\uffff\1\6\1\5"+
            "\15\uffff\1\7\32\uffff\1\7\6\uffff\1\7",
            "\1\13\1\14\1\uffff\2\13\4\uffff\1\13\1\uffff\10\13\36\uffff"+
            "\1\13\32\uffff\1\13\6\uffff\1\13",
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
            return "211:10: ( usingPod | usingType | usingAs )";
        }
    }
    static final String DFA7_eotS =
        "\13\uffff";
    static final String DFA7_eofS =
        "\13\uffff";
    static final String DFA7_minS =
        "\1\24\3\0\1\uffff\3\0\3\uffff";
    static final String DFA7_maxS =
        "\1\144\3\0\1\uffff\3\0\3\uffff";
    static final String DFA7_acceptS =
        "\4\uffff\1\1\3\uffff\1\1\1\2\1\3";
    static final String DFA7_specialS =
        "\1\0\1\1\1\2\1\3\1\uffff\1\4\1\5\1\6\3\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\6\1\7\4\uffff\1\5\1\uffff\1\10\1\11\1\12\1\4\4\3\71\uffff"+
            "\1\2\6\uffff\1\1",
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

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "220:24: ( ( ( classFlags )* KW_CLASS )=> classDef | ( ( protection )? KW_ENUM )=> enumDef | mixinDef )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA7_0 = input.LA(1);

                         
                        int index7_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA7_0==DOC) ) {s = 1;}

                        else if ( (LA7_0==AT) ) {s = 2;}

                        else if ( ((LA7_0>=KW_PRIVATE && LA7_0<=KW_INTERNAL)) ) {s = 3;}

                        else if ( (LA7_0==KW_ABSTRACT) && (synpred9_Fan())) {s = 4;}

                        else if ( (LA7_0==KW_FINAL) ) {s = 5;}

                        else if ( (LA7_0==KW_CONST) ) {s = 6;}

                        else if ( (LA7_0==KW_STATIC) ) {s = 7;}

                        else if ( (LA7_0==KW_CLASS) && (synpred9_Fan())) {s = 8;}

                        else if ( (LA7_0==KW_ENUM) && (synpred11_Fan())) {s = 9;}

                        else if ( (LA7_0==KW_MIXIN) ) {s = 10;}

                         
                        input.seek(index7_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA7_1 = input.LA(1);

                         
                        int index7_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_Fan()) ) {s = 8;}

                        else if ( (synpred11_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index7_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA7_2 = input.LA(1);

                         
                        int index7_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_Fan()) ) {s = 8;}

                        else if ( (synpred11_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index7_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA7_3 = input.LA(1);

                         
                        int index7_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_Fan()) ) {s = 8;}

                        else if ( (synpred11_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index7_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA7_5 = input.LA(1);

                         
                        int index7_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_Fan()) ) {s = 8;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index7_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA7_6 = input.LA(1);

                         
                        int index7_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_Fan()) ) {s = 8;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index7_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA7_7 = input.LA(1);

                         
                        int index7_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_Fan()) ) {s = 8;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index7_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 7, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA44_eotS =
        "\24\uffff";
    static final String DFA44_eofS =
        "\24\uffff";
    static final String DFA44_minS =
        "\1\23\1\0\22\uffff";
    static final String DFA44_maxS =
        "\1\144\1\0\22\uffff";
    static final String DFA44_acceptS =
        "\2\uffff\1\2\20\uffff\1\1";
    static final String DFA44_specialS =
        "\1\uffff\1\0\22\uffff}>";
    static final String[] DFA44_transitionS = {
            "\2\2\1\1\6\2\3\uffff\7\2\17\uffff\1\2\11\uffff\1\2\35\uffff"+
            "\2\2\5\uffff\1\2",
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

    static final short[] DFA44_eot = DFA.unpackEncodedString(DFA44_eotS);
    static final short[] DFA44_eof = DFA.unpackEncodedString(DFA44_eofS);
    static final char[] DFA44_min = DFA.unpackEncodedStringToUnsignedChars(DFA44_minS);
    static final char[] DFA44_max = DFA.unpackEncodedStringToUnsignedChars(DFA44_maxS);
    static final short[] DFA44_accept = DFA.unpackEncodedString(DFA44_acceptS);
    static final short[] DFA44_special = DFA.unpackEncodedString(DFA44_specialS);
    static final short[][] DFA44_transition;

    static {
        int numStates = DFA44_transitionS.length;
        DFA44_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA44_transition[i] = DFA.unpackEncodedString(DFA44_transitionS[i]);
        }
    }

    class DFA44 extends DFA {

        public DFA44(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 44;
            this.eot = DFA44_eot;
            this.eof = DFA44_eof;
            this.min = DFA44_min;
            this.max = DFA44_max;
            this.accept = DFA44_accept;
            this.special = DFA44_special;
            this.transition = DFA44_transition;
        }
        public String getDescription() {
            return "253:12: ( ( KW_STATIC BRACKET_L )=> staticBlock | ( docs ( facet )* ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id PAR_L )=> methodDef | fieldDef ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA44_1 = input.LA(1);

                         
                        int index44_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred57_Fan()) ) {s = 19;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index44_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 44, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA43_eotS =
        "\23\uffff";
    static final String DFA43_eofS =
        "\23\uffff";
    static final String DFA43_minS =
        "\1\23\3\0\1\uffff\4\0\1\uffff\5\0\4\uffff";
    static final String DFA43_maxS =
        "\1\144\3\0\1\uffff\4\0\1\uffff\5\0\4\uffff";
    static final String DFA43_acceptS =
        "\4\uffff\1\1\4\uffff\1\2\5\uffff\1\2\1\3\2\uffff";
    static final String DFA43_specialS =
        "\1\0\1\1\1\2\1\3\1\uffff\1\4\1\5\1\6\1\7\1\uffff\1\10\1\11\1\12"+
        "\1\13\1\14\4\uffff}>";
    static final String[] DFA43_transitionS = {
            "\2\20\1\10\1\12\1\20\1\6\1\5\1\13\1\17\3\uffff\1\7\4\3\1\4\1"+
            "\11\17\uffff\1\14\11\uffff\1\15\35\uffff\1\2\1\16\5\uffff\1"+
            "\1",
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
            "",
            ""
    };

    static final short[] DFA43_eot = DFA.unpackEncodedString(DFA43_eotS);
    static final short[] DFA43_eof = DFA.unpackEncodedString(DFA43_eofS);
    static final char[] DFA43_min = DFA.unpackEncodedStringToUnsignedChars(DFA43_minS);
    static final char[] DFA43_max = DFA.unpackEncodedStringToUnsignedChars(DFA43_maxS);
    static final short[] DFA43_accept = DFA.unpackEncodedString(DFA43_acceptS);
    static final short[] DFA43_special = DFA.unpackEncodedString(DFA43_specialS);
    static final short[][] DFA43_transition;

    static {
        int numStates = DFA43_transitionS.length;
        DFA43_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA43_transition[i] = DFA.unpackEncodedString(DFA43_transitionS[i]);
        }
    }

    class DFA43 extends DFA {

        public DFA43(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 43;
            this.eot = DFA43_eot;
            this.eof = DFA43_eof;
            this.min = DFA43_min;
            this.max = DFA43_max;
            this.accept = DFA43_accept;
            this.special = DFA43_special;
            this.transition = DFA43_transition;
        }
        public String getDescription() {
            return "255:6: ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id PAR_L )=> methodDef | fieldDef )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA43_0 = input.LA(1);

                         
                        int index43_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA43_0==DOC) ) {s = 1;}

                        else if ( (LA43_0==AT) ) {s = 2;}

                        else if ( ((LA43_0>=KW_PRIVATE && LA43_0<=KW_INTERNAL)) ) {s = 3;}

                        else if ( (LA43_0==KW_NEW) && (synpred60_Fan())) {s = 4;}

                        else if ( (LA43_0==KW_VIRTUAL) ) {s = 5;}

                        else if ( (LA43_0==KW_OVERRIDE) ) {s = 6;}

                        else if ( (LA43_0==KW_ABSTRACT) ) {s = 7;}

                        else if ( (LA43_0==KW_STATIC) ) {s = 8;}

                        else if ( (LA43_0==KW_ONCE) && (synpred63_Fan())) {s = 9;}

                        else if ( (LA43_0==KW_NATIVE) ) {s = 10;}

                        else if ( (LA43_0==KW_FINAL) ) {s = 11;}

                        else if ( (LA43_0==SQ_BRACKET_L) ) {s = 12;}

                        else if ( (LA43_0==SP_PIPE) ) {s = 13;}

                        else if ( (LA43_0==ID) ) {s = 14;}

                        else if ( (LA43_0==KW_VOID) && (synpred63_Fan())) {s = 15;}

                        else if ( ((LA43_0>=KW_RD_ONLY && LA43_0<=KW_CONST)||LA43_0==KW_VOLATILE) ) {s = 16;}

                         
                        input.seek(index43_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA43_1 = input.LA(1);

                         
                        int index43_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_Fan()) ) {s = 4;}

                        else if ( (synpred63_Fan()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index43_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA43_2 = input.LA(1);

                         
                        int index43_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_Fan()) ) {s = 4;}

                        else if ( (synpred63_Fan()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index43_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA43_3 = input.LA(1);

                         
                        int index43_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_Fan()) ) {s = 4;}

                        else if ( (synpred63_Fan()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index43_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA43_5 = input.LA(1);

                         
                        int index43_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_Fan()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index43_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA43_6 = input.LA(1);

                         
                        int index43_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_Fan()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index43_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA43_7 = input.LA(1);

                         
                        int index43_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_Fan()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index43_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA43_8 = input.LA(1);

                         
                        int index43_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_Fan()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index43_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA43_10 = input.LA(1);

                         
                        int index43_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_Fan()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index43_10);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA43_11 = input.LA(1);

                         
                        int index43_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_Fan()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index43_11);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA43_12 = input.LA(1);

                         
                        int index43_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_Fan()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index43_12);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA43_13 = input.LA(1);

                         
                        int index43_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_Fan()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index43_13);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA43_14 = input.LA(1);

                         
                        int index43_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_Fan()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index43_14);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 43, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA53_eotS =
        "\12\uffff";
    static final String DFA53_eofS =
        "\3\uffff\1\11\6\uffff";
    static final String DFA53_minS =
        "\1\65\2\uffff\1\4\4\uffff\1\0\1\uffff";
    static final String DFA53_maxS =
        "\1\136\2\uffff\1\145\4\uffff\1\0\1\uffff";
    static final String DFA53_acceptS =
        "\1\uffff\2\1\1\uffff\4\1\1\uffff\1\2";
    static final String DFA53_specialS =
        "\1\0\2\uffff\1\1\4\uffff\1\2\1\uffff}>";
    static final String[] DFA53_transitionS = {
            "\1\1\11\uffff\1\2\36\uffff\1\3",
            "",
            "",
            "\15\11\2\uffff\11\11\3\uffff\12\11\2\uffff\4\11\4\uffff\1\4"+
            "\1\uffff\1\11\1\uffff\2\11\1\7\2\11\1\uffff\1\5\1\6\1\11\1\uffff"+
            "\2\11\13\uffff\1\11\2\uffff\2\11\3\uffff\4\11\3\uffff\1\11\1"+
            "\10\7\11",
            "",
            "",
            "",
            "",
            "\1\uffff",
            ""
    };

    static final short[] DFA53_eot = DFA.unpackEncodedString(DFA53_eotS);
    static final short[] DFA53_eof = DFA.unpackEncodedString(DFA53_eofS);
    static final char[] DFA53_min = DFA.unpackEncodedStringToUnsignedChars(DFA53_minS);
    static final char[] DFA53_max = DFA.unpackEncodedStringToUnsignedChars(DFA53_maxS);
    static final short[] DFA53_accept = DFA.unpackEncodedString(DFA53_acceptS);
    static final short[] DFA53_special = DFA.unpackEncodedString(DFA53_specialS);
    static final short[][] DFA53_transition;

    static {
        int numStates = DFA53_transitionS.length;
        DFA53_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA53_transition[i] = DFA.unpackEncodedString(DFA53_transitionS[i]);
        }
    }

    class DFA53 extends DFA {

        public DFA53(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 53;
            this.eot = DFA53_eot;
            this.eof = DFA53_eof;
            this.min = DFA53_min;
            this.max = DFA53_max;
            this.accept = DFA53_accept;
            this.special = DFA53_special;
            this.transition = DFA53_transition;
        }
        public String getDescription() {
            return "267:11: ( ( type id )=> typeAndId | id )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA53_0 = input.LA(1);

                         
                        int index53_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA53_0==SQ_BRACKET_L) && (synpred72_Fan())) {s = 1;}

                        else if ( (LA53_0==SP_PIPE) && (synpred72_Fan())) {s = 2;}

                        else if ( (LA53_0==ID) ) {s = 3;}

                         
                        input.seek(index53_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA53_3 = input.LA(1);

                         
                        int index53_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA53_3==SP_COLCOL) && (synpred72_Fan())) {s = 4;}

                        else if ( (LA53_3==SP_QMARK) && (synpred72_Fan())) {s = 5;}

                        else if ( (LA53_3==LIST_TYPE) && (synpred72_Fan())) {s = 6;}

                        else if ( (LA53_3==SP_COLON) && (synpred72_Fan())) {s = 7;}

                        else if ( (LA53_3==ID) ) {s = 8;}

                        else if ( (LA53_3==EOF||(LA53_3>=KW_BREAK && LA53_3<=KW_FINALLY)||(LA53_3>=KW_RD_ONLY && LA53_3<=KW_VOID)||(LA53_3>=KW_ABSTRACT && LA53_3<=KW_ELSE)||(LA53_3>=KW_NULL && LA53_3<=KW_FALSE)||LA53_3==SQ_BRACKET_L||(LA53_3>=BRACKET_L && LA53_3<=BRACKET_R)||(LA53_3>=SP_COMMA && LA53_3<=PAR_L)||LA53_3==SP_PIPE||(LA53_3>=AS_INIT_VAL && LA53_3<=SP_SEMI)||LA53_3==OP_CURRY||(LA53_3>=OP_PLUS && LA53_3<=OP_MINUS)||(LA53_3>=OP_BANG && LA53_3<=OP_TILDA)||LA53_3==AT||(LA53_3>=QUOTSTR && LA53_3<=NUMBER)) ) {s = 9;}

                         
                        input.seek(index53_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA53_8 = input.LA(1);

                         
                        int index53_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Fan()) ) {s = 7;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index53_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 53, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA73_eotS =
        "\36\uffff";
    static final String DFA73_eofS =
        "\36\uffff";
    static final String DFA73_minS =
        "\1\4\14\uffff\1\0\14\uffff\2\0\2\uffff";
    static final String DFA73_maxS =
        "\1\145\14\uffff\1\0\14\uffff\2\0\2\uffff";
    static final String DFA73_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\22\uffff\1\13";
    static final String DFA73_specialS =
        "\15\uffff\1\0\14\uffff\1\1\1\2\2\uffff}>";
    static final String[] DFA73_transitionS = {
            "\1\4\1\5\1\2\1\1\1\6\1\7\1\10\1\3\1\11\31\uffff\2\12\3\uffff"+
            "\4\12\6\uffff\1\32\5\uffff\1\12\3\uffff\1\33\16\uffff\1\12\2"+
            "\uffff\2\12\3\uffff\4\12\3\uffff\1\12\1\15\5\12\1\uffff\1\12",
            "",
            "",
            "",
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
            ""
    };

    static final short[] DFA73_eot = DFA.unpackEncodedString(DFA73_eotS);
    static final short[] DFA73_eof = DFA.unpackEncodedString(DFA73_eofS);
    static final char[] DFA73_min = DFA.unpackEncodedStringToUnsignedChars(DFA73_minS);
    static final char[] DFA73_max = DFA.unpackEncodedStringToUnsignedChars(DFA73_maxS);
    static final short[] DFA73_accept = DFA.unpackEncodedString(DFA73_acceptS);
    static final short[] DFA73_special = DFA.unpackEncodedString(DFA73_specialS);
    static final short[][] DFA73_transition;

    static {
        int numStates = DFA73_transitionS.length;
        DFA73_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA73_transition[i] = DFA.unpackEncodedString(DFA73_transitionS[i]);
        }
    }

    class DFA73 extends DFA {

        public DFA73(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 73;
            this.eot = DFA73_eot;
            this.eof = DFA73_eof;
            this.min = DFA73_min;
            this.max = DFA73_max;
            this.accept = DFA73_accept;
            this.special = DFA73_special;
            this.transition = DFA73_transition;
        }
        public String getDescription() {
            return "288:5: ( g_if | g_for | g_while | g_break | g_continue | g_return | g_switch | g_throw | g_try | exprStmt | localDef )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA73_13 = input.LA(1);

                         
                        int index73_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred116_Fan()) ) {s = 10;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index73_13);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA73_26 = input.LA(1);

                         
                        int index73_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred116_Fan()) ) {s = 10;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index73_26);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA73_27 = input.LA(1);

                         
                        int index73_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred116_Fan()) ) {s = 10;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index73_27);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 73, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA78_eotS =
        "\65\uffff";
    static final String DFA78_eofS =
        "\1\1\64\uffff";
    static final String DFA78_minS =
        "\1\4\13\uffff\23\0\26\uffff";
    static final String DFA78_maxS =
        "\1\145\13\uffff\23\0\26\uffff";
    static final String DFA78_acceptS =
        "\1\uffff\1\1\62\uffff\1\2";
    static final String DFA78_specialS =
        "\14\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\26\uffff}>";
    static final String[] DFA78_transitionS = {
            "\15\1\2\uffff\11\1\3\uffff\7\1\1\21\1\22\1\1\2\uffff\1\20\1"+
            "\23\1\24\1\25\6\uffff\1\34\2\uffff\1\1\1\uffff\1\1\1\14\3\uffff"+
            "\1\35\2\uffff\1\1\13\uffff\1\31\2\uffff\1\31\1\15\3\uffff\4"+
            "\31\3\uffff\1\16\1\17\1\26\1\27\1\30\1\33\1\36\1\1\1\32",
            "",
            "",
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
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA78_eot = DFA.unpackEncodedString(DFA78_eotS);
    static final short[] DFA78_eof = DFA.unpackEncodedString(DFA78_eofS);
    static final char[] DFA78_min = DFA.unpackEncodedStringToUnsignedChars(DFA78_minS);
    static final char[] DFA78_max = DFA.unpackEncodedStringToUnsignedChars(DFA78_maxS);
    static final short[] DFA78_accept = DFA.unpackEncodedString(DFA78_acceptS);
    static final short[] DFA78_special = DFA.unpackEncodedString(DFA78_specialS);
    static final short[][] DFA78_transition;

    static {
        int numStates = DFA78_transitionS.length;
        DFA78_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA78_transition[i] = DFA.unpackEncodedString(DFA78_transitionS[i]);
        }
    }

    class DFA78 extends DFA {

        public DFA78(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 78;
            this.eot = DFA78_eot;
            this.eof = DFA78_eof;
            this.min = DFA78_min;
            this.max = DFA78_max;
            this.accept = DFA78_accept;
            this.special = DFA78_special;
            this.transition = DFA78_transition;
        }
        public String getDescription() {
            return "302:22: ( eos | expr eos )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA78_12 = input.LA(1);

                         
                        int index78_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((((synpred121_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred121_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred121_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred121_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred121_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred121_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred121_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred121_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred121_Fan()&&(lookupNL()))&&(notAfterEol()))||(synpred121_Fan()&&(lookupNL()))||((synpred121_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred121_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred121_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred121_Fan()&&(lookupNL()))&&(notAfterEol())))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index78_12);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA78_13 = input.LA(1);

                         
                        int index78_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred121_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index78_13);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA78_14 = input.LA(1);

                         
                        int index78_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred121_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index78_14);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA78_15 = input.LA(1);

                         
                        int index78_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred121_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index78_15);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA78_16 = input.LA(1);

                         
                        int index78_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred121_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index78_16);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA78_17 = input.LA(1);

                         
                        int index78_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred121_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index78_17);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA78_18 = input.LA(1);

                         
                        int index78_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred121_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index78_18);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA78_19 = input.LA(1);

                         
                        int index78_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred121_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index78_19);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA78_20 = input.LA(1);

                         
                        int index78_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred121_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index78_20);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA78_21 = input.LA(1);

                         
                        int index78_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred121_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index78_21);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA78_22 = input.LA(1);

                         
                        int index78_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred121_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index78_22);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA78_23 = input.LA(1);

                         
                        int index78_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred121_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index78_23);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA78_24 = input.LA(1);

                         
                        int index78_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred121_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index78_24);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA78_25 = input.LA(1);

                         
                        int index78_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred121_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index78_25);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA78_26 = input.LA(1);

                         
                        int index78_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred121_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index78_26);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA78_27 = input.LA(1);

                         
                        int index78_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred121_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index78_27);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA78_28 = input.LA(1);

                         
                        int index78_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred121_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index78_28);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA78_29 = input.LA(1);

                         
                        int index78_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred121_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index78_29);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA78_30 = input.LA(1);

                         
                        int index78_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred121_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index78_30);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 78, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA81_eotS =
        "\65\uffff";
    static final String DFA81_eofS =
        "\1\1\64\uffff";
    static final String DFA81_minS =
        "\1\4\3\uffff\34\0\25\uffff";
    static final String DFA81_maxS =
        "\1\145\3\uffff\34\0\25\uffff";
    static final String DFA81_acceptS =
        "\1\uffff\1\2\62\uffff\1\1";
    static final String DFA81_specialS =
        "\4\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
        "\1\32\1\33\25\uffff}>";
    static final String[] DFA81_transitionS = {
            "\1\7\1\10\1\5\1\4\1\11\1\12\1\13\1\6\1\14\4\1\2\uffff\11\1\3"+
            "\uffff\7\1\1\22\1\23\1\1\2\uffff\1\21\1\24\1\25\1\26\6\uffff"+
            "\1\35\2\uffff\1\1\1\uffff\1\1\1\15\3\uffff\1\36\2\uffff\1\1"+
            "\13\uffff\1\32\2\uffff\1\32\1\16\3\uffff\4\32\3\uffff\1\17\1"+
            "\20\1\27\1\30\1\31\1\34\1\37\1\1\1\33",
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
            "",
            "",
            "",
            ""
    };

    static final short[] DFA81_eot = DFA.unpackEncodedString(DFA81_eotS);
    static final short[] DFA81_eof = DFA.unpackEncodedString(DFA81_eofS);
    static final char[] DFA81_min = DFA.unpackEncodedStringToUnsignedChars(DFA81_minS);
    static final char[] DFA81_max = DFA.unpackEncodedStringToUnsignedChars(DFA81_maxS);
    static final short[] DFA81_accept = DFA.unpackEncodedString(DFA81_acceptS);
    static final short[] DFA81_special = DFA.unpackEncodedString(DFA81_specialS);
    static final short[][] DFA81_transition;

    static {
        int numStates = DFA81_transitionS.length;
        DFA81_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA81_transition[i] = DFA.unpackEncodedString(DFA81_transitionS[i]);
        }
    }

    class DFA81 extends DFA {

        public DFA81(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 81;
            this.eot = DFA81_eot;
            this.eof = DFA81_eof;
            this.min = DFA81_min;
            this.max = DFA81_max;
            this.accept = DFA81_accept;
            this.special = DFA81_special;
            this.transition = DFA81_transition;
        }
        public String getDescription() {
            return "()* loopback of 306:42: ( stmt )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA81_4 = input.LA(1);

                         
                        int index81_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA81_5 = input.LA(1);

                         
                        int index81_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA81_6 = input.LA(1);

                         
                        int index81_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_6);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA81_7 = input.LA(1);

                         
                        int index81_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_7);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA81_8 = input.LA(1);

                         
                        int index81_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_8);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA81_9 = input.LA(1);

                         
                        int index81_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_9);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA81_10 = input.LA(1);

                         
                        int index81_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_10);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA81_11 = input.LA(1);

                         
                        int index81_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_11);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA81_12 = input.LA(1);

                         
                        int index81_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_12);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA81_13 = input.LA(1);

                         
                        int index81_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (((synpred125_Fan()&&(notAfterEol()))||synpred125_Fan())) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_13);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA81_14 = input.LA(1);

                         
                        int index81_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_14);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA81_15 = input.LA(1);

                         
                        int index81_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_15);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA81_16 = input.LA(1);

                         
                        int index81_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_16);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA81_17 = input.LA(1);

                         
                        int index81_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_17);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA81_18 = input.LA(1);

                         
                        int index81_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_18);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA81_19 = input.LA(1);

                         
                        int index81_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_19);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA81_20 = input.LA(1);

                         
                        int index81_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_20);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA81_21 = input.LA(1);

                         
                        int index81_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_21);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA81_22 = input.LA(1);

                         
                        int index81_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_22);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA81_23 = input.LA(1);

                         
                        int index81_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_23);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA81_24 = input.LA(1);

                         
                        int index81_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_24);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA81_25 = input.LA(1);

                         
                        int index81_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_25);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA81_26 = input.LA(1);

                         
                        int index81_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_26);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA81_27 = input.LA(1);

                         
                        int index81_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_27);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA81_28 = input.LA(1);

                         
                        int index81_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_28);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA81_29 = input.LA(1);

                         
                        int index81_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_29);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA81_30 = input.LA(1);

                         
                        int index81_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_30);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA81_31 = input.LA(1);

                         
                        int index81_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_31);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 81, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA87_eotS =
        "\25\uffff";
    static final String DFA87_eofS =
        "\25\uffff";
    static final String DFA87_minS =
        "\1\46\3\0\21\uffff";
    static final String DFA87_maxS =
        "\1\145\3\0\21\uffff";
    static final String DFA87_acceptS =
        "\4\uffff\1\2\17\uffff\1\1";
    static final String DFA87_specialS =
        "\1\uffff\1\0\1\1\1\2\21\uffff}>";
    static final String[] DFA87_transitionS = {
            "\2\4\3\uffff\4\4\6\uffff\1\1\5\uffff\1\4\3\uffff\1\2\16\uffff"+
            "\1\4\2\uffff\2\4\3\uffff\4\4\3\uffff\1\4\1\3\5\4\1\uffff\1\4",
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
            ""
    };

    static final short[] DFA87_eot = DFA.unpackEncodedString(DFA87_eotS);
    static final short[] DFA87_eof = DFA.unpackEncodedString(DFA87_eofS);
    static final char[] DFA87_min = DFA.unpackEncodedStringToUnsignedChars(DFA87_minS);
    static final char[] DFA87_max = DFA.unpackEncodedStringToUnsignedChars(DFA87_maxS);
    static final short[] DFA87_accept = DFA.unpackEncodedString(DFA87_acceptS);
    static final short[] DFA87_special = DFA.unpackEncodedString(DFA87_specialS);
    static final short[][] DFA87_transition;

    static {
        int numStates = DFA87_transitionS.length;
        DFA87_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA87_transition[i] = DFA.unpackEncodedString(DFA87_transitionS[i]);
        }
    }

    class DFA87 extends DFA {

        public DFA87(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 87;
            this.eot = DFA87_eot;
            this.eof = DFA87_eof;
            this.min = DFA87_min;
            this.max = DFA87_max;
            this.accept = DFA87_accept;
            this.special = DFA87_special;
            this.transition = DFA87_transition;
        }
        public String getDescription() {
            return "310:1: forInit : ( forInitDef | expr );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA87_1 = input.LA(1);

                         
                        int index87_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred130_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index87_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA87_2 = input.LA(1);

                         
                        int index87_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred130_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index87_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA87_3 = input.LA(1);

                         
                        int index87_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred130_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index87_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 87, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA89_eotS =
        "\66\uffff";
    static final String DFA89_eofS =
        "\1\2\65\uffff";
    static final String DFA89_minS =
        "\1\4\1\0\64\uffff";
    static final String DFA89_maxS =
        "\1\145\1\0\64\uffff";
    static final String DFA89_acceptS =
        "\2\uffff\1\2\62\uffff\1\1";
    static final String DFA89_specialS =
        "\1\uffff\1\0\64\uffff}>";
    static final String[] DFA89_transitionS = {
            "\15\2\2\uffff\11\2\3\uffff\12\2\2\uffff\4\2\6\uffff\1\2\1\uffff"+
            "\2\2\1\uffff\1\2\1\1\3\uffff\1\2\2\uffff\1\2\13\uffff\1\2\2"+
            "\uffff\2\2\3\uffff\4\2\3\uffff\11\2",
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

    static final short[] DFA89_eot = DFA.unpackEncodedString(DFA89_eotS);
    static final short[] DFA89_eof = DFA.unpackEncodedString(DFA89_eofS);
    static final char[] DFA89_min = DFA.unpackEncodedStringToUnsignedChars(DFA89_minS);
    static final char[] DFA89_max = DFA.unpackEncodedStringToUnsignedChars(DFA89_maxS);
    static final short[] DFA89_accept = DFA.unpackEncodedString(DFA89_acceptS);
    static final short[] DFA89_special = DFA.unpackEncodedString(DFA89_specialS);
    static final short[][] DFA89_transition;

    static {
        int numStates = DFA89_transitionS.length;
        DFA89_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA89_transition[i] = DFA.unpackEncodedString(DFA89_transitionS[i]);
        }
    }

    class DFA89 extends DFA {

        public DFA89(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 89;
            this.eot = DFA89_eot;
            this.eof = DFA89_eof;
            this.min = DFA89_min;
            this.max = DFA89_max;
            this.accept = DFA89_accept;
            this.special = DFA89_special;
            this.transition = DFA89_transition;
        }
        public String getDescription() {
            return "313:21: ( catchDef )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA89_1 = input.LA(1);

                         
                        int index89_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred132_Fan()) ) {s = 53;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index89_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 89, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA90_eotS =
        "\65\uffff";
    static final String DFA90_eofS =
        "\1\1\64\uffff";
    static final String DFA90_minS =
        "\1\4\2\uffff\34\0\26\uffff";
    static final String DFA90_maxS =
        "\1\145\2\uffff\34\0\26\uffff";
    static final String DFA90_acceptS =
        "\1\uffff\1\2\62\uffff\1\1";
    static final String DFA90_specialS =
        "\3\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
        "\1\32\1\33\26\uffff}>";
    static final String[] DFA90_transitionS = {
            "\1\6\1\7\1\4\1\3\1\10\1\11\1\12\1\5\1\13\4\1\2\uffff\11\1\3"+
            "\uffff\7\1\1\21\1\22\1\1\2\uffff\1\20\1\23\1\24\1\25\6\uffff"+
            "\1\34\2\uffff\1\1\1\uffff\1\1\1\14\3\uffff\1\35\2\uffff\1\1"+
            "\13\uffff\1\31\2\uffff\1\31\1\15\3\uffff\4\31\3\uffff\1\16\1"+
            "\17\1\26\1\27\1\30\1\33\1\36\1\1\1\32",
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
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA90_eot = DFA.unpackEncodedString(DFA90_eotS);
    static final short[] DFA90_eof = DFA.unpackEncodedString(DFA90_eofS);
    static final char[] DFA90_min = DFA.unpackEncodedStringToUnsignedChars(DFA90_minS);
    static final char[] DFA90_max = DFA.unpackEncodedStringToUnsignedChars(DFA90_maxS);
    static final short[] DFA90_accept = DFA.unpackEncodedString(DFA90_acceptS);
    static final short[] DFA90_special = DFA.unpackEncodedString(DFA90_specialS);
    static final short[][] DFA90_transition;

    static {
        int numStates = DFA90_transitionS.length;
        DFA90_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA90_transition[i] = DFA.unpackEncodedString(DFA90_transitionS[i]);
        }
    }

    class DFA90 extends DFA {

        public DFA90(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 90;
            this.eot = DFA90_eot;
            this.eof = DFA90_eof;
            this.min = DFA90_min;
            this.max = DFA90_max;
            this.accept = DFA90_accept;
            this.special = DFA90_special;
            this.transition = DFA90_transition;
        }
        public String getDescription() {
            return "()* loopback of 313:58: ( stmt )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA90_3 = input.LA(1);

                         
                        int index90_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA90_4 = input.LA(1);

                         
                        int index90_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_4);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA90_5 = input.LA(1);

                         
                        int index90_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_5);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA90_6 = input.LA(1);

                         
                        int index90_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_6);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA90_7 = input.LA(1);

                         
                        int index90_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_7);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA90_8 = input.LA(1);

                         
                        int index90_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_8);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA90_9 = input.LA(1);

                         
                        int index90_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_9);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA90_10 = input.LA(1);

                         
                        int index90_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_10);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA90_11 = input.LA(1);

                         
                        int index90_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_11);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA90_12 = input.LA(1);

                         
                        int index90_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (((synpred134_Fan()&&(notAfterEol()))||synpred134_Fan())) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_12);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA90_13 = input.LA(1);

                         
                        int index90_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_13);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA90_14 = input.LA(1);

                         
                        int index90_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_14);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA90_15 = input.LA(1);

                         
                        int index90_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_15);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA90_16 = input.LA(1);

                         
                        int index90_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_16);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA90_17 = input.LA(1);

                         
                        int index90_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_17);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA90_18 = input.LA(1);

                         
                        int index90_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_18);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA90_19 = input.LA(1);

                         
                        int index90_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_19);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA90_20 = input.LA(1);

                         
                        int index90_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_20);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA90_21 = input.LA(1);

                         
                        int index90_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_21);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA90_22 = input.LA(1);

                         
                        int index90_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_22);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA90_23 = input.LA(1);

                         
                        int index90_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_23);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA90_24 = input.LA(1);

                         
                        int index90_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_24);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA90_25 = input.LA(1);

                         
                        int index90_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_25);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA90_26 = input.LA(1);

                         
                        int index90_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_26);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA90_27 = input.LA(1);

                         
                        int index90_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_27);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA90_28 = input.LA(1);

                         
                        int index90_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_28);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA90_29 = input.LA(1);

                         
                        int index90_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_29);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA90_30 = input.LA(1);

                         
                        int index90_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_30);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 90, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA93_eotS =
        "\65\uffff";
    static final String DFA93_eofS =
        "\1\1\64\uffff";
    static final String DFA93_minS =
        "\1\4\1\uffff\34\0\27\uffff";
    static final String DFA93_maxS =
        "\1\145\1\uffff\34\0\27\uffff";
    static final String DFA93_acceptS =
        "\1\uffff\1\2\62\uffff\1\1";
    static final String DFA93_specialS =
        "\2\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
        "\1\32\1\33\27\uffff}>";
    static final String[] DFA93_transitionS = {
            "\1\5\1\6\1\3\1\2\1\7\1\10\1\11\1\4\1\12\4\1\2\uffff\11\1\3\uffff"+
            "\7\1\1\20\1\21\1\1\2\uffff\1\17\1\22\1\23\1\24\6\uffff\1\33"+
            "\2\uffff\1\1\1\uffff\1\1\1\13\3\uffff\1\34\2\uffff\1\1\13\uffff"+
            "\1\30\2\uffff\1\30\1\14\3\uffff\4\30\3\uffff\1\15\1\16\1\25"+
            "\1\26\1\27\1\32\1\35\1\1\1\31",
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
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA93_eot = DFA.unpackEncodedString(DFA93_eotS);
    static final short[] DFA93_eof = DFA.unpackEncodedString(DFA93_eofS);
    static final char[] DFA93_min = DFA.unpackEncodedStringToUnsignedChars(DFA93_minS);
    static final char[] DFA93_max = DFA.unpackEncodedStringToUnsignedChars(DFA93_maxS);
    static final short[] DFA93_accept = DFA.unpackEncodedString(DFA93_acceptS);
    static final short[] DFA93_special = DFA.unpackEncodedString(DFA93_specialS);
    static final short[][] DFA93_transition;

    static {
        int numStates = DFA93_transitionS.length;
        DFA93_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA93_transition[i] = DFA.unpackEncodedString(DFA93_transitionS[i]);
        }
    }

    class DFA93 extends DFA {

        public DFA93(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 93;
            this.eot = DFA93_eot;
            this.eof = DFA93_eof;
            this.min = DFA93_min;
            this.max = DFA93_max;
            this.accept = DFA93_accept;
            this.special = DFA93_special;
            this.transition = DFA93_transition;
        }
        public String getDescription() {
            return "()* loopback of 317:53: ( stmt )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA93_2 = input.LA(1);

                         
                        int index93_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA93_3 = input.LA(1);

                         
                        int index93_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA93_4 = input.LA(1);

                         
                        int index93_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA93_5 = input.LA(1);

                         
                        int index93_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_5);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA93_6 = input.LA(1);

                         
                        int index93_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_6);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA93_7 = input.LA(1);

                         
                        int index93_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_7);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA93_8 = input.LA(1);

                         
                        int index93_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_8);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA93_9 = input.LA(1);

                         
                        int index93_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_9);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA93_10 = input.LA(1);

                         
                        int index93_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_10);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA93_11 = input.LA(1);

                         
                        int index93_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (((synpred137_Fan()&&(notAfterEol()))||synpred137_Fan())) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_11);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA93_12 = input.LA(1);

                         
                        int index93_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_12);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA93_13 = input.LA(1);

                         
                        int index93_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_13);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA93_14 = input.LA(1);

                         
                        int index93_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_14);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA93_15 = input.LA(1);

                         
                        int index93_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_15);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA93_16 = input.LA(1);

                         
                        int index93_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_16);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA93_17 = input.LA(1);

                         
                        int index93_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_17);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA93_18 = input.LA(1);

                         
                        int index93_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_18);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA93_19 = input.LA(1);

                         
                        int index93_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_19);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA93_20 = input.LA(1);

                         
                        int index93_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_20);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA93_21 = input.LA(1);

                         
                        int index93_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_21);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA93_22 = input.LA(1);

                         
                        int index93_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_22);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA93_23 = input.LA(1);

                         
                        int index93_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_23);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA93_24 = input.LA(1);

                         
                        int index93_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_24);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA93_25 = input.LA(1);

                         
                        int index93_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_25);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA93_26 = input.LA(1);

                         
                        int index93_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_26);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA93_27 = input.LA(1);

                         
                        int index93_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_27);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA93_28 = input.LA(1);

                         
                        int index93_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_28);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA93_29 = input.LA(1);

                         
                        int index93_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_29);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 93, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA109_eotS =
        "\105\uffff";
    static final String DFA109_eofS =
        "\1\1\104\uffff";
    static final String DFA109_minS =
        "\1\4\30\uffff\1\0\53\uffff";
    static final String DFA109_maxS =
        "\1\145\30\uffff\1\0\53\uffff";
    static final String DFA109_acceptS =
        "\1\uffff\1\2\102\uffff\1\1";
    static final String DFA109_specialS =
        "\31\uffff\1\0\53\uffff}>";
    static final String[] DFA109_transitionS = {
            "\15\1\1\uffff\35\1\6\uffff\11\1\1\uffff\1\31\2\uffff\13\1\1"+
            "\104\1\1\2\uffff\2\1\3\uffff\4\1\3\uffff\11\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            ""
    };

    static final short[] DFA109_eot = DFA.unpackEncodedString(DFA109_eotS);
    static final short[] DFA109_eof = DFA.unpackEncodedString(DFA109_eofS);
    static final char[] DFA109_min = DFA.unpackEncodedStringToUnsignedChars(DFA109_minS);
    static final char[] DFA109_max = DFA.unpackEncodedStringToUnsignedChars(DFA109_maxS);
    static final short[] DFA109_accept = DFA.unpackEncodedString(DFA109_acceptS);
    static final short[] DFA109_special = DFA.unpackEncodedString(DFA109_specialS);
    static final short[][] DFA109_transition;

    static {
        int numStates = DFA109_transitionS.length;
        DFA109_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA109_transition[i] = DFA.unpackEncodedString(DFA109_transitionS[i]);
        }
    }

    class DFA109 extends DFA {

        public DFA109(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 109;
            this.eot = DFA109_eot;
            this.eof = DFA109_eof;
            this.min = DFA109_min;
            this.max = DFA109_max;
            this.accept = DFA109_accept;
            this.special = DFA109_special;
            this.transition = DFA109_transition;
        }
        public String getDescription() {
            return "()* loopback of 342:25: ( ( OP_BITOR | SP_PIPE ) bitAndExpr )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA109_25 = input.LA(1);

                         
                        int index109_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred158_Fan()) ) {s = 68;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index109_25);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 109, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA110_eotS =
        "\107\uffff";
    static final String DFA110_eofS =
        "\1\1\106\uffff";
    static final String DFA110_minS =
        "\1\4\66\uffff\1\0\17\uffff";
    static final String DFA110_maxS =
        "\1\145\66\uffff\1\0\17\uffff";
    static final String DFA110_acceptS =
        "\1\uffff\1\2\104\uffff\1\1";
    static final String DFA110_specialS =
        "\67\uffff\1\0\17\uffff}>";
    static final String[] DFA110_transitionS = {
            "\15\1\1\uffff\35\1\6\uffff\11\1\1\uffff\1\1\2\uffff\14\1\1\67"+
            "\2\uffff\2\1\3\uffff\4\1\3\uffff\11\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 343:25: ( OP_CURRY shiftExpr )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA110_55 = input.LA(1);

                         
                        int index110_55 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred159_Fan()) ) {s = 70;}

                        else if ( ((lookupNL())) ) {s = 1;}

                         
                        input.seek(index110_55);
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
    static final String DFA112_eotS =
        "\111\uffff";
    static final String DFA112_eofS =
        "\1\1\110\uffff";
    static final String DFA112_minS =
        "\1\4\56\uffff\1\0\11\uffff\1\0\17\uffff";
    static final String DFA112_maxS =
        "\1\145\56\uffff\1\0\11\uffff\1\0\17\uffff";
    static final String DFA112_acceptS =
        "\1\uffff\1\2\106\uffff\1\1";
    static final String DFA112_specialS =
        "\57\uffff\1\0\11\uffff\1\1\17\uffff}>";
    static final String[] DFA112_transitionS = {
            "\15\1\1\uffff\35\1\6\uffff\11\1\1\uffff\1\1\2\uffff\17\1\1\71"+
            "\1\57\3\uffff\4\1\3\uffff\11\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            ""
    };

    static final short[] DFA112_eot = DFA.unpackEncodedString(DFA112_eotS);
    static final short[] DFA112_eof = DFA.unpackEncodedString(DFA112_eofS);
    static final char[] DFA112_min = DFA.unpackEncodedStringToUnsignedChars(DFA112_minS);
    static final char[] DFA112_max = DFA.unpackEncodedStringToUnsignedChars(DFA112_maxS);
    static final short[] DFA112_accept = DFA.unpackEncodedString(DFA112_acceptS);
    static final short[] DFA112_special = DFA.unpackEncodedString(DFA112_specialS);
    static final short[][] DFA112_transition;

    static {
        int numStates = DFA112_transitionS.length;
        DFA112_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA112_transition[i] = DFA.unpackEncodedString(DFA112_transitionS[i]);
        }
    }

    class DFA112 extends DFA {

        public DFA112(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 112;
            this.eot = DFA112_eot;
            this.eof = DFA112_eof;
            this.min = DFA112_min;
            this.max = DFA112_max;
            this.accept = DFA112_accept;
            this.special = DFA112_special;
            this.transition = DFA112_transition;
        }
        public String getDescription() {
            return "()* loopback of 345:21: ( ( OP_PLUS | OP_MINUS ) multExpr )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA112_47 = input.LA(1);

                         
                        int index112_47 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred163_Fan()) ) {s = 72;}

                        else if ( ((lookupNL())) ) {s = 1;}

                         
                        input.seek(index112_47);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA112_57 = input.LA(1);

                         
                        int index112_57 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred163_Fan()) ) {s = 72;}

                        else if ( ((lookupNL())) ) {s = 1;}

                         
                        input.seek(index112_57);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 112, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA114_eotS =
        "\26\uffff";
    static final String DFA114_eofS =
        "\26\uffff";
    static final String DFA114_minS =
        "\1\46\1\0\24\uffff";
    static final String DFA114_maxS =
        "\1\145\1\0\24\uffff";
    static final String DFA114_acceptS =
        "\2\uffff\1\3\21\uffff\1\1\1\2";
    static final String DFA114_specialS =
        "\1\uffff\1\0\24\uffff}>";
    static final String[] DFA114_transitionS = {
            "\2\2\3\uffff\4\2\6\uffff\1\2\5\uffff\1\1\3\uffff\1\2\16\uffff"+
            "\1\2\2\uffff\2\2\3\uffff\4\2\3\uffff\7\2\1\uffff\1\2",
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
            ""
    };

    static final short[] DFA114_eot = DFA.unpackEncodedString(DFA114_eotS);
    static final short[] DFA114_eof = DFA.unpackEncodedString(DFA114_eofS);
    static final char[] DFA114_min = DFA.unpackEncodedStringToUnsignedChars(DFA114_minS);
    static final char[] DFA114_max = DFA.unpackEncodedStringToUnsignedChars(DFA114_maxS);
    static final short[] DFA114_accept = DFA.unpackEncodedString(DFA114_acceptS);
    static final short[] DFA114_special = DFA.unpackEncodedString(DFA114_specialS);
    static final short[][] DFA114_transition;

    static {
        int numStates = DFA114_transitionS.length;
        DFA114_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA114_transition[i] = DFA.unpackEncodedString(DFA114_transitionS[i]);
        }
    }

    class DFA114 extends DFA {

        public DFA114(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 114;
            this.eot = DFA114_eot;
            this.eof = DFA114_eof;
            this.min = DFA114_min;
            this.max = DFA114_max;
            this.accept = DFA114_accept;
            this.special = DFA114_special;
            this.transition = DFA114_transition;
        }
        public String getDescription() {
            return "348:1: parenExpr : ( castExpr | groupedExpr | unaryExpr );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA114_1 = input.LA(1);

                         
                        int index114_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred168_Fan()&&(notAfterEol()))) ) {s = 20;}

                        else if ( (synpred169_Fan()) ) {s = 21;}

                         
                        input.seek(index114_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 114, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA115_eotS =
        "\115\uffff";
    static final String DFA115_eofS =
        "\1\1\114\uffff";
    static final String DFA115_minS =
        "\1\4\17\uffff\1\0\15\uffff\1\0\21\uffff\1\0\34\uffff";
    static final String DFA115_maxS =
        "\1\145\17\uffff\1\0\15\uffff\1\0\21\uffff\1\0\34\uffff";
    static final String DFA115_acceptS =
        "\1\uffff\1\2\107\uffff\1\1\3\uffff";
    static final String DFA115_specialS =
        "\20\uffff\1\0\15\uffff\1\1\21\uffff\1\2\34\uffff}>";
    static final String[] DFA115_transitionS = {
            "\15\1\1\uffff\35\1\5\uffff\1\111\1\36\1\1\1\20\3\1\1\60\2\1"+
            "\1\uffff\1\1\1\111\1\uffff\30\1\1\uffff\2\111\11\1",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 352:33: ( termChain )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA115_16 = input.LA(1);

                         
                        int index115_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred170_Fan()) ) {s = 73;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index115_16);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA115_30 = input.LA(1);

                         
                        int index115_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred170_Fan()&&(notAfterEol()))) ) {s = 73;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index115_30);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA115_48 = input.LA(1);

                         
                        int index115_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred170_Fan()&&(notAfterEol()))) ) {s = 73;}

                        else if ( ((((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||(lookupNL())||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol())))) ) {s = 1;}

                         
                        input.seek(index115_48);
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
        "\25\uffff";
    static final String DFA116_eofS =
        "\25\uffff";
    static final String DFA116_minS =
        "\1\46\14\0\1\uffff\5\0\2\uffff";
    static final String DFA116_maxS =
        "\1\145\14\0\1\uffff\5\0\2\uffff";
    static final String DFA116_acceptS =
        "\15\uffff\1\1\5\uffff\1\2\1\3";
    static final String DFA116_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\uffff"+
        "\1\14\1\15\1\16\1\17\1\20\2\uffff}>";
    static final String[] DFA116_transitionS = {
            "\1\5\1\6\3\uffff\1\4\1\7\1\10\1\11\6\uffff\1\20\11\uffff\1\21"+
            "\16\uffff\1\15\2\uffff\1\15\1\1\3\uffff\4\15\3\uffff\1\2\1\3"+
            "\1\12\1\13\1\14\1\17\1\22\1\uffff\1\16",
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
            return "353:1: unaryExpr : ( prefixExpr | postfixExpr | termExpr );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA116_1 = input.LA(1);

                         
                        int index116_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred171_Fan()) ) {s = 13;}

                        else if ( (synpred172_Fan()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index116_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA116_2 = input.LA(1);

                         
                        int index116_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred172_Fan()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index116_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA116_3 = input.LA(1);

                         
                        int index116_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred172_Fan()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index116_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA116_4 = input.LA(1);

                         
                        int index116_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred172_Fan()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index116_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA116_5 = input.LA(1);

                         
                        int index116_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred172_Fan()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index116_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA116_6 = input.LA(1);

                         
                        int index116_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred172_Fan()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index116_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA116_7 = input.LA(1);

                         
                        int index116_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred172_Fan()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index116_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA116_8 = input.LA(1);

                         
                        int index116_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred172_Fan()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index116_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA116_9 = input.LA(1);

                         
                        int index116_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred172_Fan()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index116_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA116_10 = input.LA(1);

                         
                        int index116_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred172_Fan()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index116_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA116_11 = input.LA(1);

                         
                        int index116_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred172_Fan()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index116_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA116_12 = input.LA(1);

                         
                        int index116_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred172_Fan()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index116_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA116_14 = input.LA(1);

                         
                        int index116_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred172_Fan()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index116_14);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA116_15 = input.LA(1);

                         
                        int index116_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred172_Fan()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index116_15);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA116_16 = input.LA(1);

                         
                        int index116_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred172_Fan()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index116_16);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA116_17 = input.LA(1);

                         
                        int index116_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred172_Fan()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index116_17);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA116_18 = input.LA(1);

                         
                        int index116_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred172_Fan()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index116_18);
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
        "\116\uffff";
    static final String DFA117_eofS =
        "\1\1\115\uffff";
    static final String DFA117_minS =
        "\1\4\17\uffff\1\0\15\uffff\1\0\21\uffff\1\0\35\uffff";
    static final String DFA117_maxS =
        "\1\145\17\uffff\1\0\15\uffff\1\0\21\uffff\1\0\35\uffff";
    static final String DFA117_acceptS =
        "\1\uffff\1\2\110\uffff\1\1\3\uffff";
    static final String DFA117_specialS =
        "\20\uffff\1\0\15\uffff\1\1\21\uffff\1\2\35\uffff}>";
    static final String[] DFA117_transitionS = {
            "\15\1\1\uffff\35\1\5\uffff\1\112\1\36\1\1\1\20\3\1\1\60\2\1"+
            "\1\uffff\1\1\1\112\1\uffff\30\1\1\uffff\2\112\11\1",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 356:22: ( termChain )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA117_16 = input.LA(1);

                         
                        int index117_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred180_Fan()) ) {s = 74;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index117_16);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA117_30 = input.LA(1);

                         
                        int index117_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred180_Fan()&&(notAfterEol()))) ) {s = 74;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index117_30);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA117_48 = input.LA(1);

                         
                        int index117_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred180_Fan()&&(notAfterEol()))) ) {s = 74;}

                        else if ( ((((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||(lookupNL())||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol())))) ) {s = 1;}

                         
                        input.seek(index117_48);
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
        "\24\uffff";
    static final String DFA118_eofS =
        "\24\uffff";
    static final String DFA118_minS =
        "\1\46\1\uffff\1\0\14\uffff\3\0\2\uffff";
    static final String DFA118_maxS =
        "\1\145\1\uffff\1\0\14\uffff\3\0\2\uffff";
    static final String DFA118_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\16\uffff\1\3\1\4";
    static final String DFA118_specialS =
        "\2\uffff\1\0\14\uffff\1\1\1\2\1\3\2\uffff}>";
    static final String[] DFA118_transitionS = {
            "\2\3\3\uffff\4\3\6\uffff\1\17\11\uffff\1\20\22\uffff\1\3\12"+
            "\uffff\1\1\1\2\4\3\1\21\1\uffff\1\3",
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
            return "358:1: termBase : ( idExprReq | literal | typeBase | id );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA118_2 = input.LA(1);

                         
                        int index118_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred181_Fan()) ) {s = 1;}

                        else if ( (synpred182_Fan()) ) {s = 3;}

                        else if ( (synpred183_Fan()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index118_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA118_15 = input.LA(1);

                         
                        int index118_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred182_Fan()) ) {s = 3;}

                        else if ( (synpred183_Fan()) ) {s = 18;}

                         
                        input.seek(index118_15);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA118_16 = input.LA(1);

                         
                        int index118_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred182_Fan()) ) {s = 3;}

                        else if ( (synpred183_Fan()) ) {s = 18;}

                         
                        input.seek(index118_16);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA118_17 = input.LA(1);

                         
                        int index118_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred182_Fan()) ) {s = 3;}

                        else if ( (synpred183_Fan()) ) {s = 18;}

                         
                        input.seek(index118_17);
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
        "\14\uffff";
    static final String DFA119_eofS =
        "\14\uffff";
    static final String DFA119_minS =
        "\1\65\3\0\10\uffff";
    static final String DFA119_maxS =
        "\1\143\3\0\10\uffff";
    static final String DFA119_acceptS =
        "\4\uffff\1\2\1\1\1\4\1\7\1\10\1\6\1\3\1\5";
    static final String DFA119_specialS =
        "\1\uffff\1\0\1\1\1\2\10\uffff}>";
    static final String[] DFA119_transitionS = {
            "\1\1\11\uffff\1\2\36\uffff\1\3\4\uffff\1\4",
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
            return "359:1: typeBase : ( typeLiteral | slotLiteral | namedSuper | staticCall | dsl | closure | simple | ctorBlock );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA119_1 = input.LA(1);

                         
                        int index119_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred184_Fan()) ) {s = 5;}

                        else if ( (synpred185_Fan()) ) {s = 4;}

                        else if ( (synpred187_Fan()) ) {s = 6;}

                        else if ( (synpred190_Fan()) ) {s = 7;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index119_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA119_2 = input.LA(1);

                         
                        int index119_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred184_Fan()) ) {s = 5;}

                        else if ( (synpred185_Fan()) ) {s = 4;}

                        else if ( (synpred187_Fan()) ) {s = 6;}

                        else if ( (synpred189_Fan()) ) {s = 9;}

                        else if ( (synpred190_Fan()) ) {s = 7;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index119_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA119_3 = input.LA(1);

                         
                        int index119_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred184_Fan()) ) {s = 5;}

                        else if ( (synpred185_Fan()) ) {s = 4;}

                        else if ( (synpred186_Fan()) ) {s = 10;}

                        else if ( (synpred187_Fan()) ) {s = 6;}

                        else if ( (synpred188_Fan()) ) {s = 11;}

                        else if ( (synpred190_Fan()) ) {s = 7;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index119_3);
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
    static final String DFA125_eotS =
        "\117\uffff";
    static final String DFA125_eofS =
        "\1\1\116\uffff";
    static final String DFA125_minS =
        "\1\4\5\uffff\1\0\110\uffff";
    static final String DFA125_maxS =
        "\1\145\5\uffff\1\0\110\uffff";
    static final String DFA125_acceptS =
        "\1\uffff\1\2\114\uffff\1\1";
    static final String DFA125_specialS =
        "\6\uffff\1\0\110\uffff}>";
    static final String[] DFA125_transitionS = {
            "\15\1\1\uffff\35\1\5\uffff\12\1\1\uffff\1\6\1\1\1\uffff\30\1"+
            "\1\uffff\13\1",
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

    static final short[] DFA125_eot = DFA.unpackEncodedString(DFA125_eotS);
    static final short[] DFA125_eof = DFA.unpackEncodedString(DFA125_eofS);
    static final char[] DFA125_min = DFA.unpackEncodedStringToUnsignedChars(DFA125_minS);
    static final char[] DFA125_max = DFA.unpackEncodedStringToUnsignedChars(DFA125_maxS);
    static final short[] DFA125_accept = DFA.unpackEncodedString(DFA125_acceptS);
    static final short[] DFA125_special = DFA.unpackEncodedString(DFA125_specialS);
    static final short[][] DFA125_transition;

    static {
        int numStates = DFA125_transitionS.length;
        DFA125_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA125_transition[i] = DFA.unpackEncodedString(DFA125_transitionS[i]);
        }
    }

    class DFA125 extends DFA {

        public DFA125(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 125;
            this.eot = DFA125_eot;
            this.eof = DFA125_eof;
            this.min = DFA125_min;
            this.max = DFA125_max;
            this.accept = DFA125_accept;
            this.special = DFA125_special;
            this.transition = DFA125_transition;
        }
        public String getDescription() {
            return "()* loopback of 376:47: ( closure )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA125_6 = input.LA(1);

                         
                        int index125_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred201_Fan()) ) {s = 78;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index125_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 125, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA132_eotS =
        "\26\uffff";
    static final String DFA132_eofS =
        "\26\uffff";
    static final String DFA132_minS =
        "\1\46\14\uffff\3\0\6\uffff";
    static final String DFA132_maxS =
        "\1\145\14\uffff\3\0\6\uffff";
    static final String DFA132_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\uffff\1\13"+
        "\3\uffff\1\15\1\14\1\16\1\17\1\20\1\21";
    static final String DFA132_specialS =
        "\15\uffff\1\0\1\1\1\2\6\uffff}>";
    static final String[] DFA132_transitionS = {
            "\1\2\1\3\3\uffff\1\1\1\4\1\5\1\6\6\uffff\1\16\11\uffff\1\17"+
            "\22\uffff\1\12\13\uffff\1\15\1\7\1\10\1\11\1\14\1\20\1\uffff"+
            "\1\12",
            "",
            "",
            "",
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
            return "390:1: literal : ( KW_NULL | KW_THIS | KW_SUPER | KW_IT | KW_TRUE | KW_FALSE | QUOTSTR | STR | URI | number | CHAR | namedSuper | slotLiteral | typeLiteral | list | map | simple );";
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
                        if ( (synpred220_Fan()) ) {s = 17;}

                        else if ( (synpred221_Fan()) ) {s = 16;}

                        else if ( (synpred222_Fan()) ) {s = 18;}

                        else if ( (synpred223_Fan()) ) {s = 19;}

                        else if ( (synpred224_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index132_13);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA132_14 = input.LA(1);

                         
                        int index132_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred221_Fan()) ) {s = 16;}

                        else if ( (synpred222_Fan()) ) {s = 18;}

                        else if ( (synpred223_Fan()) ) {s = 19;}

                        else if ( (synpred224_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index132_14);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA132_15 = input.LA(1);

                         
                        int index132_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred221_Fan()) ) {s = 16;}

                        else if ( (synpred222_Fan()) ) {s = 18;}

                        else if ( (synpred223_Fan()) ) {s = 19;}

                        else if ( (synpred224_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
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
 

    public static final BitSet FOLLOW_using_in_prog357 = new BitSet(new long[]{0x0000000FF4320000L,0x0000001020000000L});
    public static final BitSet FOLLOW_typeDef_in_prog360 = new BitSet(new long[]{0x0000000FF4300000L,0x0000001020000000L});
    public static final BitSet FOLLOW_docs_in_prog363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_prog365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_usingPod_in_using374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_usingType_in_using378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_usingAs_in_using382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_USING_in_usingPod392 = new BitSet(new long[]{0x0020000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_podSpec_in_usingPod394 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_eos_in_usingPod396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_USING_in_usingType406 = new BitSet(new long[]{0x0020000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_podSpec_in_usingType408 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_SP_COLCOL_in_usingType410 = new BitSet(new long[]{0x0020000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_id_in_usingType412 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_eos_in_usingType414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_USING_in_usingAs422 = new BitSet(new long[]{0x0020000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_podSpec_in_usingAs424 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_SP_COLCOL_in_usingAs426 = new BitSet(new long[]{0x0020000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_id_in_usingAs428 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_KW_AS_in_usingAs430 = new BitSet(new long[]{0x0020000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_id_in_usingAs432 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_eos_in_usingAs434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ffi_in_podSpec442 = new BitSet(new long[]{0x0020000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_id_in_podSpec445 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_DOT_in_podSpec448 = new BitSet(new long[]{0x0020000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_id_in_podSpec450 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_SQ_BRACKET_L_in_ffi461 = new BitSet(new long[]{0x0020000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_id_in_ffi463 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_SQ_BRACKET_R_in_ffi465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_typeDef474 = new BitSet(new long[]{0x0000000FF4300000L,0x0000001020000000L});
    public static final BitSet FOLLOW_facet_in_typeDef476 = new BitSet(new long[]{0x0000000FF4300000L,0x0000001020000000L});
    public static final BitSet FOLLOW_classDef_in_typeDef487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDef_in_typeDef501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mixinDef_in_typeDef505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classHeader_in_classDef516 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_classBody_in_classDef518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_classHeader525 = new BitSet(new long[]{0x0000000F94300000L,0x0000000020000000L});
    public static final BitSet FOLLOW_facet_in_classHeader527 = new BitSet(new long[]{0x0000000F94300000L,0x0000000020000000L});
    public static final BitSet FOLLOW_classFlags_in_classHeader530 = new BitSet(new long[]{0x0000000F94300000L});
    public static final BitSet FOLLOW_KW_CLASS_in_classHeader533 = new BitSet(new long[]{0x0020000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_id_in_classHeader535 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_inheritance_in_classHeader537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protection_in_classFlags546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ABSTRACT_in_classFlags550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FINAL_in_classFlags554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CONST_in_classFlags558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_STATIC_in_classFlags562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRACKET_L_in_classBody570 = new BitSet(new long[]{0x8120003F8FF80000L,0x0000001060000000L});
    public static final BitSet FOLLOW_slotDef_in_classBody572 = new BitSet(new long[]{0x8120003F8FF80000L,0x0000001060000000L});
    public static final BitSet FOLLOW_BRACKET_R_in_classBody575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_protection0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mixinHeader_in_mixinDef601 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_mixinBody_in_mixinDef603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_mixinHeader610 = new BitSet(new long[]{0x0000000F44300000L,0x0000000020000000L});
    public static final BitSet FOLLOW_facet_in_mixinHeader612 = new BitSet(new long[]{0x0000000F44300000L,0x0000000020000000L});
    public static final BitSet FOLLOW_mixinFlags_in_mixinHeader615 = new BitSet(new long[]{0x0000000F44300000L});
    public static final BitSet FOLLOW_KW_MIXIN_in_mixinHeader618 = new BitSet(new long[]{0x0020000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_id_in_mixinHeader620 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_inheritance_in_mixinHeader622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protection_in_mixinFlags630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CONST_in_mixinFlags634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_STATIC_in_mixinFlags638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FINAL_in_mixinFlags642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRACKET_L_in_mixinBody649 = new BitSet(new long[]{0x8120003F8FF80000L,0x0000001060000000L});
    public static final BitSet FOLLOW_slotDef_in_mixinBody651 = new BitSet(new long[]{0x8120003F8FF80000L,0x0000001060000000L});
    public static final BitSet FOLLOW_BRACKET_R_in_mixinBody654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumHeader_in_enumDef662 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_enumBody_in_enumDef664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_enumHeader674 = new BitSet(new long[]{0x0000000F20000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_facet_in_enumHeader676 = new BitSet(new long[]{0x0000000F20000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_protection_in_enumHeader679 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_KW_ENUM_in_enumHeader682 = new BitSet(new long[]{0x0020000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_id_in_enumHeader684 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_inheritance_in_enumHeader686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRACKET_L_in_enumBody694 = new BitSet(new long[]{0x0020000000000000L,0x0000001040000000L});
    public static final BitSet FOLLOW_enumValDefs_in_enumBody696 = new BitSet(new long[]{0x8120003F8FF80000L,0x0000001060000000L});
    public static final BitSet FOLLOW_slotDef_in_enumBody698 = new BitSet(new long[]{0x8120003F8FF80000L,0x0000001060000000L});
    public static final BitSet FOLLOW_BRACKET_R_in_enumBody701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_COLON_in_inheritance710 = new BitSet(new long[]{0x8020000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_typeList_in_inheritance712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumValDef_in_enumValDefs720 = new BitSet(new long[]{0x0400000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SP_COMMA_in_enumValDefs723 = new BitSet(new long[]{0x0020000000000000L,0x0000001040000000L});
    public static final BitSet FOLLOW_enumValDef_in_enumValDefs726 = new BitSet(new long[]{0x0400000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_eos_in_enumValDefs730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_enumValDef738 = new BitSet(new long[]{0x0020000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_id_in_enumValDef740 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_PAR_L_in_enumValDef743 = new BitSet(new long[]{0x982078C000000000L,0x0000002FE3C64000L});
    public static final BitSet FOLLOW_args_in_enumValDef745 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_PAR_R_in_enumValDef748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeList759 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_SP_COMMA_in_typeList762 = new BitSet(new long[]{0x8020000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_type_in_typeList764 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_typeRoot_in_type784 = new BitSet(new long[]{0x6000000000000002L});
    public static final BitSet FOLLOW_SP_QMARK_in_type787 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_LIST_TYPE_in_type791 = new BitSet(new long[]{0x6000000000000002L});
    public static final BitSet FOLLOW_SP_QMARK_in_type793 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_funcType_in_nonMapType804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleType_in_nonMapType808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mapType_in_typeRoot815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonMapType_in_typeRoot819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_simpleType833 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_SP_COLCOL_in_simpleType836 = new BitSet(new long[]{0x0020000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_id_in_simpleType838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SQ_BRACKET_L_in_mapType849 = new BitSet(new long[]{0x8020000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_nonMapType_in_mapType852 = new BitSet(new long[]{0x6200000000000000L});
    public static final BitSet FOLLOW_SP_QMARK_in_mapType854 = new BitSet(new long[]{0x4200000000000000L});
    public static final BitSet FOLLOW_LIST_TYPE_in_mapType858 = new BitSet(new long[]{0x6200000000000000L});
    public static final BitSet FOLLOW_SP_QMARK_in_mapType860 = new BitSet(new long[]{0x4200000000000000L});
    public static final BitSet FOLLOW_SP_COLON_in_mapType872 = new BitSet(new long[]{0x8020000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_type_in_mapType876 = new BitSet(new long[]{0x0240000000000002L});
    public static final BitSet FOLLOW_SQ_BRACKET_R_in_mapType880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_PIPE_in_funcType889 = new BitSet(new long[]{0x8420000000000000L,0x0000000040000001L});
    public static final BitSet FOLLOW_SP_COMMA_in_funcType892 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_formals_in_funcType897 = new BitSet(new long[]{0x8420000000000000L,0x0000000040000001L});
    public static final BitSet FOLLOW_assignedType_in_funcType904 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_assignedType_in_funcType916 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_SP_PIPE_in_funcType920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_ARROW_in_assignedType927 = new BitSet(new long[]{0x8020000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_type_in_assignedType929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formal_in_formals939 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_SP_COMMA_in_formals942 = new BitSet(new long[]{0x8020000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_formal_in_formals944 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_formalFull_in_formal954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formalTypeOnly_in_formal958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formalInferred_in_formal962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_formalFull974 = new BitSet(new long[]{0x0020000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_id_in_formalFull976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_formalTypeOnly986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_formalInferred996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_staticBlock_in_slotDef1012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_slotDef1020 = new BitSet(new long[]{0x8020003F8FF80000L,0x0000001060000000L});
    public static final BitSet FOLLOW_facet_in_slotDef1022 = new BitSet(new long[]{0x8020003F8FF80000L,0x0000001060000000L});
    public static final BitSet FOLLOW_ctorDef_in_slotDef1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodDef_in_slotDef1072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldDef_in_slotDef1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_fieldDef1107 = new BitSet(new long[]{0x8020003F8FF80000L,0x0000001060000000L});
    public static final BitSet FOLLOW_facet_in_fieldDef1109 = new BitSet(new long[]{0x8020003F8FF80000L,0x0000001060000000L});
    public static final BitSet FOLLOW_fieldFlags_in_fieldDef1112 = new BitSet(new long[]{0x8020003F8FF80000L,0x0000001060000000L});
    public static final BitSet FOLLOW_typeId_in_fieldDef1114 = new BitSet(new long[]{0x0080000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_AS_INIT_VAL_in_fieldDef1117 = new BitSet(new long[]{0x882078C000000000L,0x0000002FE3C64000L});
    public static final BitSet FOLLOW_expr_in_fieldDef1119 = new BitSet(new long[]{0x0080000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_BRACKET_L_in_fieldDef1134 = new BitSet(new long[]{0x0000000F00000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_protection_in_fieldDef1137 = new BitSet(new long[]{0x0000000F00000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_getter_in_fieldDef1141 = new BitSet(new long[]{0x89A078FF8FF81FF0L,0x0000003FE3C64004L});
    public static final BitSet FOLLOW_setter_in_fieldDef1145 = new BitSet(new long[]{0x89A078FF8FF81FF0L,0x0000003FE3C64004L});
    public static final BitSet FOLLOW_SP_SEMI_in_fieldDef1148 = new BitSet(new long[]{0x89A078FF8FF81FF0L,0x0000003FE3C64000L});
    public static final BitSet FOLLOW_block_in_fieldDef1151 = new BitSet(new long[]{0x0100000F00000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_BRACKET_R_in_fieldDef1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_eos_in_fieldDef1165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeAndId_in_typeId1182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_typeId1186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeAndId1194 = new BitSet(new long[]{0x0020000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_id_in_typeAndId1196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ABSTRACT_in_fieldFlags1204 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_KW_RD_ONLY_in_fieldFlags1208 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_KW_CONST_in_fieldFlags1212 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_KW_STATIC_in_fieldFlags1216 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_KW_NATIVE_in_fieldFlags1220 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_KW_VOLATILE_in_fieldFlags1224 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_KW_OVERRIDE_in_fieldFlags1228 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_KW_VIRTUAL_in_fieldFlags1232 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_KW_FINAL_in_fieldFlags1236 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_protection_in_fieldFlags1240 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_docs_in_methodDef1249 = new BitSet(new long[]{0x8020002F8F600000L,0x0000000060000000L});
    public static final BitSet FOLLOW_facet_in_methodDef1251 = new BitSet(new long[]{0x8020002F8F600000L,0x0000000060000000L});
    public static final BitSet FOLLOW_methodFlags_in_methodDef1254 = new BitSet(new long[]{0x8020002F8F600000L,0x0000000040000000L});
    public static final BitSet FOLLOW_type_in_methodDef1258 = new BitSet(new long[]{0x0020000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_KW_VOID_in_methodDef1262 = new BitSet(new long[]{0x0020000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_id_in_methodDef1265 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_PAR_L_in_methodDef1267 = new BitSet(new long[]{0x9020000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_params_in_methodDef1269 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_PAR_R_in_methodDef1271 = new BitSet(new long[]{0x0080000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_methodBody_in_methodDef1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protection_in_methodFlags1280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_VIRTUAL_in_methodFlags1284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_OVERRIDE_in_methodFlags1288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ABSTRACT_in_methodFlags1292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_STATIC_in_methodFlags1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ONCE_in_methodFlags1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_NATIVE_in_methodFlags1308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FINAL_in_methodFlags1312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_params1321 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_SP_COMMA_in_params1324 = new BitSet(new long[]{0x8020000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_param_in_params1326 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_type_in_param1339 = new BitSet(new long[]{0x0020000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_id_in_param1341 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_AS_INIT_VAL_in_param1344 = new BitSet(new long[]{0x882078C000000000L,0x0000002FE3C64000L});
    public static final BitSet FOLLOW_expr_in_param1346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRACKET_L_in_methodBody1356 = new BitSet(new long[]{0x89A078FF8FF81FF0L,0x0000003FE3C64000L});
    public static final BitSet FOLLOW_stmt_in_methodBody1358 = new BitSet(new long[]{0x89A078FF8FF81FF0L,0x0000003FE3C64000L});
    public static final BitSet FOLLOW_BRACKET_R_in_methodBody1361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_eos_in_methodBody1366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_ctorDef1374 = new BitSet(new long[]{0x0000001F00000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_facet_in_ctorDef1376 = new BitSet(new long[]{0x0000001F00000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_ctorFlags_in_ctorDef1379 = new BitSet(new long[]{0x0000001F00000000L});
    public static final BitSet FOLLOW_KW_NEW_in_ctorDef1382 = new BitSet(new long[]{0x0020000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_id_in_ctorDef1384 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_PAR_L_in_ctorDef1386 = new BitSet(new long[]{0x9020000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_params_in_ctorDef1388 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_PAR_R_in_ctorDef1390 = new BitSet(new long[]{0x0280000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ctorChain_in_ctorDef1397 = new BitSet(new long[]{0x0080000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_methodBody_in_ctorDef1401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protection_in_ctorFlags1408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_COLON_in_ctorChain1415 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_ctorChainThis_in_ctorChain1418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctorChainSuper_in_ctorChain1422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_THIS_in_ctorChainThis1431 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_DOT_in_ctorChainThis1433 = new BitSet(new long[]{0x0020000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_id_in_ctorChainThis1435 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_PAR_L_in_ctorChainThis1437 = new BitSet(new long[]{0x982078C000000000L,0x0000002FE3C64000L});
    public static final BitSet FOLLOW_args_in_ctorChainThis1439 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_PAR_R_in_ctorChainThis1442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_SUPER_in_ctorChainSuper1449 = new BitSet(new long[]{0x0810000000000000L});
    public static final BitSet FOLLOW_DOT_in_ctorChainSuper1452 = new BitSet(new long[]{0x0020000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_id_in_ctorChainSuper1454 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_PAR_L_in_ctorChainSuper1458 = new BitSet(new long[]{0x982078C000000000L,0x0000002FE3C64000L});
    public static final BitSet FOLLOW_args_in_ctorChainSuper1460 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_PAR_R_in_ctorChainSuper1463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_STATIC_in_staticBlock1471 = new BitSet(new long[]{0x88A078FF8FF81FF0L,0x0000003FE3C64000L});
    public static final BitSet FOLLOW_block_in_staticBlock1473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiStmt_in_block1487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_block1491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRACKET_L_in_multiStmt1499 = new BitSet(new long[]{0x89A078FF8FF81FF0L,0x0000003FE3C64000L});
    public static final BitSet FOLLOW_stmt_in_multiStmt1502 = new BitSet(new long[]{0x89A078FF8FF81FF0L,0x0000003FE3C64000L});
    public static final BitSet FOLLOW_BRACKET_R_in_multiStmt1505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_if_in_stmt1524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_for_in_stmt1528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_while_in_stmt1532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_break_in_stmt1536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_continue_in_stmt1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_return_in_stmt1547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_switch_in_stmt1551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_throw_in_stmt1558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_try_in_stmt1562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprStmt_in_stmt1566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localDef_in_stmt1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_BREAK_in_g_break1583 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_eos_in_g_break1585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CONTINUE_in_g_continue1592 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_eos_in_g_continue1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FOR_in_g_for1602 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_PAR_L_in_g_for1604 = new BitSet(new long[]{0x882078FF8FF80000L,0x0000003FE3C64004L});
    public static final BitSet FOLLOW_forInit_in_g_for1606 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SP_SEMI_in_g_for1609 = new BitSet(new long[]{0x882078C000000000L,0x0000002FE3C64004L});
    public static final BitSet FOLLOW_expr_in_g_for1611 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SP_SEMI_in_g_for1614 = new BitSet(new long[]{0x982078C000000000L,0x0000002FE3C64000L});
    public static final BitSet FOLLOW_expr_in_g_for1616 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_PAR_R_in_g_for1619 = new BitSet(new long[]{0x88A078FF8FF81FF0L,0x0000003FE3C64000L});
    public static final BitSet FOLLOW_block_in_g_for1622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_IF_in_g_if1630 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_PAR_L_in_g_if1632 = new BitSet(new long[]{0x882078C000000000L,0x0000002FE3C64000L});
    public static final BitSet FOLLOW_expr_in_g_if1634 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_PAR_R_in_g_if1636 = new BitSet(new long[]{0x88A078FF8FF81FF0L,0x0000003FE3C64000L});
    public static final BitSet FOLLOW_block_in_g_if1638 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_KW_ELSE_in_g_if1645 = new BitSet(new long[]{0x88A078FF8FF81FF0L,0x0000003FE3C64000L});
    public static final BitSet FOLLOW_block_in_g_if1647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_RETURN_in_g_return1656 = new BitSet(new long[]{0x882078C000000000L,0x0000002FE3C64004L});
    public static final BitSet FOLLOW_eos_in_g_return1659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_g_return1663 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_eos_in_g_return1665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_SWITCH_in_g_switch1673 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_PAR_L_in_g_switch1675 = new BitSet(new long[]{0x882078C000000000L,0x0000002FE3C64000L});
    public static final BitSet FOLLOW_expr_in_g_switch1677 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_PAR_R_in_g_switch1679 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_BRACKET_L_in_g_switch1681 = new BitSet(new long[]{0x0100000000006000L});
    public static final BitSet FOLLOW_g_case_in_g_switch1684 = new BitSet(new long[]{0x0100000000006000L});
    public static final BitSet FOLLOW_g_default_in_g_switch1689 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_BRACKET_R_in_g_switch1693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_THROW_in_g_throw1701 = new BitSet(new long[]{0x882078C000000000L,0x0000002FE3C64000L});
    public static final BitSet FOLLOW_expr_in_g_throw1703 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_eos_in_g_throw1705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_WHILE_in_g_while1713 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_PAR_L_in_g_while1715 = new BitSet(new long[]{0x882078C000000000L,0x0000002FE3C64000L});
    public static final BitSet FOLLOW_expr_in_g_while1717 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_PAR_R_in_g_while1719 = new BitSet(new long[]{0x88A078FF8FF81FF0L,0x0000003FE3C64000L});
    public static final BitSet FOLLOW_block_in_g_while1721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_TRY_in_g_try1729 = new BitSet(new long[]{0x88A078FF8FF99FF2L,0x0000003FE3C64000L});
    public static final BitSet FOLLOW_try_long_in_g_try1736 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_stmt_in_g_try1740 = new BitSet(new long[]{0x88A078FF8FF99FF2L,0x0000003FE3C64000L});
    public static final BitSet FOLLOW_g_catch_in_g_try1749 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_g_finally_in_g_try1758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRACKET_L_in_try_long1767 = new BitSet(new long[]{0x89A078FF8FF81FF0L,0x0000003FE3C64000L});
    public static final BitSet FOLLOW_stmt_in_try_long1769 = new BitSet(new long[]{0x89A078FF8FF81FF0L,0x0000003FE3C64000L});
    public static final BitSet FOLLOW_BRACKET_R_in_try_long1772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_exprStmt1779 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_eos_in_exprStmt1781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeId_in_localDef1788 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_AS_INIT_VAL_in_localDef1791 = new BitSet(new long[]{0x882078C000000000L,0x0000002FE3C64000L});
    public static final BitSet FOLLOW_expr_in_localDef1793 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_eos_in_localDef1797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forInitDef_in_forInit1805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_forInit1809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeId_in_forInitDef1816 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_AS_INIT_VAL_in_forInitDef1819 = new BitSet(new long[]{0x882078C000000000L,0x0000002FE3C64000L});
    public static final BitSet FOLLOW_expr_in_forInitDef1821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CATCH_in_g_catch1832 = new BitSet(new long[]{0x88A078FF8FF81FF2L,0x0000003FE3C64000L});
    public static final BitSet FOLLOW_catchDef_in_g_catch1834 = new BitSet(new long[]{0x88A078FF8FF81FF2L,0x0000003FE3C64000L});
    public static final BitSet FOLLOW_catch_long_in_g_catch1842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_g_catch1846 = new BitSet(new long[]{0x88A078FF8FF81FF2L,0x0000003FE3C64000L});
    public static final BitSet FOLLOW_BRACKET_L_in_catch_long1855 = new BitSet(new long[]{0x89A078FF8FF81FF0L,0x0000003FE3C64000L});
    public static final BitSet FOLLOW_stmt_in_catch_long1857 = new BitSet(new long[]{0x89A078FF8FF81FF0L,0x0000003FE3C64000L});
    public static final BitSet FOLLOW_BRACKET_R_in_catch_long1860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_L_in_catchDef1868 = new BitSet(new long[]{0x8020000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_type_in_catchDef1870 = new BitSet(new long[]{0x0020000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_id_in_catchDef1872 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_PAR_R_in_catchDef1874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FINALLY_in_g_finally1882 = new BitSet(new long[]{0x88A078FF8FF81FF2L,0x0000003FE3C64000L});
    public static final BitSet FOLLOW_finally_long_in_g_finally1889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_g_finally1893 = new BitSet(new long[]{0x88A078FF8FF81FF2L,0x0000003FE3C64000L});
    public static final BitSet FOLLOW_BRACKET_L_in_finally_long1902 = new BitSet(new long[]{0x89A078FF8FF81FF0L,0x0000003FE3C64000L});
    public static final BitSet FOLLOW_stmt_in_finally_long1904 = new BitSet(new long[]{0x89A078FF8FF81FF0L,0x0000003FE3C64000L});
    public static final BitSet FOLLOW_BRACKET_R_in_finally_long1907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CASE_in_g_case1915 = new BitSet(new long[]{0x882078C000000000L,0x0000002FE3C64000L});
    public static final BitSet FOLLOW_expr_in_g_case1917 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_SP_COLON_in_g_case1919 = new BitSet(new long[]{0x88A078FF8FF81FF2L,0x0000003FE3C64000L});
    public static final BitSet FOLLOW_stmt_in_g_case1921 = new BitSet(new long[]{0x88A078FF8FF81FF2L,0x0000003FE3C64000L});
    public static final BitSet FOLLOW_KW_DEFAULT_in_g_default1929 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_SP_COLON_in_g_default1931 = new BitSet(new long[]{0x88A078FF8FF81FF2L,0x0000003FE3C64000L});
    public static final BitSet FOLLOW_stmt_in_g_default1933 = new BitSet(new long[]{0x88A078FF8FF81FF2L,0x0000003FE3C64000L});
    public static final BitSet FOLLOW_assignExpr_in_expr1954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ternaryExpr_in_assignExpr1961 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000018L});
    public static final BitSet FOLLOW_assignOp_in_assignExpr1964 = new BitSet(new long[]{0x882078C000000000L,0x0000002FE3C64000L});
    public static final BitSet FOLLOW_assignExpr_in_assignExpr1966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condOrExpr_in_ternaryExpr1975 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_ternaryTail_in_ternaryExpr1978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_QMARK_in_ternaryTail1988 = new BitSet(new long[]{0x882078C000000000L,0x0000002FE3C64000L});
    public static final BitSet FOLLOW_condOrExpr_in_ternaryTail1990 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_SP_COLON_in_ternaryTail1992 = new BitSet(new long[]{0x882078C000000000L,0x0000002FE3C64000L});
    public static final BitSet FOLLOW_condOrExpr_in_ternaryTail1994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_assignOp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condAndExpr_in_condOrExpr2013 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_OP_OR_in_condOrExpr2017 = new BitSet(new long[]{0x882078C000000000L,0x0000002FE3C64000L});
    public static final BitSet FOLLOW_condAndExpr_in_condOrExpr2020 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_equalityExpr_in_condAndExpr2030 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_OP_AND_in_condAndExpr2033 = new BitSet(new long[]{0x882078C000000000L,0x0000002FE3C64000L});
    public static final BitSet FOLLOW_equalityExpr_in_condAndExpr2036 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_relationalExpr_in_equalityExpr2046 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_CP_EQUALITY_in_equalityExpr2049 = new BitSet(new long[]{0x882078C000000000L,0x0000002FE3C64000L});
    public static final BitSet FOLLOW_relationalExpr_in_equalityExpr2051 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_elvisExpr_in_relationalExpr2064 = new BitSet(new long[]{0x0000060000040000L,0x0000000000000100L});
    public static final BitSet FOLLOW_typeCheck_in_relationalExpr2067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compare_in_relationalExpr2071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_typeCheck2082 = new BitSet(new long[]{0x8020000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_typeRoot_in_typeCheck2094 = new BitSet(new long[]{0x6000000000000002L});
    public static final BitSet FOLLOW_SP_QMARK_in_typeCheck2097 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_LIST_TYPE_in_typeCheck2102 = new BitSet(new long[]{0x6000000000000002L});
    public static final BitSet FOLLOW_CP_COMPARATORS_in_compare2115 = new BitSet(new long[]{0x882078C000000000L,0x0000002FE3C64000L});
    public static final BitSet FOLLOW_elvisExpr_in_compare2117 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_rangeExpr_in_elvisExpr2128 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_OP_ELVIS_in_elvisExpr2131 = new BitSet(new long[]{0x882078C000000000L,0x0000002FE3C64000L});
    public static final BitSet FOLLOW_rangeExpr_in_elvisExpr2133 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_bitOrExpr_in_rangeExpr2144 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001C00L});
    public static final BitSet FOLLOW_set_in_rangeExpr2147 = new BitSet(new long[]{0x882078C000000000L,0x0000002FE3C64000L});
    public static final BitSet FOLLOW_bitOrExpr_in_rangeExpr2161 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001C00L});
    public static final BitSet FOLLOW_bitAndExpr_in_bitOrExpr2172 = new BitSet(new long[]{0x8000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_set_in_bitOrExpr2175 = new BitSet(new long[]{0x882078C000000000L,0x0000002FE3C64000L});
    public static final BitSet FOLLOW_bitAndExpr_in_bitOrExpr2183 = new BitSet(new long[]{0x8000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_shiftExpr_in_bitAndExpr2194 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_OP_CURRY_in_bitAndExpr2197 = new BitSet(new long[]{0x882078C000000000L,0x0000002FE3C64000L});
    public static final BitSet FOLLOW_shiftExpr_in_bitAndExpr2199 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr2211 = new BitSet(new long[]{0x0000000000000002L,0x0000000000018000L});
    public static final BitSet FOLLOW_set_in_shiftExpr2214 = new BitSet(new long[]{0x882078C000000000L,0x0000002FE3C64000L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr2222 = new BitSet(new long[]{0x0000000000000002L,0x0000000000018000L});
    public static final BitSet FOLLOW_multExpr_in_addExpr2233 = new BitSet(new long[]{0x0000000000000002L,0x0000000000060000L});
    public static final BitSet FOLLOW_set_in_addExpr2236 = new BitSet(new long[]{0x882078C000000000L,0x0000002FE3C64000L});
    public static final BitSet FOLLOW_multExpr_in_addExpr2244 = new BitSet(new long[]{0x0000000000000002L,0x0000000000060000L});
    public static final BitSet FOLLOW_set_in_addAppend2254 = new BitSet(new long[]{0x882078C000000000L,0x0000002FE3C64000L});
    public static final BitSet FOLLOW_parenExpr_in_addAppend2262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parenExpr_in_multExpr2270 = new BitSet(new long[]{0x0000000000000002L,0x0000000000380000L});
    public static final BitSet FOLLOW_set_in_multExpr2273 = new BitSet(new long[]{0x882078C000000000L,0x0000002FE3C64000L});
    public static final BitSet FOLLOW_parenExpr_in_multExpr2285 = new BitSet(new long[]{0x0000000000000002L,0x0000000000380000L});
    public static final BitSet FOLLOW_castExpr_in_parenExpr2296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_groupedExpr_in_parenExpr2300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpr_in_parenExpr2304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_L_in_castExpr2315 = new BitSet(new long[]{0x8020000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_type_in_castExpr2317 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_PAR_R_in_castExpr2319 = new BitSet(new long[]{0x882078C000000000L,0x0000002FE3C64000L});
    public static final BitSet FOLLOW_parenExpr_in_castExpr2321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_L_in_groupedExpr2330 = new BitSet(new long[]{0x882078C000000000L,0x0000002FE3C64000L});
    public static final BitSet FOLLOW_expr_in_groupedExpr2332 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_PAR_R_in_groupedExpr2334 = new BitSet(new long[]{0x08B0000000000002L,0x0000000018000001L});
    public static final BitSet FOLLOW_termChain_in_groupedExpr2336 = new BitSet(new long[]{0x08B0000000000002L,0x0000000018000001L});
    public static final BitSet FOLLOW_prefixExpr_in_unaryExpr2345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpr_in_unaryExpr2349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termExpr_in_unaryExpr2353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_prefixExpr2361 = new BitSet(new long[]{0x882078C000000000L,0x0000002FE3C64000L});
    public static final BitSet FOLLOW_parenExpr_in_prefixExpr2389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termExpr_in_postfixExpr2398 = new BitSet(new long[]{0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_set_in_postfixExpr2400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termBase_in_termExpr2415 = new BitSet(new long[]{0x08B0000000000002L,0x0000000018000001L});
    public static final BitSet FOLLOW_termChain_in_termExpr2417 = new BitSet(new long[]{0x08B0000000000002L,0x0000000018000001L});
    public static final BitSet FOLLOW_idExprReq_in_termBase2427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_termBase2431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeBase_in_termBase2435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_termBase2439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeLiteral_in_typeBase2446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slotLiteral_in_typeBase2450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namedSuper_in_typeBase2454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_staticCall_in_typeBase2458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dsl_in_typeBase2480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_closure_in_typeBase2484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_in_typeBase2488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctorBlock_in_typeBase2492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_ctorBlock2499 = new BitSet(new long[]{0x08B0000000000000L,0x0000000018000001L});
    public static final BitSet FOLLOW_itBlock_in_ctorBlock2501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_staticCall2508 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_DOT_in_staticCall2510 = new BitSet(new long[]{0x0020000000000000L,0x0000000060000000L});
    public static final BitSet FOLLOW_idExpr_in_staticCall2512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dotCall_in_termChain2521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dynCall_in_termChain2525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_safeDotCall_in_termChain2529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_safeDynCall_in_termChain2533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_indexExpr_in_termChain2540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callOp_in_termChain2544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_itBlock_in_termChain2548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleType_in_dsl2563 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_DSL_in_dsl2565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRACKET_L_in_itBlock2575 = new BitSet(new long[]{0x89A078FF8FF81FF0L,0x0000003FE3C64000L});
    public static final BitSet FOLLOW_stmt_in_itBlock2578 = new BitSet(new long[]{0x8DA078FF8FF81FF0L,0x0000003FE3C64004L});
    public static final BitSet FOLLOW_SP_COMMA_in_itBlock2580 = new BitSet(new long[]{0x89A078FF8FF81FF0L,0x0000003FE3C64004L});
    public static final BitSet FOLLOW_SP_SEMI_in_itBlock2583 = new BitSet(new long[]{0x89A078FF8FF81FF0L,0x0000003FE3C64000L});
    public static final BitSet FOLLOW_BRACKET_R_in_itBlock2588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_dotCall2596 = new BitSet(new long[]{0x0020000000000000L,0x0000000060000000L});
    public static final BitSet FOLLOW_idExpr_in_dotCall2598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_ARROW_in_dynCall2606 = new BitSet(new long[]{0x0020000000000000L,0x0000000060000000L});
    public static final BitSet FOLLOW_idExpr_in_dynCall2608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_SAFE_CALL_in_safeDotCall2616 = new BitSet(new long[]{0x0020000000000000L,0x0000000060000000L});
    public static final BitSet FOLLOW_idExpr_in_safeDotCall2618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_SAFEDYN_CALL_in_safeDynCall2625 = new BitSet(new long[]{0x0020000000000000L,0x0000000060000000L});
    public static final BitSet FOLLOW_idExpr_in_safeDynCall2627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SQ_BRACKET_L_in_indexExpr2637 = new BitSet(new long[]{0x882078C000000000L,0x0000002FE3C64000L});
    public static final BitSet FOLLOW_expr_in_indexExpr2639 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_SQ_BRACKET_R_in_indexExpr2641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_L_in_callOp2652 = new BitSet(new long[]{0x982078C000000000L,0x0000002FE3C64000L});
    public static final BitSet FOLLOW_args_in_callOp2654 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_PAR_R_in_callOp2658 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_closure_in_callOp2660 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_funcType_in_closure2671 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_BRACKET_L_in_closure2673 = new BitSet(new long[]{0x89A078FF8FF81FF0L,0x0000003FE3C64000L});
    public static final BitSet FOLLOW_stmt_in_closure2675 = new BitSet(new long[]{0x89A078FF8FF81FF0L,0x0000003FE3C64000L});
    public static final BitSet FOLLOW_BRACKET_R_in_closure2678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idExprReq_in_idExpr2688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_idExpr2692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_in_idExprReq2700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_idExprReq2704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_field2713 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_field2715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_call2725 = new BitSet(new long[]{0x8800000000000000L});
    public static final BitSet FOLLOW_callParams_in_call2729 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_closure_in_call2731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callParams_in_call2736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_closure_in_call2740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_L_in_callParams2751 = new BitSet(new long[]{0x982078C000000000L,0x0000002FE3C64000L});
    public static final BitSet FOLLOW_args_in_callParams2753 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_PAR_R_in_callParams2756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_args2765 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_SP_COMMA_in_args2768 = new BitSet(new long[]{0x882078C000000000L,0x0000002FE3C64000L});
    public static final BitSet FOLLOW_expr_in_args2771 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_KW_NULL_in_literal2782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_THIS_in_literal2786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_SUPER_in_literal2790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_IT_in_literal2794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_TRUE_in_literal2798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FALSE_in_literal2802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTSTR_in_literal2806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_in_literal2810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_URI_in_literal2814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_literal2821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_literal2825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namedSuper_in_literal2829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slotLiteral_in_literal2836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeLiteral_in_literal2840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_list_in_literal2844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_map_in_literal2848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_in_literal2852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeLiteral2861 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_OP_POUND_in_typeLiteral2865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_slotLiteral2874 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_OP_POUND_in_slotLiteral2877 = new BitSet(new long[]{0x0020000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_id_in_slotLiteral2881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleType_in_namedSuper2889 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_DOT_in_namedSuper2891 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_KW_SUPER_in_namedSuper2893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_list2903 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_SQ_BRACKET_L_in_list2909 = new BitSet(new long[]{0x8C2078C000000000L,0x0000002FE3C64000L});
    public static final BitSet FOLLOW_listItems_in_list2911 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_SQ_BRACKET_R_in_list2913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_listItems2922 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_SP_COMMA_in_listItems2925 = new BitSet(new long[]{0x882078C000000000L,0x0000002FE3C64000L});
    public static final BitSet FOLLOW_expr_in_listItems2927 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_SP_COMMA_in_listItems2932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_COMMA_in_listItems2938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mapType_in_map2948 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_SQ_BRACKET_L_in_map2954 = new BitSet(new long[]{0x8A2078C000000000L,0x0000002FE3C64000L});
    public static final BitSet FOLLOW_mapItems_in_map2956 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_SQ_BRACKET_R_in_map2958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mapPair_in_mapItems2967 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_SP_COMMA_in_mapItems2970 = new BitSet(new long[]{0x882078C000000000L,0x0000002FE3C64000L});
    public static final BitSet FOLLOW_mapPair_in_mapItems2972 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_SP_COMMA_in_mapItems2976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_COLON_in_mapItems2982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_mapPair2990 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_SP_COLON_in_mapPair2992 = new BitSet(new long[]{0x882078C000000000L,0x0000002FE3C64000L});
    public static final BitSet FOLLOW_expr_in_mapPair2994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_simple3002 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_PAR_L_in_simple3004 = new BitSet(new long[]{0x882078C000000000L,0x0000002FE3C64000L});
    public static final BitSet FOLLOW_expr_in_simple3006 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_PAR_R_in_simple3008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOC_in_docs3017 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
    public static final BitSet FOLLOW_OP_MINUS_in_number3028 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_NUMBER_in_number3031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_facet3039 = new BitSet(new long[]{0x0020000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_id_in_facet3041 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_AS_EQUAL_in_facet3044 = new BitSet(new long[]{0x882078C000000000L,0x0000002FE3C64000L});
    public static final BitSet FOLLOW_expr_in_facet3046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_SEMI_in_eos3068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_id3092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_getter3105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_setter3118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_facet_in_synpred7_Fan476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classFlags_in_synpred9_Fan481 = new BitSet(new long[]{0x0000000F94300000L});
    public static final BitSet FOLLOW_KW_CLASS_in_synpred9_Fan484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protection_in_synpred11_Fan495 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_KW_ENUM_in_synpred11_Fan498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_QMARK_in_synpred38_Fan787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_QMARK_in_synpred39_Fan793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIST_TYPE_in_synpred40_Fan791 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_SP_QMARK_in_synpred40_Fan793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mapType_in_synpred42_Fan815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_COLON_in_synpred48_Fan872 = new BitSet(new long[]{0x8020000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_type_in_synpred48_Fan876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SQ_BRACKET_R_in_synpred49_Fan880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_ARROW_in_synpred51_Fan901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_ARROW_in_synpred53_Fan913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formalFull_in_synpred55_Fan954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formalTypeOnly_in_synpred56_Fan958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_STATIC_in_synpred57_Fan1006 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_BRACKET_L_in_synpred57_Fan1008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_facet_in_synpred58_Fan1022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctorFlags_in_synpred60_Fan1039 = new BitSet(new long[]{0x0000001F00000000L});
    public static final BitSet FOLLOW_KW_NEW_in_synpred60_Fan1042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodFlags_in_synpred63_Fan1056 = new BitSet(new long[]{0x8020002F8F600000L,0x0000000040000000L});
    public static final BitSet FOLLOW_type_in_synpred63_Fan1060 = new BitSet(new long[]{0x0020000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_KW_VOID_in_synpred63_Fan1064 = new BitSet(new long[]{0x0020000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_id_in_synpred63_Fan1067 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_PAR_L_in_synpred63_Fan1069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_getter_in_synpred67_Fan1141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_synpred69_Fan1151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_synpred72_Fan1177 = new BitSet(new long[]{0x0020000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_id_in_synpred72_Fan1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_COLON_in_synpred100_Fan1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRACKET_L_in_synpred105_Fan1484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprStmt_in_synpred116_Fan1566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ELSE_in_synpred120_Fan1645 = new BitSet(new long[]{0x88A078FF8FF81FF0L,0x0000003FE3C64000L});
    public static final BitSet FOLLOW_block_in_synpred120_Fan1647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_eos_in_synpred121_Fan1659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRACKET_L_in_synpred124_Fan1733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_synpred125_Fan1740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CATCH_in_synpred126_Fan1746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FINALLY_in_synpred127_Fan1755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forInitDef_in_synpred130_Fan1805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_catchDef_in_synpred132_Fan1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRACKET_L_in_synpred133_Fan1839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_synpred134_Fan1846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRACKET_L_in_synpred136_Fan1886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_synpred137_Fan1893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred158_Fan2175 = new BitSet(new long[]{0x882078C000000000L,0x0000002FE3C64000L});
    public static final BitSet FOLLOW_bitAndExpr_in_synpred158_Fan2183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_CURRY_in_synpred159_Fan2197 = new BitSet(new long[]{0x882078C000000000L,0x0000002FE3C64000L});
    public static final BitSet FOLLOW_shiftExpr_in_synpred159_Fan2199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred163_Fan2236 = new BitSet(new long[]{0x882078C000000000L,0x0000002FE3C64000L});
    public static final BitSet FOLLOW_multExpr_in_synpred163_Fan2244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_castExpr_in_synpred168_Fan2296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_groupedExpr_in_synpred169_Fan2300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termChain_in_synpred170_Fan2336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prefixExpr_in_synpred171_Fan2345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpr_in_synpred172_Fan2349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termChain_in_synpred180_Fan2417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idExprReq_in_synpred181_Fan2427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_synpred182_Fan2431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeBase_in_synpred183_Fan2435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeLiteral_in_synpred184_Fan2446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slotLiteral_in_synpred185_Fan2450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namedSuper_in_synpred186_Fan2454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_staticCall_in_synpred187_Fan2458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dsl_in_synpred188_Fan2480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_closure_in_synpred189_Fan2484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_in_synpred190_Fan2488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_closure_in_synpred201_Fan2660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idExprReq_in_synpred203_Fan2688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callParams_in_synpred205_Fan2729 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_closure_in_synpred205_Fan2731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callParams_in_synpred206_Fan2736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namedSuper_in_synpred220_Fan2829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slotLiteral_in_synpred221_Fan2836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeLiteral_in_synpred222_Fan2840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_list_in_synpred223_Fan2844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_map_in_synpred224_Fan2848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_synpred226_Fan2903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mapType_in_synpred230_Fan2948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOC_in_synpred234_Fan3017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_SEMI_in_synpred237_Fan3068 = new BitSet(new long[]{0x0000000000000002L});

}