import com.sun.javafx.binding.StringFormatter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneDB {
    final static String PHONE_ABSCENT = "Такого ФИО в БД нет";

    public static void main(String[] args) throws IOException{
        HashMap<String,ArrayList<String>> phoneDB = getPhoneDB();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Укажите имя в формате Фамилия И.О.: ");
        String fio = br.readLine();

        Map.Entry<String,ArrayList<String>> record = findRecord(fio);
        if (record!=null){
            printRecord(record);
        }else{
            System.out.println(PHONE_ABSCENT);
        }

    }

    public static HashMap<String,ArrayList<String>>  getPhoneDB(){
        HashMap<String,ArrayList<String>> ret = new HashMap<String,ArrayList<String>>();

        ArrayList<String> phones = new ArrayList<String>();
        phones.add("+8 800 2000 500");
        phones.add("+8 800 200 600");
        ret.put("Иванов И.И.",phones);

        phones = new ArrayList<String>();
        phones.add("+8 800 2000 700");
        ret.put("Петров П.П.",phones);

        phones = new ArrayList<String>();
        phones.add("+8 800 2000 800");
        phones.add("+8 800 2000 900");
        phones.add("+8 800 2000 000");
        ret.put("Сидоров С.С.",phones);

        return ret;
    }

    public static void printRecord(Map.Entry<String,ArrayList<String>> record){
        if (record.getValue().size()==0){
            System.out.println(PHONE_ABSCENT);
            return;
        }
        int i=1;
        for(String tel:record.getValue()){
            System.out.println(String.format("%d. %s",i++,tel));
        }
    }

    public static Map.Entry<String,ArrayList<String>> findRecord(String fio){
        return null;
    }
}
