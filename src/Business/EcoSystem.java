/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Enterprise.EnterpriseDirectory;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class EcoSystem extends Organization {

    private static EcoSystem system;
    private ArrayList<Network> networkList;
    //private EnterpriseDirectory enterprisedir;

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    /* public EnterpriseDirectory getEnterprisedir() {
     return enterprisedir;
     }

     public void setEnterprisedir(EnterpriseDirectory enterprisedir) {
     this.enterprisedir = enterprisedir;
     }
     */
    public static EcoSystem getInstance() {
        if (system == null) {
            system = new EcoSystem();
        }
        return system;
    }

    private EcoSystem() {
        super(null);
        //enterprisedir=new EnterpriseDirectory();
        networkList = new ArrayList<>();

    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        SystemAdminRole role = new SystemAdminRole();
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(role);
        return roleList;
    }

    public Network createAndAddNetwork(String name) {
        Network network = new Network();
        network.setName(name);
        networkList.add(network);
        return network;
    }

}
