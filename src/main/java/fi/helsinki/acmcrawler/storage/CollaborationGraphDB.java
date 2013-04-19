package fi.helsinki.acmcrawler.storage;

import fi.helsinki.acmcrawler.domain.Node;
import java.util.List;

/**
 * Defines the interface for collaboration graph database.
 *
 * @author rodionefremov
 * @version I
 */
public interface CollaborationGraphDB<T extends Node<T>> {
    boolean addAuthor(String id, String name);
    boolean addPaper(String id, String name);
    boolean addBibtexToPaper(String id, String bibtex);
    boolean associate(String authorId, String paperId);

    List<T>         listAllAuthors();
    List<String>    listAllBibtexReferences();
}
