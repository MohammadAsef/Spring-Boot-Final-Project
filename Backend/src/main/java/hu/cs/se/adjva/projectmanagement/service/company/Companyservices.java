package hu.cs.se.adjva.projectmanagement.service.company;

import java.util.List;

import hu.cs.se.adjva.projectmanagement.model.Company;

/**
 * Companyservices
 */
public interface Companyservices {


    List<Company> getAllCompany();

    Company getCompanyById(Integer id);

    Company addCompany(Company company);

    void deleteCompanyt(Integer id);
}