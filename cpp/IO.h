#include <string>

namespace IO {

    class Socket {
        public:
            int send(signed char *data, int len) {
                onReceive(data, len);
                return len;
            }

            virtual int onReceive(signed char *data, int len) {
                return 0;
            }
    };
}
