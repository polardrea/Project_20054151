package a.makery.chess.view

import a.makery.chess.MainApp
import scalafxml.core.macros.sfxml

@sfxml
class RootLayoutController(){
  def handleMainMenu(): Unit = {
    MainApp.showWelcome()
  }

  def handleExit(): Unit = {
    System.exit(0)
  }

  def handleHowToPlay(): Unit = {
    MainApp.showHowToPlay()
  }
}