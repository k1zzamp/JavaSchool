import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
	public static void main(String[] args)
	{
		int		x;
		int		y;
		char	sign;

		if (args.length != 3)
		{
			System.out.println("Error");
			System.exit(1);
		}

		try
		{
			x = Integer.parseInt(args[0]);
			y = Integer.parseInt(args[2]);

			if (args[1].length() != 1)
				throw new Exception();
			sign = args[1].charAt(0);
			System.out.println(Calculate(x, y, sign));

		}
		catch (Exception e)
		{
			System.out.println("Error");
		}
	}

	public static int Calculate(int x, int y, char sign) throws Exception
	{
		if (sign == '/' && y == 0)
			throw new Exception();

		if (sign == '+')
			return (x + y);
		else if (sign == '-')
			return (x - y);
		else if (sign == '/')
			return (x / y);
		else if (sign == '%')
			return (x % y);
		else if (sign == '*')
			return (x * y);
		else
			throw new Exception();

	}
}
