
public class fonction {
	char ope;
	int resultat;
	
	if( ope == "+") 
		{
			resultat = addition(x, y);
		}
	else if( ope == "-") 
		{
			resultat = soustraction(x, y);
		}
	else if(ope == "*")
		{
			resultat = multiplication(x, y);
		}
	else if(ope == "/")
		{
			resultat = division(x, y);
		}
	
	System.out.println("le résultat est : " resultat);
}


public static int addition(int x, int y)
	{
		int somme = 0;
		somme = x + y;
		
		return somme;
	}

public static int soustraction(int x, int y)
{
	int difference = 0;
	difference = x - y;
	
	return difference;
}

public static int multiplication(int x, int y)
{
	int produit = 0;
	produit = x * y;
	
	return produit;
}

public static int division(int x, int y)
{
	int quotient = 0;
	quotient = x / y;
	
	return quotient;
}



