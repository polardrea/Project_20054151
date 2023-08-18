package a.makery.chess.view

import a.makery.chess.MainApp
import scalafxml.core.macros.sfxml

@sfxml
class HowToPlayController(){
  def handleGotIt(): Unit = {
    MainApp.showStart()
  }
}

