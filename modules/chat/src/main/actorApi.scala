package lila.chat
package actorApi

import akka.actor.ActorRef
import play.api.libs.json.JsValue

case class UserTalk(chatId: String, userId: String, text: String, replyTo: ActorRef, public: Boolean = true)
case class PlayerTalk(chatId: String, white: Boolean, text: String, replyTo: ActorRef)
case class SystemTalk(chatId: String, text: String, replyTo: ActorRef)
case class ChatLine(chatId: String, line: Line)
case class Timeout(chatId: String, member: lila.socket.SocketMember, data: JsValue)

case class MarkDeleted(username: String)
