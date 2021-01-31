package sample08.rh;

public class Cliente implements IAutenticavel {
	public static final String MASTER_KEY = "123";
	public static final String SU = "su";

	@Override
	public boolean autentica(String login, String senha) {
		return login.equals(SU) && senha.equals(MASTER_KEY);
	}

}
