package game2dms;

/**
 *
 * @author alex
 */

import javax.swing.JPanel;

public abstract class Contexto extends JPanel implements MudancaEstadoListener {
	
	private Estado estadoAtual = null;

	public Contexto( Estado estadoInicial ) {
		estadoAtual = estadoInicial;
	}
	
	public Estado getEstadoAtual() {
		return estadoAtual;
	}
	
	public void start() {
		estadoAtual.setListener(this);
		estadoAtual.init();
		this.addKeyListener(estadoAtual.getKeyListener());
		this.addMouseListener(estadoAtual.getMouseListener());
	}
	
	public void pausar() {
		estadoAtual.setPausado(true);
	}
	
	public void liberar() {
		estadoAtual.setPausado(false);
	}
	
	public void estadoMudou( Estado proximoEstado ) {
		estadoAtual.cleanup();
		this.removeKeyListener(estadoAtual.getKeyListener());
		this.removeMouseListener(estadoAtual.getMouseListener());
		if( proximoEstado != null ) {
			
			proximoEstado.setEstadoAnterior(estadoAtual);
			proximoEstado.init();
			this.addKeyListener(proximoEstado.getKeyListener());
			this.addMouseListener(proximoEstado.getMouseListener());
			proximoEstado.setListener(this);
			estadoAtual = proximoEstado;
		}
	}
}
