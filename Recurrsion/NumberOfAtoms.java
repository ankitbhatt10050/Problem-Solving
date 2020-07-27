package Recurrsion;
import java.util.*;
class Shin{

    static int i;
public static String countOfAtoms(String formula) {
    StringBuilder ans = new StringBuilder();
    i = 0;
    Map<String, Integer> count = parse(formula);

    System.out.println(" Final Entered Map:- "+count);

    for (String name: count.keySet()) {
        ans.append(name);
        int multiplicity = count.get(name);
        if (multiplicity > 1) ans.append("" + multiplicity);
    }
    return new String(ans);
}

public static Map<String, Integer> parse(String formula) {
    int N = formula.length();
    Map<String, Integer> count = new TreeMap();
    while (i < N && formula.charAt(i) != ')') {
        if (formula.charAt(i) == '(') {
            i++;
            System.out.println(" Inside if before:- "+count);
            for (Map.Entry<String, Integer> entry: parse(formula).entrySet()) {
                count.put(entry.getKey(), count.getOrDefault(entry.getKey(), 0) + entry.getValue());
            }

            System.out.println(" After:- "+count);

        } else {
            int iStart = i++;
            while (i < N && Character.isLowerCase(formula.charAt(i))) i++;
            String name = formula.substring(iStart, i);
            iStart = i;
            while (i < N && Character.isDigit(formula.charAt(i))) i++;
            int multiplicity = iStart < i ? Integer.parseInt(formula.substring(iStart, i)) : 1;
            count.put(name, count.getOrDefault(name, 0) + multiplicity);
        }
    }
    int iStart = ++i;
    while (i < N && Character.isDigit(formula.charAt(i))) i++;
    if (iStart < i) {
        int multiplicity = Integer.parseInt(formula.substring(iStart, i));
        for (String key: count.keySet()) {
            count.put(key, count.get(key) * multiplicity);
        }
    }
    return count;
}  

    public static void main(String[]args)
        {
            String S="K4(ON(SO3)2)2";
            System.out.println(countOfAtoms(S));
        }


}