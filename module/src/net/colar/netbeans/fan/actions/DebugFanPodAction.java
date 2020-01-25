/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.actions;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import net.colar.netbeans.fan.project.FanProject;
import org.netbeans.api.extexecution.ExecutionService;
import org.netbeans.api.java.classpath.ClassPath;
import org.netbeans.spi.java.classpath.support.ClassPathSupport;
import org.netbeans.spi.project.ActionProvider;
import org.openide.util.Lookup;

/**
 *
 * @author tcolar
 */
public class DebugFanPodAction extends FanAction {

  public static final String COMMAND_DEBUG_FAN_POD = ActionProvider.COMMAND_DEBUG;

  public DebugFanPodAction(FanProject project) {
    super(project);
  }

  @Override
  public String getCommandId() {
    return COMMAND_DEBUG_FAN_POD;
  }

  @Override
  public void invokeAction(Lookup context) throws IllegalArgumentException {

    FanExecutionGroup group = new FanExecutionGroup(
            buildPodAction(context),
            // true = debug
            runPodAction(context, true));

    ExecutionService service =
            ExecutionService.newService(
            group,
            // don't allow rerun because with the JPDA debugger part it would not work
            descriptor.controllable(false), getProjectName(context));

    service.run();
  }

  @Override
  public boolean isActionEnabled(Lookup context) throws IllegalArgumentException {
    return true;
  }

  private static Object[] createServices() {
    try {
      Map<String, Object> map = new HashMap<String, Object>();
      String sourceRoot = System.getProperty("test.dir.src");
      URL sourceUrl = new File(sourceRoot).toURI().toURL();
      String sourceUrlStr = sourceUrl.toString() + File.separator;
      sourceUrl = new URL(sourceUrlStr);
      ClassPath cp = ClassPathSupport.createClassPath(new URL[]{
                sourceUrl
              });
      map.put("sourcepath", cp);
      map.put("baseDir", new File(sourceRoot).getParentFile());
      return new Object[]{
                map
              };
    } catch (MalformedURLException ex) {
      //System.err.println("MalformedURLException: sourceRoot = '"+sourceRoot+"'.");
      ex.printStackTrace();
      return new Object[]{};
    }
  }
}
