package hu.cs.se.adjva.projectmanagement.service.company;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hu.cs.se.adjva.projectmanagement.Repository.CompanyRepository;
import hu.cs.se.adjva.projectmanagement.model.Company;

/**
 * CompanyServiceImp
 */@Service
public class CompanyServiceImp implements Companyservices {

    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public List<Company> getAllCompany() {
        
        List<Company> getAllcCompanies = companyRepository.findAll();
        return getAllcCompanies;
    }

    @Override
    public Company getCompanyById(Integer id) {
        return companyRepository.getOne(id);
    }

    @Override
    public Company addCompany(Company company) {
        
        return companyRepository.save(company);
    }

    @Override
    public void deleteCompanyt(Integer id) {
        
        companyRepository.deleteById(id);

    }

    

    
}