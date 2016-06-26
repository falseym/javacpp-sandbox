#include <string>

namespace NativeLibrary {
    struct FRAME {
        int age;
        int rate;
    };

    class NativeClass {
        public:
            const std::string& get_property() { return property; }
            void set_property(const std::string& property) { this->property = property; }
            std::string property;

            const struct FRAME* parse(char *data, int len) { 
                /* struct FRAME *pFrame = new struct FRAME; */
                /* pFrame->age = 0; */

                // Assume that data size is identical with sizeOf(FRAME)
                struct FRAME *pFrame = (struct FRAME *)data;
                return pFrame; 
            }
    };
}
