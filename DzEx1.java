package dz_sem5.java_homework4;

import java.util.LinkedList;
import java.util.logging.Logger;

// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
public class DzEx1 {
    public static void main(String[] args) {
        Logger logger = Logger.getAnonymousLogger();
        String[] str = {"дом", "собака", "кот", "дверь"};
        LinkedList<String> smthList = new LinkedList<>();
        for (int i = 0; i < str.length; i++) {
            smthList.add(str[i]);
        }
        System.out.println(smthList);
        logger.info(reverseList(smthList).toString());

    }

    public static LinkedList<String> reverseList(LinkedList<String> smthList) {
        for (int i = 0; i < smthList.size() / 2; i++) {
            String temp = smthList.get(i);
            smthList.set(i, smthList.get(smthList.size() - i - 1));
            smthList.set(smthList.size() - i - 1, temp);
        }
        return smthList;
    }
}
