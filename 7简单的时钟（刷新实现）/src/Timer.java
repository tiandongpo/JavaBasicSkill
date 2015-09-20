public abstract class Citizen
{
	List pols;
	String help = "normal";
	public void setHelp(String help)
	{
		this.help=help;

	}

	public void getHelp()
	{
		return this.help;
	}

	abstract void sedMessage(String help);
	public void setPolicemen()
	{
		this.pols=new ArrayList();

	}
	public void register(Policeman pol)
	{
		this.pols.add(pol);
	}
	public void unRegister(Policeman pol)
	{
		this.pols.remove(pol);
	}



}



public interface Policeman
{
	void action(Citizen ci);
}

public class HuangPuCitizen extends Citizen
{
	public HuangPuCitizen(Policeman pol)
	{
		setPolicemen();
		register(pol);
	}

	public void sedMessage(String help)
	{
		setHelp(help);
		for(int i=0;i<pols.size();i++)
		{
			Policeman pol = pols.get(i);
			//通知警察行动
			pol.action(this);
		}
	}
}

public class TianHeCitizen extends Citizen
{
	public TianHeCitizen(Policeman pol)
	{
		setPolicemen();
		register(pol);
	}

	public void sendMessage(String help)
	{
		setHel(help);
		for(int i=0;i<pols.size;i++)
		{
			Policeman pol = pols.get(i);
			//通知警察行动
			pol.aciton(this);
		}
	}
}


public class HuangPuCitizenPoliceman implements Policeman
{
	public void action(Citizen ci)
	{
		String help = ci.getHelp();
		if(help.equal("normal"))
		{
			System.out.println("一切正常，不用出动");
		}
		if(help.euqal("unnormal"))
		{
			System.out.println("有法犯罪行为，黄埔经常出动");
		}
	}
}

public class TianHeCitizenPolice implements Policeman
{"
	public void action(Citizen ci)
	{
		String help = ci.getHelp();
		if(help.equal("normal"))
		{
			System.out.println("一切正常，不用出动");

		}
		if(help.equals("unnormal"))
			{
				System.out.println("有犯罪行为，天河警察出动");
			}
	}
}


public class Text
{
	public static void main(String args)
	{
		Policeman thPol = new TianHeCitizenPoliceman();
		Policeman hpPol = new HuangPuCitizenPoliceman();


		Citizen citizen = new HuangPuCitizen(hpPol);
		citizen.sendMessage = ("unnormal");
		citizen.sendMessage = ("normal");

		system.out.println("================");


		citizen = new TianHeCitizen(thPol);
		citizen.sendMessage("normal");
		citizen.sendMessage("unnormal");
	}
}