package org.jgroups.gossiprouter;

import org.jgroups.logging.Log;
import org.jgroups.logging.LogFactory;
import org.jgroups.stack.GossipRouter;
import org.jgroups.util.Util;

public class Main {
  protected Log log=LogFactory.getLog(GossipRouter.class);

  protected void start() {
    log.info("an info mesage");
    log.debug("a debug message");
    log.trace("a trace message");
    log.warn("a warning message");
    log.error("an error");
    log.fatal("this is fatal!");
    Util.sleep(60000);
  }

  public static void main(String[] args) {
    Main m=new Main();
    m.start();
  }

}
