package hausaufgabe51;

public class IpParser {
    public static void main(String[] args) {
        try {
            String ipAddress = "192.168.0.1";
            byte[] ipBytes = parseIp(ipAddress);

            System.out.println("IPv4 bytes:");
            for (byte b : ipBytes) {
                System.out.print(b + " ");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error parsing IP address: " + e.getMessage());
        }
    }

    public static byte[] parseIp(String ip) {
        String[] octets = ip.split("\\.");

        if (octets.length != 4) {
            throw new IllegalArgumentException("Invalid IP address format");
        }

        byte[] ipBytes = new byte[4];
        for (int i = 0; i < 4; i++) {
            try {
                int octetValue = Integer.parseInt(octets[i]);
                if (octetValue < 0 || octetValue > 255) {
                    throw new IllegalArgumentException("Invalid octet value");
                }
                ipBytes[i] = (byte) octetValue;
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Invalid octet format");
            }
        }

        return ipBytes;
    }
}
