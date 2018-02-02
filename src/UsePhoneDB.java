import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class UsePhoneDB {
    public final static String PROMPT_FIO = "Укажите имя в формате Фамилия И.О.: ";

    public static void main(String[] args) throws IOException{
        PhoneDB phoneDB = new PhoneDB();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(PROMPT_FIO);
        String fio="";
        while(fio.length()==0){
            fio=br.readLine();
        }
        phoneDB.findAndPrint(fio);
    }
}
