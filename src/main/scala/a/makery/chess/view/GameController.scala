package a.makery.chess

import scalafx.scene.text.Text
import scalafxml.core.macros.sfxml
import javafx.scene.control.{Button, Label}
import scalafx.event.ActionEvent

@sfxml
class GameController(private val playerOneName: Text,
                     private val playerTwoName: Text,
                     private var button1: Button,
                     private var button2: Button,
                     private var button3: Button,
                     private var button4: Button,
                     private var button5: Button,
                     private var button6: Button,
                     private var button7: Button,
                     private var button8: Button,
                     private var button9: Button,
                    ){

  playerOneName.text = TTTBoard.playerOne.name
  playerTwoName.text = TTTBoard.playerTwo.name

  private val playerOne = new Player()
  private val playerTwo = new Player()

  private val game = new Logic()
}