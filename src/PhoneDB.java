import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneDB {
    public static void main(String[] args) throws IOException{
        HashMap<String,ArrayList<String>> phoneDB = getPhoneDB();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Укажите имя в формате Фамилия И.О.: ");
        String fio = br.readLine();

        Map.Entry<String,ArrayList<String>> record = findRecord(fio);
        printRecord(record);
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

    }

    public static Map.Entry<String,ArrayList<String>> findRecord(String fio){
        return null;
    }
}
