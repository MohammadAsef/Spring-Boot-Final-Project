package hu.cs.se.adjva.projectmanagement.service.store;

import java.util.List;

import hu.cs.se.adjva.projectmanagement.model.Store;

/**
 * StoreServices
 */
public interface StoreServices {
    
    
    List<Store> getAllStore();

    Store getStoreById(Integer id);

    Store addStore(Store store);

    void deleteStore(Integer id);

}