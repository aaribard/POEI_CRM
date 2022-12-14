package model;

public class Paiement {
	
	private Long   id;
    private String numero_carte;
    private String code_confidentiel;
    private String banque;
    private Client client;
    
  //Constructeur
    
    public Paiement() {  
    	
    }
    
    public Paiement(String numero_carte, String code_confidentiel, String banque, Client client) {
    	this.numero_carte = numero_carte;
    	this.code_confidentiel = code_confidentiel;
    	this.banque = banque;
    	this.client = client;
    }

    //Getters & setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumero_carte() {
		return numero_carte;
	}

	public void setNumero_carte(String numero_carte) {
		this.numero_carte = numero_carte;
	}

	public String getCode_confidentiel() {
		return code_confidentiel;
	}

	public void setCode_confidentiel(String code_confidentiel) {
		this.code_confidentiel = code_confidentiel;
	}

	public String getBanque() {
		return banque;
	}

	public void setBanque(String banque) {
		this.banque = banque;
	}
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	@Override
	public String toString() {
		return getId() + " : " + getNumero_carte() + " " + getCode_confidentiel() + " - " + getBanque() + " - " + getClient().getNom() + " " + getClient().getPrenom();
	}
    
    
}

