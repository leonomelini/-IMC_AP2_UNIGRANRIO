package control;

public class CalculadoraIMC {

	private int idade;
	private String sexo;
	private boolean gravida;
	private double altura;
	private double peso;

	public CalculadoraIMC(int idade, String sexo, boolean gravida, double altura, double peso) {
		this.idade = idade;
		this.sexo = sexo;
		this.gravida = gravida;
		this.altura = altura;
		this.peso = peso;	
	}

	public String classificacaoImcGeral(double imc) {

		if (this.peso > 0 && this.altura > 0) {

			if (idade < 0)
				return "Valor inv�lido";

			else if (this.gravida == true && this.sexo.compareTo("Masculino") == 0)
				return "Algo n�o est� certo, sexo masculino n�o pode engravidar";

			else if (this.idade < 20 && this.sexo.compareTo("Feminino") == 0)
				return classificacaoImcMeninas(imc);

			else if (this.idade < 20 && this.sexo.compareTo("Masculino") == 0)
				return classificacaoImcMeninos(imc);

			else if (this.idade > 65 && this.sexo.compareTo("Feminino") == 0)
				return classificacaoImcMulheresIdosas(imc);

			else if (this.idade > 65 && this.sexo.compareTo("Masculino") == 0)
				return classificacaoImcHomensIdosos(imc);

			else if (this.gravida == true && this.sexo.compareTo("Feminino") == 0)
				return classificacaoImcMulherGravida(imc);

		}

		if (this.sexo.compareToIgnoreCase("Masculino") == 0 || this.sexo.compareToIgnoreCase("Feminino") == 0) {

			String classificador = "IMC n�o classificado";

			if (this.idade >= 20 && this.idade <= 65) {

				if (imc < 16)
					classificador = "Baixo peso muito grave";
				else if (imc <= 16.99)
					classificador = "Baixo peso grave";
				else if (imc <= 18.49)
					classificador = "Baixo peso";
				else if (imc <= 24.99)
					classificador = "Peso normal";
				else if (imc <= 29.99)
					classificador = "Sobrepeso";
				else if (imc <= 34.99)
					classificador = "Obesidade grau I";
				else if (imc <= 39.99)
					classificador = "Obesidade grau II";
				else
					classificador = "Obesidade grau III (Obesidade m�rbida)";
			}

			return classificador;
		}

		else
			return "Valores inv�lidos devido ao g�nero escolhido";

	}

	public String classificacaoImcMeninos(double imc) {

		String classificador = "IMC n�o classificado";

		if (this.sexo.compareTo("Masculino") == 0) {

			if (this.idade <= 2) {

				if (imc < 15)
					classificador = "Baixo peso";

				else if (imc <= 18)
					classificador = "Peso normal";

				else if (imc <= 21)
					classificador = "Sobrepeso";

				else
					classificador = "Obesidade";

			}

			if (this.idade <= 4) {

				if (imc < 14)
					classificador = "Baixo peso";

				else if (imc <= 17)
					classificador = "Peso normal";

				else if (imc <= 18)
					classificador = "Sobrepeso";

				else
					classificador = "Obesidade";

			}

			if (this.idade <= 6) {

				if (imc < 14)
					classificador = "Baixo peso";

				else if (imc <= 17)
					classificador = "Peso normal";

				else if (imc <= 18.3)
					classificador = "Sobrepeso";

				else
					classificador = "Obesidade";

			}

			if (this.idade <= 8) {

				if (imc < 14)
					classificador = "Baixo peso";

				else if (imc <= 18)
					classificador = "Peso normal";

				else if (imc <= 20)
					classificador = "Sobrepeso";

				else
					classificador = "Obesidade";

			}

			if (this.idade <= 10) {

				if (imc < 14.5)
					classificador = "Baixo peso";

				else if (imc <= 19)
					classificador = "Peso normal";

				else if (imc <= 22)
					classificador = "Sobrepeso";

				else
					classificador = "Obesidade";

			}

			if (this.idade <= 12) {

				if (imc < 15.2)
					classificador = "Baixo peso";

				else if (imc <= 21)
					classificador = "Peso normal";

				else if (imc <= 23)
					classificador = "Sobrepeso";

				else
					classificador = "Obesidade";

			}

			if (this.idade <= 14) {

				if (imc < 16.3)
					classificador = "Baixo peso";

				else if (imc <= 22.5)
					classificador = "Peso normal";

				else if (imc <= 26)
					classificador = "Sobrepeso";

				else
					classificador = "Obesidade";

			}

			if (this.idade <= 16) {

				if (imc < 16.8)
					classificador = "Baixo peso";

				else if (imc <= 24)
					classificador = "Peso normal";

				else if (imc <= 26.5)
					classificador = "Sobrepeso";

				else
					classificador = "Obesidade";

			}

			if (this.idade <= 18) {

				if (imc < 18.9)
					classificador = "Baixo peso";

				else if (imc <= 25.7)
					classificador = "Peso normal";

				else if (imc <= 27.9)
					classificador = "Sobrepeso";

				else
					classificador = "Obesidade";

			}

			else {

				if (imc < 18.9)
					classificador = "Baixo peso";

				else if (imc <= 25.7)
					classificador = "Peso normal";

				else if (imc <= 27.9)
					classificador = "Sobrepeso";

				else
					classificador = "Obesidade";

			}

			return classificador;

		}

		else
			return classificacaoImcMeninas(imc);

	}

