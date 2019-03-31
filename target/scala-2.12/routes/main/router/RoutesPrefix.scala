// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/college2/PlayReminder/conf/routes
// @DATE:Sun Mar 31 18:21:15 CEST 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
