package dz_sem5.java_homework4;

import java.util.*;
import java.util.logging.Logger;

//Реализуйте очередь с помощью LinkedList со следующими методами:enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя
public class DzEx2 {
    public static void main(String[] args) {
        Logger logger = Logger.getAnonymousLogger();
        String[] str = {"дом", "собака", "кот", "дверь"};
        LinkedList<String> smthList = new LinkedList<>();
        for (int i = 0; i < str.length; i++) {
            smthList.add(str[i]);
        }
        System.out.println(smthList);
        logger.info(enqueue(smthList, "пряник").toString());
        logger.info(dequeue(smthList));
        logger.info(first(smthList));
    }

    //Так как в задание сказано помещать эллемент в конец очереди, будем считать, что иммеется ввиду добовление нового,
    //эллемента в конец очереди, так как иначе должна быть формулировка "перемещает"
    public static LinkedList<String> enqueue(LinkedList<String> smthList, String num) {
        smthList.add(num);
        return smthList;
    }

    public static String dequeue(LinkedList<String> smthList) {
        System.out.println(smthList.get(0));
        String temp = smthList.get(0);
        smthList.remove(0);
        return temp;
    }

    public static String first(LinkedList<String> smthList) {
        System.out.println(smthList.get(0));
        String temp = smthList.get(0);
        smthList.remove(0);
        return temp;


    }
}
