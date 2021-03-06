import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneDB {
    private final static String PHONE_ABSCENT = "Такого ФИО в БД нет";

    private HashMap<String,ArrayList<String>> phoneDB = getPhoneDB();

    public void findAndPrint(String fio){
        Map.Entry<String,ArrayList<String>> record = findRecord(fio);
        if (record!=null){
            printRecord(record);
        }else System.out.println(PHONE_ABSCENT);
    }

    private HashMap<String,ArrayList<String>>  getPhoneDB(){
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

        //Пользователь без телефонов
        phones = new ArrayList<String>();
        ret.put("Кузнецов К.К.",phones);

        return ret;
    }

    private void printRecord(Map.Entry<String,ArrayList<String>> record){
        if (record.getValue()==null || record.getValue().size()==0){
            System.out.println(PHONE_ABSCENT);
            return;
        }
        int i=1;
        for(String tel:record.getValue()){
            System.out.println(String.format("%d. %s",i++,tel));
        }
    }

    private Map.Entry<String,ArrayList<String>> findRecord(String fio){
        for(Map.Entry<String,ArrayList<String>> currRecord:phoneDB.entrySet()){
            if(currRecord.getKey().toLowerCase().equals(fio.toLowerCase())){
                return currRecord;
            }
        }
        return null;
    }
}
