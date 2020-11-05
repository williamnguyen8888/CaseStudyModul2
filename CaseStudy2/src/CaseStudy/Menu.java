package CaseStudy;

import java.time.LocalDate;
import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);

    public Hotel addNewCustomer() {
        Hotel hotelManage = new Hotel();
        System.out.println("Mời bạn nhập tên của khách hàng");
        hotelManage.customer.setNameCustomer(scanner.nextLine());
        System.out.println("Mời bạn nhập số chứng minh thư của khách hàng " + hotelManage.customer.getNameCustomer());
        hotelManage.customer.setId(Integer.parseInt(scanner.nextLine()));
        System.out.println("mời bạn nhập ngày tháng năm sinh của khách hàng " + hotelManage.customer.getNameCustomer() + " theo định dạng yyyy-mm-dd");
        hotelManage.customer.setBirthday(LocalDate.parse(scanner.nextLine()));
        System.out.println("Mời bạn nhập giới tính của khách hàng " + hotelManage.customer.getNameCustomer());
        hotelManage.customer.setGender(scanner.nextLine());
        System.out.println("Mời bạn nhập số điện thoại liên lạc của khách hàng " + hotelManage.customer.getNameCustomer());
        hotelManage.customer.setPhoneNumber(Integer.parseInt(scanner.nextLine()));
        System.out.println("Mời bạn Nhập hạng phòng của khách hàng " + hotelManage.customer.getNameCustomer());
        hotelManage.setChoiceTypeRoom(CheckQuantityRoom());
        System.out.println("Mời bạn nhập số đêm khách muốn ở");
        hotelManage.setNightStay(Integer.parseInt(scanner.nextLine()));
        return hotelManage;
    }

    public Hotel UpdateCustommer() {
        Hotel hotelManage = new Hotel();
        System.out.println("Mời bạn nhập tên của khách hàng");
        hotelManage.customer.setNameCustomer(scanner.nextLine());
        System.out.println("Mời bạn nhập số chứng minh thư của khách hàng " + hotelManage.customer.getNameCustomer());
        hotelManage.customer.setId(Integer.parseInt(scanner.nextLine()));
        System.out.println("mời bạn nhập ngày tháng năm sinh của khách hàng " + hotelManage.customer.getNameCustomer() + " theo định dạng yyyy-mm-dd");
        hotelManage.customer.setBirthday(LocalDate.parse(scanner.nextLine()));
        System.out.println("Mời bạn nhập giới tính của khách hàng " + hotelManage.customer.getNameCustomer());
        hotelManage.customer.setGender(scanner.nextLine());
        System.out.println("Mời bạn nhập số điện thoại liên lạc của khách hàng " + hotelManage.customer.getNameCustomer());
        hotelManage.customer.setPhoneNumber(Integer.parseInt(scanner.nextLine()));
        return hotelManage;
    }

    public String TypeRoom() {
        Hotel hotel = new Hotel();
        String typeRoom;
        System.out.println("* * * * * * * * * * * * * * * * * * * *");
        System.out.println("*          1." + hotel.getStandard() + "                 *");
        System.out.println("*          2." + hotel.getSuperior() + "                 *");
        System.out.println("*          3." + hotel.getDeluxe() + "                   *");
        System.out.println("*          4." + hotel.getSuite() + "                    *");
        System.out.println("*          5." + hotel.getPresident() + "                *");
        System.out.println("*          6." + hotel.getRoyalSuite() + "               *");
        System.out.println("*          7." + hotel.getBungalow() + "                 *");
        System.out.println("* * * * * * * * * * * * * * * * * * * *");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:

                return typeRoom = hotel.getStandard();

            case 2:

                return typeRoom = hotel.getSuperior();

            case 3:

                return typeRoom = hotel.getDeluxe();

            case 4:

                return typeRoom = hotel.getSuite();

            case 5:

                return typeRoom = hotel.getPresident();

            case 6:

                return typeRoom = hotel.getRoyalSuite();

            case 7:

                return typeRoom = hotel.getBungalow();

        }
        return null;
    }


    public String CheckQuantityRoom() {
        Hotel hotel = new Hotel();
        String typeRoom;
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
        if (hotel.getStandardquantity() <= 0) {
            System.out.println("*          1." + hotel.getStandard().toUpperCase() + "(Hết phòng)" + "                                  *");
        } else {
            System.out.println("*          1." + hotel.getStandard().toUpperCase() + " ( số lượng phòng còn lại " + hotel.getStandardquantity() + " )                *");
        }

        if (hotel.getSuperiorquantity() <= 0) {
            System.out.println("*          2." + hotel.getSuperior().toUpperCase() + "(Hết phòng)" + "                                  *");
        } else {
            System.out.println("*          2." + hotel.getSuperior().toUpperCase() + " ( số lượng phòng còn lại " + hotel.getSuperiorquantity() + " )                *");
        }

        if (hotel.getDeluxequantity() <= 0) {
            System.out.println("*          3." + hotel.getDeluxe().toUpperCase() + "(Hết phòng)" + "                                    *");
        } else {
            System.out.println("*          3." + hotel.getDeluxe().toUpperCase() + " ( số lượng phòng còn lại " + hotel.getDeluxequantity() + " )                  *");

        }
        if (hotel.getSuitequantity() <= 0) {
            System.out.println("*          4." + hotel.getSuite().toUpperCase() + "(Hết phòng)" + "                                     *");
        } else {
            System.out.println("*          4." + hotel.getSuite().toUpperCase() + " ( số lượng phòng còn lại " + hotel.getSuitequantity() + " )                   *");

        }
        if (hotel.getPresidentquantity() <= 0) {
            System.out.println("*          5." + hotel.getPresident().toUpperCase() + "(Hết phòng)" + "                                 *");
        } else {
            System.out.println("*          5." + hotel.getPresident().toUpperCase() + " ( số lượng phòng còn lại " + hotel.getPresidentquantity() + " )               *");

        }

        if (hotel.getRoyalSuitequantity() <= 0) {
            System.out.println("*          6." + hotel.getRoyalSuite().toUpperCase() + "(Hết phòng)" + "                                *");
        } else {
            System.out.println("*          6." + hotel.getRoyalSuite().toUpperCase() + " ( số lượng phòng còn lại " + hotel.getRoyalSuitequantity() + " )              *");
        }

        if (hotel.getBungalowquantity() <= 0) {
            System.out.println("*          7." + hotel.getBungalow().toUpperCase() + "(Hết phòng)" + "                                  *");
        } else {
            System.out.println("*          7." + hotel.getBungalow().toUpperCase() + " ( số lượng phòng còn lại " + hotel.getBungalowquantity() + " )                *");
        }
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                if (hotel.getStandardquantity() <= 0) {
                    System.out.println("Hạng phòng " + hotel.getStandard() + " Hết phòng, mời chọn hạng phòng khác");
                    CheckQuantityRoom();
                    break;

                } else {
                    hotel.setStandardquantity(hotel.getStandardquantity() - 1);
                    System.out.println("phogn" + hotel.getStandardquantity());
                    return typeRoom = hotel.getStandard();
                }
            case 2:
                if (hotel.getSuperiorquantity() > 0) {
                    hotel.setSuperiorquantity(hotel.getSuperiorquantity() - 1);
                    return typeRoom = hotel.getSuperior();
                } else {
                    System.out.println("Hạng phòng " + hotel.getSuperior() + " Hết phòng, mời chọn hạng phòng khác");
                    CheckQuantityRoom();
                    break;

                }
            case 3:
                if (hotel.getDeluxequantity() > 0) {
                    hotel.setDeluxequantity(hotel.getDeluxequantity() - 1);
                    return typeRoom = hotel.getDeluxe();
                } else {
                    System.out.println("Hạng phòng " + hotel.getDeluxe() + " Hết phòng, mời chọn hạng phòng khác");
                    CheckQuantityRoom();
                    break;

                }
            case 4:
                if (hotel.getSuitequantity() > 0) {
                    hotel.setSuitequantity(hotel.getSuitequantity() - 1);
                    return typeRoom = hotel.getSuite();
                } else {
                    System.out.println("Hạng phòng " + hotel.getSuite() + " Hết phòng, mời chọn hạng phòng khác");
                    CheckQuantityRoom();
                    break;

                }
            case 5:
                if (hotel.getPresidentquantity() > 0) {
                    hotel.setPresidentquantity(hotel.getPresidentquantity() - 1);
                    return typeRoom = hotel.getPresident();
                } else {
                    System.out.println("Hạng phòng " + hotel.getPresident() + " Hết phòng, mời chọn hạng phòng khác");
                    CheckQuantityRoom();
                    break;

                }
            case 6:
                if (hotel.getRoyalSuitequantity() > 0) {
                    hotel.setRoyalSuitequantity(hotel.getRoyalSuitequantity() - 1);
                    return typeRoom = hotel.getRoyalSuite();
                } else {
                    System.out.println("Hạng phòng " + hotel.getRoyalSuite() + " Hết phòng, mời chọn hạng phòng khác");
                    CheckQuantityRoom();
                    break;

                }
            case 7:
                if (hotel.getBungalowquantity() > 0) {
                    hotel.setBungalowquantity(hotel.getBungalowquantity() - 1);
                    return typeRoom = hotel.getBungalow();
                } else {
                    System.out.println("Hạng phòng " + hotel.getBungalow() + " Hết phòng, mời chọn hạng phòng khác");
                    CheckQuantityRoom();
                    break;

                }
        }
        return null;
    }


}
