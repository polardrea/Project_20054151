package a.makery.chess.view

import a.makery.chess.{MainApp, Player, TTTBoard}
import scalafx.scene.control.{Alert, Button, ChoiceBox, TextField}
import scalafx.scene.text.Text
import scalafxml.core.macros.sfxml

@sfxml
class StartController(private val goButton: Button, val playerOneInput: TextField, val playerTwoInput: TextField){
  def nullChecking(x: String): Boolean = x == null || x.length == 0

  def hasValidInput(): Boolean = {
    var errorMessage = ""
    if (nullChecking(playerOneInput.text.value))
      errorMessage += "Please input name for Player 1\n"
    if (nullChecking(playerTwoInput.text.value))
      errorMessage += "Please input name for Player 2\n"

    if (errorMessage.length() == 0) {
      return true

    } else {
      val alert = new Alert(Alert.AlertType.Error) {
        initOwner(MainApp.stage)
        title = "!!!"
        headerText = "ERROR"
        contentText = errorMessage
      }.showAndWait()
      return false;
    }

  }

  def handleGo() = {
    if (hasValidInput()) {
      TTTBoard.playerOne.name = playerOneInput.text.value
      TTTBoard.playerTwo.name = playerTwoInput.text.value
      MainApp.showGame()
    }
  }
}