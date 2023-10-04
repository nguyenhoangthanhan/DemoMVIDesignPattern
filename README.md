# DemoMVIDesignPattern

https://github.com/nguyenhoangthanhan/DemoMVIDesignPattern/assets/38137175/ba0f2e55-68bd-46a4-97bd-eb6e044c4821

***Địn nghĩa
Kiến trúc MVI là gì?
-MVI là viết tắt của Model-View-Intent. Mô hình này đã được giới thiệu gần đây trong Android. Nó hoạt động dựa trên nguyên tắc của dòng chảy một chiều và hình trụ lấy cảm hứng từ Cycle.js framework.
*Hãy xem vai trò của từng thành phần của MVI là gì.
-Model: Không giống như các pattern khác, Trong MVI thì Model đại diện cho trạng thái của giao diện người dùng. ví dụ: giao diện người dùng có thể có các trạng thái khác nhau như Đang tải dữ liệu, Đã tải, Thay đổi giao diện người dùng với Hành động của người dùng, Lỗi, Trạng thái vị trí màn hình hiện tại của người dùng. Mỗi trạng thái được lưu trữ tương tự như đối tượng trong mô hình.
-View: View trong MVI là Giao diện của chúng ta có thể được triển khai trong Activities và fragments. Nó có nghĩa là có một container có thể chấp nhận các trạng thái mô hình khác nhau và hiển thị nó dưới dạng giao diện người dùng. Họ sử dụng observable intents (Lưu ý: Điều này không đại diện cho các Intents truyền thống của Android) để phản hồi các hành động của người dùng.
-Intent: Mặc dù đây không phải là Intent như Android đã định nghĩa từ trước. Kết quả của các hành động của người dùng được chuyển dưới dạng giá trị đầu vào cho Intents. Đổi lại, chúng ta có thể nói rằng chúng ta sẽ gửi các model làm đầu vào cho Intent có thể tải nó thông qua View.

***Cách thức hoạt động
Người dùng thực hiện một hành động sẽ là Intent → Intent là trạng thái là đầu vào cho model → Model lưu trữ trạng thái và gửi trạng thái được yêu cầu đến View → View Tải trạng thái từ Model → Hiển thị cho người dùng. Nếu chúng ta quan sát, dữ liệu sẽ luôn chảy từ người dùng và kết thúc với người dùng thông qua mục đích. Nó không thể là theo cách khác, Do đó nó được gọi là kiến trúc Một chiều. Nếu người dùng thực hiện thêm một hành động thì cùng một chu kỳ được lặp lại, do đó nó là Chu kỳ.

***Ưu điểm của MVI
Duy trì trạng thái không còn là một thách thức với kiến trúc này, vì nó chủ yếu tập trung vào các trạng thái.
Vì nó là một chiều, nên có thể dễ dàng theo dõi và dự đoán Luồng dữ liệu.
Nó đảm bảo an toàn luồng vì các đối tượng trạng thái là bất biến.
Dễ dàng debug, Như chúng ta biết trạng thái của đối tượng khi xảy ra lỗi.
Nó được tách rời nhiều hơn khi mỗi thành phần hoàn thành trách nhiệm của riêng mình.
Việc kiểm tra ứng dụng cũng sẽ dễ dàng hơn vì chúng tôi có thể lập bản đồ logic nghiệp vụ cho từng trạng thái.

***Nhược điểm của MVI
Nó dẫn đến rất nhiều mã soạn sẵn vì chúng ta phải duy trì trạng thái cho mỗi hành động của người dùng.
Như chúng ta biết, nó phải tạo rất nhiều đối tượng cho tất cả các trạng thái. Điều này làm cho việc quản lý bộ nhớ ứng dụng quá tốn kém.
Việc xử lý trạng thái cảnh báo có thể gặp khó khăn trong khi chúng ta xử lý các thay đổi cấu hình. Ví dụ: nếu không có internet, chúng tôi sẽ hiển thị thanh ăn nhẹ, Khi thay đổi cấu hình, nó hiển thị lại thanh nhanh như trạng thái của mục đích. Về khả năng sử dụng, điều này phải được xử lý
