/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.editor;

import org.netbeans.api.editor.mimelookup.MimeRegistration;
import org.netbeans.spi.editor.bracesmatching.BracesMatcher;
import org.netbeans.spi.editor.bracesmatching.BracesMatcherFactory;
import org.netbeans.spi.editor.bracesmatching.MatcherContext;
import org.netbeans.spi.editor.bracesmatching.support.BracesMatcherSupport;

@MimeRegistration(mimeType="text/x-fan",service=BracesMatcherFactory.class)
public class FanBracesMatcherFactory implements BracesMatcherFactory {

    @Override
    public BracesMatcher createMatcher(MatcherContext context) {
        return BracesMatcherSupport.defaultMatcher(context, -1, -1);
    }
    
}
