// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/college2/PlayReminder/conf/routes
// @DATE:Sun Mar 31 18:21:15 CEST 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_1: controllers.HomeController,
  // @LINE:8
  CountController_0: controllers.CountController,
  // @LINE:10
  AsyncController_2: controllers.AsyncController,
  // @LINE:13
  Assets_5: controllers.Assets,
  // @LINE:16
  LoginController_6: controllers.LoginController,
  // @LINE:49
  RentCtrl_4: controllers.RentCtrl,
  // @LINE:52
  ShoppingCtrl_3: controllers.ShoppingCtrl,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_1: controllers.HomeController,
    // @LINE:8
    CountController_0: controllers.CountController,
    // @LINE:10
    AsyncController_2: controllers.AsyncController,
    // @LINE:13
    Assets_5: controllers.Assets,
    // @LINE:16
    LoginController_6: controllers.LoginController,
    // @LINE:49
    RentCtrl_4: controllers.RentCtrl,
    // @LINE:52
    ShoppingCtrl_3: controllers.ShoppingCtrl
  ) = this(errorHandler, HomeController_1, CountController_0, AsyncController_2, Assets_5, LoginController_6, RentCtrl_4, ShoppingCtrl_3, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, CountController_0, AsyncController_2, Assets_5, LoginController_6, RentCtrl_4, ShoppingCtrl_3, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.LoginController.login"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """loginSubmit""", """controllers.LoginController.loginSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.LoginController.logout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """payment""", """controllers.HomeController.payment"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """database""", """controllers.HomeController.database"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """searchQuery""", """controllers.HomeController.searchDB(min:Integer ?= 0, max:Integer ?= 0)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addHouse""", """controllers.HomeController.addHouse"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addHouseSubmit""", """controllers.HomeController.addHouseSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteHouse/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteHouse(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateHouse/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateHouse(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """landlord""", """controllers.HomeController.landlord"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addLandlord""", """controllers.HomeController.addLandlord"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addLandlordSubmit""", """controllers.HomeController.addLandlordSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateLandlord/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateLandlord(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteLandlord/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteLandlord(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """createAccount""", """controllers.HomeController.createAccount"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addMember""", """controllers.HomeController.addMember"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addMemberSubmit""", """controllers.HomeController.addMemberSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateMember/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateMember(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteMember/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteMember(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """viewRent""", """controllers.RentCtrl.viewRent()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """setupRent""", """controllers.RentCtrl.setupRent(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """showBasket""", """controllers.ShoppingCtrl.showBasket()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addToBasket/""" + "$" + """id<[^/]+>""", """controllers.ShoppingCtrl.addToBasket(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """removeOne/""" + "$" + """itemId<[^/]+>""", """controllers.ShoppingCtrl.removeOne(itemId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """emptyBasket""", """controllers.ShoppingCtrl.emptyBasket()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """placeOrder""", """controllers.ShoppingCtrl.placeOrder()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """viewOrder/""" + "$" + """id<[^/]+>""", """controllers.ShoppingCtrl.viewOrder(id:Long)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_1.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_CountController_count1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count1_invoker = createInvoker(
    CountController_0.count,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      this.prefix + """count""",
      """ An example controller showing how to use dependency injection""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_AsyncController_message2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message2_invoker = createInvoker(
    AsyncController_2.message,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      this.prefix + """message""",
      """ An example controller showing how to write asynchronous code""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Assets_versioned3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned3_invoker = createInvoker(
    Assets_5.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_LoginController_login4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_LoginController_login4_invoker = createInvoker(
    LoginController_6.login,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "login",
      Nil,
      "GET",
      this.prefix + """login""",
      """GET from LoginController""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_LoginController_loginSubmit5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("loginSubmit")))
  )
  private[this] lazy val controllers_LoginController_loginSubmit5_invoker = createInvoker(
    LoginController_6.loginSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "loginSubmit",
      Nil,
      "GET",
      this.prefix + """loginSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_LoginController_logout6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_LoginController_logout6_invoker = createInvoker(
    LoginController_6.logout,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "logout",
      Nil,
      "GET",
      this.prefix + """logout""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_HomeController_payment7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("payment")))
  )
  private[this] lazy val controllers_HomeController_payment7_invoker = createInvoker(
    HomeController_1.payment,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "payment",
      Nil,
      "GET",
      this.prefix + """payment""",
      """""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_HomeController_database8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("database")))
  )
  private[this] lazy val controllers_HomeController_database8_invoker = createInvoker(
    HomeController_1.database,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "database",
      Nil,
      "GET",
      this.prefix + """database""",
      """""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_HomeController_searchDB9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("searchQuery")))
  )
  private[this] lazy val controllers_HomeController_searchDB9_invoker = createInvoker(
    HomeController_1.searchDB(fakeValue[Integer], fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "searchDB",
      Seq(classOf[Integer], classOf[Integer]),
      "GET",
      this.prefix + """searchQuery""",
      """""",
      Seq()
    )
  )

  // @LINE:31
  private[this] lazy val controllers_HomeController_addHouse10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addHouse")))
  )
  private[this] lazy val controllers_HomeController_addHouse10_invoker = createInvoker(
    HomeController_1.addHouse,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addHouse",
      Nil,
      "GET",
      this.prefix + """addHouse""",
      """""",
      Seq()
    )
  )

  // @LINE:32
  private[this] lazy val controllers_HomeController_addHouseSubmit11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addHouseSubmit")))
  )
  private[this] lazy val controllers_HomeController_addHouseSubmit11_invoker = createInvoker(
    HomeController_1.addHouseSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addHouseSubmit",
      Nil,
      "POST",
      this.prefix + """addHouseSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:33
  private[this] lazy val controllers_HomeController_deleteHouse12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteHouse/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteHouse12_invoker = createInvoker(
    HomeController_1.deleteHouse(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteHouse",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """deleteHouse/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:34
  private[this] lazy val controllers_HomeController_updateHouse13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateHouse/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateHouse13_invoker = createInvoker(
    HomeController_1.updateHouse(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateHouse",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """updateHouse/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:36
  private[this] lazy val controllers_HomeController_landlord14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("landlord")))
  )
  private[this] lazy val controllers_HomeController_landlord14_invoker = createInvoker(
    HomeController_1.landlord,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "landlord",
      Nil,
      "GET",
      this.prefix + """landlord""",
      """""",
      Seq()
    )
  )

  // @LINE:37
  private[this] lazy val controllers_HomeController_addLandlord15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addLandlord")))
  )
  private[this] lazy val controllers_HomeController_addLandlord15_invoker = createInvoker(
    HomeController_1.addLandlord,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addLandlord",
      Nil,
      "GET",
      this.prefix + """addLandlord""",
      """""",
      Seq()
    )
  )

  // @LINE:38
  private[this] lazy val controllers_HomeController_addLandlordSubmit16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addLandlordSubmit")))
  )
  private[this] lazy val controllers_HomeController_addLandlordSubmit16_invoker = createInvoker(
    HomeController_1.addLandlordSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addLandlordSubmit",
      Nil,
      "POST",
      this.prefix + """addLandlordSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:39
  private[this] lazy val controllers_HomeController_updateLandlord17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateLandlord/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateLandlord17_invoker = createInvoker(
    HomeController_1.updateLandlord(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateLandlord",
      Seq(classOf[String]),
      "GET",
      this.prefix + """updateLandlord/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:40
  private[this] lazy val controllers_HomeController_deleteLandlord18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteLandlord/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteLandlord18_invoker = createInvoker(
    HomeController_1.deleteLandlord(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteLandlord",
      Seq(classOf[String]),
      "GET",
      this.prefix + """deleteLandlord/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:42
  private[this] lazy val controllers_HomeController_createAccount19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("createAccount")))
  )
  private[this] lazy val controllers_HomeController_createAccount19_invoker = createInvoker(
    HomeController_1.createAccount,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "createAccount",
      Nil,
      "GET",
      this.prefix + """createAccount""",
      """""",
      Seq()
    )
  )

  // @LINE:43
  private[this] lazy val controllers_HomeController_addMember20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addMember")))
  )
  private[this] lazy val controllers_HomeController_addMember20_invoker = createInvoker(
    HomeController_1.addMember,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addMember",
      Nil,
      "GET",
      this.prefix + """addMember""",
      """""",
      Seq()
    )
  )

  // @LINE:44
  private[this] lazy val controllers_HomeController_addMemberSubmit21_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addMemberSubmit")))
  )
  private[this] lazy val controllers_HomeController_addMemberSubmit21_invoker = createInvoker(
    HomeController_1.addMemberSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addMemberSubmit",
      Nil,
      "POST",
      this.prefix + """addMemberSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:45
  private[this] lazy val controllers_HomeController_updateMember22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateMember/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateMember22_invoker = createInvoker(
    HomeController_1.updateMember(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateMember",
      Seq(classOf[String]),
      "GET",
      this.prefix + """updateMember/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:46
  private[this] lazy val controllers_HomeController_deleteMember23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteMember/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteMember23_invoker = createInvoker(
    HomeController_1.deleteMember(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteMember",
      Seq(classOf[String]),
      "GET",
      this.prefix + """deleteMember/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:49
  private[this] lazy val controllers_RentCtrl_viewRent24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("viewRent")))
  )
  private[this] lazy val controllers_RentCtrl_viewRent24_invoker = createInvoker(
    RentCtrl_4.viewRent(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RentCtrl",
      "viewRent",
      Nil,
      "GET",
      this.prefix + """viewRent""",
      """GET from RentCrtl""",
      Seq()
    )
  )

  // @LINE:50
  private[this] lazy val controllers_RentCtrl_setupRent25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("setupRent")))
  )
  private[this] lazy val controllers_RentCtrl_setupRent25_invoker = createInvoker(
    RentCtrl_4.setupRent(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RentCtrl",
      "setupRent",
      Seq(classOf[String]),
      "GET",
      this.prefix + """setupRent""",
      """""",
      Seq()
    )
  )

  // @LINE:52
  private[this] lazy val controllers_ShoppingCtrl_showBasket26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("showBasket")))
  )
  private[this] lazy val controllers_ShoppingCtrl_showBasket26_invoker = createInvoker(
    ShoppingCtrl_3.showBasket(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "showBasket",
      Nil,
      "GET",
      this.prefix + """showBasket""",
      """""",
      Seq()
    )
  )

  // @LINE:53
  private[this] lazy val controllers_ShoppingCtrl_addToBasket27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addToBasket/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_addToBasket27_invoker = createInvoker(
    ShoppingCtrl_3.addToBasket(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "addToBasket",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """addToBasket/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:54
  private[this] lazy val controllers_ShoppingCtrl_removeOne28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("removeOne/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_removeOne28_invoker = createInvoker(
    ShoppingCtrl_3.removeOne(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "removeOne",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """removeOne/""" + "$" + """itemId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:55
  private[this] lazy val controllers_ShoppingCtrl_emptyBasket29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("emptyBasket")))
  )
  private[this] lazy val controllers_ShoppingCtrl_emptyBasket29_invoker = createInvoker(
    ShoppingCtrl_3.emptyBasket(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "emptyBasket",
      Nil,
      "GET",
      this.prefix + """emptyBasket""",
      """""",
      Seq()
    )
  )

  // @LINE:56
  private[this] lazy val controllers_ShoppingCtrl_placeOrder30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("placeOrder")))
  )
  private[this] lazy val controllers_ShoppingCtrl_placeOrder30_invoker = createInvoker(
    ShoppingCtrl_3.placeOrder(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "placeOrder",
      Nil,
      "GET",
      this.prefix + """placeOrder""",
      """""",
      Seq()
    )
  )

  // @LINE:57
  private[this] lazy val controllers_ShoppingCtrl_viewOrder31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("viewOrder/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_viewOrder31_invoker = createInvoker(
    ShoppingCtrl_3.viewOrder(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "viewOrder",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """viewOrder/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_1.index)
      }
  
    // @LINE:8
    case controllers_CountController_count1_route(params@_) =>
      call { 
        controllers_CountController_count1_invoker.call(CountController_0.count)
      }
  
    // @LINE:10
    case controllers_AsyncController_message2_route(params@_) =>
      call { 
        controllers_AsyncController_message2_invoker.call(AsyncController_2.message)
      }
  
    // @LINE:13
    case controllers_Assets_versioned3_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned3_invoker.call(Assets_5.versioned(path, file))
      }
  
    // @LINE:16
    case controllers_LoginController_login4_route(params@_) =>
      call { 
        controllers_LoginController_login4_invoker.call(LoginController_6.login)
      }
  
    // @LINE:18
    case controllers_LoginController_loginSubmit5_route(params@_) =>
      call { 
        controllers_LoginController_loginSubmit5_invoker.call(LoginController_6.loginSubmit)
      }
  
    // @LINE:20
    case controllers_LoginController_logout6_route(params@_) =>
      call { 
        controllers_LoginController_logout6_invoker.call(LoginController_6.logout)
      }
  
    // @LINE:25
    case controllers_HomeController_payment7_route(params@_) =>
      call { 
        controllers_HomeController_payment7_invoker.call(HomeController_1.payment)
      }
  
    // @LINE:27
    case controllers_HomeController_database8_route(params@_) =>
      call { 
        controllers_HomeController_database8_invoker.call(HomeController_1.database)
      }
  
    // @LINE:29
    case controllers_HomeController_searchDB9_route(params@_) =>
      call(params.fromQuery[Integer]("min", Some(0)), params.fromQuery[Integer]("max", Some(0))) { (min, max) =>
        controllers_HomeController_searchDB9_invoker.call(HomeController_1.searchDB(min, max))
      }
  
    // @LINE:31
    case controllers_HomeController_addHouse10_route(params@_) =>
      call { 
        controllers_HomeController_addHouse10_invoker.call(HomeController_1.addHouse)
      }
  
    // @LINE:32
    case controllers_HomeController_addHouseSubmit11_route(params@_) =>
      call { 
        controllers_HomeController_addHouseSubmit11_invoker.call(HomeController_1.addHouseSubmit)
      }
  
    // @LINE:33
    case controllers_HomeController_deleteHouse12_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_deleteHouse12_invoker.call(HomeController_1.deleteHouse(id))
      }
  
    // @LINE:34
    case controllers_HomeController_updateHouse13_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_updateHouse13_invoker.call(HomeController_1.updateHouse(id))
      }
  
    // @LINE:36
    case controllers_HomeController_landlord14_route(params@_) =>
      call { 
        controllers_HomeController_landlord14_invoker.call(HomeController_1.landlord)
      }
  
    // @LINE:37
    case controllers_HomeController_addLandlord15_route(params@_) =>
      call { 
        controllers_HomeController_addLandlord15_invoker.call(HomeController_1.addLandlord)
      }
  
    // @LINE:38
    case controllers_HomeController_addLandlordSubmit16_route(params@_) =>
      call { 
        controllers_HomeController_addLandlordSubmit16_invoker.call(HomeController_1.addLandlordSubmit)
      }
  
    // @LINE:39
    case controllers_HomeController_updateLandlord17_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_HomeController_updateLandlord17_invoker.call(HomeController_1.updateLandlord(id))
      }
  
    // @LINE:40
    case controllers_HomeController_deleteLandlord18_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_HomeController_deleteLandlord18_invoker.call(HomeController_1.deleteLandlord(id))
      }
  
    // @LINE:42
    case controllers_HomeController_createAccount19_route(params@_) =>
      call { 
        controllers_HomeController_createAccount19_invoker.call(HomeController_1.createAccount)
      }
  
    // @LINE:43
    case controllers_HomeController_addMember20_route(params@_) =>
      call { 
        controllers_HomeController_addMember20_invoker.call(HomeController_1.addMember)
      }
  
    // @LINE:44
    case controllers_HomeController_addMemberSubmit21_route(params@_) =>
      call { 
        controllers_HomeController_addMemberSubmit21_invoker.call(HomeController_1.addMemberSubmit)
      }
  
    // @LINE:45
    case controllers_HomeController_updateMember22_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_HomeController_updateMember22_invoker.call(HomeController_1.updateMember(id))
      }
  
    // @LINE:46
    case controllers_HomeController_deleteMember23_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_HomeController_deleteMember23_invoker.call(HomeController_1.deleteMember(id))
      }
  
    // @LINE:49
    case controllers_RentCtrl_viewRent24_route(params@_) =>
      call { 
        controllers_RentCtrl_viewRent24_invoker.call(RentCtrl_4.viewRent())
      }
  
    // @LINE:50
    case controllers_RentCtrl_setupRent25_route(params@_) =>
      call(params.fromQuery[String]("id", None)) { (id) =>
        controllers_RentCtrl_setupRent25_invoker.call(RentCtrl_4.setupRent(id))
      }
  
    // @LINE:52
    case controllers_ShoppingCtrl_showBasket26_route(params@_) =>
      call { 
        controllers_ShoppingCtrl_showBasket26_invoker.call(ShoppingCtrl_3.showBasket())
      }
  
    // @LINE:53
    case controllers_ShoppingCtrl_addToBasket27_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ShoppingCtrl_addToBasket27_invoker.call(ShoppingCtrl_3.addToBasket(id))
      }
  
    // @LINE:54
    case controllers_ShoppingCtrl_removeOne28_route(params@_) =>
      call(params.fromPath[Long]("itemId", None)) { (itemId) =>
        controllers_ShoppingCtrl_removeOne28_invoker.call(ShoppingCtrl_3.removeOne(itemId))
      }
  
    // @LINE:55
    case controllers_ShoppingCtrl_emptyBasket29_route(params@_) =>
      call { 
        controllers_ShoppingCtrl_emptyBasket29_invoker.call(ShoppingCtrl_3.emptyBasket())
      }
  
    // @LINE:56
    case controllers_ShoppingCtrl_placeOrder30_route(params@_) =>
      call { 
        controllers_ShoppingCtrl_placeOrder30_invoker.call(ShoppingCtrl_3.placeOrder())
      }
  
    // @LINE:57
    case controllers_ShoppingCtrl_viewOrder31_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ShoppingCtrl_viewOrder31_invoker.call(ShoppingCtrl_3.viewOrder(id))
      }
  }
}
