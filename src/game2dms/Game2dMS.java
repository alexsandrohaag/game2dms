package game2dms;

import java.awt.Graphics;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;

public class Game2dMS extends JFrame {

	private static final String DISPLAY_STRING = "Game2D MS";

	private BufferedImage backbuffer = null;

	private Timer timer = new Timer();
                
	private boolean wndResized = true;

	private Estado estadoInicial = new IntroState();
	
	private Contexto jogo = new ContextoJogo();

	public Game2dMS() {
		super("Game2D FSM");

		getContentPane().add( jogo );
		
		addComponentListener(
			new ComponentAdapter() {
				public void componentResized(ComponentEvent e) {
					wndResized = true; 
				}
			});

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {

				timer.cancel();

				setVisible(false); 

				dispose(); 

				System.exit(0);

			}
		});

		setSize(640, 480);
		setVisible(true);

		init();
	}

	public void init() {

		jogo.requestFocus();
		
		jogo.start();

		TimerTask renderTask = new TimerTask() {

			public void run() {
		
				if (backbuffer == null || wndResized) {
					backbuffer = new BufferedImage(getWidth(), getHeight(),
							BufferedImage.TYPE_INT_ARGB);
					wndResized = false;
				}
		

				Graphics g = backbuffer.getGraphics();
		
				jogo.getEstadoAtual().render(g);
		
				jogo.getGraphics().drawImage(backbuffer, 0, 0, null);
		
				g.clearRect(0, 0, backbuffer.getWidth(), 
						backbuffer.getHeight());
			}
		};

		timer.schedule(renderTask, 100, 16);
	}
	
	public class ContextoJogo extends Contexto {

		public ContextoJogo() {
			super(estadoInicial);
		}

		public void exit() {
			onExit();			
		}
		
	}
	
	public class IntroState extends Estado {

		public void init() {	
			setMouseListener( new MouseAdapter() {
				public void mouseClicked( MouseEvent e ) {
					getListener().estadoMudou(new EstadoJogo());
				}
			});
		}

		public void render(Graphics g) {
			g.drawString("Dentro do Estado",100,100);
		}

		public void cleanup() {
			// TODO 			
		}

		protected void concreteUpdate(long dt) {
			// TODO 			
		}

	}

	public class EstadoJogo extends Estado {

		public void init() {

			setKeyListener( new KeyAdapter() {
				public void keyPressed( KeyEvent e ) {
					if( e.getKeyCode() == KeyEvent.VK_ESCAPE ) {
						getListener().exit();
					}
				}
			});
			setMouseListener(new MouseAdapter() {
				public void mouseClicked( MouseEvent e ) {
					getListener().estadoMudou(getEstadoAnterior());
				}
			});
		}

		public void render(Graphics g) {
			g.drawString("Estado do jogo em ",100,100);
			
		}

		public void cleanup() {
			// TODO 
			
		}

		protected void concreteUpdate(long dt) {
			// TODO 
			
		}

	}
	
	public static void main(String[] args) {
		new Game2dMS();
	}

	public void onExit() {

		timer.cancel();
		
		setVisible(false);
		
		dispose();
		
		System.exit(0);
	}

}
