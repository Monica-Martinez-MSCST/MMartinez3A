package edu.southeastmn.mmartinez.mmartinez3a;
import java.text.DecimalFormat;

/**
 * Created by moki on 4/3/2017.
 */

public class Loops {
    private int max;

    public Loops(int max)
    {
        this.max = max;
    }

    public String whileLoop()
    {
        DecimalFormat fmt = new DecimalFormat("  00");
        String output = "While Loop\nCount\tSum\n=====\t=====\n";
        int i = 1, total = 0;
        while (i < max)
        {
            total += i;
            output += fmt.format(i) + '\t' + fmt.format(total) + '\n';
            i++;
        }
        return output;
    }

    public String dowhileLoop()
    {
        DecimalFormat fmt = new DecimalFormat("  00");
        String output = "Do While Loop\nCount\tSum\n=====\t=====\n";
        int i = 1, total = 0;
        do
        {
            total += i;
            output += fmt.format(i) + '\t' + fmt.format(total) + '\n';
            i++;
        }
        while (i < max);

        return output;
    }

    public String forLoop()
    {
        DecimalFormat fmt = new DecimalFormat("  00");
        String output = "For Loop\nCount\tSum\n=====\t=====\n";
        int total = 0;
        for(int i = 1; i < max; i++)
        {
            total += i;
            output += fmt.format(i) + '\t' + fmt.format(total) + '\n';
        }
        return output;

    }
}
