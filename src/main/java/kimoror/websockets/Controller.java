package kimoror.websockets;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;

import java.text.SimpleDateFormat;
import java.util.Date;

@org.springframework.stereotype.Controller
public class Controller {

    @MessageMapping("/webs")
    @SendTo("/topic/messages")
    public OutputMessage send(Message message){
        if(message.text().equals("")){
            throw new NoDataFoundException();
        }
        String time = new SimpleDateFormat("HH:mm").format(new Date());
        return new OutputMessage(message.from(), message.text(), time);
    }
}
