package CaseStudy;

import java.util.ArrayList;
import java.util.List;

public class HotelManage {
   static List<Hotel> customerList = new ArrayList<>();
    Hotel hotel = new Hotel();

    public void add(Hotel hotel) {
        customerList.add(hotel);
    }

    public void update(int id, Hotel hotel) {
        for (Hotel customerUpdate : customerList) {
            if (customerUpdate.customer.getId() == id) {

                customerUpdate.customer.setId(hotel.customer.getId());
                customerUpdate.customer.setPhoneNumber(hotel.customer.getPhoneNumber());
                customerUpdate.customer.setGender(hotel.customer.getGender());
                customerUpdate.customer.setBirthday(hotel.customer.getBirthday());
                customerUpdate.customer.setNameCustomer(hotel.customer.getNameCustomer());
//                customerUpdate.setChoiceTypeRoom(hotel.getChoiceTypeRoom());
//                customerUpdate.setNightStay(hotel.getNightStay());
                System.out.println("Cập nhật thành công");
            }
        }

    }

    public void read() {
        for (Hotel hotel : customerList) {
            System.out.println(hotel.toString());

        }
    }

    public void readByTypeRoom(String typeRoom) {
        System.out.println("Danh sách các khách hàng đang sử dụng phòng " + typeRoom + ":");
        for (Hotel hotel : customerList) {
            if (hotel.getChoiceTypeRoom().equals(typeRoom)) {
                System.out.println(hotel.toString());
            }
        }
    }

    public void checkOutRoom(int id) {
        for (Hotel customer : customerList) {
            if (customer.customer.getId() == id) {
                checkPrice(customer);
                System.out.println("-----------------------------------------------------------------------------------------------------------------");
                System.out.println("khách hàng " + customer.customer.getNameCustomer() + " đã ở " + customer.getNightStay() + " ngày, " + " với hạng phòng " + customer.getChoiceTypeRoom());
                System.out.println("số tiền cần thanh toán là " + customer.getTotal() + "Đ");
                System.out.println("-----------------------------------------------------------------------------------------------------------------");
                customerList.remove(customer);
                break;
            }
        }

    }

    public void findCustomerById(int id) {
        for (Hotel customer : customerList) {
            if (customer.customer.getId() == id) {
                System.out.println(customer.toString());
            }
        }
    }


    public void loadingBar(){
        for (int i = 0; i <= 300; i = i + 20) {
            LoadingBar.progressPercentage(i, 300);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }
    public void checkPrice(Hotel customer) {
        if (hotel.getStandard().equals(customer.getChoiceTypeRoom())) {
            customer.setTotal(customer.getNightStay() * customer.getStandardPrice());
        }
        if (hotel.getSuperior().equals(customer.getChoiceTypeRoom())) {
            customer.setTotal(customer.getNightStay() * customer.getSuperiorPrice());
        }
        if (hotel.getDeluxe().equals(customer.getChoiceTypeRoom())) {
            customer.setTotal(customer.getNightStay() * customer.getDeluxePrice());
        }
        if (hotel.getSuite().equals(customer.getChoiceTypeRoom())) {
            customer.setTotal(customer.getNightStay() * customer.getSuitePrice());
        }
        if (hotel.getPresident().equals(customer.getChoiceTypeRoom())) {
            customer.setTotal(customer.getNightStay() * customer.getPresidentPrice());
        }
        if (hotel.getRoyalSuite().equals(customer.getChoiceTypeRoom())) {
            customer.setTotal(customer.getNightStay() * customer.getRoyalSuitePrice());
        }
        if (hotel.getBungalow().equals(customer.getChoiceTypeRoom())) {
            customer.setTotal(customer.getNightStay() * customer.getBungalowPrice());
        }

    }

    public void resultRoomAvailability() {
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
        if (hotel.getStandardquantity() > 0) {
            System.out.println("*            " + hotel.getStandard().toUpperCase() + " ( số lượng phòng còn lại " + hotel.getStandardquantity() + " )                *");
        }

        if (hotel.getSuperiorquantity() > 0) {
            System.out.println("*            " + hotel.getSuperior().toUpperCase() + " ( số lượng phòng còn lại " + hotel.getSuperiorquantity() + " )                *");

        }

        if (hotel.getDeluxequantity() > 0) {
            System.out.println("*            " + hotel.getDeluxe().toUpperCase() + " ( số lượng phòng còn lại " + hotel.getDeluxequantity() + " )                  *");
        }
        if (hotel.getSuitequantity() > 0) {
            System.out.println("*            " + hotel.getSuite().toUpperCase() + " ( số lượng phòng còn lại " + hotel.getSuitequantity() + " )                   *");
        }
        if (hotel.getPresidentquantity() > 0) {
            System.out.println("*            " + hotel.getPresident().toUpperCase() + " ( số lượng phòng còn lại " + hotel.getPresidentquantity() + " )               *");

        }

        if (hotel.getRoyalSuitequantity() > 0) {
            System.out.println("*            " + hotel.getRoyalSuite().toUpperCase() + " ( số lượng phòng còn lại " + hotel.getRoyalSuitequantity() + " )              *");
        }

        if (hotel.getBungalowquantity() > 0) {
            System.out.println("*            " + hotel.getBungalow().toUpperCase() + " ( số lượng phòng còn lại " + hotel.getBungalowquantity() + " )                *");
        }
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
    }


}
