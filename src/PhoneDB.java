import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneDB {
    public static void main(String[] args){
        HashMap<String,ArrayList<String>> phoneDB = getPhoneDB();

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

        return new HashMap<String,ArrayList<String>>();
    }

    
}
