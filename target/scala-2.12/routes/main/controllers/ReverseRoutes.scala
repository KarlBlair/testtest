// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/college2/PlayReminder/conf/routes
// @DATE:Sun Mar 31 18:21:15 CEST 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:13
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:49
  class ReverseRentCtrl(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:49
    def viewRent(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "viewRent")
    }
  
    // @LINE:50
    def setupRent(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "setupRent" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("id", id)))))
    }
  
  }

  // @LINE:8
  class ReverseCountController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def count(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "count")
    }
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def database(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "database")
    }
  
    // @LINE:42
    def createAccount(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "createAccount")
    }
  
    // @LINE:37
    def addLandlord(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addLandlord")
    }
  
    // @LINE:32
    def addHouseSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addHouseSubmit")
    }
  
    // @LINE:44
    def addMemberSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addMemberSubmit")
    }
  
    // @LINE:40
    def deleteLandlord(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deleteLandlord/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:39
    def updateLandlord(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateLandlord/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:25
    def payment(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "payment")
    }
  
    // @LINE:38
    def addLandlordSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addLandlordSubmit")
    }
  
    // @LINE:46
    def deleteMember(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deleteMember/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:34
    def updateHouse(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateHouse/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:45
    def updateMember(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateMember/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:29
    def searchDB(min:Integer = 0, max:Integer = 0): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "searchQuery" + play.core.routing.queryString(List(if(min == 0) None else Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("min", min)), if(max == 0) None else Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("max", max)))))
    }
  
    // @LINE:33
    def deleteHouse(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deleteHouse/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:36
    def landlord(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "landlord")
    }
  
    // @LINE:43
    def addMember(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addMember")
    }
  
    // @LINE:31
    def addHouse(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addHouse")
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:10
  class ReverseAsyncController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def message(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "message")
    }
  
  }

  // @LINE:16
  class ReverseLoginController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def loginSubmit(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "loginSubmit")
    }
  
    // @LINE:20
    def logout(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
    // @LINE:16
    def login(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }

  // @LINE:52
  class ReverseShoppingCtrl(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:53
    def addToBasket(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addToBasket/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:57
    def viewOrder(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "viewOrder/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:56
    def placeOrder(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "placeOrder")
    }
  
    // @LINE:54
    def removeOne(itemId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "removeOne/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("itemId", itemId)))
    }
  
    // @LINE:52
    def showBasket(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "showBasket")
    }
  
    // @LINE:55
    def emptyBasket(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "emptyBasket")
    }
  
  }


}