	public String classificacaoImcMeninas(double imc) {

		String classificador = "IMC n�o classificado";
		
		if (this.gravida == true)
			return classificacaoImcMulherGravida(imc);

		if (this.sexo.compareTo("Feminino") == 0) {

			if (this.idade <= 2) {

				if (imc < 15)
					classificador = "Baixo peso";

				else if (imc <= 18)
					classificador = "Peso normal";

				else if (imc <= 20)
					classificador = "Sobrepeso";

				else
					classificador = "Obesidade";

			}

			if (this.idade <= 4) {

				if (imc < 14)
					classificador = "Baixo peso";

				else if (imc <= 17)
					classificador = "Peso normal";

				else if (imc <= 18)
					classificador = "Sobrepeso";

				else
					classificador = "Obesidade";

			}

			if (this.idade <= 6) {

				if (imc < 14)
					classificador = "Baixo peso";

				else if (imc <= 17)
					classificador = "Peso normal";

				else if (imc <= 19)
					classificador = "Sobrepeso";

				else
					classificador = "Obesidade";

			}

			if (this.idade <= 8) {

				if (imc < 14)
					classificador = "Baixo peso";

				else if (imc <= 18)
					classificador = "Peso normal";

				else if (imc <= 20.7)
					classificador = "Sobrepeso";

				else
					classificador = "Obesidade";

			}

			if (this.idade <= 10) {

				if (imc < 14.5)
					classificador = "Baixo peso";

				else if (imc <= 20)
					classificador = "Peso normal";

				else if (imc <= 23)
					classificador = "Sobrepeso";

				else
					classificador = "Obesidade";

			}

			if (this.idade <= 12) {

				if (imc < 15.5)
					classificador = "Baixo peso";

				else if (imc <= 21.8)
					classificador = "Peso normal";

				else if (imc <= 25)
					classificador = "Sobrepeso";

				else
					classificador = "Obesidade";

			}

			if (this.idade <= 14) {

				if (imc < 16.3)
					classificador = "Baixo peso";

				else if (imc <= 23.2)
					classificador = "Peso normal";

				else if (imc <= 27)
					classificador = "Sobrepeso";

				else
					classificador = "Obesidade";

			}

			if (this.idade <= 16) {

				if (imc < 17.2)
					classificador = "Baixo peso";

				else if (imc <= 24.7)
					classificador = "Peso normal";

				else if (imc <= 29)
					classificador = "Sobrepeso";

				else
					classificador = "Obesidade";

			}

			if (this.idade <= 18) {

				if (imc < 18.2)
					classificador = "Baixo peso";

				else if (imc <= 25.7)
					classificador = "Peso normal";

				else if (imc <= 30.2)
					classificador = "Sobrepeso";

				else
					classificador = "Obesidade";

			}

			else {

				if (imc < 18.5)
					classificador = "Baixo peso";

				else if (imc <= 26.5)
					classificador = "Peso normal";

				else if (imc <= 32.7)
					classificador = "Sobrepeso";

				else
					classificador = "Obesidade";

			}

			return classificador;
		}

		return classificacaoImcMeninos(imc);

	}

	public String classificacaoImcHomensIdosos(double imc) {

		String classificador = "IMC n�o classificado";

		if (this.sexo.compareTo("Masculino") == 0) {

			if (this.idade > 65) {

				if (imc < 21.9)
					classificador = "Baixo peso";
				else if (imc <= 27)
					classificador = "Peso normal";
				else if (imc <= 30)
					classificador = "Sobrepeso";
				else if (imc <= 35)
					classificador = "Obesidade grau I";
				else if (imc <= 39.9)
					classificador = "Obesidade grau II";
				else
					classificador = "Obesidade grau III (Obesidade m�rbida)";

			}

			else if (this.idade <= 20)
				return classificacaoImcMeninos(imc);
			else
				return classificacaoImcGeral(imc);

		}

		return classificador;

	}

	public String classificacaoImcMulheresIdosas(double imc) {

		String classificador = "IMC n�o classificado";

		if (this.gravida == true)
			return classificacaoImcMulherGravida(imc);
			
		if (this.sexo.compareTo("Feminino") == 0) {

			if (this.idade > 65) {

				if (imc < 21.9)
					classificador = "Baixo peso";
				else if (imc <= 27)
					classificador = "Peso normal";
				else if (imc <= 32)
					classificador = "Sobrepeso";
				else if (imc <= 37)
					classificador = "Obesidade grau I";
				else if (imc <= 41.9)
					classificador = "Obesidade grau II";
				else
					classificador = "Obesidade grau III (Obesidade m�rbida)";

			}

			else if (this.idade <= 20)
				return classificacaoImcMeninas(imc);
			else
				return classificacaoImcGeral(imc);
		}

		return classificador;
	}

	public String classificacaoImcMulherGravida(double imc) {

		String classificador = "IMC n�o classificado";

		if (this.sexo.compareTo("Feminino") == 0) {

			if (this.gravida == true) {

				if (imc < 18.5)
					classificador = "Baixo peso";
				else if (imc <= 24.9)
					classificador = "Peso normal";
				else if (imc <= 29.9)
					classificador = "Sobrepeso";
				else
					classificador = "Obesidade";
			}

			else
				return classificacaoImcGeral(imc);
		}

		return classificador;
	}

	public double calculaImc() {
		double imc = this.peso / (Math.pow(this.altura, 2));
		return imc;
	}

}
