package br.poo.geradorestatisticasbr;

public class EstatisticaFaltasCartoes {
	
	private int totalCartoesAmarelosTimeVisitante;
	private int totalCartoesVermelhosTimeVisitante;
	private int totalCartoesAmarelosTimeMandante;
	private int totalCartoesVermelhosTimeMandante;
	private int totalFaltasTimeVisitante;
	private int totalFaltasTimeMandante;
	
	public int getTotalCartoesAmarelosTimeVisitante() {
		return totalCartoesAmarelosTimeVisitante;
	}

	public int getTotalCartoesVermelhosTimeVisitante() {
		return totalCartoesVermelhosTimeVisitante;
	}

	public int getTotalCartoesAmarelosTimeMandante() {
		return totalCartoesAmarelosTimeMandante;
	}

	public int getTotalCartoesVermelhosTimeMandante() {
		return totalCartoesVermelhosTimeMandante;
	}

	public int getTotalFaltasTimeVisitante() {
		return totalFaltasTimeVisitante;
	}

	public int getTotalFaltasTimeMandante() {
		return totalFaltasTimeMandante;
	}

	public int getTotalFaltas() {
		return totalFaltasTimeVisitante + totalFaltasTimeMandante;
	}
	
	public double getPorcentagemFaltasTimeVisitante() {
		return ((double)totalFaltasTimeVisitante / getTotalFaltas()) * 100;
	}
	
	public double getPorcentagemFaltasTimeMandante() {
		return ((double)totalFaltasTimeMandante / getTotalFaltas()) * 100;
	}
	
	public EstatisticaFaltasCartoes(int totalCartoesAmarelosTimeVisitante, int totalCartoesVermelhosTimeVisitante,
			int totalCartoesAmarelosTimeMandante, int totalCartoesVermelhosTimeMandante, int totalFaltasTimeVisitante,
			int totalFaltasTimeMandante) {
		super();
		this.totalCartoesAmarelosTimeVisitante = totalCartoesAmarelosTimeVisitante;
		this.totalCartoesVermelhosTimeVisitante = totalCartoesVermelhosTimeVisitante;
		this.totalCartoesAmarelosTimeMandante = totalCartoesAmarelosTimeMandante;
		this.totalCartoesVermelhosTimeMandante = totalCartoesVermelhosTimeMandante;
		this.totalFaltasTimeVisitante = totalFaltasTimeVisitante;
		this.totalFaltasTimeMandante = totalFaltasTimeMandante;
	}

	public String imprimir() {
		return "Total de Faltas: " + this.getTotalFaltas() + System.lineSeparator() +
			"O time mandante teve " + this.getPorcentagemFaltasTimeMandante() + "% das faltas do jogo" + System.lineSeparator() +
			"O time visitante teve " + this.getPorcentagemFaltasTimeVisitante() + "% das faltas do jogo" + System.lineSeparator() +
			"Total de cartões amarelos do time visitante: " + this.getTotalCartoesAmarelosTimeVisitante() + System.lineSeparator() +
			"Total de cartões vermelhos do time visitante: " + this.getTotalCartoesVermelhosTimeVisitante() + System.lineSeparator() +
			"Total de cartões amarelos do time mandante: " + this.getTotalCartoesAmarelosTimeMandante() + System.lineSeparator() +
			"Total de cartões vermelhos do time mandante: " + this.getTotalCartoesVermelhosTimeMandante() + System.lineSeparator();
	}
}
