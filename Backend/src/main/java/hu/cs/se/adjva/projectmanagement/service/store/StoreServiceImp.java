package hu.cs.se.adjva.projectmanagement.service.store;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hu.cs.se.adjva.projectmanagement.Repository.StoreRepository;
import hu.cs.se.adjva.projectmanagement.model.Store;

@Service
public class StoreServiceImp implements StoreServices {

    @Autowired
    private StoreRepository storeRepository;

    @Override
    public List<Store> getAllStore() {

        return storeRepository.findAll();
    }

    @Override
    public Store getStoreById(Integer id) {
        return storeRepository.getOne(id);
    }

    @Override
    public Store addStore(Store store) {
        return storeRepository.save(store);
    }

    @Override
    public void deleteStore(Integer id) {
        storeRepository.deleteById(id);
    }


    
}
