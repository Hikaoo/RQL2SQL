package br.edu.ifsp.syntacticTree.interfaces;

import br.edu.ifsp.parser.Token;

/** Interface for all node children types
 * @author Lucas Venezian, D�rick Welman
 */
public interface NodeChildren {
	public Token getFirstToken();
	public int getNumber();
	public void setNumber(int number);
}
