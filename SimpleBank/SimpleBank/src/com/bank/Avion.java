package com.bank;

public class Avion {
		
	    private String matricula;
	    private String marca;
	    private int id;
	   public Avion(int id, String matricula, String marca) {
		   this.id=id;
		   this.matricula=matricula;
		   this.marca=marca;
	   }


	    public String getMarca() {
	        return marca;
	    }
	    public void setMarca(String marca) {
	        this.marca = marca;
	    }
	    public int getId() {
	        return id;
	    }
	    public void setId(int id) {
	        this.id = id;
	    }
	    public String getMatricula() {
	        return matricula;
	    }
	    public void setMatricula(String matricula) {
	        this.matricula = matricula;
	    }

	    @Override
	    public String toString() {
	        return "Avion [ marca=" + marca + ", id=" + id + ", matricula=" + matricula + "]";
	    }

	}

	



