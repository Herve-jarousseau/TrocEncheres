package fr.eni.encheres.dal;

import java.util.List;

import fr.eni.encheres.BusinessException;
import fr.eni.encheres.bo.Article;

/**
 * Interface de la couche DAL permettant de lister les méthodes (CRUD) des requetes à la base de données concernant l'entité enchères (articles, retrait, et encheres).
 * @author Groupe 3
 *
 */
public interface EnchereDAO {
	
	// Selection de toutes les enchères.
	public List<Article> selectAllSales() throws BusinessException;


}
