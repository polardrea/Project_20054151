package a.makery.chess.view

import a.makery.chess.MainApp
import scalafxml.core.macros.sfxml

@sfxml
class WelcomeController(){
  def handleStart(): Unit = {
    MainApp.showStart()
  }

  def handleHowToPlay(): Unit = {
    MainApp.showHowToPlay()
  }

  def handleExit() = {
    System.exit(0)
  }
}