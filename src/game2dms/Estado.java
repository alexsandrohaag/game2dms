package game2dms;

/**
 *
 * @author alex
 */


import java.awt.Graphics;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;

    
public abstract class Estado {

	private boolean pausado = false;
	private MudancaEstadoListener listener = null;
	private Estado estadoAnterior = null;
	private KeyListener keyListener = null;
	private MouseListener mouseListener = null;
	
	public abstract void init();
	public abstract void render( Graphics g );
	public abstract void cleanup();
	protected abstract void concreteUpdate( long dt );
	
	public Estado() {
		super();
	}
	
	public final void update( long dt ) {
		if( !pausado ) {
			concreteUpdate( dt );
		}
	}
	
	public MudancaEstadoListener getListener() {
		return listener;
	}

	public void setListener(MudancaEstadoListener listener) {
		this.listener = listener;
	}

	public Estado getEstadoAnterior() {
		return estadoAnterior;
	}
	
	public void setEstadoAnterior(Estado estadoAnterior) {
		this.estadoAnterior = estadoAnterior;
	}
	
	public final boolean emPausa() {
		return pausado;
	}

	public final void setPausado(boolean pausado) {
		this.pausado = pausado;
	}
	
	public final KeyListener getKeyListener() {
		return keyListener;
	}
	
	public final void setKeyListener(KeyListener keyListener) {
		this.keyListener = keyListener;
	}
	
	public final MouseListener getMouseListener() {
		return mouseListener;
	}
	
	public final void setMouseListener(MouseListener mouseListener) {
		this.mouseListener = mouseListener;
	}

	
}
