/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.test.mock;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import javax.swing.text.Document;
import org.netbeans.api.editor.mimelookup.MimeLookup;

import org.netbeans.modules.parsing.api.Snapshot;
import org.netbeans.modules.parsing.api.Source;
import org.netbeans.modules.parsing.impl.Schedulers;
import org.netbeans.modules.parsing.implspi.EnvironmentFactory;
import org.netbeans.modules.parsing.implspi.SchedulerControl;
import org.netbeans.modules.parsing.implspi.SourceControl;
import org.netbeans.modules.parsing.implspi.SourceEnvironment;
import org.netbeans.modules.parsing.spi.Parser;
import org.netbeans.modules.parsing.spi.ParserFactory;
import org.netbeans.modules.parsing.spi.Scheduler;
import org.openide.cookies.EditorCookie;
import org.openide.filesystems.FileObject;
import org.openide.loaders.DataObject;
import org.openide.util.Lookup;

/**
 *
 * @author sdedic
 */
public class TestEnvironmentFactory implements EnvironmentFactory {

    @Override
    public Lookup getContextLookup() {
        return Lookup.getDefault();
    }

    @Override
    public Parser findMimeParser(Lookup context, String mimeType) {
        return MimeLookup.getLookup(mimeType).lookup(ParserFactory.class).createParser(Collections.<Snapshot>emptySet());
    }

    @Override
    public Collection<? extends Scheduler> getSchedulers(Lookup context) {
        return Schedulers.getSchedulers();
    }

    @Override
    public Class<? extends Scheduler> findStandardScheduler(String schedulerName) {
        return null;
    }

    @Override
    public SourceEnvironment createEnvironment(Source src, SourceControl control) {
        return new Env(control);
    }

    @Override
    public <T> T runPriorityIO(Callable<T> r) throws Exception {
        return r.call();
    }

    static class Env extends SourceEnvironment {

        public Env(SourceControl ctrl) {
            super(ctrl);
        }

        @Override
        public boolean isReparseBlocked() {
            return false;
        }
        
        @Override
        public Document readDocument(FileObject f, boolean forceOpen) throws IOException {
            DataObject d = DataObject.find(f);
            EditorCookie cake = d.getCookie(EditorCookie.class);
            if (!forceOpen) {
                return cake.getDocument();
            } else {
                return cake.openDocument();
            }
        }

        @Override
        public void attachScheduler(SchedulerControl s, boolean attach) {
        }

        @Override
        public void activate() {
        }
    }
}

