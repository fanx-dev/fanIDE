/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan;

import java.util.Enumeration;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.EarlyExitException;
import org.antlr.runtime.FailedPredicateException;
import org.antlr.runtime.MismatchedRangeException;
import org.antlr.runtime.MismatchedTokenException;
import org.antlr.runtime.MissingTokenException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.antlr.runtime.UnwantedTokenException;
import org.netbeans.modules.csl.api.Error;
import org.netbeans.modules.csl.api.Severity;
import org.netbeans.modules.csl.spi.DefaultError;
import org.netbeans.modules.csl.spi.ParserResult;
import org.netbeans.modules.parsing.api.Snapshot;

/**
 *
 * @author tcolar
 */
public class FanParserResult extends ParserResult {

    List<Error> errors=new Vector<Error>();
    private final String sourceName;

    public FanParserResult(Snapshot snapshot)
    {
	super(snapshot);
	this.sourceName=snapshot.getSource().getFileObject().getName();
    }

    @Override
    public List<? extends Error> getDiagnostics() {
	return errors;
    }

    @Override
    protected void invalidate() {
	// what should this do ?
    }

    public void addAntlrError(RecognitionException e, Stack<String> paraphrase)
    {
	String location=null;
	if(! paraphrase.isEmpty())
	    location=paraphrase.peek();
	Enumeration el=paraphrase.elements();
	String trace="";
	/*int cpt=0;
	while(el.hasMoreElements())
	{
	    trace+=el.nextElement()+" ->";
	    cpt++;
	    if(cpt%4==0) trace+="\n";
	}*/
	CommonToken token =(CommonToken)e.token;
	String key="NBFanParser("+sourceName+")";
	String desc="";
	int start=token.getStartIndex();
	int end= token.getStopIndex();
	String loc=location!=null?location:e.token.getText();

	// trying to make some nicer erro messages.
	if(e instanceof MissingTokenException)
	{//tested
	    MissingTokenException ee=(MissingTokenException)e;
	    Object inserted=ee.inserted;
	    if(inserted!=null && inserted instanceof Token)
	    {
		Token tk=(Token)inserted;
		desc="Was expecting :'"+loc+"', but got '"+token.getText()+"' instead."+"\n"+desc;
	    }
	}else if(e instanceof FailedPredicateException)
	{ // tested
	    desc="Expecting: '"+loc+"' but found: '"+token.getText()+"' instead.";
	}else if(e instanceof MismatchedTokenException)
	{// tested
	    desc="Mismatch, looking for: '"+loc+"' but found: '"+token.getText();
	}else if(e instanceof EarlyExitException)
	{//tested
	    desc="Missing required item(s) after: "+loc;
	}else if(e instanceof MismatchedRangeException)
	{
	    MismatchedRangeException ee=(MismatchedRangeException)e;
	    desc="Unexpected token range-> "+e.getUnexpectedType()+" should be within ["+ee.a+"-"+ee.b+"] at: "+e.token.getText();
	}else if(e instanceof NoViableAltException)
	{//tested
	    desc="Unexpected token: '"+token.getText()+"' instead of '"+loc;
	}else if(e instanceof UnwantedTokenException)
	{// tested
	    desc="Unwanted token: '"+token.getText()+"' before '"+loc;
	}
	//desc+="\n"+trace;
	desc+="\n"+e.toString();
	Error error=DefaultError.createDefaultError(key,desc,"Syntax Error",null,start,end,e.approximateLineInfo,Severity.ERROR);
	System.err.println("Adding parsing error: "+key+"| Syntax Error | "+desc+" | "+start+" | "+end+" | "+e.line+" |"+token);
	//e.printStackTrace();
	errors.add(error);
    }
}
