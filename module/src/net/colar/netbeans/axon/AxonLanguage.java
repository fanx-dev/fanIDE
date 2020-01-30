/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.axon;

import java.util.Collections;
import java.util.Set;
import net.colar.netbeans.fan.parser.FanTokenID;
import net.colar.netbeans.fan.utils.FanUtilities;
import org.netbeans.api.java.classpath.ClassPath;
import org.netbeans.api.lexer.Language;
import org.netbeans.modules.csl.api.CodeCompletionHandler;
import org.netbeans.modules.csl.api.DeclarationFinder;
import org.netbeans.modules.csl.api.Formatter;
import org.netbeans.modules.csl.api.HintsProvider;
import org.netbeans.modules.csl.api.KeystrokeHandler;
import org.netbeans.modules.csl.api.SemanticAnalyzer;
import org.netbeans.modules.csl.api.StructureScanner;
import org.netbeans.modules.csl.spi.DefaultLanguageConfig;
import org.netbeans.modules.csl.spi.LanguageRegistration;
import org.netbeans.modules.parsing.spi.Parser;

/**
 *
 * @author tcolar
 */
@LanguageRegistration(mimeType = "text/x-axon")
public class AxonLanguage extends DefaultLanguageConfig
{
    public static final String AXON_MIME_TYPE = "text/x-axon";

    public AxonLanguage()
    {
        super();
        FanUtilities.logger.info("Fantom - init AxonLanguage");
    }

    @Override
    public String getDisplayName()
    {
        return "Axon";
    }
    
    @Override
    public Language getLexerLanguage()
    {
        return AxonLanguageHierarchy.axonlanguage();
    }

    @Override
    public String getPreferredExtension()
    {
        return "axon";
    }

    @Override
    public Parser getParser()
    {
        return null;
    }

    @Override
    public boolean hasStructureScanner()
    {
        return false;
    }

    @Override
    public StructureScanner getStructureScanner()
    {
        return null;
    }

    @Override
    public KeystrokeHandler getKeystrokeHandler()
    {
        return null;
    }

    @Override
    public SemanticAnalyzer getSemanticAnalyzer()
    {
        return null;
    }

    @Override
    public Set<String> getBinaryLibraryPathIds()
    {
        return Collections.singleton(ClassPath.BOOT);
    }

    @Override
    public Set<String> getSourcePathIds()
    {
        return Collections.singleton(ClassPath.SOURCE);
    }

    @Override
    public Formatter getFormatter()
    {
        return null;
    }

    @Override
    public CodeCompletionHandler getCompletionHandler()
    {
        return null;
    }

    @Override
    public boolean hasFormatter()
    {
        return false;
    }

    @Override
    public boolean hasHintsProvider()
    {
        return false;
    }

    @Override
    public HintsProvider getHintsProvider()
    {
        return null;
    }

    @Override
    public DeclarationFinder getDeclarationFinder()
    {
        return null;
    }  
}
