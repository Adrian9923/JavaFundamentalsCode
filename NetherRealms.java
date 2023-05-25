package RegularExpressions;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NetherRealms {

    static class Demon {
        String name;
        int hp;
        double damage;

        public Demon(String name, int hp, double damage) {
            this.name = name;
            this.hp = hp;
            this.damage = damage;
        }

        @Override
        public String toString() {
            return String.format("%s - %d health, %.2f damage",this.name,this.hp,this.damage);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Demon> demonsList = new ArrayList<>();
        String input = scanner.nextLine();
        String[] demons = input.split(",\\s*");
        for (String demon : demons) {
            int health = 0;
            String name = "";
            String regexName = "[A-Za-z]";
            Pattern pattern = Pattern.compile(regexName);
            Matcher matcher = pattern.matcher(demon);
            while (matcher.find()){
                name += matcher.group();
            }
            for (int i = 0; i < name.length(); i++) {
                char letter = name.charAt(i);
                health += letter;
            }
            double extractedSumNum = sumNum(demon);
            double damage = calcDamage(demon);
            double totalDamage = extractedSumNum * damage;
            Demon demon1 = new Demon(demon,health,totalDamage);
            demonsList.add(demon1);
        }
        demonsList.sort((n1,n2)->n1.name.compareTo(n2.name));
        for (Demon demon : demonsList) {
            System.out.println(demon);
        }


    }

    public static double sumNum(String command) {
        double sum = 0;
        String regex = "-?\\d\\.?\\d?";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(command);
        while (matcher.find()) {
            sum += Double.parseDouble(matcher.group());
        }
        return sum;
    }

    public static double calcDamage(String command) {
        double damage = 1;
        String regex = "\\*|\\/";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(command);
        while (matcher.find()){
            switch (matcher.group()) {
                case "*": {
                    damage *= 2;
                    break;
                }
                case "/": {
                    damage /= 2;
                    break;
                }
            }
        }
        return damage;
    }

}
