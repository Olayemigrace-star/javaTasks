import java.util.Scanner;

public class repoCase{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("""
     
  MY MENU APP
1. Phone book
2. Messages
3. Chat
4. Call register
5. Tones
6. Settings
7. Call divert
8. Games
9. Calculators
10. Reminders
11. Clock
12. Profiles
13. SIM services

              """);


System.out.println("Enter an option from 1 - 13");
int user = input.nextInt();

switch(user){
case 1: System.out.print("Options:\n1. Search\n2. Service Nos.\n3. Addname\n4. Erase\n5. Edit\n6. Send b'card\n7. Options\n9. Speed dials\n10. Voice tags\n");
if(user == 8){
System.out.print("1.Type of view\n2. Memory status\n");
}
break;

case 2: System.out.print("1.Write messages\n" + "2. Inbox\n" + "3. outbox\n" + "4. Picture messages\n" + "5. Templates\n" +  "6. Smileys\n" + "7. Message settings\n" + "8.Info service\n" + "9.Voice mailbox number" + "10.Service command editor\n");
if(user == 7){
System.out.print("1. Message centre number\n2. Messages sent as\n3. Message validity");
}
break;
case 3: System.out.print("");
break;
case 4: System.out.print("1.Missed call\n" + "2. Received calls\n" + "3. Dailled numbers\n" + "4. Erase recent call list\n" + "5. Show call duration\n" + "6. Show call cost\n" + "7. Call cost settings\n" + "8. Prepaid credit");
if(user == 5){
System.out.print("1. Last call duration\n2. All call's duration'\n3. Received calls duration\n4. Dailled call's duration\n5.Clear timers");
}
else if(user == 6){
System.out.print("1. Last call cost\n2. All call's cost\n3. Clear counters\n");
}
else if(user == 7){
System.out.print("1. Call cost limit\n2. Show cost in\n\n");
}
break;
case 5: System.out.print("1. Ringing tone\n" + "2. Ringing volume\n" + "3. Incoming call alert\n" + "4. Composer\n" + "5. Message alert tone\n" + "6. Keypasdstones" + "7. Warning and game tones\n" + "8. Vibrating alert\n" + "9. Screen saver\n");
break;
case 6: System.out.print("1. Call settings\n" + "2. Phone settings\n" + "3. Security settings\n" + "4. Restore factory settings\n");
break;
if (user == 1) {
System.out.println("Call settings:\n1. Redial\n2. Speed dial\n3. Call waiting\n4. Own number\n5. Line use\n6. Auto answer");
} 
else if (user == 2) {
System.out.println("Phone settings:\n1. Language\n2. Cell info\n3. Welcome note\n4. Network selection\n5. Lights\n6. Confirm SIM actions");
                    }
 else if (user == 3) {
System.out.println("Security settings:\n1. PIN request\n2. Call barring\n3. Fixed dialing\n4. Closed user group\n5. Phone security\n6. Change access codes");
                    }
 else if (user == 4) {
 System.out.println("Restoring factory settings...");
                    }
                    break;
//case 7: System.out.print("");
//case 8: System.out.print("");
//case 9: System.out.print("");
//case 10: System.out.print("");
case 11: System.out.print("1. Alarm clock\n" + "2. Clock settings\n" + "3. Date settings\n" + "4. Stop watch\n" + "5. Countdown timer\n" + "6. Auto update of time and date"); 
break;
case 12: System.out.print("");
break;
case 13: System.out.print("");
break;











 

}


}
}





 
