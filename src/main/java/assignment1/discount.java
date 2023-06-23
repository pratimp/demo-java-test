package assignment1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class discount {
    public static void main(String[] args) {
        String paragraph = "A core i 7 laptop price is 85000 tk and a gaming mouse price is 2500 tk. If I buy the laptop and 1 piece mouse, what will be my total cost after giving 15% discount?";
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(paragraph);
        int laptopPrice = 0;
        int mousePrice = 0;
        if (matcher.find()) {
            laptopPrice = Integer.parseInt(matcher.group());
        }
        if (matcher.find()) {
            mousePrice = Integer.parseInt(matcher.group());
        }
        int totalCost = (int) ((laptopPrice + mousePrice) * 0.85);
        System.out.println("Total cost after discount: " + totalCost + " tk");
    }
}
